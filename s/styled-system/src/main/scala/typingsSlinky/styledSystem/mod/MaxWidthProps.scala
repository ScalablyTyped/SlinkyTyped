package typingsSlinky.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxWidthProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The max-width CSS property sets the maximum width of an element.
    * It prevents the used value of the width property from becoming larger than the value specified by max-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
    */
  var maxWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object MaxWidthProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): MaxWidthProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxWidthProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class MaxWidthPropsMutableBuilder[Self <: MaxWidthProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (MaxWidthProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setMaxWidth(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMaxWidthVarargs(value: (TVal | Null)*): Self = StObject.set(x, "maxWidth", js.Array(value :_*))
  }
}
