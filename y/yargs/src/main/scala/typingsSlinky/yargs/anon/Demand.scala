package typingsSlinky.yargs.anon

import typingsSlinky.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Demand extends js.Object {
  var demand: java.lang.String | `true` = js.native
}

object Demand {
  @scala.inline
  def apply(demand: java.lang.String | `true`): Demand = {
    val __obj = js.Dynamic.literal(demand = demand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Demand]
  }
  @scala.inline
  implicit class DemandOps[Self <: Demand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDemand(value: java.lang.String | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

