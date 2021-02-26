package typingsSlinky.zenObservable

import typingsSlinky.std.ArrayLike
import typingsSlinky.zenObservable.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @JSImport("zen-observable/esm", JSImport.Default)
  @js.native
  class default[T] protected () extends ^[T] {
    def this(subscriber: typingsSlinky.zenObservable.mod.global.ZenObservable.Subscriber[T]) = this()
  }
  object default {
    
    @JSImport("zen-observable/esm", "default.from")
    @js.native
    def from[R](observable: ArrayLike[R]): typingsSlinky.zenObservable.mod.Observable[R] = js.native
    /* static member */
    @JSImport("zen-observable/esm", "default.from")
    @js.native
    def from[R](observable: typingsSlinky.zenObservable.mod.Observable[R]): typingsSlinky.zenObservable.mod.Observable[R] = js.native
    @JSImport("zen-observable/esm", "default.from")
    @js.native
    def from[R](observable: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[R]): typingsSlinky.zenObservable.mod.Observable[R] = js.native
    
    /* static member */
    @JSImport("zen-observable/esm", "default.of")
    @js.native
    def of[R](items: R*): typingsSlinky.zenObservable.mod.Observable[R] = js.native
  }
  
  @JSImport("zen-observable/esm", "Observable")
  @js.native
  class Observable[T] protected () extends ^[T] {
    def this(subscriber: typingsSlinky.zenObservable.mod.global.ZenObservable.Subscriber[T]) = this()
  }
  object Observable {
    
    @JSImport("zen-observable/esm", "Observable.from")
    @js.native
    def from[R](observable: ArrayLike[R]): typingsSlinky.zenObservable.mod.Observable[R] = js.native
    /* static member */
    @JSImport("zen-observable/esm", "Observable.from")
    @js.native
    def from[R](observable: typingsSlinky.zenObservable.mod.Observable[R]): typingsSlinky.zenObservable.mod.Observable[R] = js.native
    @JSImport("zen-observable/esm", "Observable.from")
    @js.native
    def from[R](observable: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[R]): typingsSlinky.zenObservable.mod.Observable[R] = js.native
    
    /* static member */
    @JSImport("zen-observable/esm", "Observable.of")
    @js.native
    def of[R](items: R*): typingsSlinky.zenObservable.mod.Observable[R] = js.native
  }
  
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest(): ^[scala.Nothing] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[A](a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A]): ^[js.Array[A]] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[T](observables: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): ^[js.Array[T]] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[A, B](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): ^[js.Tuple2[A, B]] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[A, B, C](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): ^[js.Tuple3[A, B, C]] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[A, B, C, D](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): ^[js.Tuple4[A, B, C, D]] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[A, B, C, D, E](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): ^[js.Tuple5[A, B, C, D, E]] = js.native
  @JSImport("zen-observable/esm", "combineLatest")
  @js.native
  def combineLatest[A, B, C, D, E, F](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): ^[js.Tuple6[A, B, C, D, E, F]] = js.native
  
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge(): ^[scala.Nothing] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[A](a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A]): ^[A] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[T](observables: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): ^[T] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[A, B](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): ^[A | B] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[A, B, C](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): ^[A | B | C] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[A, B, C, D](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): ^[A | B | C | D] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[A, B, C, D, E](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): ^[A | B | C | D | E] = js.native
  @JSImport("zen-observable/esm", "merge")
  @js.native
  def merge[A, B, C, D, E, F](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): ^[A | B | C | D | E | F] = js.native
  
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip(): ^[scala.Nothing] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[A](a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A]): ^[js.Array[A]] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[T](observables: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): ^[js.Array[T]] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[A, B](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): ^[js.Tuple2[A, B]] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[A, B, C](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): ^[js.Tuple3[A, B, C]] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[A, B, C, D](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): ^[js.Tuple4[A, B, C, D]] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[A, B, C, D, E](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): ^[js.Tuple5[A, B, C, D, E]] = js.native
  @JSImport("zen-observable/esm", "zip")
  @js.native
  def zip[A, B, C, D, E, F](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): ^[js.Tuple6[A, B, C, D, E, F]] = js.native
  
  type ObservableLike[T] = typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[T]
  
  type Observer[T] = typingsSlinky.zenObservable.mod.global.ZenObservable.Observer[T]
  
  type Subscriber[T] = typingsSlinky.zenObservable.mod.global.ZenObservable.Subscriber[T]
  
  type Subscription = typingsSlinky.zenObservable.mod.global.ZenObservable.Subscription
  
  type SubscriptionObserver[T] = typingsSlinky.zenObservable.mod.global.ZenObservable.SubscriptionObserver[T]
}
