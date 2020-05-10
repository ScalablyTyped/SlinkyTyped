package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridTemplateRowsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The grid-template-rows CSS property defines the line names and track sizing functions of the grid rows.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/row-template-rows)
    */
  var gridTemplateRows: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridTemplateRowsProps {
  @scala.inline
  def apply[ThemeType, TVal](): GridTemplateRowsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateRowsProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridTemplateRowsPropsOps[Self[themetype, tval] <: GridTemplateRowsProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withGridTemplateRows(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplateRows: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateRows")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTemplateRowsNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateRows")(null)
        ret
    }
  }
  
}

