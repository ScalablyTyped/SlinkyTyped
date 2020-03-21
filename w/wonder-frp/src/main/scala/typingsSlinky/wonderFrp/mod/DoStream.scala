package typingsSlinky.wonderFrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "DoStream")
@js.native
class DoStream protected ()
  extends typingsSlinky.wonderFrp.doStreamMod.DoStream {
  def this(
    source: typingsSlinky.wonderFrp.streamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "DoStream")
@js.native
object DoStream extends js.Object {
  def create(source: typingsSlinky.wonderFrp.streamMod.Stream): typingsSlinky.wonderFrp.doStreamMod.DoStream = js.native
  def create(source: typingsSlinky.wonderFrp.streamMod.Stream, onNext: js.Function): typingsSlinky.wonderFrp.doStreamMod.DoStream = js.native
  def create(source: typingsSlinky.wonderFrp.streamMod.Stream, onNext: js.Function, onError: js.Function): typingsSlinky.wonderFrp.doStreamMod.DoStream = js.native
  def create(
    source: typingsSlinky.wonderFrp.streamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): typingsSlinky.wonderFrp.doStreamMod.DoStream = js.native
}

