package typingsSlinky.styledComponents.styledComponentsMod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeProviderProps[T /* <: js.Object */, U /* <: js.Object */] extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var theme: T | (js.Function1[/* theme */ U, T]) = js.native
}
object ThemeProviderProps {
  
  @scala.inline
  def apply[T /* <: js.Object */, U /* <: js.Object */](theme: T | (js.Function1[/* theme */ U, T])): ThemeProviderProps[T, U] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[T, U]]
  }
  
  @scala.inline
  implicit class ThemeProviderPropsMutableBuilder[Self <: ThemeProviderProps[_, _], T /* <: js.Object */, U /* <: js.Object */] (val x: Self with (ThemeProviderProps[T, U])) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setTheme(value: T | (js.Function1[/* theme */ U, T])): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeFunction1(value: /* theme */ U => T): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
  }
}
