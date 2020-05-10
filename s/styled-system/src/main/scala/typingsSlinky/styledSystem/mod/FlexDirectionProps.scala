package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.FlexDirectionProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexDirectionProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The flex-direction CSS property specifies how flex items are placed in the flex container defining the main
    * axis and the direction (normal or reversed).
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction)
    */
  var flexDirection: js.UndefOr[ResponsiveValue[FlexDirectionProperty, ThemeType]] = js.native
}

object FlexDirectionProps {
  @scala.inline
  def apply[ThemeType](): FlexDirectionProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexDirectionProps[ThemeType]]
  }
  @scala.inline
  implicit class FlexDirectionPropsOps[Self[themetype] <: FlexDirectionProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withFlexDirection(value: ResponsiveValue[FlexDirectionProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexDirection: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexDirectionNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexDirection")(null)
        ret
    }
  }
  
}

