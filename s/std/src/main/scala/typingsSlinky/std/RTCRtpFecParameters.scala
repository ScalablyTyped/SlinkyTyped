package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpFecParameters extends js.Object {
  var mechanism: js.UndefOr[java.lang.String] = js.native
  var ssrc: js.UndefOr[Double] = js.native
}

object RTCRtpFecParameters {
  @scala.inline
  def apply(): RTCRtpFecParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpFecParameters]
  }
  @scala.inline
  implicit class RTCRtpFecParametersOps[Self <: RTCRtpFecParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMechanism(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mechanism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMechanism: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mechanism")(js.undefined)
        ret
    }
    @scala.inline
    def withSsrc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssrc")(js.undefined)
        ret
    }
  }
  
}

