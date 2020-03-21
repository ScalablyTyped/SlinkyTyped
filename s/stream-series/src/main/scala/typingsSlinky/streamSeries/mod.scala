package typingsSlinky.streamSeries

import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-series", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T /* <: ReadableStream */](streams: T*): ReadWriteStream = js.native
}

