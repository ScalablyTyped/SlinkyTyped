package typingsSlinky.wonderFrp.mod

import typingsSlinky.wonderFrp.idisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "GroupDisposable")
@js.native
class GroupDisposable ()
  extends typingsSlinky.wonderFrp.groupDisposableMod.GroupDisposable {
  def this(disposable: IDisposable) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "GroupDisposable")
@js.native
object GroupDisposable extends js.Object {
  def create(): typingsSlinky.wonderFrp.groupDisposableMod.GroupDisposable = js.native
  def create(disposable: IDisposable): typingsSlinky.wonderFrp.groupDisposableMod.GroupDisposable = js.native
}

