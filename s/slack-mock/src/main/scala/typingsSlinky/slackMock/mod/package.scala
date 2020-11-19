package typingsSlinky.slackMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
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
}
