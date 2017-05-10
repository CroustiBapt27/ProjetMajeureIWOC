$(function() {
  var c = $("canvas")[0].getContext("2d");
  var ready_load=0;
  var scale_factor=6;
  var scene = {
    layers: [],
    loadready:function(){
        //check if all images are loaded
        ready_load++;
        if(ready_load>=Object.keys(this.tileset).length){
            //if all images are loaded launch the render
            this.renderLayers(this.data.layers);
        }
    },
    renderLayer: function(layer) {
      // data: [array of tiles, 1-based, position of sprite from top-left]
      // height: integer, height in number of sprites
      // name: "string", internal name of layer
      // opacity: integer
      // type: "string", layer type (tile, object)
      // visible: boolean
      // width: integer, width in number of sprites
      // x: integer, starting x position
      // y: integer, starting y position
      if (layer.type !== "tilelayer" || !layer.opacity) { return; }
      var s = c.canvas.cloneNode(),
          size = scene.data.tilewidth;
      s = s.getContext("2d");
      if (scene.layers.length < scene.data.layers.length) {
          var odd=0;
          var s_y_t_1=0;
        layer.data.forEach(function(tile_idx, i) {
              if (!tile_idx) { return; }
              var img_x, img_y, s_x, s_y,s_index_x,s_index_y;
               //CAUTION current index of the image is the index-1
              image_loaded = scene.tileset[tile_idx-1];
                //index into map of the current elt
                s_index_x=(i % layer.width);
                s_index_y=~~(i / layer.width);
            
            // on time per 2 need to add margin on x to respect isometric aspect
             if(s_index_y % 2==0){
                        s_x = (s_index_x)  * size;                
                }else{
                        s_x = (s_index_x) * size + size/2 ;
                }
                 s_y = (s_index_y) * (size/4);
              //draw the current image with an adjusted y position according to the difference between used tiledheight and current image heigt
              s.drawImage(image_loaded,
                          s_x/scale_factor, (s_y-(image_loaded.height-size/2))/scale_factor,image_loaded.width/scale_factor, image_loaded.height/scale_factor);
              //draw current image only for test
              //c.drawImage(s.canvas, 0, 0);
        });
        scene.layers.push(s.canvas.toDataURL());
        c.drawImage(s.canvas, 0, 0);
      }
      else {
        scene.layers.forEach(function(src) {
          var i = $("<img />", { src: src })[0];
          c.drawImage(i, 0, 0);
        });
      }
    },
    renderLayers: function(layers) {
      layers = $.isArray(layers) ? layers : this.data.layers;
      layers.forEach(this.renderLayer);
    },
    loadTileset: function(json) {
      this.data = json;
      //get back tilesets from json map (image URL/ code)
      this.tileset = json.tilesets[0].tiles
      var keys = Object.keys(this.tileset);
      //replace all object into tiled set by dom images    
      keys.forEach(function(key){
        scene.tileset[key]=$("<img />", { src:scene.tileset[key].image})[0];
        //each time an image is loaded check if all images are loaded
        scene.tileset[key].onload=$.proxy(scene.loadready, scene)
      });
    },
    load: function(name) {
      return $.ajax({
        url: "./data/" + name + ".json"
      }).done($.proxy(this.loadTileset, this));
    },
      rerenderall: function(){
        //clear old display
        c.clearRect(0, 0, c.canvas.width, c.canvas.height);
        //remove scene layerrs
        scene.layers=[];
        //ask for rerender
        scene.renderLayers(scene.data.layers);
      }
  };
  
    
  //load the json file into data like ./data/road.json
  scene.load("road2");

  //TO IMPROVE associate an action to the range input to scale up or down the visualization
  $(document).on('input change', '#scaleButtonId', function() {
    var current_val=$("#scaleButtonId")[0].value;
    scale_factor=current_val;
    scene.rerenderall();  
  });
});

