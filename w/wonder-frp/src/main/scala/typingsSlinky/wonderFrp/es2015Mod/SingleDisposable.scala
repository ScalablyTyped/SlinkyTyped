package typingsSlinky.wonderFrp.es2015Mod

import typingsSlinky.wonderFrp.disposableIdisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "SingleDisposable")
@js.native
class SingleDisposable protected ()
  extends typingsSlinky.wonderFrp.disposableSingleDisposableMod.SingleDisposable {
  def this(dispose: js.Function) = this()
  def this(dispose: IDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "SingleDisposable")
@js.native
object SingleDisposable extends js.Object {
  def create(): typingsSlinky.wonderFrp.disposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: js.Function): typingsSlinky.wonderFrp.disposableSingleDisposableMod.SingleDisposable = js.native
  def create(dispose: IDisposable): typingsSlinky.wonderFrp.disposableSingleDisposableMod.SingleDisposable = js.native
}

