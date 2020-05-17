package typingsSlinky.vortexWebClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runtime extends js.Object {
  var Runtime: typingsSlinky.vortexWebClient.DDS.Runtime = js.native
}

object Runtime {
  @scala.inline
  def apply(Runtime: typingsSlinky.vortexWebClient.DDS.Runtime): Runtime = {
    val __obj = js.Dynamic.literal(Runtime = Runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runtime]
  }
  @scala.inline
  implicit class RuntimeOps[Self <: Runtime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuntime(value: typingsSlinky.vortexWebClient.DDS.Runtime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Runtime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

