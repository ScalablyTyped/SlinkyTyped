package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pt' | 'paddingTop'> */
@js.native
trait PaddingTopProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var paddingTop: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var pt: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
}

object PaddingTopProps {
  @scala.inline
  def apply[ThemeType](): PaddingTopProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingTopProps[ThemeType]]
  }
  @scala.inline
  implicit class PaddingTopPropsOps[Self[themetype] <: PaddingTopProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withPaddingTop(
      value: ResponsiveValue[
          ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingTop: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingTopNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingTop")(null)
        ret
    }
    @scala.inline
    def withPt(
      value: ResponsiveValue[
          ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPt: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(js.undefined)
        ret
    }
    @scala.inline
    def withPtNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pt")(null)
        ret
    }
  }
  
}

