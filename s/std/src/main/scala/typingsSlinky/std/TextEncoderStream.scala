package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncoderStream
  extends GenericTransformStream
     with TextEncoderCommon {
  @JSName("readable")
  val readable_TextEncoderStream: org.scalajs.dom.experimental.ReadableStream[js.typedarray.Uint8Array] = js.native
  @JSName("writable")
  val writable_TextEncoderStream: WritableStream[java.lang.String] = js.native
}

@JSGlobal("TextEncoderStream")
@js.native
object TextEncoderStream extends Instantiable0[TextEncoderStream]

