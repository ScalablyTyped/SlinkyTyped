package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugConsole extends js.Object {
  /**
  		 * Append the given value to the debug console.
  		 *
  		 * @param value A string, falsy values will not be printed.
  		 */
  def append(value: String): Unit = js.native
  /**
  		 * Append the given value and a line feed character
  		 * to the debug console.
  		 *
  		 * @param value A string, falsy values will be printed.
  		 */
  def appendLine(value: String): Unit = js.native
}

object DebugConsole {
  @scala.inline
  def apply(append: String => Unit, appendLine: String => Unit): DebugConsole = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendLine = js.Any.fromFunction1(appendLine))
    __obj.asInstanceOf[DebugConsole]
  }
  @scala.inline
  implicit class DebugConsoleOps[Self <: DebugConsole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAppendLine(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendLine")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

