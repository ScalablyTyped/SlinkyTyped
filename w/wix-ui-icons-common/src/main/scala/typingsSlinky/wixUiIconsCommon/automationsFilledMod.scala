package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object automationsFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AutomationsFilled", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AutomationsFilledProps] = js.native
  
  @js.native
  trait AutomationsFilledProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AutomationsFilledProps {
    
    @scala.inline
    def apply(): AutomationsFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutomationsFilledProps]
    }
    
    @scala.inline
    implicit class AutomationsFilledPropsMutableBuilder[Self <: AutomationsFilledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AutomationsFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `automationsFilledMod.foo` */
  override def _to: ReactComponentClass[AutomationsFilledProps] = default
}
