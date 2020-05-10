package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugSessionOptions extends js.Object {
  /**
  		 * Controls whether this session should have a separate debug console or share it
  		 * with the parent session. Has no effect for sessions which do not have a parent session.
  		 * Defaults to Separate.
  		 */
  var consoleMode: js.UndefOr[DebugConsoleMode] = js.native
  /**
  		 * When specified the newly created debug session is registered as a "child" session of this
  		 * "parent" debug session.
  		 */
  var parentSession: js.UndefOr[DebugSession] = js.native
}

object DebugSessionOptions {
  @scala.inline
  def apply(): DebugSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugSessionOptions]
  }
  @scala.inline
  implicit class DebugSessionOptionsOps[Self <: DebugSessionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsoleMode(value: DebugConsoleMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsoleMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleMode")(js.undefined)
        ret
    }
    @scala.inline
    def withParentSession(value: DebugSession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSession")(js.undefined)
        ret
    }
  }
  
}

