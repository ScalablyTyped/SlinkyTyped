package typingsSlinky.wonderDashFrp

import typingsSlinky.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typingsSlinky.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import typingsSlinky.wonderDashFrp.distCommonjsObserverTakeUntilObserverMod.TakeUntilObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/TakeUntilObserver", JSImport.Namespace)
@js.native
object distCommonjsObserverTakeUntilObserverMod extends js.Object {
  @js.native
  class TakeUntilObserver protected () extends Observer {
    def this(prevObserver: IObserver) = this()
    var _prevObserver: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TakeUntilObserver extends js.Object {
    def create(prevObserver: IObserver): TakeUntilObserver = js.native
  }
  
}

