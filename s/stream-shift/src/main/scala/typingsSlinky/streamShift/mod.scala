package typingsSlinky.streamShift

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-shift", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(stream: ReadableStream): Buffer | String | Null = js.native
}

