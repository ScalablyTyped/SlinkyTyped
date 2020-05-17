package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BacklogInError extends js.Object {
  var backlogInError: scala.Double = js.native
  var doesntExistOrAccessDenied: scala.Double = js.native
  var maxTeamFieldsExceeded: scala.Double = js.native
  var maxTeamsExceeded: scala.Double = js.native
  var missingTeamFieldValue: scala.Double = js.native
  var noIterationsExist: scala.Double = js.native
  var oK: scala.Double = js.native
}

object BacklogInError {
  @scala.inline
  def apply(
    backlogInError: scala.Double,
    doesntExistOrAccessDenied: scala.Double,
    maxTeamFieldsExceeded: scala.Double,
    maxTeamsExceeded: scala.Double,
    missingTeamFieldValue: scala.Double,
    noIterationsExist: scala.Double,
    oK: scala.Double
  ): BacklogInError = {
    val __obj = js.Dynamic.literal(backlogInError = backlogInError.asInstanceOf[js.Any], doesntExistOrAccessDenied = doesntExistOrAccessDenied.asInstanceOf[js.Any], maxTeamFieldsExceeded = maxTeamFieldsExceeded.asInstanceOf[js.Any], maxTeamsExceeded = maxTeamsExceeded.asInstanceOf[js.Any], missingTeamFieldValue = missingTeamFieldValue.asInstanceOf[js.Any], noIterationsExist = noIterationsExist.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogInError]
  }
  @scala.inline
  implicit class BacklogInErrorOps[Self <: BacklogInError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBacklogInError(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backlogInError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoesntExistOrAccessDenied(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doesntExistOrAccessDenied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTeamFieldsExceeded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTeamFieldsExceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTeamsExceeded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTeamsExceeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissingTeamFieldValue(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingTeamFieldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoIterationsExist(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noIterationsExist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOK(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oK")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

