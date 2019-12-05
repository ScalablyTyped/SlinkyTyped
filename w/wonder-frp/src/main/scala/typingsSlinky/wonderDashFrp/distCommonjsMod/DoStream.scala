package typingsSlinky.wonderDashFrp.distCommonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "DoStream")
@js.native
class DoStream protected ()
  extends typingsSlinky.wonderDashFrp.distCommonjsStreamDoStreamMod.DoStream {
  def this(
    source: typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "DoStream")
@js.native
object DoStream extends js.Object {
  def create(source: typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream): typingsSlinky.wonderDashFrp.distCommonjsStreamDoStreamMod.DoStream = js.native
  def create(source: typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream, onNext: js.Function): typingsSlinky.wonderDashFrp.distCommonjsStreamDoStreamMod.DoStream = js.native
  def create(
    source: typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function
  ): typingsSlinky.wonderDashFrp.distCommonjsStreamDoStreamMod.DoStream = js.native
  def create(
    source: typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): typingsSlinky.wonderDashFrp.distCommonjsStreamDoStreamMod.DoStream = js.native
}

