package typingsSlinky.wonderFrp.mod

import typingsSlinky.wonderFrp.idisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
@js.native
class SingleDisposable protected ()
  extends typingsSlinky.wonderFrp.singleDisposableMod.SingleDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: IDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "SingleDisposable")
@js.native
object SingleDisposable extends js.Object {
  def create(): typingsSlinky.wonderFrp.singleDisposableMod.SingleDisposable = js.native
  def create(dispose: js.Function): typingsSlinky.wonderFrp.singleDisposableMod.SingleDisposable = js.native
  def create(dispose: IDisposable): typingsSlinky.wonderFrp.singleDisposableMod.SingleDisposable = js.native
}

