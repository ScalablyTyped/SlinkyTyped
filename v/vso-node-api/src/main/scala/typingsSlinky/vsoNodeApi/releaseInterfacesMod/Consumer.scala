package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Consumer extends js.Object {
  var consumerId: Double = js.native
  var consumerName: String = js.native
}

object Consumer {
  @scala.inline
  def apply(consumerId: Double, consumerName: String): Consumer = {
    val __obj = js.Dynamic.literal(consumerId = consumerId.asInstanceOf[js.Any], consumerName = consumerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consumer]
  }
  @scala.inline
  implicit class ConsumerOps[Self <: Consumer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

