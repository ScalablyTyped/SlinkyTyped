package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.splitMod.Split
import typingsSlinky.vegaLite.vegaLiteStrings.height
import typingsSlinky.vegaLite.vegaLiteStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutsizeComponentMod {
  
  @JSImport("vega-lite/build/src/compile/layoutsize/component", "getSizeTypeFromLayoutSizeType")
  @js.native
  def getSizeTypeFromLayoutSizeType(layoutSizeType: LayoutSizeType): width | height = js.native
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsSlinky.vegaLite.vegaLiteStrings.container
    - typingsSlinky.vegaLite.vegaLiteStrings.step
    - typingsSlinky.vegaLite.vegaLiteStrings.merged
  */
  type LayoutSize = _LayoutSize | Double
  
  type LayoutSizeComponent = Split[LayoutSizeIndex]
  
  @js.native
  trait LayoutSizeIndex extends StObject {
    
    var childHeight: js.UndefOr[LayoutSize] = js.native
    
    var childWidth: js.UndefOr[LayoutSize] = js.native
    
    var height: js.UndefOr[LayoutSize] = js.native
    
    var width: js.UndefOr[LayoutSize] = js.native
  }
  object LayoutSizeIndex {
    
    @scala.inline
    def apply(): LayoutSizeIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutSizeIndex]
    }
    
    @scala.inline
    implicit class LayoutSizeIndexMutableBuilder[Self <: LayoutSizeIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildHeight(value: LayoutSize): Self = StObject.set(x, "childHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildHeightUndefined: Self = StObject.set(x, "childHeight", js.undefined)
      
      @scala.inline
      def setChildWidth(value: LayoutSize): Self = StObject.set(x, "childWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildWidthUndefined: Self = StObject.set(x, "childWidth", js.undefined)
      
      @scala.inline
      def setHeight(value: LayoutSize): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: LayoutSize): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.width
    - typingsSlinky.vegaLite.vegaLiteStrings.childWidth
    - typingsSlinky.vegaLite.vegaLiteStrings.height
    - typingsSlinky.vegaLite.vegaLiteStrings.childHeight
  */
  trait LayoutSizeType extends StObject
  
  trait _LayoutSize extends StObject
}
