package typingsSlinky.wonderFrp

import typingsSlinky.wonderFrp.coreObserverMod.Observer
import typingsSlinky.wonderFrp.coreStreamMod.Stream
import typingsSlinky.wonderFrp.disposableIdisposableMod.IDisposable
import typingsSlinky.wonderFrp.observerIobserverMod.IObserver
import typingsSlinky.wonderFrp.subjectSubjectMod.Subject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/stream/BaseStream", JSImport.Namespace)
@js.native
object streamBaseStreamMod extends js.Object {
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

