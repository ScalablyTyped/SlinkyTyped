package typingsSlinky.vscodeLanguageclient

import typingsSlinky.vscodeLanguageclient.mod.Executable
import typingsSlinky.vscodeLanguageclient.mod._ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDebug extends _ServerOptions {
  var debug: Executable = js.native
  var run: Executable = js.native
}

object AnonDebug {
  @scala.inline
  def apply(debug: Executable, run: Executable): AnonDebug = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDebug]
  }
  @scala.inline
  implicit class AnonDebugOps[Self <: AnonDebug] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebug(value: Executable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: Executable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

