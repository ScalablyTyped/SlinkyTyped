package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncGitOperationNotification extends js.Object {
  var operationId: Double = js.native
}

object AsyncGitOperationNotification {
  @scala.inline
  def apply(operationId: Double): AsyncGitOperationNotification = {
    val __obj = js.Dynamic.literal(operationId = operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncGitOperationNotification]
  }
  @scala.inline
  implicit class AsyncGitOperationNotificationOps[Self <: AsyncGitOperationNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

