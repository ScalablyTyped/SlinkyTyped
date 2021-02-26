package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bonusGiftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BonusGift", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BonusGiftProps] = js.native
  
  @js.native
  trait BonusGiftProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BonusGiftProps {
    
    @scala.inline
    def apply(): BonusGiftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BonusGiftProps]
    }
    
    @scala.inline
    implicit class BonusGiftPropsMutableBuilder[Self <: BonusGiftProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BonusGiftProps]
  
  /* This means you don't have to write `default`, but can instead just say `bonusGiftMod.foo` */
  override def _to: ReactComponentClass[BonusGiftProps] = default
}
