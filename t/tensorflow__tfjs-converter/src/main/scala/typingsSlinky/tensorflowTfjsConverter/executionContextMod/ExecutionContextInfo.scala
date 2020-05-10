package typingsSlinky.tensorflowTfjsConverter.executionContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionContextInfo extends js.Object {
  var frameName: String = js.native
  var id: Double = js.native
  var iterationId: Double = js.native
}

object ExecutionContextInfo {
  @scala.inline
  def apply(frameName: String, id: Double, iterationId: Double): ExecutionContextInfo = {
    val __obj = js.Dynamic.literal(frameName = frameName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iterationId = iterationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextInfo]
  }
  @scala.inline
  implicit class ExecutionContextInfoOps[Self <: ExecutionContextInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrameName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterationId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

