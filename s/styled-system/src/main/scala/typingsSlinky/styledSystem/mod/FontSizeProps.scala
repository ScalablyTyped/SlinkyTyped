package typingsSlinky.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontSizeProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends StObject {
  
  /**
    * The fontSize utility parses a component's `fontSize` prop and converts it into a CSS font-size declaration.
    *
    * - Numbers from 0-8 (or `theme.fontSizes.length`) are converted to values on the [font size scale](#default-theme).
    * - Numbers greater than `theme.fontSizes.length` are converted to raw pixel values.
    * - String values are passed as raw CSS values.
    * - And array values are converted into responsive values.
    *
    */
  var fontSize: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object FontSizeProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): FontSizeProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSizeProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class FontSizePropsMutableBuilder[Self <: FontSizeProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (FontSizeProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setFontSize(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeNull: Self = StObject.set(x, "fontSize", null)
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontSizeVarargs(value: (TVal | Null)*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
  }
}
