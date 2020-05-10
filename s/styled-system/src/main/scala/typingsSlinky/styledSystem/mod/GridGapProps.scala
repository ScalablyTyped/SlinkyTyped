package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridGapProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The gap CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for row-gap
    * and column-gap.
    *
    * @deprecated use gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/gap)
    */
  var gridGap: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridGapProps {
  @scala.inline
  def apply[ThemeType, TVal](): GridGapProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridGapProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridGapPropsOps[Self[themetype, tval] <: GridGapProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withGridGap(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridGap: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridGap")(js.undefined)
        ret
    }
    @scala.inline
    def withGridGapNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridGap")(null)
        ret
    }
  }
  
}

