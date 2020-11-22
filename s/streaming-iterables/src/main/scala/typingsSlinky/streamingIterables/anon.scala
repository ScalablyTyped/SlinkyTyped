package typingsSlinky.streamingIterables

import typingsSlinky.std.AsyncGenerator
import typingsSlinky.std.AsyncIterableIterator
import typingsSlinky.streamingIterables.mod.AnyIterable
import typingsSlinky.streamingIterables.mod.FlatMapValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Fn0[T, R] extends js.Object {
    
    def apply(func: js.Function1[/* data */ T, R | js.Promise[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncIterableIterator[R]] = js.native
    def apply(func: js.Function1[/* data */ T, R | js.Promise[R]], iterable: AnyIterable[T]): AsyncIterableIterator[R] = js.native
  }
  
  @js.native
  trait FnCall[T, R] extends js.Object {
    
    def apply(func: js.Function1[/* data */ T, FlatMapValue[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[R, _, _]] = js.native
    def apply(func: js.Function1[/* data */ T, FlatMapValue[R]], iterable: AnyIterable[T]): AsyncGenerator[R, _, _] = js.native
  }
  
  @js.native
  trait FnCallFuncIterable[T, R] extends js.Object {
    
    def apply(func: js.Function1[/* data */ T, R | js.Promise[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[R, _, _]] = js.native
    def apply(func: js.Function1[/* data */ T, R | js.Promise[R]], iterable: AnyIterable[T]): AsyncGenerator[R, _, _] = js.native
  }
  
  @js.native
  trait FnCallStartIterable[B, T] extends js.Object {
    
    def apply(start: B): js.Function1[/* iterable */ AnyIterable[T], js.Promise[B]] = js.native
    def apply(start: B, iterable: AnyIterable[T]): js.Promise[B] = js.native
  }
}
