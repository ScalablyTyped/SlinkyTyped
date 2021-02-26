package typingsSlinky.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'ml' | 'marginLeft'> */
@js.native
trait MarginLeftProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var marginLeft: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  
  var ml: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
}
object MarginLeftProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): MarginLeftProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginLeftProps[ThemeType]]
  }
  
  @scala.inline
  implicit class MarginLeftPropsMutableBuilder[Self <: MarginLeftProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with MarginLeftProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setMarginLeft(
      value: ResponsiveValue[
          ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftNull: Self = StObject.set(x, "marginLeft", null)
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginLeftVarargs(
      value: ((ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*
    ): Self = StObject.set(x, "marginLeft", js.Array(value :_*))
    
    @scala.inline
    def setMl(
      value: ResponsiveValue[
          ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMlNull: Self = StObject.set(x, "ml", null)
    
    @scala.inline
    def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
    
    @scala.inline
    def setMlVarargs(
      value: ((ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*
    ): Self = StObject.set(x, "ml", js.Array(value :_*))
  }
}
