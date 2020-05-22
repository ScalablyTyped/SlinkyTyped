package typingsSlinky.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Multiaddr extends js.Object {
  var buffer: js.typedarray.Uint8Array
}

object Multiaddr {
  @scala.inline
  def apply(buffer: js.typedarray.Uint8Array): Multiaddr = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multiaddr]
  }
}

