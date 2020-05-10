package typingsSlinky.sipJs

import typingsSlinky.sipJs.coreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFromUri extends js.Object {
  var fromUri: js.UndefOr[String | URI] = js.native
  var toDisplayName: js.UndefOr[String] = js.native
  var toUri: js.UndefOr[String | URI] = js.native
}

object AnonFromUri {
  @scala.inline
  def apply(): AnonFromUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFromUri]
  }
  @scala.inline
  implicit class AnonFromUriOps[Self <: AnonFromUri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

