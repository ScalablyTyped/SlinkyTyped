package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexGrowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The flex-grow CSS property sets the flex grow factor of a flex item main size. It specifies how much of the
    * remaining space in the flex container should be assigned to the item (the flex grow factor).
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-grow)
    */
  var flexGrow: js.UndefOr[ResponsiveValue[GlobalsNumber, ThemeType]] = js.native
}

object FlexGrowProps {
  @scala.inline
  def apply[ThemeType](): FlexGrowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexGrowProps[ThemeType]]
  }
  @scala.inline
  implicit class FlexGrowPropsOps[Self[themetype] <: FlexGrowProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withFlexGrow(value: ResponsiveValue[GlobalsNumber, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexGrow: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexGrowNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexGrow")(null)
        ret
    }
  }
  
}

