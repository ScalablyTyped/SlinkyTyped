package typingsSlinky.vscode.vscodeMod

import typingsSlinky.vscode.Anon_NewUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileRenameEvent extends js.Object {
  /**
  		 * The files that got renamed.
  		 */
  val files: js.Array[Anon_NewUri]
}

object FileRenameEvent {
  @scala.inline
  def apply(files: js.Array[Anon_NewUri]): FileRenameEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileRenameEvent]
  }
}

