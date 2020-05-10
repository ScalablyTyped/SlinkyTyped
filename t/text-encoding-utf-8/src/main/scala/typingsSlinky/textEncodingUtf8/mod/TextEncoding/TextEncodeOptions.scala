package typingsSlinky.textEncodingUtf8.mod.TextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncodeOptions extends js.Object {
  var stream: js.UndefOr[Boolean] = js.native
}

object TextEncodeOptions {
  @scala.inline
  def apply(): TextEncodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEncodeOptions]
  }
  @scala.inline
  implicit class TextEncodeOptionsOps[Self <: TextEncodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStream(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
  }
  
}

