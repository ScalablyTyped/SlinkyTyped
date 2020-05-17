package typingsSlinky.ssh2Streams.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ssh2Streams.mod.TcpipForwardGlobalRequest
  - typingsSlinky.ssh2Streams.mod.opensshStreamLocalForwardGlobalRequest
  - typingsSlinky.node.Buffer
*/
trait GlobalRequest extends js.Object

object GlobalRequest {
  @scala.inline
  implicit def apply(value: Buffer): GlobalRequest = value.asInstanceOf[GlobalRequest]
  @scala.inline
  implicit def apply(value: TcpipForwardGlobalRequest): GlobalRequest = value.asInstanceOf[GlobalRequest]
  @scala.inline
  implicit def apply(value: opensshStreamLocalForwardGlobalRequest): GlobalRequest = value.asInstanceOf[GlobalRequest]
}

