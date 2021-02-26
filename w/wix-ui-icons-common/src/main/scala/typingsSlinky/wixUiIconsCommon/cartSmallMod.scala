package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cartSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CartSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CartSmallProps] = js.native
  
  @js.native
  trait CartSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CartSmallProps {
    
    @scala.inline
    def apply(): CartSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CartSmallProps]
    }
    
    @scala.inline
    implicit class CartSmallPropsMutableBuilder[Self <: CartSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CartSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `cartSmallMod.foo` */
  override def _to: ReactComponentClass[CartSmallProps] = default
}
