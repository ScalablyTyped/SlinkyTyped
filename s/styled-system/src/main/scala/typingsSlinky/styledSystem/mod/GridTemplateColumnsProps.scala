package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridTemplateColumnsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The grid-template-columns CSS property defines the line names and track sizing functions of the grid columns.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns)
    */
  var gridTemplateColumns: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridTemplateColumnsProps {
  @scala.inline
  def apply[ThemeType, TVal](): GridTemplateColumnsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateColumnsProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridTemplateColumnsPropsOps[Self[themetype, tval] <: GridTemplateColumnsProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withGridTemplateColumns(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridTemplateColumns: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGridTemplateColumnsNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridTemplateColumns")(null)
        ret
    }
  }
  
}

