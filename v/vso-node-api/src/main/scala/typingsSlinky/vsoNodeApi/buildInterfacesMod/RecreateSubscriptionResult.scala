package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecreateSubscriptionResult extends js.Object {
  var eventType: String = js.native
  var repositoryType: String = js.native
}

object RecreateSubscriptionResult {
  @scala.inline
  def apply(eventType: String, repositoryType: String): RecreateSubscriptionResult = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], repositoryType = repositoryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecreateSubscriptionResult]
  }
  @scala.inline
  implicit class RecreateSubscriptionResultOps[Self <: RecreateSubscriptionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

