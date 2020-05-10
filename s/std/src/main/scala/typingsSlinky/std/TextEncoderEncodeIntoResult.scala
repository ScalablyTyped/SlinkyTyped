package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoderEncodeIntoResult extends js.Object {
  var read: js.UndefOr[Double] = js.native
  var written: js.UndefOr[Double] = js.native
}

object TextEncoderEncodeIntoResult {
  @scala.inline
  def apply(): TextEncoderEncodeIntoResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEncoderEncodeIntoResult]
  }
  @scala.inline
  implicit class TextEncoderEncodeIntoResultOps[Self <: TextEncoderEncodeIntoResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withWritten(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("written")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("written")(js.undefined)
        ret
    }
  }
  
}

