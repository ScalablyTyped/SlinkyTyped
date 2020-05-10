package typingsSlinky.vscode.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clipboard extends js.Object {
  /**
  		 * Read the current clipboard contents as text.
  		 * @returns A thenable that resolves to a string.
  		 */
  def readText(): Thenable[String] = js.native
  /**
  		 * Writes text into the clipboard.
  		 * @returns A thenable that resolves when writing happened.
  		 */
  def writeText(value: String): Thenable[Unit] = js.native
}

object Clipboard {
  @scala.inline
  def apply(readText: () => Thenable[String], writeText: String => Thenable[Unit]): Clipboard = {
    val __obj = js.Dynamic.literal(readText = js.Any.fromFunction0(readText), writeText = js.Any.fromFunction1(writeText))
    __obj.asInstanceOf[Clipboard]
  }
  @scala.inline
  implicit class ClipboardOps[Self <: Clipboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadText(value: () => Thenable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWriteText(value: String => Thenable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

