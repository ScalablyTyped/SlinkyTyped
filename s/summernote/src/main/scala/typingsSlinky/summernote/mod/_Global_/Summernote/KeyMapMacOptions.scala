package typingsSlinky.summernote.mod._Global_.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyMapMacOptions extends js.Object {
  var options: js.UndefOr[js.Any] = js.native
}

object KeyMapMacOptions {
  @scala.inline
  def apply(): KeyMapMacOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyMapMacOptions]
  }
  @scala.inline
  implicit class KeyMapMacOptionsOps[Self <: KeyMapMacOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

