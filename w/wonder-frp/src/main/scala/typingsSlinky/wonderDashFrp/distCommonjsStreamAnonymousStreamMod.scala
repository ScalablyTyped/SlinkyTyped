package typingsSlinky.wonderDashFrp

import typingsSlinky.wonderDashFrp.distCommonjsCoreStreamMod.Stream
import typingsSlinky.wonderDashFrp.distCommonjsDisposableIDisposableMod.IDisposable
import typingsSlinky.wonderDashFrp.distCommonjsObserverIObserverMod.IObserver
import typingsSlinky.wonderDashFrp.distCommonjsStreamAnonymousStreamMod.AnonymousStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/AnonymousStream", JSImport.Namespace)
@js.native
object distCommonjsStreamAnonymousStreamMod extends js.Object {
  @js.native
  class AnonymousStream protected () extends Stream {
    def this(subscribeFunc: js.Function) = this()
    def subscribe(observer: IObserver): IDisposable = js.native
    def subscribe(onNext: js.Function1[/* value */ js.Any, Unit]): IDisposable = js.native
    def subscribe(onNext: js.Function1[/* value */ js.Any, Unit], onError: js.Function1[/* e */ js.Any, Unit]): IDisposable = js.native
    def subscribe(
      onNext: js.Function1[/* value */ js.Any, Unit],
      onError: js.Function1[/* e */ js.Any, Unit],
      onComplete: js.Function0[Unit]
    ): IDisposable = js.native
  }
  
  /* static members */
  @js.native
  object AnonymousStream extends js.Object {
    def create(subscribeFunc: js.Function): AnonymousStream = js.native
  }
  
}

