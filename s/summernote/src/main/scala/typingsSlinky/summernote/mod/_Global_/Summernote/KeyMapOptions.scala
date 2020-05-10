package typingsSlinky.summernote.mod._Global_.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyMapOptions extends js.Object {
  var mac: js.UndefOr[KeyMapMacOptions] = js.native
  var pc: js.UndefOr[KeyMapPcOptions] = js.native
}

object KeyMapOptions {
  @scala.inline
  def apply(): KeyMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyMapOptions]
  }
  @scala.inline
  implicit class KeyMapOptionsOps[Self <: KeyMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMac(value: KeyMapMacOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMac: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(js.undefined)
        ret
    }
    @scala.inline
    def withPc(value: KeyMapPcOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pc")(js.undefined)
        ret
    }
  }
  
}

