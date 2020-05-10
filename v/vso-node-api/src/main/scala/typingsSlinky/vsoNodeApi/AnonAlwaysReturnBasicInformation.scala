package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlwaysReturnBasicInformation extends js.Object {
  var alwaysReturnBasicInformation: Double = js.native
  var includeDeletedSubscriptions: Double = js.native
  var includeFilterDetails: Double = js.native
  var includeInvalidSubscriptions: Double = js.native
  var none: Double = js.native
}

object AnonAlwaysReturnBasicInformation {
  @scala.inline
  def apply(
    alwaysReturnBasicInformation: Double,
    includeDeletedSubscriptions: Double,
    includeFilterDetails: Double,
    includeInvalidSubscriptions: Double,
    none: Double
  ): AnonAlwaysReturnBasicInformation = {
    val __obj = js.Dynamic.literal(alwaysReturnBasicInformation = alwaysReturnBasicInformation.asInstanceOf[js.Any], includeDeletedSubscriptions = includeDeletedSubscriptions.asInstanceOf[js.Any], includeFilterDetails = includeFilterDetails.asInstanceOf[js.Any], includeInvalidSubscriptions = includeInvalidSubscriptions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlwaysReturnBasicInformation]
  }
  @scala.inline
  implicit class AnonAlwaysReturnBasicInformationOps[Self <: AnonAlwaysReturnBasicInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysReturnBasicInformation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysReturnBasicInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeDeletedSubscriptions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDeletedSubscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeFilterDetails(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFilterDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeInvalidSubscriptions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInvalidSubscriptions")(value.asInstanceOf[js.Any])
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

