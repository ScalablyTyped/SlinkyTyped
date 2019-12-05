package typingsSlinky.wonderDashFrp.distCommonjsMod

import typingsSlinky.wonderDashFrp.distCommonjsDisposableIDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
@js.native
class SingleDisposable protected ()
  extends typingsSlinky.wonderDashFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: IDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
@js.native
object SingleDisposable extends js.Object {
  def create(): typingsSlinky.wonderDashFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: js.Function): typingsSlinky.wonderDashFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: IDisposable): typingsSlinky.wonderDashFrp.distCommonjsDisposableSingleDisposableMod.SingleDisposable = js.native
}

