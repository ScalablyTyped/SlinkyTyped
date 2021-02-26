package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PaymentSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PaymentSmallProps] = js.native
  
  @js.native
  trait PaymentSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PaymentSmallProps {
    
    @scala.inline
    def apply(): PaymentSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentSmallProps]
    }
    
    @scala.inline
    implicit class PaymentSmallPropsMutableBuilder[Self <: PaymentSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PaymentSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `paymentSmallMod.foo` */
  override def _to: ReactComponentClass[PaymentSmallProps] = default
}
