package typingsSlinky.vegaTypings.anon

import typingsSlinky.vegaTypings.scaleMod.SortOrder
import typingsSlinky.vegaTypings.scaleMod.UnionSortField
import typingsSlinky.vegaTypings.vegaTypingsStrings.count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpOrder extends UnionSortField {
  var op: count = js.native
  var order: js.UndefOr[SortOrder] = js.native
}

object OpOrder {
  @scala.inline
  def apply(op: count): OpOrder = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpOrder]
  }
  @scala.inline
  implicit class OpOrderOps[Self <: OpOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOp(value: count): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: SortOrder): Self = {
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

