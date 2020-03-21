package typingsSlinky.wonderFrp.mod

import typingsSlinky.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MapObserver")
@js.native
class MapObserver protected ()
  extends typingsSlinky.wonderFrp.mapObserverMod.MapObserver {
  def this(currentObserver: IObserver, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MapObserver")
@js.native
object MapObserver extends js.Object {
  def create(currentObserver: IObserver, selector: js.Function): typingsSlinky.wonderFrp.mapObserverMod.MapObserver = js.native
}

