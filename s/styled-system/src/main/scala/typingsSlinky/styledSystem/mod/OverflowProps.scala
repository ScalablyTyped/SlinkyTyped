package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.OverflowProperty
import typingsSlinky.csstype.mod.OverflowXProperty
import typingsSlinky.csstype.mod.OverflowYProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverflowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The overflow CSS property sets what to do when an element's content is too big to fit in its block
    * formatting context. It is a shorthand for overflow-x and overflow-y.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
    */
  var overflow: js.UndefOr[ResponsiveValue[OverflowProperty, ThemeType]] = js.native
  /**
    * The overflow-x CSS property sets what shows when content overflows a block-level element's left
    * and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
    */
  var overflowX: js.UndefOr[ResponsiveValue[OverflowXProperty, ThemeType]] = js.native
  /**
    * The overflow-y CSS property sets what shows when content overflows a block-level element's top
    * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
    */
  var overflowY: js.UndefOr[ResponsiveValue[OverflowYProperty, ThemeType]] = js.native
}

object OverflowProps {
  @scala.inline
  def apply[ThemeType](): OverflowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverflowProps[ThemeType]]
  }
  @scala.inline
  implicit class OverflowPropsOps[Self[themetype] <: OverflowProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withOverflow(value: ResponsiveValue[OverflowProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflow: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(null)
        ret
    }
    @scala.inline
    def withOverflowX(value: ResponsiveValue[OverflowXProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowX: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowX")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowXNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowX")(null)
        ret
    }
    @scala.inline
    def withOverflowY(value: ResponsiveValue[OverflowYProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowY: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowYNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowY")(null)
        ret
    }
  }
  
}

