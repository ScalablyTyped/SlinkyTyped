package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.JustifyItemsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JustifyItemsProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The CSS justify-items property defines the default justify-self for all items of the box, giving them all
    * a default way of justifying each box along the appropriate axis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-items)
    */
  var justifyItems: js.UndefOr[ResponsiveValue[JustifyItemsProperty, ThemeType]] = js.native
}

object JustifyItemsProps {
  @scala.inline
  def apply[ThemeType](): JustifyItemsProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyItemsProps[ThemeType]]
  }
  @scala.inline
  implicit class JustifyItemsPropsOps[Self[themetype] <: JustifyItemsProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withJustifyItems(value: ResponsiveValue[JustifyItemsProperty, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustifyItems: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyItems")(js.undefined)
        ret
    }
    @scala.inline
    def withJustifyItemsNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justifyItems")(null)
        ret
    }
  }
  
}

