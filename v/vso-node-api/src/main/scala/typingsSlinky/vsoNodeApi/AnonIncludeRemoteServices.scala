package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeRemoteServices extends js.Object {
  var includeRemoteServices: Double = js.native
  var none: Double = js.native
}

object AnonIncludeRemoteServices {
  @scala.inline
  def apply(includeRemoteServices: Double, none: Double): AnonIncludeRemoteServices = {
    val __obj = js.Dynamic.literal(includeRemoteServices = includeRemoteServices.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeRemoteServices]
  }
  @scala.inline
  implicit class AnonIncludeRemoteServicesOps[Self <: AnonIncludeRemoteServices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeRemoteServices(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeRemoteServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

