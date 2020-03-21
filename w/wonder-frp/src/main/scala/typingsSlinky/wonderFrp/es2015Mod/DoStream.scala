package typingsSlinky.wonderFrp.es2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "DoStream")
@js.native
class DoStream protected ()
  extends typingsSlinky.wonderFrp.streamDoStreamMod.DoStream {
  def this(
    source: typingsSlinky.wonderFrp.coreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "DoStream")
@js.native
object DoStream extends js.Object {
  def create(source: typingsSlinky.wonderFrp.coreStreamMod.Stream): typingsSlinky.wonderFrp.streamDoStreamMod.DoStream = js.native
  def create(source: typingsSlinky.wonderFrp.coreStreamMod.Stream, onNext: js.Function): typingsSlinky.wonderFrp.streamDoStreamMod.DoStream = js.native
  def create(source: typingsSlinky.wonderFrp.coreStreamMod.Stream, onNext: js.Function, onError: js.Function): typingsSlinky.wonderFrp.streamDoStreamMod.DoStream = js.native
  def create(
    source: typingsSlinky.wonderFrp.coreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): typingsSlinky.wonderFrp.streamDoStreamMod.DoStream = js.native
}

