package typingsSlinky.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonACCEPTEDBODYTYPES extends js.Object {
  var ACCEPTED_BODY_TYPES: js.Array[String] = js.native
  var ALLOWED_METHODS: js.Array[String] = js.native
  var CONFIGURATION_ERROR: Double = js.native
  var MAX_FORWARDS: Double = js.native
  var NETWORK_ERROR: Double = js.native
  var STATUS_INIT: Double = js.native
  var STATUS_NOT_READY: Double = js.native
  var STATUS_READY: Double = js.native
  var STATUS_STARTING: Double = js.native
  var STATUS_USER_CLOSED: Double = js.native
  var TAG_LENGTH: Double = js.native
}

object AnonACCEPTEDBODYTYPES {
  @scala.inline
  def apply(
    ACCEPTED_BODY_TYPES: js.Array[String],
    ALLOWED_METHODS: js.Array[String],
    CONFIGURATION_ERROR: Double,
    MAX_FORWARDS: Double,
    NETWORK_ERROR: Double,
    STATUS_INIT: Double,
    STATUS_NOT_READY: Double,
    STATUS_READY: Double,
    STATUS_STARTING: Double,
    STATUS_USER_CLOSED: Double,
    TAG_LENGTH: Double
  ): AnonACCEPTEDBODYTYPES = {
    val __obj = js.Dynamic.literal(ACCEPTED_BODY_TYPES = ACCEPTED_BODY_TYPES.asInstanceOf[js.Any], ALLOWED_METHODS = ALLOWED_METHODS.asInstanceOf[js.Any], CONFIGURATION_ERROR = CONFIGURATION_ERROR.asInstanceOf[js.Any], MAX_FORWARDS = MAX_FORWARDS.asInstanceOf[js.Any], NETWORK_ERROR = NETWORK_ERROR.asInstanceOf[js.Any], STATUS_INIT = STATUS_INIT.asInstanceOf[js.Any], STATUS_NOT_READY = STATUS_NOT_READY.asInstanceOf[js.Any], STATUS_READY = STATUS_READY.asInstanceOf[js.Any], STATUS_STARTING = STATUS_STARTING.asInstanceOf[js.Any], STATUS_USER_CLOSED = STATUS_USER_CLOSED.asInstanceOf[js.Any], TAG_LENGTH = TAG_LENGTH.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonACCEPTEDBODYTYPES]
  }
  @scala.inline
  implicit class AnonACCEPTEDBODYTYPESOps[Self <: AnonACCEPTEDBODYTYPES] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withACCEPTED_BODY_TYPES(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ACCEPTED_BODY_TYPES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withALLOWED_METHODS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALLOWED_METHODS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCONFIGURATION_ERROR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONFIGURATION_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAX_FORWARDS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_FORWARDS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNETWORK_ERROR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NETWORK_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTATUS_INIT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STATUS_INIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTATUS_NOT_READY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STATUS_NOT_READY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTATUS_READY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STATUS_READY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTATUS_STARTING(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STATUS_STARTING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTATUS_USER_CLOSED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STATUS_USER_CLOSED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTAG_LENGTH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TAG_LENGTH")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

