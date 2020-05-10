package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeEventTypeInformation extends js.Object {
  var includeEventTypeInformation: Double = js.native
  var includeGroup: Double = js.native
  var includeUser: Double = js.native
  var includeUserAndGroup: Double = js.native
  var none: Double = js.native
}

object AnonIncludeEventTypeInformation {
  @scala.inline
  def apply(
    includeEventTypeInformation: Double,
    includeGroup: Double,
    includeUser: Double,
    includeUserAndGroup: Double,
    none: Double
  ): AnonIncludeEventTypeInformation = {
    val __obj = js.Dynamic.literal(includeEventTypeInformation = includeEventTypeInformation.asInstanceOf[js.Any], includeGroup = includeGroup.asInstanceOf[js.Any], includeUser = includeUser.asInstanceOf[js.Any], includeUserAndGroup = includeUserAndGroup.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeEventTypeInformation]
  }
  @scala.inline
  implicit class AnonIncludeEventTypeInformationOps[Self <: AnonIncludeEventTypeInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeEventTypeInformation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEventTypeInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeGroup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeUser(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeUserAndGroup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUserAndGroup")(value.asInstanceOf[js.Any])
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

