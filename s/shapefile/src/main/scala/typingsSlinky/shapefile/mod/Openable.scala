package typingsSlinky.shapefile.mod

import org.scalajs.dom.experimental.ReadableStream
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.node.streamMod.Readable
  - typingsSlinky.std.ReadableStream[js.Any]
*/
trait Openable extends js.Object

object Openable {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): Openable = value.asInstanceOf[Openable]
  @scala.inline
  implicit def apply(value: Readable): Openable = value.asInstanceOf[Openable]
  @scala.inline
  implicit def apply(value: ReadableStream[js.Any]): Openable = value.asInstanceOf[Openable]
  @scala.inline
  implicit def apply(value: String): Openable = value.asInstanceOf[Openable]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Openable = value.asInstanceOf[Openable]
}

