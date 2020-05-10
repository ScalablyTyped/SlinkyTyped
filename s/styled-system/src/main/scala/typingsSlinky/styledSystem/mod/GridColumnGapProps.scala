package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumnGapProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The column-gap CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * @deprecated use column-gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/column-gap)
    */
  var gridColumnGap: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridColumnGapProps {
  @scala.inline
  def apply[ThemeType, TVal](): GridColumnGapProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnGapProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridColumnGapPropsOps[Self[themetype, tval] <: GridColumnGapProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withGridColumnGap(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumnGap: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnGap")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColumnGapNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumnGap")(null)
        ret
    }
  }
  
}

