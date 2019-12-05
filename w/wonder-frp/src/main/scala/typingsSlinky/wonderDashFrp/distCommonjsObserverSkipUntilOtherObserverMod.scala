package typingsSlinky.wonderDashFrp

import typingsSlinky.wonderDashFrp.distCommonjsCoreObserverMod.Observer
import typingsSlinky.wonderDashFrp.distCommonjsDisposableIDisposableMod.IDisposable
import typingsSlinky.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import typingsSlinky.wonderDashFrp.distCommonjsObserverSkipUntilOtherObserverMod.SkipUntilOtherObserver
import typingsSlinky.wonderDashFrp.distCommonjsStreamSkipUntilStreamMod.SkipUntilStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/observer/SkipUntilOtherObserver", JSImport.Namespace)
@js.native
object distCommonjsObserverSkipUntilOtherObserverMod extends js.Object {
  @js.native
  class SkipUntilOtherObserver protected () extends Observer {
    def this(prevObserver: IObserver, skipUntilStream: SkipUntilStream) = this()
    var _prevObserver: js.Any = js.native
    var _skipUntilStream: js.Any = js.native
    var otherDisposable: IDisposable = js.native
  }
  
  /* static members */
  @js.native
  object SkipUntilOtherObserver extends js.Object {
    def create(prevObserver: IObserver, skipUntilStream: SkipUntilStream): SkipUntilOtherObserver = js.native
  }
  
}

