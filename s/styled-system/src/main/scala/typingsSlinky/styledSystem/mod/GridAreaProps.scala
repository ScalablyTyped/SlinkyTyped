package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.GridAreaProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAreaProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The grid-area CSS property is a shorthand property for grid-row-start, grid-column-start, grid-row-end
    * and grid-column-end, specifying a grid item’s size and location within the grid row by contributing a line,
    * a span, or nothing (automatic) to its grid placement, thereby specifying the edges of its grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-area)
    */
  var gridArea: js.UndefOr[ResponsiveValue[GridAreaProperty, ThemeType]] = js.native
}

object GridAreaProps {
  @scala.inline
  def apply[ThemeType](): GridAreaProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAreaProps[ThemeType]]
  }
  @scala.inline
  implicit class GridAreaPropsOps[Self[themetype] <: GridAreaProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withGridArea(value: ResponsiveValue[GridAreaProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridArea: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridArea")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAreaNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridArea")(null)
        ret
    }
  }
  
}

