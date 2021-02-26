package typingsSlinky.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends BackgroundImageProps[ThemeType]
     with BackgroundSizeProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundSize<TLengthStyledSystem> */ js.Any
    ]
     with BackgroundPositionProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundPosition<TLengthStyledSystem> */ js.Any
    ]
     with BackgroundRepeatProps[ThemeType] {
  
  /**
    * The background shorthand CSS property sets all background style properties at once,
    * such as color, image, origin and size, repeat method, and others.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background)
    */
  var background: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}
object BackgroundProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](): BackgroundProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundProps[ThemeType, TVal]]
  }
  
  @scala.inline
  implicit class BackgroundPropsMutableBuilder[Self <: BackgroundProps[_, _], ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] (val x: Self with (BackgroundProps[ThemeType, TVal])) extends AnyVal {
    
    @scala.inline
    def setBackground(value: ResponsiveValue[TVal, ThemeType]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundNull: Self = StObject.set(x, "background", null)
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBackgroundVarargs(value: (TVal | Null)*): Self = StObject.set(x, "background", js.Array(value :_*))
  }
}
