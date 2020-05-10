package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridRowGapProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The row-gap CSS property sets the size of the gap (gutter) between an element's rows.
    *
    * @deprecated use row-gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/row-gap)
    */
  var gridRowGap: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridRowGapProps {
  @scala.inline
  def apply[ThemeType, TVal](): GridRowGapProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRowGapProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridRowGapPropsOps[Self[themetype, tval] <: GridRowGapProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withGridRowGap(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRowGap: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowGap")(js.undefined)
        ret
    }
    @scala.inline
    def withGridRowGapNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRowGap")(null)
        ret
    }
  }
  
}

