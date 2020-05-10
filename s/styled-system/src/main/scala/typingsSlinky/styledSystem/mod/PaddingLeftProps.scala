package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<styled-system.styled-system.SpaceProps<ThemeType, styled-system.styled-system.ThemeValue<'space', ThemeType, any>>, 'pl' | 'paddingLeft'> */
@js.native
trait PaddingLeftProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var paddingLeft: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
  var pl: js.UndefOr[
    ResponsiveValue[
      ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
      ThemeType
    ]
  ] = js.native
}

object PaddingLeftProps {
  @scala.inline
  def apply[ThemeType](): PaddingLeftProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingLeftProps[ThemeType]]
  }
  @scala.inline
  implicit class PaddingLeftPropsOps[Self[themetype] <: PaddingLeftProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withPaddingLeft(
      value: ResponsiveValue[
          ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingLeft: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingLeftNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingLeft")(null)
        ret
    }
    @scala.inline
    def withPl(
      value: ResponsiveValue[
          ThemeValue[typingsSlinky.styledSystem.styledSystemStrings.space, ThemeType, _], 
          ThemeType
        ]
    ): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPl: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl")(js.undefined)
        ret
    }
    @scala.inline
    def withPlNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pl")(null)
        ret
    }
  }
  
}

