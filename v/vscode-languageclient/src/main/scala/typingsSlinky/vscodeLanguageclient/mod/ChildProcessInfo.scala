package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProcessInfo extends js.Object {
  var detached: Boolean = js.native
  var process: ChildProcess = js.native
}

object ChildProcessInfo {
  @scala.inline
  def apply(detached: Boolean, process: ChildProcess): ChildProcessInfo = {
    val __obj = js.Dynamic.literal(detached = detached.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildProcessInfo]
  }
  @scala.inline
  implicit class ChildProcessInfoOps[Self <: ChildProcessInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcess(value: ChildProcess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

