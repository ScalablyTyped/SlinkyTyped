package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBadRequest extends js.Object {
  var badRequest: Double = js.native
  var invalidResolution: Double = js.native
  var notFound: Double = js.native
  var succeeded: Double = js.native
  var unsupportedConflictType: Double = js.native
}

object AnonBadRequest {
  @scala.inline
  def apply(
    badRequest: Double,
    invalidResolution: Double,
    notFound: Double,
    succeeded: Double,
    unsupportedConflictType: Double
  ): AnonBadRequest = {
    val __obj = js.Dynamic.literal(badRequest = badRequest.asInstanceOf[js.Any], invalidResolution = invalidResolution.asInstanceOf[js.Any], notFound = notFound.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], unsupportedConflictType = unsupportedConflictType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBadRequest]
  }
  @scala.inline
  implicit class AnonBadRequestOps[Self <: AnonBadRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotFound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnsupportedConflictType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsupportedConflictType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

