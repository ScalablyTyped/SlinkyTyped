package typingsSlinky.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscodeLanguageclient.mod.TransportKind
  - typingsSlinky.vscodeLanguageclient.mod.SocketTransport
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  implicit def apply(value: SocketTransport): Transport = value.asInstanceOf[Transport]
  @scala.inline
  implicit def apply(value: TransportKind): Transport = value.asInstanceOf[Transport]
}

