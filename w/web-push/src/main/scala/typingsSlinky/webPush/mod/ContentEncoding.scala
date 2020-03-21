package typingsSlinky.webPush.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webPush.webPushStrings.aesgcm
  - typingsSlinky.webPush.webPushStrings.aes128gcm
*/
trait ContentEncoding extends js.Object

object ContentEncoding {
  @scala.inline
  def aes128gcm: typingsSlinky.webPush.webPushStrings.aes128gcm = this.cast("aes128gcm")
  @scala.inline
  def aesgcm: typingsSlinky.webPush.webPushStrings.aesgcm = this.cast("aesgcm")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

