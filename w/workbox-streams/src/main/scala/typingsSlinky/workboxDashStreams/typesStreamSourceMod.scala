package typingsSlinky.workboxDashStreams

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.Response
import typingsSlinky.std.BodyInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-streams/types/StreamSource", JSImport.Namespace)
@js.native
object typesStreamSourceMod extends js.Object {
  type StreamSource = Response | BodyInit | ReadableStream[js.Any]
}

