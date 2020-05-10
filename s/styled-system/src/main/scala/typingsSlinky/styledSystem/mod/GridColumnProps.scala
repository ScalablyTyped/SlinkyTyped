package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.GridColumnProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumnProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The grid-column CSS property is a shorthand property for grid-column-start and grid-column-end specifying
    * a grid item's size and location within the grid column by contributing a line, a span, or nothing (automatic)
    * to its grid placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-column)
    */
  var gridColumn: js.UndefOr[ResponsiveValue[GridColumnProperty, ThemeType]] = js.native
}

object GridColumnProps {
  @scala.inline
  def apply[ThemeType](): GridColumnProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnProps[ThemeType]]
  }
  @scala.inline
  implicit class GridColumnPropsOps[Self[themetype] <: GridColumnProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withGridColumn(value: ResponsiveValue[GridColumnProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridColumn: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withGridColumnNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridColumn")(null)
        ret
    }
  }
  
}

