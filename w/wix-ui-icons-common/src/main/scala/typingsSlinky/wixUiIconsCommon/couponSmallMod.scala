package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object couponSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CouponSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CouponSmallProps] = js.native
  
  @js.native
  trait CouponSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object CouponSmallProps {
    
    @scala.inline
    def apply(): CouponSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CouponSmallProps]
    }
    
    @scala.inline
    implicit class CouponSmallPropsMutableBuilder[Self <: CouponSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CouponSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `couponSmallMod.foo` */
  override def _to: ReactComponentClass[CouponSmallProps] = default
}
