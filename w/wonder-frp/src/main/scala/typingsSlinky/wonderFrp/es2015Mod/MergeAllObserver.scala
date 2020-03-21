package typingsSlinky.wonderFrp.es2015Mod

import typingsSlinky.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015", "MergeAllObserver")
@js.native
class MergeAllObserver protected ()
  extends typingsSlinky.wonderFrp.observerMergeAllObserverMod.MergeAllObserver {
  def this(
    currentObserver: IObserver,
    groupDisposable: typingsSlinky.wonderFrp.disposableGroupDisposableMod.GroupDisposable
  ) = this()
}

/* static members */
@JSImport("wonder-frp/dist/es2015", "MergeAllObserver")
@js.native
object MergeAllObserver extends js.Object {
  def create(
    currentObserver: IObserver,
    groupDisposable: typingsSlinky.wonderFrp.disposableGroupDisposableMod.GroupDisposable
  ): typingsSlinky.wonderFrp.observerMergeAllObserverMod.MergeAllObserver = js.native
}

