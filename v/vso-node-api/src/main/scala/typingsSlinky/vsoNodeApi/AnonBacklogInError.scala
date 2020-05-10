package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBacklogInError extends js.Object {
  var backlogInError: Double = js.native
  var doesntExistOrAccessDenied: Double = js.native
  var maxTeamFieldsExceeded: Double = js.native
  var maxTeamsExceeded: Double = js.native
  var missingTeamFieldValue: Double = js.native
  var noIterationsExist: Double = js.native
  var oK: Double = js.native
}

object AnonBacklogInError {
  @scala.inline
  def apply(
    backlogInError: Double,
    doesntExistOrAccessDenied: Double,
    maxTeamFieldsExceeded: Double,
    maxTeamsExceeded: Double,
    missingTeamFieldValue: Double,
    noIterationsExist: Double,
    oK: Double
  ): AnonBacklogInError = {
    val __obj = js.Dynamic.literal(backlogInError = backlogInError.asInstanceOf[js.Any], doesntExistOrAccessDenied = doesntExistOrAccessDenied.asInstanceOf[js.Any], maxTeamFieldsExceeded = maxTeamFieldsExceeded.asInstanceOf[js.Any], maxTeamsExceeded = maxTeamsExceeded.asInstanceOf[js.Any], missingTeamFieldValue = missingTeamFieldValue.asInstanceOf[js.Any], noIterationsExist = noIterationsExist.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBacklogInError]
  }
  @scala.inline
  implicit class AnonBacklogInErrorOps[Self <: AnonBacklogInError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBacklogInError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backlogInError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoesntExistOrAccessDenied(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesntExistOrAccessDenied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTeamFieldsExceeded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTeamFieldsExceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTeamsExceeded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTeamsExceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissingTeamFieldValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingTeamFieldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoIterationsExist(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noIterationsExist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOK(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oK")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

