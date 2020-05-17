package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An abnormal event (called an exception) which occurs as a result of calling a method or accessing a property of a web API. */
@js.native
trait DOMException extends js.Object {
  val ABORT_ERR: Double = js.native
  val DATA_CLONE_ERR: Double = js.native
  val DOMSTRING_SIZE_ERR: Double = js.native
  val HIERARCHY_REQUEST_ERR: Double = js.native
  val INDEX_SIZE_ERR: Double = js.native
  val INUSE_ATTRIBUTE_ERR: Double = js.native
  val INVALID_ACCESS_ERR: Double = js.native
  val INVALID_CHARACTER_ERR: Double = js.native
  val INVALID_MODIFICATION_ERR: Double = js.native
  val INVALID_NODE_TYPE_ERR: Double = js.native
  val INVALID_STATE_ERR: Double = js.native
  val NAMESPACE_ERR: Double = js.native
  val NETWORK_ERR: Double = js.native
  val NOT_FOUND_ERR: Double = js.native
  val NOT_SUPPORTED_ERR: Double = js.native
  val NO_DATA_ALLOWED_ERR: Double = js.native
  val NO_MODIFICATION_ALLOWED_ERR: Double = js.native
  val QUOTA_EXCEEDED_ERR: Double = js.native
  val SECURITY_ERR: Double = js.native
  val SYNTAX_ERR: Double = js.native
  val TIMEOUT_ERR: Double = js.native
  val TYPE_MISMATCH_ERR: Double = js.native
  val URL_MISMATCH_ERR: Double = js.native
  val VALIDATION_ERR: Double = js.native
  val WRONG_DOCUMENT_ERR: Double = js.native
  val code: Double = js.native
  val message: java.lang.String = js.native
  val name: java.lang.String = js.native
}

object DOMException {
  @scala.inline
  def apply(
    ABORT_ERR: Double,
    DATA_CLONE_ERR: Double,
    DOMSTRING_SIZE_ERR: Double,
    HIERARCHY_REQUEST_ERR: Double,
    INDEX_SIZE_ERR: Double,
    INUSE_ATTRIBUTE_ERR: Double,
    INVALID_ACCESS_ERR: Double,
    INVALID_CHARACTER_ERR: Double,
    INVALID_MODIFICATION_ERR: Double,
    INVALID_NODE_TYPE_ERR: Double,
    INVALID_STATE_ERR: Double,
    NAMESPACE_ERR: Double,
    NETWORK_ERR: Double,
    NOT_FOUND_ERR: Double,
    NOT_SUPPORTED_ERR: Double,
    NO_DATA_ALLOWED_ERR: Double,
    NO_MODIFICATION_ALLOWED_ERR: Double,
    QUOTA_EXCEEDED_ERR: Double,
    SECURITY_ERR: Double,
    SYNTAX_ERR: Double,
    TIMEOUT_ERR: Double,
    TYPE_MISMATCH_ERR: Double,
    URL_MISMATCH_ERR: Double,
    VALIDATION_ERR: Double,
    WRONG_DOCUMENT_ERR: Double,
    code: Double,
    message: java.lang.String,
    name: java.lang.String
  ): DOMException = {
    val __obj = js.Dynamic.literal(ABORT_ERR = ABORT_ERR.asInstanceOf[js.Any], DATA_CLONE_ERR = DATA_CLONE_ERR.asInstanceOf[js.Any], DOMSTRING_SIZE_ERR = DOMSTRING_SIZE_ERR.asInstanceOf[js.Any], HIERARCHY_REQUEST_ERR = HIERARCHY_REQUEST_ERR.asInstanceOf[js.Any], INDEX_SIZE_ERR = INDEX_SIZE_ERR.asInstanceOf[js.Any], INUSE_ATTRIBUTE_ERR = INUSE_ATTRIBUTE_ERR.asInstanceOf[js.Any], INVALID_ACCESS_ERR = INVALID_ACCESS_ERR.asInstanceOf[js.Any], INVALID_CHARACTER_ERR = INVALID_CHARACTER_ERR.asInstanceOf[js.Any], INVALID_MODIFICATION_ERR = INVALID_MODIFICATION_ERR.asInstanceOf[js.Any], INVALID_NODE_TYPE_ERR = INVALID_NODE_TYPE_ERR.asInstanceOf[js.Any], INVALID_STATE_ERR = INVALID_STATE_ERR.asInstanceOf[js.Any], NAMESPACE_ERR = NAMESPACE_ERR.asInstanceOf[js.Any], NETWORK_ERR = NETWORK_ERR.asInstanceOf[js.Any], NOT_FOUND_ERR = NOT_FOUND_ERR.asInstanceOf[js.Any], NOT_SUPPORTED_ERR = NOT_SUPPORTED_ERR.asInstanceOf[js.Any], NO_DATA_ALLOWED_ERR = NO_DATA_ALLOWED_ERR.asInstanceOf[js.Any], NO_MODIFICATION_ALLOWED_ERR = NO_MODIFICATION_ALLOWED_ERR.asInstanceOf[js.Any], QUOTA_EXCEEDED_ERR = QUOTA_EXCEEDED_ERR.asInstanceOf[js.Any], SECURITY_ERR = SECURITY_ERR.asInstanceOf[js.Any], SYNTAX_ERR = SYNTAX_ERR.asInstanceOf[js.Any], TIMEOUT_ERR = TIMEOUT_ERR.asInstanceOf[js.Any], TYPE_MISMATCH_ERR = TYPE_MISMATCH_ERR.asInstanceOf[js.Any], URL_MISMATCH_ERR = URL_MISMATCH_ERR.asInstanceOf[js.Any], VALIDATION_ERR = VALIDATION_ERR.asInstanceOf[js.Any], WRONG_DOCUMENT_ERR = WRONG_DOCUMENT_ERR.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMException]
  }
  @scala.inline
  implicit class DOMExceptionOps[Self <: org.scalajs.dom.raw.DOMException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withABORT_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ABORT_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDATA_CLONE_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATA_CLONE_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOMSTRING_SIZE_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOMSTRING_SIZE_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHIERARCHY_REQUEST_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HIERARCHY_REQUEST_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINDEX_SIZE_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INDEX_SIZE_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINUSE_ATTRIBUTE_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INUSE_ATTRIBUTE_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINVALID_ACCESS_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ACCESS_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINVALID_CHARACTER_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CHARACTER_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINVALID_MODIFICATION_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INVALID_MODIFICATION_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINVALID_NODE_TYPE_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INVALID_NODE_TYPE_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINVALID_STATE_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INVALID_STATE_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNAMESPACE_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NAMESPACE_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNETWORK_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NETWORK_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_FOUND_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOUND_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNOT_SUPPORTED_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NOT_SUPPORTED_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_DATA_ALLOWED_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_DATA_ALLOWED_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_MODIFICATION_ALLOWED_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_MODIFICATION_ALLOWED_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQUOTA_EXCEEDED_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QUOTA_EXCEEDED_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSECURITY_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SECURITY_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSYNTAX_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SYNTAX_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTIMEOUT_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTYPE_MISMATCH_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TYPE_MISMATCH_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withURL_MISMATCH_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URL_MISMATCH_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVALIDATION_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VALIDATION_ERR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWRONG_DOCUMENT_ERR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WRONG_DOCUMENT_ERR")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

