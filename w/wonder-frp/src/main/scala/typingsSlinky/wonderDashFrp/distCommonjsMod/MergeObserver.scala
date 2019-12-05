package typingsSlinky.wonderDashFrp.distCommonjsMod

import typingsSlinky.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeObserver")
@js.native
class MergeObserver protected ()
  extends typingsSlinky.wonderDashFrp.distCommonjsObserverMergeObserverMod.MergeObserver {
  def this(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typingsSlinky.wonderDashFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeObserver")
@js.native
object MergeObserver extends js.Object {
  def create(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typingsSlinky.wonderDashFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
  ): typingsSlinky.wonderDashFrp.distCommonjsObserverMergeObserverMod.MergeObserver = js.native
}

