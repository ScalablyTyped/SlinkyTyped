package typingsSlinky.tileReduce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TileReduce {
  
  type BBox = js.Tuple4[Double, Double, Double, Double]
  
  @js.native
  trait Source extends StObject {
    
    var layers: js.UndefOr[js.Array[String]] = js.native
    
    var maxrate: js.UndefOr[Double] = js.native
    
    var mbtiles: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Source {
    
    @scala.inline
    def apply(name: String): Source = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setMaxrate(value: Double): Self = StObject.set(x, "maxrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxrateUndefined: Self = StObject.set(x, "maxrate", js.undefined)
      
      @scala.inline
      def setMbtiles(value: String): Self = StObject.set(x, "mbtiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMbtilesUndefined: Self = StObject.set(x, "mbtiles", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type Tile = js.Tuple3[Double, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tileReduce.tileReduceStrings.start
    - typingsSlinky.tileReduce.tileReduceStrings.map
    - typingsSlinky.tileReduce.tileReduceStrings.reduce
    - typingsSlinky.tileReduce.tileReduceStrings.end
  */
  trait Types extends StObject
  object Types {
    
    @scala.inline
    def end: typingsSlinky.tileReduce.tileReduceStrings.end = "end".asInstanceOf[typingsSlinky.tileReduce.tileReduceStrings.end]
    
    @scala.inline
    def map: typingsSlinky.tileReduce.tileReduceStrings.map = "map".asInstanceOf[typingsSlinky.tileReduce.tileReduceStrings.map]
    
    @scala.inline
    def reduce: typingsSlinky.tileReduce.tileReduceStrings.reduce = "reduce".asInstanceOf[typingsSlinky.tileReduce.tileReduceStrings.reduce]
    
    @scala.inline
    def start: typingsSlinky.tileReduce.tileReduceStrings.start = "start".asInstanceOf[typingsSlinky.tileReduce.tileReduceStrings.start]
  }
}
