package typingsSlinky.wonderDashFrp.distCommonjsMod

import typingsSlinky.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FilterObserver")
@js.native
class FilterObserver protected ()
  extends typingsSlinky.wonderDashFrp.distCommonjsObserverFilterObserverMod.FilterObserver {
  def this(
    prevObserver: IObserver,
    predicate: js.Function1[/* value */ js.Any, Boolean],
    source: typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "FilterObserver")
@js.native
object FilterObserver extends js.Object {
  def create(
    prevObserver: IObserver,
    predicate: js.Function3[
      /* value */ js.Any, 
      /* index */ js.UndefOr[Double], 
      /* source */ js.UndefOr[typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream], 
      Boolean
    ],
    source: typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream
  ): typingsSlinky.wonderDashFrp.distCommonjsObserverFilterObserverMod.FilterObserver = js.native
}

