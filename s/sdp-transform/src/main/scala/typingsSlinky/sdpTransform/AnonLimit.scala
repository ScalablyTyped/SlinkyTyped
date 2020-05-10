package typingsSlinky.sdpTransform

import typingsSlinky.sdpTransform.sdpTransformStrings.AS
import typingsSlinky.sdpTransform.sdpTransformStrings.CT
import typingsSlinky.sdpTransform.sdpTransformStrings.RR
import typingsSlinky.sdpTransform.sdpTransformStrings.RS
import typingsSlinky.sdpTransform.sdpTransformStrings.TIAS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLimit extends js.Object {
  var limit: Double | String = js.native
  var `type`: TIAS | AS | CT | RR | RS = js.native
}

object AnonLimit {
  @scala.inline
  def apply(limit: Double | String, `type`: TIAS | AS | CT | RR | RS): AnonLimit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLimit]
  }
  @scala.inline
  implicit class AnonLimitOps[Self <: AnonLimit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TIAS | AS | CT | RR | RS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

