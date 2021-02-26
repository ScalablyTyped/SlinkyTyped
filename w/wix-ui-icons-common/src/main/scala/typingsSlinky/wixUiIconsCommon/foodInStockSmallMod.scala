package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foodInStockSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FoodInStockSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FoodInStockSmallProps] = js.native
  
  @js.native
  trait FoodInStockSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FoodInStockSmallProps {
    
    @scala.inline
    def apply(): FoodInStockSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoodInStockSmallProps]
    }
    
    @scala.inline
    implicit class FoodInStockSmallPropsMutableBuilder[Self <: FoodInStockSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FoodInStockSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `foodInStockSmallMod.foo` */
  override def _to: ReactComponentClass[FoodInStockSmallProps] = default
}
