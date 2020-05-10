package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pb' | 'paddingBottom'> */
@js.native
trait PaddingBottomProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var paddingBottom: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var pb: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
}

object PaddingBottomProps {
  @scala.inline
  def apply[ThemeType](): PaddingBottomProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingBottomProps[ThemeType]]
  }
  @scala.inline
  implicit class PaddingBottomPropsOps[Self[themetype] <: PaddingBottomProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withPaddingBottom(
      value: ResponsiveValue[
          ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingBottom: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingBottomNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingBottom")(null)
        ret
    }
    @scala.inline
    def withPb(
      value: ResponsiveValue[
          ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPb: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pb")(js.undefined)
        ret
    }
    @scala.inline
    def withPbNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pb")(null)
        ret
    }
  }
  
}

