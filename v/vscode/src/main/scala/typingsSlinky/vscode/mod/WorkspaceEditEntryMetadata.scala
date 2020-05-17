package typingsSlinky.vscode.mod

import typingsSlinky.vscode.anon.Dark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceEditEntryMetadata extends js.Object {
  /**
  		 * A human-readable string which is rendered less prominent on the same line.
  		 */
  var description: js.UndefOr[String] = js.native
  /**
  		 * The icon path or [ThemeIcon](#ThemeIcon) for the edit.
  		 */
  var iconPath: js.UndefOr[Uri | Dark | ThemeIcon] = js.native
  /**
  		 * A human-readable string which is rendered prominent.
  		 */
  var label: String = js.native
  /**
  		 * A flag which indicates that user confirmation is needed.
  		 */
  var needsConfirmation: Boolean = js.native
}

object WorkspaceEditEntryMetadata {
  @scala.inline
  def apply(label: String, needsConfirmation: Boolean): WorkspaceEditEntryMetadata = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], needsConfirmation = needsConfirmation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceEditEntryMetadata]
  }
  @scala.inline
  implicit class WorkspaceEditEntryMetadataOps[Self <: WorkspaceEditEntryMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedsConfirmation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needsConfirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withIconPath(value: Uri | Dark | ThemeIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPath")(js.undefined)
        ret
    }
  }
  
}

