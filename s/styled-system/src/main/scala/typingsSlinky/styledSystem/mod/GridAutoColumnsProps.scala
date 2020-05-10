package typingsSlinky.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAutoColumnsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The grid-auto-columns CSS property specifies the size of an implicitly-created grid column track.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns)
    */
  var gridAutoColumns: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object GridAutoColumnsProps {
  @scala.inline
  def apply[ThemeType, TVal](): GridAutoColumnsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoColumnsProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class GridAutoColumnsPropsOps[Self[themetype, tval] <: GridAutoColumnsProps[themetype, tval], ThemeType, TVal] (val x: Self[ThemeType, TVal]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType, TVal] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType, TVal]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[ThemeType, TVal]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[ThemeType, TVal]) with Other]
    @scala.inline
    def withGridAutoColumns(value: ResponsiveValue[TVal, ThemeType]): Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridAutoColumns: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGridAutoColumnsNull: Self[ThemeType, TVal] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridAutoColumns")(null)
        ret
    }
  }
  
}

