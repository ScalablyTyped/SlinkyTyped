package typingsSlinky.twilsock

import typingsSlinky.twilsock.protocolMod.Protocol.MessageType
import typingsSlinky.twilsock.protocolMod.Protocol.Method
import typingsSlinky.twilsock.twilsockMod.TwilsockChannel.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilsockStrings {
  
  @js.native
  sealed trait DELETE extends Method
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET extends Method
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait POST extends Method
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT extends Method
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait close extends MessageType
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait connected extends State
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting extends State
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait delete_notification_ctx extends Method
  @scala.inline
  def delete_notification_ctx: delete_notification_ctx = "delete_notification_ctx".asInstanceOf[delete_notification_ctx]
  
  @js.native
  sealed trait disconnected extends State
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait disconnecting extends State
  @scala.inline
  def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  
  @js.native
  sealed trait error extends State
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait init extends MessageType
  @scala.inline
  def init: init = "init".asInstanceOf[init]
  
  @js.native
  sealed trait message extends MessageType
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait notification extends MessageType
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  
  @js.native
  sealed trait ping extends MessageType
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait put_notification_ctx extends Method
  @scala.inline
  def put_notification_ctx: put_notification_ctx = "put_notification_ctx".asInstanceOf[put_notification_ctx]
  
  @js.native
  sealed trait rejected extends State
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait reply extends MessageType
  @scala.inline
  def reply: reply = "reply".asInstanceOf[reply]
  
  @js.native
  sealed trait telemetryDotv1 extends MessageType
  @scala.inline
  def telemetryDotv1: telemetryDotv1 = "telemetry.v1".asInstanceOf[telemetryDotv1]
  
  @js.native
  sealed trait unknown extends State
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
}
