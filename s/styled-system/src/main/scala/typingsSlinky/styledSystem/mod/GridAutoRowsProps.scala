package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAutoRowsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The grid-auto-rows CSS property specifies the size of an implicitly-created grid row track.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows)
    */
  var gridAutoRows: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridAutoRowsProps {
  @scala.inline
  def apply[ThemeType, TVal](): GridAutoRowsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoRowsProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridAutoRowsPropsOps[Self[themetype, tval] <: GridAutoRowsProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withGridAutoRows(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAutoRows: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoRows")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAutoRowsNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoRows")(null)
        ret
    }
  }
  
}

