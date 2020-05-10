package typingsSlinky.sipJs

import typingsSlinky.sipJs.coreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFromDisplayName extends js.Object {
  var fromDisplayName: js.UndefOr[String] = js.native
  var fromTag: js.UndefOr[String] = js.native
  var fromUri: js.UndefOr[String | URI] = js.native
  var toDisplayName: js.UndefOr[String] = js.native
  var toUri: js.UndefOr[String | URI] = js.native
}

object AnonFromDisplayName {
  @scala.inline
  def apply(): AnonFromDisplayName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFromDisplayName]
  }
  @scala.inline
  implicit class AnonFromDisplayNameOps[Self <: AnonFromDisplayName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withFromTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromTag")(js.undefined)
        ret
    }
    @scala.inline
    def withFromUri(value: String | URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUri")(js.undefined)
        ret
    }
    @scala.inline
    def withToDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withToUri(value: String | URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUri")(js.undefined)
        ret
    }
  }
  
}

