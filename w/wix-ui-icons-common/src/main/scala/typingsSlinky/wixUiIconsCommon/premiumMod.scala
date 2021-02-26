package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object premiumMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Premium", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PremiumProps] = js.native
  
  @js.native
  trait PremiumProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object PremiumProps {
    
    @scala.inline
    def apply(): PremiumProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PremiumProps]
    }
    
    @scala.inline
    implicit class PremiumPropsMutableBuilder[Self <: PremiumProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PremiumProps]
  
  /* This means you don't have to write `default`, but can instead just say `premiumMod.foo` */
  override def _to: ReactComponentClass[PremiumProps] = default
}
