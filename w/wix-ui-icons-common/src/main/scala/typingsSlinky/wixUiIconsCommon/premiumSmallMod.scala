package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object premiumSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PremiumSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PremiumSmallProps] = js.native
  
  @js.native
  trait PremiumSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PremiumSmallProps {
    
    @scala.inline
    def apply(): PremiumSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PremiumSmallProps]
    }
    
    @scala.inline
    implicit class PremiumSmallPropsMutableBuilder[Self <: PremiumSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PremiumSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `premiumSmallMod.foo` */
  override def _to: ReactComponentClass[PremiumSmallProps] = default
}
