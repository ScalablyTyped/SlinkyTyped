package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMarketMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AppMarket", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AppMarketProps] = js.native
  
  @js.native
  trait AppMarketProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AppMarketProps {
    
    @scala.inline
    def apply(): AppMarketProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppMarketProps]
    }
    
    @scala.inline
    implicit class AppMarketPropsMutableBuilder[Self <: AppMarketProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AppMarketProps]
  
  /* This means you don't have to write `default`, but can instead just say `appMarketMod.foo` */
  override def _to: ReactComponentClass[AppMarketProps] = default
}
