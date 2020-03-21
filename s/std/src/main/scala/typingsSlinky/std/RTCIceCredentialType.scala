package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.stdStrings.oauth
  - typingsSlinky.std.stdStrings.password
*/
trait RTCIceCredentialType extends js.Object

object RTCIceCredentialType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def oauth: typingsSlinky.std.stdStrings.oauth = this.cast("oauth")
  @scala.inline
  def password: typingsSlinky.std.stdStrings.password = this.cast("password")
}

