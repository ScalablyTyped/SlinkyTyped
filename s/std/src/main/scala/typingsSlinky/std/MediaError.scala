package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An error which occurred while handling media in an HTML media element based on HTMLMediaElement, such as <audio> or <video>. */
@js.native
trait MediaError extends js.Object {
  val MEDIA_ERR_ABORTED: Double = js.native
  val MEDIA_ERR_DECODE: Double = js.native
  val MEDIA_ERR_NETWORK: Double = js.native
  val MEDIA_ERR_SRC_NOT_SUPPORTED: Double = js.native
  val MS_MEDIA_ERR_ENCRYPTED: Double = js.native
  val code: Double = js.native
  val message: java.lang.String = js.native
  val msExtendedCode: Double = js.native
}

object MediaError {
  @scala.inline
  def apply(
    MEDIA_ERR_ABORTED: Double,
    MEDIA_ERR_DECODE: Double,
    MEDIA_ERR_NETWORK: Double,
    MEDIA_ERR_SRC_NOT_SUPPORTED: Double,
    MS_MEDIA_ERR_ENCRYPTED: Double,
    code: Double,
    message: java.lang.String,
    msExtendedCode: Double
  ): MediaError = {
    val __obj = js.Dynamic.literal(MEDIA_ERR_ABORTED = MEDIA_ERR_ABORTED.asInstanceOf[js.Any], MEDIA_ERR_DECODE = MEDIA_ERR_DECODE.asInstanceOf[js.Any], MEDIA_ERR_NETWORK = MEDIA_ERR_NETWORK.asInstanceOf[js.Any], MEDIA_ERR_SRC_NOT_SUPPORTED = MEDIA_ERR_SRC_NOT_SUPPORTED.asInstanceOf[js.Any], MS_MEDIA_ERR_ENCRYPTED = MS_MEDIA_ERR_ENCRYPTED.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], msExtendedCode = msExtendedCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaError]
  }
  @scala.inline
  implicit class MediaErrorOps[Self <: org.scalajs.dom.raw.MediaError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMEDIA_ERR_ABORTED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ERR_ABORTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEDIA_ERR_DECODE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ERR_DECODE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEDIA_ERR_NETWORK(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ERR_NETWORK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEDIA_ERR_SRC_NOT_SUPPORTED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_ERR_SRC_NOT_SUPPORTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMS_MEDIA_ERR_ENCRYPTED(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MS_MEDIA_ERR_ENCRYPTED")(value.asInstanceOf[js.Any])
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
    def withMsExtendedCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msExtendedCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

