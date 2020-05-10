package typingsSlinky.yargs

import typingsSlinky.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDemand extends js.Object {
  var demand: String | `true` = js.native
}

object AnonDemand {
  @scala.inline
  def apply(demand: String | `true`): AnonDemand = {
    val __obj = js.Dynamic.literal(demand = demand.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDemand]
  }
  @scala.inline
  implicit class AnonDemandOps[Self <: AnonDemand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDemand(value: String | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

