package typingsSlinky.xummApi.mod

import typingsSlinky.xummApi.anon.Applicationuuidv4
import typingsSlinky.xummApi.anon.Payloaduuidv4
import typingsSlinky.xummApi.anon.Tokenexpiration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XummWebhookBody extends js.Object {
  var custom_meta: XummCustomMeta = js.native
  var meta: Applicationuuidv4 = js.native
  var payloadResponse: Payloaduuidv4 = js.native
  var userToken: Tokenexpiration | Null = js.native
}

object XummWebhookBody {
  @scala.inline
  def apply(custom_meta: XummCustomMeta, meta: Applicationuuidv4, payloadResponse: Payloaduuidv4): XummWebhookBody = {
    val __obj = js.Dynamic.literal(custom_meta = custom_meta.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payloadResponse = payloadResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummWebhookBody]
  }
  @scala.inline
  implicit class XummWebhookBodyOps[Self <: XummWebhookBody] (val x: Self) extends AnyVal {
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
    def withMeta(value: Applicationuuidv4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayloadResponse(value: Payloaduuidv4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserToken(value: Tokenexpiration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userToken")(null)
        ret
    }
  }
  
}

