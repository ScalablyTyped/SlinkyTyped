package typingsSlinky.twilsock.protocolMod.Protocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.twilsock.twilsockStrings.GET
  - typingsSlinky.twilsock.twilsockStrings.POST
  - typingsSlinky.twilsock.twilsockStrings.PUT
  - typingsSlinky.twilsock.twilsockStrings.DELETE
  - typingsSlinky.twilsock.twilsockStrings.put_notification_ctx
  - typingsSlinky.twilsock.twilsockStrings.delete_notification_ctx
*/
trait Method extends js.Object

object Method {
  @scala.inline
  def DELETE: typingsSlinky.twilsock.twilsockStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typingsSlinky.twilsock.twilsockStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typingsSlinky.twilsock.twilsockStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typingsSlinky.twilsock.twilsockStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete_notification_ctx: typingsSlinky.twilsock.twilsockStrings.delete_notification_ctx = this.cast("delete_notification_ctx")
  @scala.inline
  def put_notification_ctx: typingsSlinky.twilsock.twilsockStrings.put_notification_ctx = this.cast("put_notification_ctx")
}

