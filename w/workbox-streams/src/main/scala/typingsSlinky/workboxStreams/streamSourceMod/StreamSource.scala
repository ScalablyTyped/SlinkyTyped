package typingsSlinky.workboxStreams.streamSourceMod

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.Response
import typingsSlinky.std.BodyInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Response
  - typingsSlinky.std.BodyInit
  - typingsSlinky.std.ReadableStream[js.Any]
*/
trait StreamSource extends js.Object

object StreamSource {
  @scala.inline
  implicit def apply(value: BodyInit): StreamSource = value.asInstanceOf[StreamSource]
  @scala.inline
  implicit def apply(value: ReadableStream[js.Any]): StreamSource = value.asInstanceOf[StreamSource]
  @scala.inline
  implicit def apply(value: Response): StreamSource = value.asInstanceOf[StreamSource]
}

