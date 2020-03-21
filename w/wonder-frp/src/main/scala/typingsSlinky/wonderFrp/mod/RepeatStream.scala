package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "RepeatStream")
@js.native
class RepeatStream protected ()
  extends typingsSlinky.wonderFrp.repeatStreamMod.RepeatStream {
  def this(source: typingsSlinky.wonderFrp.streamMod.Stream, count: Double) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "RepeatStream")
@js.native
object RepeatStream extends js.Object {
  def create(source: typingsSlinky.wonderFrp.streamMod.Stream, count: Double): typingsSlinky.wonderFrp.repeatStreamMod.RepeatStream = js.native
}

