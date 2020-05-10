package typingsSlinky.xstyledSystem.mod

import typingsSlinky.csstype.mod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderProps extends js.Object {
  val order: js.UndefOr[ResponsiveValue[GlobalsNumber]] = js.native
}

object OrderProps {
  @scala.inline
  def apply(): OrderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderProps]
  }
  @scala.inline
  implicit class OrderPropsOps[Self <: OrderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrder(value: ResponsiveValue[GlobalsNumber]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
  }
  
}

