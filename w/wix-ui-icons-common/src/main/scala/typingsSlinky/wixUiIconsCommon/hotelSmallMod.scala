package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotelSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/HotelSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[HotelSmallProps] = js.native
  
  @js.native
  trait HotelSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object HotelSmallProps {
    
    @scala.inline
    def apply(): HotelSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HotelSmallProps]
    }
    
    @scala.inline
    implicit class HotelSmallPropsMutableBuilder[Self <: HotelSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[HotelSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `hotelSmallMod.foo` */
  override def _to: ReactComponentClass[HotelSmallProps] = default
}
