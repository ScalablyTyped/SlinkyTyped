package typingsSlinky.vortexWebClient

import typingsSlinky.vortexWebClient.DDS_.Runtime_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRuntime extends js.Object {
  var Runtime: Runtime_ = js.native
}

object AnonRuntime {
  @scala.inline
  def apply(Runtime: Runtime_): AnonRuntime = {
    val __obj = js.Dynamic.literal(Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRuntime]
  }
  @scala.inline
  implicit class AnonRuntimeOps[Self <: AnonRuntime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuntime(value: Runtime_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Runtime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

