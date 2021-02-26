package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Email", JSImport.Default)
  @js.native
  val default: ReactComponentClass[EmailProps] = js.native
  
  @js.native
  trait EmailProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object EmailProps {
    
    @scala.inline
    def apply(): EmailProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailProps]
    }
    
    @scala.inline
    implicit class EmailPropsMutableBuilder[Self <: EmailProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[EmailProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailMod.foo` */
  override def _to: ReactComponentClass[EmailProps] = default
}
