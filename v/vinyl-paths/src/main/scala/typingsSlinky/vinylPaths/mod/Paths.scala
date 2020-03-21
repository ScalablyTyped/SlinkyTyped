package typingsSlinky.vinylPaths.mod

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paths
  extends ReadableStream
     with WritableStream {
  var paths: js.Array[String] = js.native
}

