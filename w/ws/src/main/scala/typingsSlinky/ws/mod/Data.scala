package typingsSlinky.ws.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data represents the message payload received over the WebSocket.
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.ArrayBuffer
  - js.Array[typingsSlinky.node.Buffer]
*/
trait Data extends js.Object

object Data {
  @scala.inline
  implicit def apply(value: js.Array[Buffer]): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: Buffer): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: String): Data = value.asInstanceOf[Data]
}

