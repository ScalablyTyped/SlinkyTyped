package typingsSlinky.twilioSync.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenMapOptions extends OpenOptions {
  var includeItems: js.UndefOr[Boolean] = js.native
}

object OpenMapOptions {
  @scala.inline
  def apply(): OpenMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenMapOptions]
  }
  @scala.inline
  implicit class OpenMapOptionsOps[Self <: OpenMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeItems")(js.undefined)
        ret
    }
  }
  
}

