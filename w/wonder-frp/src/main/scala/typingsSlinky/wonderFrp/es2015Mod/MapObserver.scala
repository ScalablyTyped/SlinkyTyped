package typingsSlinky.wonderFrp.es2015Mod

import typingsSlinky.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MapObserver")
@js.native
class MapObserver protected ()
  extends typingsSlinky.wonderFrp.observerMapObserverMod.MapObserver {
  def this(currentObserver: IObserver, selector: js.Function) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MapObserver")
@js.native
object MapObserver extends js.Object {
  def create(currentObserver: IObserver, selector: js.Function): typingsSlinky.wonderFrp.observerMapObserverMod.MapObserver = js.native
}

