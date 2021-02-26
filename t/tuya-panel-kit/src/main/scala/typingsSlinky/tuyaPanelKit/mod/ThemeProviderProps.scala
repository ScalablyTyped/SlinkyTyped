package typingsSlinky.tuyaPanelKit.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeProviderProps extends StObject {
  
  var children: ReactElement = js.native
  
  var theme: js.Any = js.native
}
object ThemeProviderProps {
  
  @scala.inline
  def apply(theme: js.Any): ThemeProviderProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps]
  }
  
  @scala.inline
  implicit class ThemeProviderPropsMutableBuilder[Self <: ThemeProviderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setTheme(value: js.Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
