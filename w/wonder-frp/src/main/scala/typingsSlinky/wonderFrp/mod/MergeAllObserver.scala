package typingsSlinky.wonderFrp.mod

import typingsSlinky.wonderFrp.iobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
@js.native
class MergeAllObserver protected ()
  extends typingsSlinky.wonderFrp.mergeAllObserverMod.MergeAllObserver {
  def this(
    currentObserver: IObserver,
    groupDisposable: typingsSlinky.wonderFrp.groupDisposableMod.GroupDisposable
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/commonjs", "MergeAllObserver")
@js.native
object MergeAllObserver extends js.Object {
  def create(
    currentObserver: IObserver,
    groupDisposable: typingsSlinky.wonderFrp.groupDisposableMod.GroupDisposable
  ): typingsSlinky.wonderFrp.mergeAllObserverMod.MergeAllObserver = js.native
}

