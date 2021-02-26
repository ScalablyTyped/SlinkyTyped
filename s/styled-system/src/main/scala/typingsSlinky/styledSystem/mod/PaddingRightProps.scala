package typingsSlinky.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pr' | 'paddingRight'> */
@js.native
trait PaddingRightProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  var paddingRight: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  
  var pr: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
}
object PaddingRightProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): PaddingRightProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingRightProps[ThemeType]]
  }
  
  @scala.inline
  implicit class PaddingRightPropsMutableBuilder[Self <: PaddingRightProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with PaddingRightProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setPaddingRight(
      value: ResponsiveValue[
          ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRightNull: Self = StObject.set(x, "paddingRight", null)
    
    @scala.inline
    def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingRightVarargs(
      value: ((ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*
    ): Self = StObject.set(x, "paddingRight", js.Array(value :_*))
    
    @scala.inline
    def setPr(
      value: ResponsiveValue[
          ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrNull: Self = StObject.set(x, "pr", null)
    
    @scala.inline
    def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    @scala.inline
    def setPrVarargs(
      value: ((ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, js.Any]) | Null)*
    ): Self = StObject.set(x, "pr", js.Array(value :_*))
  }
}
