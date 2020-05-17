package typingsSlinky.xummApi.mod

import typingsSlinky.xummApi.anon.Account
import typingsSlinky.xummApi.anon.Createdat
import typingsSlinky.xummApi.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummGetPayloadResponse extends js.Object {
  var application: Description = js.native
  var custom_meta: XummCustomMeta = js.native
  var meta: XummPayloadMeta = js.native
  var payload: Createdat = js.native
  var response: Account = js.native
}

object XummGetPayloadResponse {
  @scala.inline
  def apply(
    application: Description,
    custom_meta: XummCustomMeta,
    meta: XummPayloadMeta,
    payload: Createdat,
    response: Account
  ): XummGetPayloadResponse = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], custom_meta = custom_meta.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummGetPayloadResponse]
  }
  @scala.inline
  implicit class XummGetPayloadResponseOps[Self <: XummGetPayloadResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom_meta(value: XummCustomMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom_meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: XummPayloadMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: Createdat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

