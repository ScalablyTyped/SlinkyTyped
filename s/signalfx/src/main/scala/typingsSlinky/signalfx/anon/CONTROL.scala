package typingsSlinky.signalfx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CONTROL extends js.Object {
  var CONTROL: String = js.native
  var DATA: String = js.native
  var EVENT: String = js.native
  var METADATA: String = js.native
}

object CONTROL {
  @scala.inline
  def apply(CONTROL: String, DATA: String, EVENT: String, METADATA: String): CONTROL = {
    val __obj = js.Dynamic.literal(CONTROL = CONTROL.asInstanceOf[js.Any], DATA = DATA.asInstanceOf[js.Any], EVENT = EVENT.asInstanceOf[js.Any], METADATA = METADATA.asInstanceOf[js.Any])
    __obj.asInstanceOf[CONTROL]
  }
  @scala.inline
  implicit class CONTROLOps[Self <: CONTROL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCONTROL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONTROL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDATA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEVENT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMETADATA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("METADATA")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

