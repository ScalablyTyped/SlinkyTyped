package typingsSlinky.wonderFrp.mod

import typingsSlinky.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "FilterObserver")
@js.native
class FilterObserver protected ()
  extends typingsSlinky.wonderFrp.filterObserverMod.FilterObserver {
  def this(
    prevObserver: IObserver,
    predicate: js.Function1[/* value */ js.Any, Boolean],
    source: typingsSlinky.wonderFrp.streamMod.Stream
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
      /* source */ js.UndefOr[typingsSlinky.wonderFrp.streamMod.Stream], 
      Boolean
    ],
    source: typingsSlinky.wonderFrp.streamMod.Stream
  ): typingsSlinky.wonderFrp.filterObserverMod.FilterObserver = js.native
}

