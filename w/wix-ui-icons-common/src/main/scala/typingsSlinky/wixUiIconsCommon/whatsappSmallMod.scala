package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whatsappSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/WhatsappSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[WhatsappSmallProps] = js.native
  
  @js.native
  trait WhatsappSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object WhatsappSmallProps {
    
    @scala.inline
    def apply(): WhatsappSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhatsappSmallProps]
    }
    
    @scala.inline
    implicit class WhatsappSmallPropsMutableBuilder[Self <: WhatsappSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[WhatsappSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `whatsappSmallMod.foo` */
  override def _to: ReactComponentClass[WhatsappSmallProps] = default
}
