package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.GridAutoFlowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAutoFlowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The grid-auto-flow CSS property controls how the auto-placement algorithm works, specifying exactly
    * how auto-placed items get flowed into the grid.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-flow)
    */
  var gridAutoFlow: js.UndefOr[ResponsiveValue[GridAutoFlowProperty, ThemeType]] = js.native
}

object GridAutoFlowProps {
  @scala.inline
  def apply[ThemeType](): GridAutoFlowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoFlowProps[ThemeType]]
  }
  @scala.inline
  implicit class GridAutoFlowPropsOps[Self[themetype] <: GridAutoFlowProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withGridAutoFlow(value: ResponsiveValue[GridAutoFlowProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoFlow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAutoFlow: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoFlow")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAutoFlowNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoFlow")(null)
        ret
    }
  }
  
}

