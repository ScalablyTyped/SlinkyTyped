package typingsSlinky.shopifyPrime.webhookMod

import typingsSlinky.shopifyPrime.baseMod.ShopifyObject
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.json
import typingsSlinky.shopifyPrime.shopifyPrimeStrings.xml
import typingsSlinky.shopifyPrime.webhookTopicMod.WebhookTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webhook extends ShopifyObject {
  /**
    * The URL where the webhook should send the POST request when the event occurs.
    */
  var address: String = js.native
  /**
    * The date and time when the webhook was created.
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * An optional array of fields which should be included in webhooks.
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  /**
    * The format in which the webhook should send the data. Valid values are json and xml.
    */
  var format: js.UndefOr[json | xml] = js.native
  /**
    * An optional array of namespaces for metafields that should be included in webhooks.
    */
  var metafield_namespaces: js.UndefOr[js.Array[String]] = js.native
  /**
    * The event that will trigger the webhook.
    */
  var topic: WebhookTopic = js.native
  /**
    * The date and time when the webhook was updated.
    */
  var updated_at: js.UndefOr[String] = js.native
}

object Webhook {
  @scala.inline
  def apply(address: String, topic: WebhookTopic): Webhook = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
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
    def withTopic(value: WebhookTopic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: json | xml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withMetafield_namespaces(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metafield_namespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetafield_namespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metafield_namespaces")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(js.undefined)
        ret
    }
  }
  
}

