package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The reason of an error occurring when using the geolocating device. */
@js.native
trait PositionError extends js.Object {
  val PERMISSION_DENIED: Double = js.native
  val POSITION_UNAVAILABLE: Double = js.native
  val TIMEOUT: Double = js.native
  val code: Double = js.native
  val message: java.lang.String = js.native
}

object PositionError {
  @scala.inline
  def apply(
    PERMISSION_DENIED: Double,
    POSITION_UNAVAILABLE: Double,
    TIMEOUT: Double,
    code: Double,
    message: java.lang.String
  ): PositionError = {
    val __obj = js.Dynamic.literal(PERMISSION_DENIED = PERMISSION_DENIED.asInstanceOf[js.Any], POSITION_UNAVAILABLE = POSITION_UNAVAILABLE.asInstanceOf[js.Any], TIMEOUT = TIMEOUT.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionError]
  }
  @scala.inline
  implicit class PositionErrorOps[Self <: org.scalajs.dom.raw.PositionError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPERMISSION_DENIED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PERMISSION_DENIED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPOSITION_UNAVAILABLE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSITION_UNAVAILABLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTIMEOUT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

