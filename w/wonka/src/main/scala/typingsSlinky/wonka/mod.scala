package typingsSlinky.wonka

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.wonka.pipeMod.UnaryFn
import typingsSlinky.wonka.wonkaCallbagMod.Callbag
import typingsSlinky.wonka.wonkaObservableMod.JsObservable
import typingsSlinky.wonka.wonkaTypesMod.List
import typingsSlinky.wonka.wonkaTypesMod.Observer
import typingsSlinky.wonka.wonkaTypesMod.Operator
import typingsSlinky.wonka.wonkaTypesMod.Source
import typingsSlinky.wonka.wonkaTypesMod.Subject
import typingsSlinky.wonka.wonkaTypesMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wonka", "buffer")
  @js.native
  def buffer[A](signal: Source[_]): Operator[A, js.Array[A]] = js.native
  
  @JSImport("wonka", "combine")
  @js.native
  def combine[A, B](a: Source[A]): js.Function1[/* b */ Source[B], Source[js.Tuple2[A, B]]] = js.native
  
  @JSImport("wonka", "concat")
  @js.native
  def concat[A](sources: js.Array[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka", "concatAll")
  @js.native
  def concatAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka", "concatMap")
  @js.native
  def concatMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
  
  @JSImport("wonka", "debounce")
  @js.native
  def debounce[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = js.native
  
  @JSImport("wonka", "delay")
  @js.native
  def delay[A](duration: Double): Operator[A, A] = js.native
  
  @JSImport("wonka", "empty")
  @js.native
  val empty: Source[js.Object] = js.native
  
  @JSImport("wonka", "filter")
  @js.native
  def filter[A](f: js.Function1[/* value */ A, Boolean]): Operator[A, A] = js.native
  
  @JSImport("wonka", "flatten")
  @js.native
  def flatten[A](source: Source[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka", "forEach")
  @js.native
  def forEach[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Unit] = js.native
  
  @JSImport("wonka", "fromArray")
  @js.native
  def fromArray[A](array: js.Array[A]): Source[A] = js.native
  
  @JSImport("wonka", "fromCallbag")
  @js.native
  def fromCallbag[T](callbag: Callbag[Unit, T]): Source[T] = js.native
  
  @JSImport("wonka", "fromDomEvent")
  @js.native
  def fromDomEvent[E](element: HTMLElement, event: String): Source[E] = js.native
  
  @JSImport("wonka", "fromList")
  @js.native
  def fromList[A](list: List[A]): Source[A] = js.native
  
  @JSImport("wonka", "fromListener")
  @js.native
  def fromListener[E](
    addListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit],
    removeListener: js.Function1[/* cb */ js.Function1[/* event */ E, Unit], Unit]
  ): Source[E] = js.native
  
  @JSImport("wonka", "fromObservable")
  @js.native
  def fromObservable[T](observable: JsObservable[T]): Source[T] = js.native
  
  @JSImport("wonka", "fromPromise")
  @js.native
  def fromPromise[A](promise: js.Promise[A]): Source[A] = js.native
  
  @JSImport("wonka", "fromValue")
  @js.native
  def fromValue[A](value: A): Source[A] = js.native
  
  @JSImport("wonka", "interval")
  @js.native
  def interval(interval: Double): Source[Double] = js.native
  
  @JSImport("wonka", "make")
  @js.native
  def make[A](f: js.Function1[/* observer */ Observer[A], js.Function0[Unit]]): Source[A] = js.native
  
  @JSImport("wonka", "makeSubject")
  @js.native
  def makeSubject[A](): Subject[A] = js.native
  
  @JSImport("wonka", "map")
  @js.native
  def map[A, B](f: js.Function1[/* value */ A, B]): Operator[A, B] = js.native
  
  @JSImport("wonka", "merge")
  @js.native
  def merge[A](sources: js.Array[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka", "mergeAll")
  @js.native
  def mergeAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka", "mergeMap")
  @js.native
  def mergeMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
  
  @JSImport("wonka", "never")
  @js.native
  val never: Source[js.Object] = js.native
  
  @JSImport("wonka", "onEnd")
  @js.native
  def onEnd[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  @JSImport("wonka", "onPush")
  @js.native
  def onPush[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  @JSImport("wonka", "onStart")
  @js.native
  def onStart[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  @JSImport("wonka", "pipe")
  @js.native
  def pipe[T, A](source: Source[T], op1: UnaryFn[Source[T], Source[A]]): Source[A] = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe[T, A, B](source: Source[T], op1: UnaryFn[Source[T], Source[A]], op2: UnaryFn[Source[A], Source[B]]): Source[B] = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe[T, A, B, C](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]]
  ): Source[C] = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe[T, A, B, C, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    consumer: UnaryFn[Source[C], R]
  ): R = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]]
  ): Source[E] = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E, F](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]]
  ): Source[F] = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E, F, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    consumer: UnaryFn[Source[F], R]
  ): R = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E, F, G, H](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    op7: UnaryFn[Source[F], Source[G]],
    op8: UnaryFn[Source[G], Source[H]]
  ): Source[H] = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe[T, A, B, C, D, E, F, G, H, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    op7: UnaryFn[Source[F], Source[G]],
    op8: UnaryFn[Source[G], Source[H]],
    consumer: UnaryFn[Source[H], R]
  ): R = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe_TABCDEFGR_R[T, A, B, C, D, E, F, G, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    op7: UnaryFn[Source[F], Source[G]],
    consumer: UnaryFn[Source[G], R]
  ): R = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe_TABCDEFG_Source[T, A, B, C, D, E, F, G](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    op7: UnaryFn[Source[F], Source[G]]
  ): Source[G] = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe_TABCDER_R[T, A, B, C, D, E, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    consumer: UnaryFn[Source[E], R]
  ): R = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe_TABCDR_R[T, A, B, C, D, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    consumer: UnaryFn[Source[D], R]
  ): R = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe_TABCD_Source[T, A, B, C, D](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]]
  ): Source[D] = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe_TABR_R[T, A, B, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    consumer: UnaryFn[Source[B], R]
  ): R = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe_TAR_R[T, A, R](source: Source[T], op1: UnaryFn[Source[T], Source[A]], consumer: UnaryFn[Source[A], R]): R = js.native
  @JSImport("wonka", "pipe")
  @js.native
  def pipe_TR_R[T, R](source: Source[T], consumer: UnaryFn[Source[T], R]): R = js.native
  
  @JSImport("wonka", "publish")
  @js.native
  def publish[A](source: Source[A]): Subscription = js.native
  
  @JSImport("wonka", "sample")
  @js.native
  def sample[A](signal: Source[_]): Operator[A, A] = js.native
  
  @JSImport("wonka", "scan")
  @js.native
  def scan[A, B](f: js.Function2[/* acc */ B, /* value */ A, B], acc: B): Operator[A, B] = js.native
  
  @JSImport("wonka", "share")
  @js.native
  def share[A](source: Source[A]): Source[A] = js.native
  
  @JSImport("wonka", "skip")
  @js.native
  def skip[A](max: Double): Operator[A, A] = js.native
  
  @JSImport("wonka", "skipUntil")
  @js.native
  def skipUntil[A](signal: Source[_]): Operator[A, A] = js.native
  
  @JSImport("wonka", "skipWhile")
  @js.native
  def skipWhile[A](f: js.Function1[/* x */ A, Boolean]): Operator[A, A] = js.native
  
  @JSImport("wonka", "subscribe")
  @js.native
  def subscribe[A](f: js.Function1[/* x */ A, Unit]): js.Function1[/* source */ Source[A], Subscription] = js.native
  
  @JSImport("wonka", "switchAll")
  @js.native
  def switchAll[A](source: Source[Source[A]]): Source[A] = js.native
  
  @JSImport("wonka", "switchMap")
  @js.native
  def switchMap[A, B](f: js.Function1[/* value */ A, Source[B]]): Operator[A, B] = js.native
  
  @JSImport("wonka", "take")
  @js.native
  def take[A](max: Double): Operator[A, A] = js.native
  
  @JSImport("wonka", "takeLast")
  @js.native
  def takeLast[A](max: Double): Operator[A, A] = js.native
  
  @JSImport("wonka", "takeUntil")
  @js.native
  def takeUntil[A](signal: Source[_]): Operator[A, A] = js.native
  
  @JSImport("wonka", "takeWhile")
  @js.native
  def takeWhile[A](f: js.Function1[/* x */ A, Boolean]): Operator[A, A] = js.native
  
  @JSImport("wonka", "tap")
  @js.native
  def tap[A](f: js.Function1[/* value */ A, Unit]): Operator[A, A] = js.native
  
  @JSImport("wonka", "throttle")
  @js.native
  def throttle[A](f: js.Function1[/* x */ A, Double]): Operator[A, A] = js.native
  
  @JSImport("wonka", "toArray")
  @js.native
  def toArray[A](source: Source[A]): js.Array[A] = js.native
  
  @JSImport("wonka", "toCallbag")
  @js.native
  def toCallbag[T](source: Source[T]): Callbag[Unit, T] = js.native
  
  @JSImport("wonka", "toObservable")
  @js.native
  def toObservable[T](source: Source[T]): JsObservable[T] = js.native
  
  @JSImport("wonka", "toPromise")
  @js.native
  def toPromise[A](source: Source[A]): js.Promise[A] = js.native
}
