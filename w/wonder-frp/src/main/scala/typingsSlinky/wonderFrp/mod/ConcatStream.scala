package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "ConcatStream")
@js.native
class ConcatStream protected ()
  extends typingsSlinky.wonderFrp.concatStreamMod.ConcatStream {
  def this(sources: js.Array[typingsSlinky.wonderFrp.streamMod.Stream]) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "ConcatStream")
@js.native
object ConcatStream extends js.Object {
  def create(sources: js.Array[typingsSlinky.wonderFrp.streamMod.Stream]): typingsSlinky.wonderFrp.concatStreamMod.ConcatStream = js.native
}

