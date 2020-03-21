package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeStream")
@js.native
class MergeStream protected ()
  extends typingsSlinky.wonderFrp.mergeStreamMod.MergeStream {
  def this(source: typingsSlinky.wonderFrp.streamMod.Stream, maxConcurrent: Double) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeStream")
@js.native
object MergeStream extends js.Object {
  def create(source: typingsSlinky.wonderFrp.streamMod.Stream, maxConcurrent: Double): typingsSlinky.wonderFrp.mergeStreamMod.MergeStream = js.native
}

