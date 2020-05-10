package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Global settings for the workspace. */
@js.native
trait WorkspaceSystemSettings extends js.Object {
  /** Workspace settings related to the disambiguation feature. **Note:** This feature is available only to Premium users. */
  var disambiguation: js.UndefOr[WorkspaceSystemSettingsDisambiguation] = js.native
  /** For internal use only. */
  var human_agent_assist: js.UndefOr[js.Object] = js.native
  /** Workspace settings related to the Watson Assistant tool. */
  var tooling: js.UndefOr[WorkspaceSystemSettingsTooling] = js.native
}

object WorkspaceSystemSettings {
  @scala.inline
  def apply(): WorkspaceSystemSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSystemSettings]
  }
  @scala.inline
  implicit class WorkspaceSystemSettingsOps[Self <: WorkspaceSystemSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisambiguation(value: WorkspaceSystemSettingsDisambiguation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disambiguation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisambiguation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disambiguation")(js.undefined)
        ret
    }
    @scala.inline
    def withHuman_agent_assist(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("human_agent_assist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHuman_agent_assist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("human_agent_assist")(js.undefined)
        ret
    }
    @scala.inline
    def withTooling(value: WorkspaceSystemSettingsTooling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooling")(js.undefined)
        ret
    }
  }
  
}

