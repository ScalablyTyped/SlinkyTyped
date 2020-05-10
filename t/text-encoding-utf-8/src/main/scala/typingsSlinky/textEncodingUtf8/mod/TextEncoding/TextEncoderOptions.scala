package typingsSlinky.textEncodingUtf8.mod.TextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoderOptions extends js.Object {
  var NONSTANDARD_allowLegacyEncoding: js.UndefOr[Boolean] = js.native
}

object TextEncoderOptions {
  @scala.inline
  def apply(): TextEncoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEncoderOptions]
  }
  @scala.inline
  implicit class TextEncoderOptionsOps[Self <: TextEncoderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNONSTANDARD_allowLegacyEncoding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONSTANDARD_allowLegacyEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNONSTANDARD_allowLegacyEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONSTANDARD_allowLegacyEncoding")(js.undefined)
        ret
    }
  }
  
}

