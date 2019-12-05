package typingsSlinky.streamDashChain

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamDashChainMod {
  import typingsSlinky.node.streamMod.Duplex
  import typingsSlinky.node.streamMod.Readable
  import typingsSlinky.node.streamMod.Transform
  import typingsSlinky.node.streamMod.Writable

  type Stream = Readable | Writable | Duplex | Transform
  type StreamItem = Stream | TransformFunction
  type TransformFunction = js.Function2[/* chunk */ js.Any, /* encoding */ js.UndefOr[String], js.Any]
}
