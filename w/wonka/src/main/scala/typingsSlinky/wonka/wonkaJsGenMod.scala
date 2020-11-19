package typingsSlinky.wonka

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.wonka.wonkaCallbagGenMod.callbagT
import typingsSlinky.wonka.wonkaObservableGenMod.observableT
import typingsSlinky.wonka.wonkaTypesGenMod.operatorT
import typingsSlinky.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/dist/types/src/web/WonkaJs.gen", JSImport.Namespace)
@js.native
object wonkaJsGenMod extends js.Object {
  
  def debounce[a](f: js.Function1[/* _1 */ a, Double]): operatorT[a, a] = js.native
  
  def delay[a](wait: Double): operatorT[a, a] = js.native
  
  def fromCallbag[T1](_1: callbagT[T1]): sourceT[T1] = js.native
  
  def fromDomEvent(element: HTMLElement, event: String): sourceT[Event] = js.native
  
  def fromObservable[T1](_1: observableT[T1]): sourceT[T1] = js.native
  
  def fromPromise[a](promise: js.Promise[a]): sourceT[a] = js.native
  
  def interval(p: Double): sourceT[Double] = js.native
  
  def throttle[a](f: js.Function1[/* _1 */ a, Double]): operatorT[a, a] = js.native
  
  def toCallbag[T1](_1: sourceT[T1]): callbagT[T1] = js.native
  
  def toObservable[T1](_1: sourceT[T1]): observableT[T1] = js.native
  
  def toPromise[a](source: sourceT[a]): js.Promise[a] = js.native
}
