package typingsSlinky.slackMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): typingsSlinky.slackMock.mod.Instance_ = typingsSlinky.slackMock.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsSlinky.slackMock.mod.Instance_]
  @scala.inline
  def apply(config: typingsSlinky.slackMock.mod.ConfigOptions): typingsSlinky.slackMock.mod.Instance_ = typingsSlinky.slackMock.mod.^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.slackMock.mod.Instance_]
  
  type EventHttpHeaders = typingsSlinky.node.httpMod.IncomingHttpHeaders
  
  // Events
  type EventUrl = java.lang.String | typingsSlinky.node.urlMod.Url
  
  type IncomingWebhookHttpHeaders = typingsSlinky.nock.mod.ReplyHeaders
  
  // Incoming Webhooks
  type IncomingWebhookUrl = java.lang.String
  
  type InteractiveButtonHttpHeaders = typingsSlinky.nock.mod.ReplyHeaders
  
  // Interactive Buttons
  type InteractiveButtonUrl = java.lang.String | typingsSlinky.node.urlMod.Url
  
  type OutgoingWebhookHttpHeaders = typingsSlinky.node.httpMod.IncomingHttpHeaders
  
  // Outgoing Webhooks
  type OutgoingWebhookUrl = java.lang.String | typingsSlinky.node.urlMod.Url
  
  type SlashCommandHttpHeaders = typingsSlinky.node.httpMod.IncomingHttpHeaders
  
  // Slash Commands
  type SlashCommandUrl = java.lang.String | typingsSlinky.node.urlMod.Url
  
  type WebHttpHeaders = typingsSlinky.nock.mod.ReplyHeaders
  
  // Web
  type WebUrl = java.lang.String
  
  @scala.inline
  def instance: typingsSlinky.slackMock.mod.Instance_ = typingsSlinky.slackMock.mod.^.asInstanceOf[js.Dynamic].selectDynamic("instance").asInstanceOf[typingsSlinky.slackMock.mod.Instance_]
  @scala.inline
  def instance_=(x: typingsSlinky.slackMock.mod.Instance_): scala.Unit = typingsSlinky.slackMock.mod.^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
}
