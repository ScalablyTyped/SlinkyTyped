package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
@js.native
class TakeUntilStream protected ()
  extends typingsSlinky.wonderFrp.takeUntilStreamMod.TakeUntilStream {
  def this(
    source: typingsSlinky.wonderFrp.streamMod.Stream,
    otherStream: typingsSlinky.wonderFrp.streamMod.Stream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "TakeUntilStream")
@js.native
object TakeUntilStream extends js.Object {
  def create(
    source: typingsSlinky.wonderFrp.streamMod.Stream,
    otherSteam: typingsSlinky.wonderFrp.streamMod.Stream
  ): typingsSlinky.wonderFrp.takeUntilStreamMod.TakeUntilStream = js.native
}

