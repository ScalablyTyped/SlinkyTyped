package typingsSlinky.zenObservableTs

import typingsSlinky.std.ArrayLike
import typingsSlinky.zenObservableTs.typesMod.ZenObservable.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zenObservableMod {
  
  @js.native
  trait Observable[T] extends StObject {
    
    def filter(fn: js.Function1[/* value */ T, Boolean]): Observable[T] = js.native
    
    def flatMap[R](
      fn: js.Function1[
          /* value */ T, 
          typingsSlinky.zenObservableTs.typesMod.ZenObservable.ObservableLike[R]
        ]
    ): Observable[R] = js.native
    
    def forEach(fn: js.Function1[/* value */ T, Unit]): js.Promise[Unit] = js.native
    
    def from[R](observable: ArrayLike[R]): Observable[R] = js.native
    def from[R](observable: typingsSlinky.zenObservableTs.typesMod.ZenObservable.ObservableLike[R]): Observable[R] = js.native
    def from[R](observable: Observable[R]): Observable[R] = js.native
    
    def map[R](fn: js.Function1[/* value */ T, R]): Observable[R] = js.native
    
    def of[R](args: R*): Observable[R] = js.native
    
    def reduce[R](fn: js.Function2[/* previousValue */ R | T, /* currentValue */ T, R | T]): Observable[R | T] = js.native
    def reduce[R](fn: js.Function2[R | T, /* currentValue */ T, R | T], initialValue: R | T): Observable[R | T] = js.native
    
    def subscribe(observerOrNext: js.Function1[/* value */ T, Unit]): Subscription = js.native
    def subscribe(
      observerOrNext: js.Function1[/* value */ T, Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ): Subscription = js.native
    def subscribe(observerOrNext: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): Subscription = js.native
    def subscribe(
      observerOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* error */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): Subscription = js.native
    def subscribe(observerOrNext: typingsSlinky.zenObservableTs.typesMod.ZenObservable.Observer[T]): Subscription = js.native
    def subscribe(
      observerOrNext: typingsSlinky.zenObservableTs.typesMod.ZenObservable.Observer[T],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ): Subscription = js.native
    def subscribe(
      observerOrNext: typingsSlinky.zenObservableTs.typesMod.ZenObservable.Observer[T],
      error: js.Function1[/* error */ js.Any, Unit]
    ): Subscription = js.native
    def subscribe(
      observerOrNext: typingsSlinky.zenObservableTs.typesMod.ZenObservable.Observer[T],
      error: js.Function1[/* error */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): Subscription = js.native
  }
  object Observable {
    
    @JSImport("zen-observable-ts/lib/zenObservable", "Observable.from")
    @js.native
    def from[R](observable: ArrayLike[R]): Observable[R] = js.native
    @JSImport("zen-observable-ts/lib/zenObservable", "Observable.from")
    @js.native
    def from[R](observable: typingsSlinky.zenObservableTs.typesMod.ZenObservable.ObservableLike[R]): Observable[R] = js.native
    @JSImport("zen-observable-ts/lib/zenObservable", "Observable.from")
    @js.native
    def from[R](observable: Observable[R]): Observable[R] = js.native
    
    @JSImport("zen-observable-ts/lib/zenObservable", "Observable.of")
    @js.native
    def of[R](args: R*): Observable[R] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("zen-observable-ts/lib/zenObservable", "Observable")
  @js.native
  class ObservableCls[T] protected () extends Observable[T] {
    def this(subscriber: Subscriber[T]) = this()
  }
  
  type ObservableLike[T] = typingsSlinky.zenObservableTs.typesMod.ZenObservable.ObservableLike[T]
  
  type Observer[T] = typingsSlinky.zenObservableTs.typesMod.ZenObservable.Observer[T]
  
  type Subscriber[T] = typingsSlinky.zenObservableTs.typesMod.ZenObservable.Subscriber[T]
}
