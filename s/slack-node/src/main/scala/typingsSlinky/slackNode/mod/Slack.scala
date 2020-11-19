package typingsSlinky.slackNode.mod

import typingsSlinky.slackNode.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slack extends js.Object {
  
  def api(method: String, callback: js.Function2[/* err */ js.Any, /* response */ js.Any, Unit]): this.type = js.native
  def api(
    method: String,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* response */ js.Any, Unit]
  ): this.type = js.native
  
  var apiMode: Boolean = js.native
  
  def composeUrl(): String = js.native
  
  def detectEmoji(emoji: String): Key = js.native
  
  var domain: String = js.native
  
  var maxAttempts: Double = js.native
  
  def setWebhook(url: String): this.type = js.native
  
  var timeout: Double = js.native
  
  var token: String = js.native
  
  var url: String = js.native
  
  def webhook(
    options: WebhookOptions,
    callback: js.Function2[/* err */ js.Any, /* response */ WebhookResponse, Unit]
  ): Unit = js.native
}
