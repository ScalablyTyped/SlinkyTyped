package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpacityProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The opacity CSS property sets the transparency of an element or the degree to which content
    * behind an element is visible.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
    */
  var opacity: js.UndefOr[ResponsiveValue[GlobalsNumber, ThemeType]] = js.native
}

object OpacityProps {
  @scala.inline
  def apply[ThemeType](): OpacityProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpacityProps[ThemeType]]
  }
  @scala.inline
  implicit class OpacityPropsOps[Self[themetype] <: OpacityProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withOpacity(value: ResponsiveValue[GlobalsNumber, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacityNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(null)
        ret
    }
  }
  
}

