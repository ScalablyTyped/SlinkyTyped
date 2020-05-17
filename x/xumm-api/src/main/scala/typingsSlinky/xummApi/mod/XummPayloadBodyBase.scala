package typingsSlinky.xummApi.mod

import typingsSlinky.xummApi.anon.Expire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummPayloadBodyBase extends js.Object {
  var custom_meta: js.UndefOr[XummCustomMeta] = js.native
  var options: js.UndefOr[Expire] = js.native
  var user_token: js.UndefOr[String] = js.native
}

object XummPayloadBodyBase {
  @scala.inline
  def apply(): XummPayloadBodyBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XummPayloadBodyBase]
  }
  @scala.inline
  implicit class XummPayloadBodyBaseOps[Self <: XummPayloadBodyBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom_meta(value: XummCustomMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom_meta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_meta")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Expire): Self = {
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
    @scala.inline
    def withUser_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_token")(js.undefined)
        ret
    }
  }
  
}

