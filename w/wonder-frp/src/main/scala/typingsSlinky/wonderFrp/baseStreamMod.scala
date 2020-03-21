package typingsSlinky.wonderFrp

import typingsSlinky.wonderFrp.idisposableMod.IDisposable
import typingsSlinky.wonderFrp.iobserverMod.IObserver
import typingsSlinky.wonderFrp.observerMod.Observer
import typingsSlinky.wonderFrp.streamMod.Stream
import typingsSlinky.wonderFrp.subjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/stream/BaseStream", JSImport.Namespace)
@js.native
object baseStreamMod extends js.Object {
  @js.native
  abstract class BaseStream () extends Stream {
    def subscribe(arg1: js.Function, onError: js.Any): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Any, onCompleted: js.Any): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Any): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Any, onCompleted: js.Any): IDisposable = js.native
    def subscribe(arg1: Subject, onError: js.Any): IDisposable = js.native
    def subscribe(arg1: Subject, onError: js.Any, onCompleted: js.Any): IDisposable = js.native
    def subscribeCore(observer: IObserver): IDisposable = js.native
  }
  
}

