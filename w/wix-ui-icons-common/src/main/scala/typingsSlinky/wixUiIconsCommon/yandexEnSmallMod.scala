package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yandexEnSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/YandexEnSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[YandexEnSmallProps] = js.native
  
  @js.native
  trait YandexEnSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object YandexEnSmallProps {
    
    @scala.inline
    def apply(): YandexEnSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YandexEnSmallProps]
    }
    
    @scala.inline
    implicit class YandexEnSmallPropsMutableBuilder[Self <: YandexEnSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[YandexEnSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `yandexEnSmallMod.foo` */
  override def _to: ReactComponentClass[YandexEnSmallProps] = default
}
