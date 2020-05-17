package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a TryCreateFolderAsync operation. */
@js.native
trait EmailMailboxCreateFolderResult extends js.Object {
  /** Get the newly created folder after a TryCreateFolderAsync operation. */
  var folder: EmailFolder = js.native
  /** Gets the status of a TryCreateFolderAsync operation. */
  var status: EmailMailboxCreateFolderStatus = js.native
}

object EmailMailboxCreateFolderResult {
  @scala.inline
  def apply(folder: EmailFolder, status: EmailMailboxCreateFolderStatus): EmailMailboxCreateFolderResult = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxCreateFolderResult]
  }
  @scala.inline
  implicit class EmailMailboxCreateFolderResultOps[Self <: EmailMailboxCreateFolderResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFolder(value: EmailFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: EmailMailboxCreateFolderStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

