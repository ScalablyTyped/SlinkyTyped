package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlwaysReturnBasicInformation extends js.Object {
  var alwaysReturnBasicInformation: scala.Double = js.native
  var includeDeletedSubscriptions: scala.Double = js.native
  var includeFilterDetails: scala.Double = js.native
  var includeInvalidSubscriptions: scala.Double = js.native
  var none: scala.Double = js.native
}

object AlwaysReturnBasicInformation {
  @scala.inline
  def apply(
    alwaysReturnBasicInformation: scala.Double,
    includeDeletedSubscriptions: scala.Double,
    includeFilterDetails: scala.Double,
    includeInvalidSubscriptions: scala.Double,
    none: scala.Double
  ): AlwaysReturnBasicInformation = {
    val __obj = js.Dynamic.literal(alwaysReturnBasicInformation = alwaysReturnBasicInformation.asInstanceOf[js.Any], includeDeletedSubscriptions = includeDeletedSubscriptions.asInstanceOf[js.Any], includeFilterDetails = includeFilterDetails.asInstanceOf[js.Any], includeInvalidSubscriptions = includeInvalidSubscriptions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlwaysReturnBasicInformation]
  }
  @scala.inline
  implicit class AlwaysReturnBasicInformationOps[Self <: AlwaysReturnBasicInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysReturnBasicInformation(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysReturnBasicInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeDeletedSubscriptions(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeletedSubscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeFilterDetails(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFilterDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeInvalidSubscriptions(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInvalidSubscriptions")(value.asInstanceOf[js.Any])
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

