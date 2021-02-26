package typingsSlinky.storybookAddonA11y

import slinky.core.ReactComponentClass
import typingsSlinky.axeCore.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoMod {
  
  @JSImport("@storybook/addon-a11y/dist/components/Report/Info", "Info")
  @js.native
  val Info: ReactComponentClass[InfoProps] = js.native
  
  @js.native
  trait InfoProps extends StObject {
    
    var item: Result = js.native
  }
  object InfoProps {
    
    @scala.inline
    def apply(item: Result): InfoProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfoProps]
    }
    
    @scala.inline
    implicit class InfoPropsMutableBuilder[Self <: InfoProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: Result): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
