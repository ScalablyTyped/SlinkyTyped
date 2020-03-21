package typingsSlinky.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "TakeUntilStream")
@js.native
class TakeUntilStream protected ()
  extends typingsSlinky.wonderFrp.streamTakeUntilStreamMod.TakeUntilStream {
  def this(
    source: typingsSlinky.wonderFrp.coreStreamMod.Stream,
    otherStream: typingsSlinky.wonderFrp.coreStreamMod.Stream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "TakeUntilStream")
@js.native
object TakeUntilStream extends js.Object {
  def create(
    source: typingsSlinky.wonderFrp.coreStreamMod.Stream,
    otherSteam: typingsSlinky.wonderFrp.coreStreamMod.Stream
  ): typingsSlinky.wonderFrp.streamTakeUntilStreamMod.TakeUntilStream = js.native
}

