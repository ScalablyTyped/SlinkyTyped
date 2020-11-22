package typingsSlinky.wonka

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.wonka.wonkaCallbagMod.Callbag
import typingsSlinky.wonka.wonkaObservableMod.JsObservable
import typingsSlinky.wonka.wonkaTypesMod.Operator
import typingsSlinky.wonka.wonkaTypesMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/web/wonkaJs", JSImport.Namespace)
@js.native
object wonkaJsMod extends js.Object {
  
  def debounce[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = js.native
  
  def delay[A](duration: Double): Operator[A, A] = js.native
  
  def fromCallbag[T](callbag: Callbag[Unit, T]): Source[T] = js.native
  
  def fromDomEvent[E](element: HTMLElement, event: String): Source[E] = js.native
  
  def fromListener[E](
    addListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit],
    removeListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit]
  ): Source[E] = js.native
  
  def fromObservable[T](observable: JsObservable[T]): Source[T] = js.native
  
  def fromPromise[A](promise: js.Promise[A]): Source[A] = js.native
  
  def interval(interval: Double): Source[Double] = js.native
  
  def throttle[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = js.native
  
  def toCallbag[T](source: Source[T]): Callbag[Unit, T] = js.native
  
  def toObservable[T](source: Source[T]): JsObservable[T] = js.native
  
  def toPromise[A](source: Source[A]): js.Promise[A] = js.native
}
