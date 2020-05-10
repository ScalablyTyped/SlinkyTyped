package typingsSlinky.simplSchema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBADDATE extends js.Object {
  var BAD_DATE: String = js.native
  var EXPECTED_TYPE: String = js.native
  var FAILED_REGULAR_EXPRESSION: String = js.native
  var KEY_NOT_IN_SCHEMA: String = js.native
  var MAX_COUNT: String = js.native
  var MAX_DATE: String = js.native
  var MAX_NUMBER: String = js.native
  var MAX_NUMBER_EXCLUSIVE: String = js.native
  var MAX_STRING: String = js.native
  var MIN_COUNT: String = js.native
  var MIN_DATE: String = js.native
  var MIN_NUMBER: String = js.native
  var MIN_NUMBER_EXCLUSIVE: String = js.native
  var MIN_STRING: String = js.native
  var MUST_BE_INTEGER: String = js.native
  var REQUIRED: String = js.native
  var VALUE_NOT_ALLOWED: String = js.native
}

object AnonBADDATE {
  @scala.inline
  def apply(
    BAD_DATE: String,
    EXPECTED_TYPE: String,
    FAILED_REGULAR_EXPRESSION: String,
    KEY_NOT_IN_SCHEMA: String,
    MAX_COUNT: String,
    MAX_DATE: String,
    MAX_NUMBER: String,
    MAX_NUMBER_EXCLUSIVE: String,
    MAX_STRING: String,
    MIN_COUNT: String,
    MIN_DATE: String,
    MIN_NUMBER: String,
    MIN_NUMBER_EXCLUSIVE: String,
    MIN_STRING: String,
    MUST_BE_INTEGER: String,
    REQUIRED: String,
    VALUE_NOT_ALLOWED: String
  ): AnonBADDATE = {
    val __obj = js.Dynamic.literal(BAD_DATE = BAD_DATE.asInstanceOf[js.Any], EXPECTED_TYPE = EXPECTED_TYPE.asInstanceOf[js.Any], FAILED_REGULAR_EXPRESSION = FAILED_REGULAR_EXPRESSION.asInstanceOf[js.Any], KEY_NOT_IN_SCHEMA = KEY_NOT_IN_SCHEMA.asInstanceOf[js.Any], MAX_COUNT = MAX_COUNT.asInstanceOf[js.Any], MAX_DATE = MAX_DATE.asInstanceOf[js.Any], MAX_NUMBER = MAX_NUMBER.asInstanceOf[js.Any], MAX_NUMBER_EXCLUSIVE = MAX_NUMBER_EXCLUSIVE.asInstanceOf[js.Any], MAX_STRING = MAX_STRING.asInstanceOf[js.Any], MIN_COUNT = MIN_COUNT.asInstanceOf[js.Any], MIN_DATE = MIN_DATE.asInstanceOf[js.Any], MIN_NUMBER = MIN_NUMBER.asInstanceOf[js.Any], MIN_NUMBER_EXCLUSIVE = MIN_NUMBER_EXCLUSIVE.asInstanceOf[js.Any], MIN_STRING = MIN_STRING.asInstanceOf[js.Any], MUST_BE_INTEGER = MUST_BE_INTEGER.asInstanceOf[js.Any], REQUIRED = REQUIRED.asInstanceOf[js.Any], VALUE_NOT_ALLOWED = VALUE_NOT_ALLOWED.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBADDATE]
  }
  @scala.inline
  implicit class AnonBADDATEOps[Self <: AnonBADDATE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBAD_DATE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BAD_DATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEXPECTED_TYPE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXPECTED_TYPE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAILED_REGULAR_EXPRESSION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAILED_REGULAR_EXPRESSION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKEY_NOT_IN_SCHEMA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KEY_NOT_IN_SCHEMA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAX_COUNT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_COUNT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAX_DATE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_DATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAX_NUMBER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_NUMBER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAX_NUMBER_EXCLUSIVE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_NUMBER_EXCLUSIVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAX_STRING(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAX_STRING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIN_COUNT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIN_COUNT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIN_DATE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIN_DATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIN_NUMBER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIN_NUMBER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIN_NUMBER_EXCLUSIVE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIN_NUMBER_EXCLUSIVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIN_STRING(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIN_STRING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMUST_BE_INTEGER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MUST_BE_INTEGER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREQUIRED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REQUIRED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVALUE_NOT_ALLOWED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VALUE_NOT_ALLOWED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

