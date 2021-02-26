package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foodOutOfStockMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FoodOutOfStock", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FoodOutOfStockProps] = js.native
  
  @js.native
  trait FoodOutOfStockProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FoodOutOfStockProps {
    
    @scala.inline
    def apply(): FoodOutOfStockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoodOutOfStockProps]
    }
    
    @scala.inline
    implicit class FoodOutOfStockPropsMutableBuilder[Self <: FoodOutOfStockProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FoodOutOfStockProps]
  
  /* This means you don't have to write `default`, but can instead just say `foodOutOfStockMod.foo` */
  override def _to: ReactComponentClass[FoodOutOfStockProps] = default
}
