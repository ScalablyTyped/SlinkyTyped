package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.BottomProperty
import typingsSlinky.csstype.mod.LeftProperty
import typingsSlinky.csstype.mod.PositionProperty
import typingsSlinky.csstype.mod.RightProperty
import typingsSlinky.csstype.mod.TopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends ZIndexProps[ThemeType]
     with TopProps[ThemeType, TopProperty[TLengthStyledSystem]]
     with RightProps[ThemeType, RightProperty[TLengthStyledSystem]]
     with BottomProps[ThemeType, BottomProperty[TLengthStyledSystem]]
     with LeftProps[ThemeType, LeftProperty[TLengthStyledSystem]] {
  /**
    * The position CSS property specifies how an element is positioned in a document.
    * The top, right, bottom, and left properties determine the final location of positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/position)
    */
  var position: js.UndefOr[ResponsiveValue[PositionProperty, ThemeType]] = js.native
}

object PositionProps {
  @scala.inline
  def apply[ThemeType](): PositionProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionProps[ThemeType]]
  }
  @scala.inline
  implicit class PositionPropsOps[Self[themetype] <: PositionProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withPosition(value: ResponsiveValue[PositionProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(null)
        ret
    }
  }
  
}

