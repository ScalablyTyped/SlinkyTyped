package typingsSlinky.wonderDashFrp

import typingsSlinky.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typingsSlinky.wonderDashFrp.distCommonjsDisposableGroupDisposableMod.GroupDisposable
import typingsSlinky.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import typingsSlinky.wonderDashFrp.distCommonjsObserverMergeAllObserverMod.MergeAllObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/MergeAllObserver", JSImport.Namespace)
@js.native
object distCommonjsObserverMergeAllObserverMod extends js.Object {
  @js.native
  class MergeAllObserver protected () extends Observer {
    def this(currentObserver: IObserver, groupDisposable: GroupDisposable) = this()
    var _groupDisposable: js.Any = js.native
    var currentObserver: IObserver = js.native
    var done: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MergeAllObserver extends js.Object {
    def create(currentObserver: IObserver, groupDisposable: GroupDisposable): MergeAllObserver = js.native
  }
  
}

