package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base64Encoded extends js.Object {
  var base64Encoded: scala.Double = js.native
  var rawText: scala.Double = js.native
}

object Base64Encoded {
  @scala.inline
  def apply(base64Encoded: scala.Double, rawText: scala.Double): Base64Encoded = {
    val __obj = js.Dynamic.literal(base64Encoded = base64Encoded.asInstanceOf[js.Any], rawText = rawText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base64Encoded]
  }
  @scala.inline
  implicit class Base64EncodedOps[Self <: Base64Encoded] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase64Encoded(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64Encoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawText(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

