package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a TryCreateFolderAsync operation. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxCreateFolderResult")
@js.native
abstract class EmailMailboxCreateFolderResult ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderResult {
  /** Get the newly created folder after a TryCreateFolderAsync operation. */
  /* CompleteClass */
  override var folder: typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailFolder = js.native
  /** Gets the status of a TryCreateFolderAsync operation. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus = js.native
}

