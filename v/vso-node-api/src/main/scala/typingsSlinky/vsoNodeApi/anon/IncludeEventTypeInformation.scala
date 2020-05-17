package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeEventTypeInformation extends js.Object {
  var includeEventTypeInformation: scala.Double = js.native
  var includeGroup: scala.Double = js.native
  var includeUser: scala.Double = js.native
  var includeUserAndGroup: scala.Double = js.native
  var none: scala.Double = js.native
}

object IncludeEventTypeInformation {
  @scala.inline
  def apply(
    includeEventTypeInformation: scala.Double,
    includeGroup: scala.Double,
    includeUser: scala.Double,
    includeUserAndGroup: scala.Double,
    none: scala.Double
  ): IncludeEventTypeInformation = {
    val __obj = js.Dynamic.literal(includeEventTypeInformation = includeEventTypeInformation.asInstanceOf[js.Any], includeGroup = includeGroup.asInstanceOf[js.Any], includeUser = includeUser.asInstanceOf[js.Any], includeUserAndGroup = includeUserAndGroup.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeEventTypeInformation]
  }
  @scala.inline
  implicit class IncludeEventTypeInformationOps[Self <: IncludeEventTypeInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeEventTypeInformation(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEventTypeInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeGroup(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeUser(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeUserAndGroup(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeUserAndGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

