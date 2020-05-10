package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexShrinkProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The flex-shrink CSS property sets the flex shrink factor of a flex item. If the size of all flex items is larger
    * than the flex container, items shrink to fit according to flex-shrink.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-shrink)
    */
  var flexShrink: js.UndefOr[ResponsiveValue[GlobalsNumber, ThemeType]] = js.native
}

object FlexShrinkProps {
  @scala.inline
  def apply[ThemeType](): FlexShrinkProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexShrinkProps[ThemeType]]
  }
  @scala.inline
  implicit class FlexShrinkPropsOps[Self[themetype] <: FlexShrinkProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withFlexShrink(value: ResponsiveValue[GlobalsNumber, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexShrink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexShrink: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexShrink")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexShrinkNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexShrink")(null)
        ret
    }
  }
  
}

