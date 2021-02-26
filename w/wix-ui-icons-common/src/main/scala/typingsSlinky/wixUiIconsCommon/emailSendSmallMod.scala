package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailSendSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmailSendSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[EmailSendSmallProps] = js.native
  
  @js.native
  trait EmailSendSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object EmailSendSmallProps {
    
    @scala.inline
    def apply(): EmailSendSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailSendSmallProps]
    }
    
    @scala.inline
    implicit class EmailSendSmallPropsMutableBuilder[Self <: EmailSendSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[EmailSendSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailSendSmallMod.foo` */
  override def _to: ReactComponentClass[EmailSendSmallProps] = default
}
