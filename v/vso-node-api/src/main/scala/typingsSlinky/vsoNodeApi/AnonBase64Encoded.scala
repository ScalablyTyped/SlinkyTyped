package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBase64Encoded extends js.Object {
  var base64Encoded: Double = js.native
  var rawText: Double = js.native
}

object AnonBase64Encoded {
  @scala.inline
  def apply(base64Encoded: Double, rawText: Double): AnonBase64Encoded = {
    val __obj = js.Dynamic.literal(base64Encoded = base64Encoded.asInstanceOf[js.Any], rawText = rawText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBase64Encoded]
  }
  @scala.inline
  implicit class AnonBase64EncodedOps[Self <: AnonBase64Encoded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase64Encoded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64Encoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawText(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

