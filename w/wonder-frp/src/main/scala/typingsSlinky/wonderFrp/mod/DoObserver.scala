package typingsSlinky.wonderFrp.mod

import typingsSlinky.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "DoObserver")
@js.native
class DoObserver protected ()
  extends typingsSlinky.wonderFrp.doObserverMod.DoObserver {
  def this(currentObserver: IObserver, prevObserver: IObserver) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "DoObserver")
@js.native
object DoObserver extends js.Object {
  def create(currentObserver: IObserver, prevObserver: IObserver): typingsSlinky.wonderFrp.doObserverMod.DoObserver = js.native
}

