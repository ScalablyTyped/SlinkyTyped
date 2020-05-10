package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDTMFToneChangeEventInit extends EventInit {
  var tone: java.lang.String = js.native
}

object RTCDTMFToneChangeEventInit {
  @scala.inline
  def apply(tone: java.lang.String): RTCDTMFToneChangeEventInit = {
    val __obj = js.Dynamic.literal(tone = tone.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDTMFToneChangeEventInit]
  }
  @scala.inline
  implicit class RTCDTMFToneChangeEventInitOps[Self <: RTCDTMFToneChangeEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTone(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

