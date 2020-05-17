package typingsSlinky.sockjsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sockjsClient.mod.CONNECTING
  - typingsSlinky.sockjsClient.mod.OPEN
  - typingsSlinky.sockjsClient.mod.CLOSING
  - typingsSlinky.sockjsClient.mod.CLOSED
*/
trait State extends js.Object

object State {
  @scala.inline
  implicit def apply(value: CLOSED): State = value.asInstanceOf[State]
  @scala.inline
  implicit def apply(value: CLOSING): State = value.asInstanceOf[State]
  @scala.inline
  implicit def apply(value: CONNECTING): State = value.asInstanceOf[State]
  @scala.inline
  implicit def apply(value: OPEN): State = value.asInstanceOf[State]
}

