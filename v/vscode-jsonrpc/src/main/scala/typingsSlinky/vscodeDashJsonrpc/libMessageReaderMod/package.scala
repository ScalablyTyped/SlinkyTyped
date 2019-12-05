package typingsSlinky.vscodeDashJsonrpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMessageReaderMod {
  import typingsSlinky.vscodeDashJsonrpc.libMessagesMod.Message

  type DataCallback = js.Function1[/* data */ Message, Unit]
}
