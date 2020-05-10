package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreated extends js.Object {
  var created: Double = js.native
  var pendingUpload: Double = js.native
}

object AnonCreated {
  @scala.inline
  def apply(created: Double, pendingUpload: Double): AnonCreated = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], pendingUpload = pendingUpload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreated]
  }
  @scala.inline
  implicit class AnonCreatedOps[Self <: AnonCreated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingUpload(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingUpload")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

