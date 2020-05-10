package typingsSlinky.styledSystem.mod

import typingsSlinky.csstype.mod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
    * are sorted by ascending order value and then by their source code order.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
    */
  var order: js.UndefOr[ResponsiveValue[GlobalsNumber, ThemeType]] = js.native
}

object OrderProps {
  @scala.inline
  def apply[ThemeType](): OrderProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderProps[ThemeType]]
  }
  @scala.inline
  implicit class OrderPropsOps[Self[themetype] <: OrderProps[themetype], ThemeType] (val x: Self[ThemeType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ThemeType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ThemeType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ThemeType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ThemeType] with Other]
    @scala.inline
    def withOrder(value: ResponsiveValue[GlobalsNumber, ThemeType]): Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderNull: Self[ThemeType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(null)
        ret
    }
  }
  
}

