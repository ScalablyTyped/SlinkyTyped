package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Phone", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PhoneProps] = js.native
  
  @js.native
  trait PhoneProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PhoneProps {
    
    @scala.inline
    def apply(): PhoneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhoneProps]
    }
    
    @scala.inline
    implicit class PhonePropsMutableBuilder[Self <: PhoneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PhoneProps]
  
  /* This means you don't have to write `default`, but can instead just say `phoneMod.foo` */
  override def _to: ReactComponentClass[PhoneProps] = default
}
