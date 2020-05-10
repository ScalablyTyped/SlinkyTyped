package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Workspace settings related to the disambiguation feature. **Note:** This feature is available only to Premium users. */
@js.native
trait WorkspaceSystemSettingsDisambiguation extends js.Object {
  /** Whether the disambiguation feature is enabled for the workspace. */
  var enabled: js.UndefOr[Boolean] = js.native
  /** The user-facing label for the option users can select if none of the suggested options is correct. If no value is specified for this property, this option does not appear. */
  var none_of_the_above_prompt: js.UndefOr[String] = js.native
  /** The text of the introductory prompt that accompanies disambiguation options presented to the user. */
  var prompt: js.UndefOr[String] = js.native
  /** The sensitivity of the disambiguation feature to intent detection conflicts. Set to **high** if you want the disambiguation feature to be triggered more often. This can be useful for testing or demonstration purposes. */
  var sensitivity: js.UndefOr[String] = js.native
}

object WorkspaceSystemSettingsDisambiguation {
  @scala.inline
  def apply(): WorkspaceSystemSettingsDisambiguation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSystemSettingsDisambiguation]
  }
  @scala.inline
  implicit class WorkspaceSystemSettingsDisambiguationOps[Self <: WorkspaceSystemSettingsDisambiguation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withNone_of_the_above_prompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none_of_the_above_prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNone_of_the_above_prompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none_of_the_above_prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withSensitivity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitivity")(js.undefined)
        ret
    }
  }
  
}

