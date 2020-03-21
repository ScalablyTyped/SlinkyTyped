package typingsSlinky.xummApi.mod

import typingsSlinky.xummApi.AnonApplicationuuidv4
import typingsSlinky.xummApi.AnonPayloaduuidv4
import typingsSlinky.xummApi.AnonTokenexpiration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummWebhookBody extends js.Object {
  var custom_meta: XummCustomMeta
  var meta: AnonApplicationuuidv4
  var payloadResponse: AnonPayloaduuidv4
  var userToken: AnonTokenexpiration | Null
}

object XummWebhookBody {
  @scala.inline
  def apply(
    custom_meta: XummCustomMeta,
    meta: AnonApplicationuuidv4,
    payloadResponse: AnonPayloaduuidv4,
    userToken: AnonTokenexpiration = null
  ): XummWebhookBody = {
    val __obj = js.Dynamic.literal(custom_meta = custom_meta.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payloadResponse = payloadResponse.asInstanceOf[js.Any])
    if (userToken != null) __obj.updateDynamic("userToken")(userToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummWebhookBody]
  }
}

