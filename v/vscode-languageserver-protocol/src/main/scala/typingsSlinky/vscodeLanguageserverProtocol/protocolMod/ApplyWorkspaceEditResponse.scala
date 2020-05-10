package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyWorkspaceEditResponse extends js.Object {
  /**
    * Indicates whether the edit was applied or not.
    */
  var applied: Boolean = js.native
  /**
    * Depending on the client's failure handling strategy `failedChange` might
    * contain the index of the change that failed. This property is only available
    * if the client signals a `failureHandlingStrategy` in its client capabilities.
    */
  var failedChange: js.UndefOr[Double] = js.native
}

object ApplyWorkspaceEditResponse {
  @scala.inline
  def apply(applied: Boolean): ApplyWorkspaceEditResponse = {
    val __obj = js.Dynamic.literal(applied = applied.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyWorkspaceEditResponse]
  }
  @scala.inline
  implicit class ApplyWorkspaceEditResponseOps[Self <: ApplyWorkspaceEditResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplied(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedChange")(js.undefined)
        ret
    }
  }
  
}

