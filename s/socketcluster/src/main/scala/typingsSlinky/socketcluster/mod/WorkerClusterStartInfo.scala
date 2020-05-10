package typingsSlinky.socketcluster.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerClusterStartInfo extends js.Object {
  var childProcess: ChildProcess = js.native
  var pid: Double = js.native
}

object WorkerClusterStartInfo {
  @scala.inline
  def apply(childProcess: ChildProcess, pid: Double): WorkerClusterStartInfo = {
    val __obj = js.Dynamic.literal(childProcess = childProcess.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerClusterStartInfo]
  }
  @scala.inline
  implicit class WorkerClusterStartInfoOps[Self <: WorkerClusterStartInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildProcess(value: ChildProcess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

