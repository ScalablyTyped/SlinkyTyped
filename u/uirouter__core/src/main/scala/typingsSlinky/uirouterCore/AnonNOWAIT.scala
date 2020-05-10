package typingsSlinky.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNOWAIT extends js.Object {
  var NOWAIT: String = js.native
  var WAIT: String = js.native
}

object AnonNOWAIT {
  @scala.inline
  def apply(NOWAIT: String, WAIT: String): AnonNOWAIT = {
    val __obj = js.Dynamic.literal(NOWAIT = NOWAIT.asInstanceOf[js.Any], WAIT = WAIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNOWAIT]
  }
  @scala.inline
  implicit class AnonNOWAITOps[Self <: AnonNOWAIT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNOWAIT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOWAIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWAIT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WAIT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

