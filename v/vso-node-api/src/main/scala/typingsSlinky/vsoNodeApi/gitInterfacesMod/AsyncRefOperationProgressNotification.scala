package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncRefOperationProgressNotification extends AsyncRefOperationCommitLevelEventNotification {
  var progress: Double = js.native
}

object AsyncRefOperationProgressNotification {
  @scala.inline
  def apply(commitId: String, operationId: Double, progress: Double): AsyncRefOperationProgressNotification = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncRefOperationProgressNotification]
  }
  @scala.inline
  implicit class AsyncRefOperationProgressNotificationOps[Self <: AsyncRefOperationProgressNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

