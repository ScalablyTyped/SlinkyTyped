package typingsSlinky.thenDashEos

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.thenDashEos.thenDashEosMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("then-eos", JSImport.Namespace)
@js.native
object thenDashEosMod extends js.Object {
  def apply(stream: Stream): js.Promise[Unit] = js.native
  type Stream = ReadableStream | WritableStream
}

