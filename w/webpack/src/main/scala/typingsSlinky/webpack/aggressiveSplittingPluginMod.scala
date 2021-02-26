package typingsSlinky.webpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aggressiveSplittingPluginMod {
  
  @js.native
  trait AggressiveSplittingPluginOptions extends StObject {
    
    /**
    	 * Default: 0
    	 */
    var chunkOverhead: js.UndefOr[Double] = js.native
    
    /**
    	 * Default: 1
    	 */
    var entryChunkMultiplicator: js.UndefOr[Double] = js.native
    
    /**
    	 * Byte, maxsize of per file. Default: 51200
    	 */
    var maxSize: js.UndefOr[Double] = js.native
    
    /**
    	 * Byte, split point. Default: 30720
    	 */
    var minSize: js.UndefOr[Double] = js.native
  }
  object AggressiveSplittingPluginOptions {
    
    @scala.inline
    def apply(): AggressiveSplittingPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AggressiveSplittingPluginOptions]
    }
    
    @scala.inline
    implicit class AggressiveSplittingPluginOptionsMutableBuilder[Self <: AggressiveSplittingPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunkOverhead(value: Double): Self = StObject.set(x, "chunkOverhead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkOverheadUndefined: Self = StObject.set(x, "chunkOverhead", js.undefined)
      
      @scala.inline
      def setEntryChunkMultiplicator(value: Double): Self = StObject.set(x, "entryChunkMultiplicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryChunkMultiplicatorUndefined: Self = StObject.set(x, "entryChunkMultiplicator", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    }
  }
}
