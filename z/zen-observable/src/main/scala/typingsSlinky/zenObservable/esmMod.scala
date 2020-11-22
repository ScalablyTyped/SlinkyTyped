package typingsSlinky.zenObservable

import typingsSlinky.std.ArrayLike
import typingsSlinky.zenObservable.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zen-observable/esm", JSImport.Namespace)
@js.native
object esmMod extends js.Object {
  
  def combineLatest(): ^[scala.Nothing] = js.native
  def combineLatest[A](a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A]): ^[js.Array[A]] = js.native
  def combineLatest[T](observables: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): ^[js.Array[T]] = js.native
  def combineLatest[A, B](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): ^[js.Tuple2[A, B]] = js.native
  def combineLatest[A, B, C](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): ^[js.Tuple3[A, B, C]] = js.native
  def combineLatest[A, B, C, D](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): ^[js.Tuple4[A, B, C, D]] = js.native
  def combineLatest[A, B, C, D, E](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): ^[js.Tuple5[A, B, C, D, E]] = js.native
  def combineLatest[A, B, C, D, E, F](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): ^[js.Tuple6[A, B, C, D, E, F]] = js.native
  
  def merge(): ^[scala.Nothing] = js.native
  def merge[A](a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A]): ^[A] = js.native
  def merge[T](observables: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): ^[T] = js.native
  def merge[A, B](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): ^[A | B] = js.native
  def merge[A, B, C](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): ^[A | B | C] = js.native
  def merge[A, B, C, D](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): ^[A | B | C | D] = js.native
  def merge[A, B, C, D, E](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): ^[A | B | C | D | E] = js.native
  def merge[A, B, C, D, E, F](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): ^[A | B | C | D | E | F] = js.native
  
  def zip(): ^[scala.Nothing] = js.native
  def zip[A](a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A]): ^[js.Array[A]] = js.native
  def zip[T](observables: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[T]*): ^[js.Array[T]] = js.native
  def zip[A, B](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B]
  ): ^[js.Tuple2[A, B]] = js.native
  def zip[A, B, C](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C]
  ): ^[js.Tuple3[A, B, C]] = js.native
  def zip[A, B, C, D](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D]
  ): ^[js.Tuple4[A, B, C, D]] = js.native
  def zip[A, B, C, D, E](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[E]
  ): ^[js.Tuple5[A, B, C, D, E]] = js.native
  def zip[A, B, C, D, E, F](
    a: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[A],
    b: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[B],
    c: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[C],
    d: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[D],
    e: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[E],
    f: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[F]
  ): ^[js.Tuple6[A, B, C, D, E, F]] = js.native
  
  @js.native
  class Observable[T] protected () extends ^[T] {
    def this(subscriber: typingsSlinky.zenObservable.mod.global.ZenObservable.Subscriber[T]) = this()
  }
  /* static members */
  @js.native
  object Observable extends js.Object {
    
    def from[R](observable: ArrayLike[R]): typingsSlinky.zenObservable.mod.Observable[R] = js.native
    def from[R](observable: typingsSlinky.zenObservable.mod.Observable[R]): typingsSlinky.zenObservable.mod.Observable[R] = js.native
    def from[R](observable: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[R]): typingsSlinky.zenObservable.mod.Observable[R] = js.native
    
    def of[R](items: R*): typingsSlinky.zenObservable.mod.Observable[R] = js.native
  }
  
  @js.native
  class default[T] protected () extends ^[T] {
    def this(subscriber: typingsSlinky.zenObservable.mod.global.ZenObservable.Subscriber[T]) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def from[R](observable: ArrayLike[R]): typingsSlinky.zenObservable.mod.Observable[R] = js.native
    def from[R](observable: typingsSlinky.zenObservable.mod.Observable[R]): typingsSlinky.zenObservable.mod.Observable[R] = js.native
    def from[R](observable: typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[R]): typingsSlinky.zenObservable.mod.Observable[R] = js.native
    
    def of[R](items: R*): typingsSlinky.zenObservable.mod.Observable[R] = js.native
  }
  
  type ObservableLike[T] = typingsSlinky.zenObservable.mod.global.ZenObservable.ObservableLike[T]
  
  type Observer[T] = typingsSlinky.zenObservable.mod.global.ZenObservable.Observer[T]
  
  type Subscriber[T] = typingsSlinky.zenObservable.mod.global.ZenObservable.Subscriber[T]
  
  type Subscription = typingsSlinky.zenObservable.mod.global.ZenObservable.Subscription
  
  type SubscriptionObserver[T] = typingsSlinky.zenObservable.mod.global.ZenObservable.SubscriptionObserver[T]
}
