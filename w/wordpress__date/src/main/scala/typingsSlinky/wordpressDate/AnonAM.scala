package typingsSlinky.wordpressDate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAM extends js.Object {
  var AM: String = js.native
  var PM: String = js.native
  var am: String = js.native
  var pm: String = js.native
}

object AnonAM {
  @scala.inline
  def apply(AM: String, PM: String, am: String, pm: String): AnonAM = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], am = am.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAM]
  }
  @scala.inline
  implicit class AnonAMOps[Self <: AnonAM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

