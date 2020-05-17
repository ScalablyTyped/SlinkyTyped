package typingsSlinky.tar.mod

import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.anon.End
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileStat
  extends Readable
     with Fields_ {
  var blockRemain: Double = js.native
  var header: HeaderProperties = js.native
  var ignore: Boolean = js.native
  var meta: Boolean = js.native
  var remain: Double = js.native
  var startBlockSize: Double = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
}

