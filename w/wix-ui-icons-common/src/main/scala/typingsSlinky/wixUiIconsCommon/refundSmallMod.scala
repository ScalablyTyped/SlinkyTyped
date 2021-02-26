package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refundSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RefundSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RefundSmallProps] = js.native
  
  @js.native
  trait RefundSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object RefundSmallProps {
    
    @scala.inline
    def apply(): RefundSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefundSmallProps]
    }
    
    @scala.inline
    implicit class RefundSmallPropsMutableBuilder[Self <: RefundSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RefundSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `refundSmallMod.foo` */
  override def _to: ReactComponentClass[RefundSmallProps] = default
}
