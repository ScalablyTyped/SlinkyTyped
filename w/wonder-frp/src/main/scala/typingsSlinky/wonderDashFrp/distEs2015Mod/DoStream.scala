package typingsSlinky.wonderDashFrp.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "DoStream")
@js.native
class DoStream protected ()
  extends typingsSlinky.wonderDashFrp.distEs2015StreamDoStreamMod.DoStream {
  def this(
    source: typingsSlinky.wonderDashFrp.distEs2015CoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "DoStream")
@js.native
object DoStream extends js.Object {
  def create(source: typingsSlinky.wonderDashFrp.distEs2015CoreStreamMod.Stream): typingsSlinky.wonderDashFrp.distEs2015StreamDoStreamMod.DoStream = js.native
  def create(source: typingsSlinky.wonderDashFrp.distEs2015CoreStreamMod.Stream, onNext: js.Function): typingsSlinky.wonderDashFrp.distEs2015StreamDoStreamMod.DoStream = js.native
  def create(
    source: typingsSlinky.wonderDashFrp.distEs2015CoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function
  ): typingsSlinky.wonderDashFrp.distEs2015StreamDoStreamMod.DoStream = js.native
  def create(
    source: typingsSlinky.wonderDashFrp.distEs2015CoreStreamMod.Stream,
    onNext: js.Function,
    onError: js.Function,
    onCompleted: js.Function
  ): typingsSlinky.wonderDashFrp.distEs2015StreamDoStreamMod.DoStream = js.native
}

