package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SkipUntilStream")
@js.native
class SkipUntilStream protected ()
  extends typingsSlinky.wonderFrp.skipUntilStreamMod.SkipUntilStream {
  def this(
    source: typingsSlinky.wonderFrp.streamMod.Stream,
    otherStream: typingsSlinky.wonderFrp.streamMod.Stream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SkipUntilStream")
@js.native
object SkipUntilStream extends js.Object {
  def create(
    source: typingsSlinky.wonderFrp.streamMod.Stream,
    otherSteam: typingsSlinky.wonderFrp.streamMod.Stream
  ): typingsSlinky.wonderFrp.skipUntilStreamMod.SkipUntilStream = js.native
}

