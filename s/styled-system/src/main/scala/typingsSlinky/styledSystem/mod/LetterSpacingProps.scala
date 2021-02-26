package typingsSlinky.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LetterSpacingProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The letter-spacing CSS property sets the spacing behavior between text characters.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing)
    */
  var letterSpacing: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object LetterSpacingProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): LetterSpacingProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LetterSpacingProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class LetterSpacingPropsMutableBuilder[Self <: LetterSpacingProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (LetterSpacingProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setLetterSpacing(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingNull: Self = StObject.set(x, "letterSpacing", null)
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setLetterSpacingVarargs(value: (TVal | Null)*): Self = StObject.set(x, "letterSpacing", js.Array(value :_*))
  }
}
