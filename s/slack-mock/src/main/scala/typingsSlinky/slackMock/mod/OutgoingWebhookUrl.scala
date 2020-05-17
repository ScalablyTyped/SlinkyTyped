package typingsSlinky.slackMock.mod

import typingsSlinky.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Outgoing Webhooks
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.urlMod.Url
*/
trait OutgoingWebhookUrl extends js.Object

object OutgoingWebhookUrl {
  @scala.inline
  implicit def apply(value: String): OutgoingWebhookUrl = value.asInstanceOf[OutgoingWebhookUrl]
  @scala.inline
  implicit def apply(value: Url): OutgoingWebhookUrl = value.asInstanceOf[OutgoingWebhookUrl]
}

