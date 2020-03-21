package typingsSlinky.wonderFrp.mod

import typingsSlinky.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "AutoDetachObserver")
@js.native
class AutoDetachObserver ()
  extends typingsSlinky.wonderFrp.autoDetachObserverMod.AutoDetachObserver

/* static members */
@JSImport("wonder-frp/dist/commonjs", "AutoDetachObserver")
@js.native
object AutoDetachObserver extends js.Object {
  def create(observer: IObserver): js.Any = js.native
  def create(onNext: js.Function, onError: js.Function, onCompleted: js.Function): js.Any = js.native
}

