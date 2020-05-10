package typingsSlinky.wonderFrp

import typingsSlinky.wonderFrp.coreObserverMod.Observer
import typingsSlinky.wonderFrp.coreStreamMod.Stream
import typingsSlinky.wonderFrp.disposableIdisposableMod.IDisposable
import typingsSlinky.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/subject/Subject", JSImport.Namespace)
@js.native
object subjectSubjectMod extends js.Object {
  @js.native
  class Subject () extends IObserver {
    var _observer: js.Any = js.native
    var _source: js.Any = js.native
    var source: Stream = js.native
    def remove(observer: Observer): Unit = js.native
    def start(): Unit = js.native
    def subscribe(): IDisposable = js.native
    def subscribe(arg1: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
  }
  
  /* static members */
  @js.native
  object Subject extends js.Object {
    def create(): Subject = js.native
  }
  
}

