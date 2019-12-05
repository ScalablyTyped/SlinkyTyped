package typingsSlinky.wonderDashFrp.distEs2015Mod

import typingsSlinky.wonderDashFrp.distEs2015ObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "FilterWithStateObserver")
@js.native
class FilterWithStateObserver ()
  extends typingsSlinky.wonderDashFrp.distEs2015ObserverFilterWithStateObserverMod.FilterWithStateObserver

/* static members */
@JSImport("wonder-frp/dist/es2015", "FilterWithStateObserver")
@js.native
object FilterWithStateObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsSlinky.wonderDashFrp.distEs2015CoreStreamMod.Stream], 
      Boolean
    ],
    source: typingsSlinky.wonderDashFrp.distEs2015CoreStreamMod.Stream
  ): typingsSlinky.wonderDashFrp.distEs2015ObserverFilterWithStateObserverMod.FilterWithStateObserver = js.native
}

