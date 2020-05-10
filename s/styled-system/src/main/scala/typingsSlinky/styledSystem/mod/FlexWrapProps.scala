package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.FlexWrapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexWrapProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The flex-wrap CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines.
    * If wrapping is allowed, it sets the direction that lines are stacked.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap)
    */
  var flexWrap: js.UndefOr[ResponsiveValue[FlexWrapProperty, ThemeType]] = js.native
}

object FlexWrapProps {
  @scala.inline
  def apply[ThemeType](): FlexWrapProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexWrapProps[ThemeType]]
  }
  @scala.inline
  implicit class FlexWrapPropsOps[Self[themetype] <: FlexWrapProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withFlexWrap(value: ResponsiveValue[FlexWrapProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexWrap: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexWrapNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexWrap")(null)
        ret
    }
  }
  
}

