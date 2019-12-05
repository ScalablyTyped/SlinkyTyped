package typingsSlinky.wonderDashFrp.distCommonjsMod

import typingsSlinky.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FilterWithStateObserver")
@js.native
class FilterWithStateObserver ()
  extends typingsSlinky.wonderDashFrp.distCommonjsObserverFilterWithStateObserverMod.FilterWithStateObserver

/* static members */
@JSImport("wonder-frp/dist/commonjs", "FilterWithStateObserver")
@js.native
object FilterWithStateObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream], 
      Boolean
    ],
    source: typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream
  ): typingsSlinky.wonderDashFrp.distCommonjsObserverFilterWithStateObserverMod.FilterWithStateObserver = js.native
}

