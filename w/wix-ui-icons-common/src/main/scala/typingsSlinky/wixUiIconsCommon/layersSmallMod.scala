package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layersSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/LayersSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LayersSmallProps] = js.native
  
  @js.native
  trait LayersSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object LayersSmallProps {
    
    @scala.inline
    def apply(): LayersSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersSmallProps]
    }
    
    @scala.inline
    implicit class LayersSmallPropsMutableBuilder[Self <: LayersSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[LayersSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `layersSmallMod.foo` */
  override def _to: ReactComponentClass[LayersSmallProps] = default
}
