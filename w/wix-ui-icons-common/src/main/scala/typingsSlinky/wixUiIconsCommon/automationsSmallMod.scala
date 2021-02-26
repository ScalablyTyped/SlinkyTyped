package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object automationsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AutomationsSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AutomationsSmallProps] = js.native
  
  @js.native
  trait AutomationsSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AutomationsSmallProps {
    
    @scala.inline
    def apply(): AutomationsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutomationsSmallProps]
    }
    
    @scala.inline
    implicit class AutomationsSmallPropsMutableBuilder[Self <: AutomationsSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AutomationsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `automationsSmallMod.foo` */
  override def _to: ReactComponentClass[AutomationsSmallProps] = default
}
