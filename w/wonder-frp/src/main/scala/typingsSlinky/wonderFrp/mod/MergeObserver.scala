package typingsSlinky.wonderFrp.mod

import typingsSlinky.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeObserver")
@js.native
class MergeObserver protected ()
  extends typingsSlinky.wonderFrp.mergeObserverMod.MergeObserver {
  def this(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typingsSlinky.wonderFrp.groupDisposableMod.GroupDisposable
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeObserver")
@js.native
object MergeObserver extends js.Object {
  def create(
    currentObserver: IObserver,
    maxConcurrent: Double,
    groupDisposable: typingsSlinky.wonderFrp.groupDisposableMod.GroupDisposable
  ): typingsSlinky.wonderFrp.mergeObserverMod.MergeObserver = js.native
}

