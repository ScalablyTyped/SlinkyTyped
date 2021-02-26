package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object whatsappMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Whatsapp", JSImport.Default)
  @js.native
  val default: ReactComponentClass[WhatsappProps] = js.native
  
  @js.native
  trait WhatsappProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object WhatsappProps {
    
    @scala.inline
    def apply(): WhatsappProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhatsappProps]
    }
    
    @scala.inline
    implicit class WhatsappPropsMutableBuilder[Self <: WhatsappProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[WhatsappProps]
  
  /* This means you don't have to write `default`, but can instead just say `whatsappMod.foo` */
  override def _to: ReactComponentClass[WhatsappProps] = default
}
