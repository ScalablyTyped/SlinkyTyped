package typingsSlinky.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProcess extends js.Object {
  var State: js.Any = js.native
  var process: js.Any = js.native
  var ruler: AnonAfter = js.native
}

object AnonProcess {
  @scala.inline
  def apply(State: js.Any, process: js.Any, ruler: AnonAfter): AnonProcess = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProcess]
  }
  @scala.inline
  implicit class AnonProcessOps[Self <: AnonProcess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcess(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuler(value: AnonAfter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruler")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

