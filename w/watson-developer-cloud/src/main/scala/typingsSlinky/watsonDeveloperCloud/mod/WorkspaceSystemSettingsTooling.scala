package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Workspace settings related to the Watson Assistant tool. */
@js.native
trait WorkspaceSystemSettingsTooling extends js.Object {
  /** Whether the dialog JSON editor displays text responses within the `output.generic` object. */
  var store_generic_responses: js.UndefOr[Boolean] = js.native
}

object WorkspaceSystemSettingsTooling {
  @scala.inline
  def apply(): WorkspaceSystemSettingsTooling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSystemSettingsTooling]
  }
  @scala.inline
  implicit class WorkspaceSystemSettingsToolingOps[Self <: WorkspaceSystemSettingsTooling] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStore_generic_responses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store_generic_responses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore_generic_responses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store_generic_responses")(js.undefined)
        ret
    }
  }
  
}

