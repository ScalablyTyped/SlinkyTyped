package typingsSlinky.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type WatcherFunction = (data: any) => void;
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.socketclusterClient.socketclusterClientStrings.authenticated
  - typingsSlinky.socketclusterClient.socketclusterClientStrings.unauthenticated
*/
trait AuthStates extends js.Object

object AuthStates {
  @scala.inline
  def authenticated: typingsSlinky.socketclusterClient.socketclusterClientStrings.authenticated = this.cast("authenticated")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unauthenticated: typingsSlinky.socketclusterClient.socketclusterClientStrings.unauthenticated = this.cast("unauthenticated")
}

