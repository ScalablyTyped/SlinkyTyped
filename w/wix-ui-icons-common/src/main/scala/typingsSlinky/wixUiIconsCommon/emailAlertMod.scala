package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailAlertMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmailAlert", JSImport.Default)
  @js.native
  val default: ReactComponentClass[EmailAlertProps] = js.native
  
  @js.native
  trait EmailAlertProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object EmailAlertProps {
    
    @scala.inline
    def apply(): EmailAlertProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailAlertProps]
    }
    
    @scala.inline
    implicit class EmailAlertPropsMutableBuilder[Self <: EmailAlertProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[EmailAlertProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailAlertMod.foo` */
  override def _to: ReactComponentClass[EmailAlertProps] = default
}
