package typingsSlinky.shapefile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shapefileMod {
  import org.scalajs.dom.experimental.ReadableStream
  import typingsSlinky.node.streamMod.Readable

  type Openable = String | scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.Uint8Array | Readable | ReadableStream[js.Any]
}
