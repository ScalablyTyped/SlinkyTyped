package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import typingsSlinky.tuyaPanelKit.themeMod.GlobalTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeConsumerProps extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var theme: js.UndefOr[GlobalTheme] = js.native
}
object ThemeConsumerProps {
  
  @scala.inline
  def apply(): ThemeConsumerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeConsumerProps]
  }
  
  @scala.inline
  implicit class ThemeConsumerPropsMutableBuilder[Self <: ThemeConsumerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setTheme(value: GlobalTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
