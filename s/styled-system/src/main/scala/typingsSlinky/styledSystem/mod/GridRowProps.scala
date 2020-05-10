package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.GridRowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridRowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The grid-row CSS property is a shorthand property for grid-row-start and grid-row-end specifying a grid item’s
    * size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid
    * placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row)
    */
  var gridRow: js.UndefOr[ResponsiveValue[GridRowProperty, ThemeType]] = js.native
}

object GridRowProps {
  @scala.inline
  def apply[ThemeType](): GridRowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRowProps[ThemeType]]
  }
  @scala.inline
  implicit class GridRowPropsOps[Self[themetype] <: GridRowProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withGridRow(value: ResponsiveValue[GridRowProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridRow: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRow")(js.undefined)
        ret
    }
    @scala.inline
    def withGridRowNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridRow")(null)
        ret
    }
  }
  
}

