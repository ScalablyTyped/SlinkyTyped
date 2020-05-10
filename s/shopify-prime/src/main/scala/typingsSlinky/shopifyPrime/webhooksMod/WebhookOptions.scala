package typingsSlinky.shopifyPrime.webhooksMod

import typingsSlinky.shopifyPrime.webhookTopicMod.WebhookTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookOptions extends js.Object {
  /**
    * Retrieve only webhooks that possess the URI where the webhook sends the POST request when the event occurs.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * Retrieve only webhooks with a given topic.
    */
  var topic: js.UndefOr[WebhookTopic] = js.native
}

object WebhookOptions {
  @scala.inline
  def apply(): WebhookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookOptions]
  }
  @scala.inline
  implicit class WebhookOptionsOps[Self <: WebhookOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: WebhookTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
  }
  
}

