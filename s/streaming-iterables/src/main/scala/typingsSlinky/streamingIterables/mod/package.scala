package typingsSlinky.streamingIterables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyIterable[T] = js.Iterable[T] | typingsSlinky.std.AsyncIterable[T]
  
  type CurriedBatchResult = js.Function1[
    /* curriedIterable */ typingsSlinky.streamingIterables.mod.AnyIterable[js.Any], 
    typingsSlinky.streamingIterables.mod.UnwrapAnyIterableArray[typingsSlinky.streamingIterables.mod.AnyIterable[js.Any]]
  ]
  
  type CurriedBufferResult = js.Function1[
    /* curriedIterable */ typingsSlinky.streamingIterables.mod.AnyIterable[js.Any], 
    typingsSlinky.streamingIterables.mod.UnwrapAnyIterable[typingsSlinky.streamingIterables.mod.AnyIterable[js.Any]]
  ]
  
  type CurriedTakeResult = js.Function1[
    /* curriedIterable */ typingsSlinky.streamingIterables.mod.AnyIterable[js.Any], 
    typingsSlinky.streamingIterables.mod.UnwrapAnyIterable[typingsSlinky.streamingIterables.mod.AnyIterable[js.Any]]
  ]
  
  type CurriedTimeResult = js.Function1[
    /* curriedIterable */ typingsSlinky.streamingIterables.mod.AnyIterable[js.Any], 
    typingsSlinky.streamingIterables.mod.UnwrapAnyIterable[typingsSlinky.streamingIterables.mod.AnyIterable[js.Any]]
  ]
  
  type FlatMapValue[B] = js.UndefOr[
    B | typingsSlinky.streamingIterables.mod.AnyIterable[B] | scala.Null | (js.Promise[js.UndefOr[B | typingsSlinky.streamingIterables.mod.AnyIterable[B] | scala.Null]])
  ]
  
  type Iterableish[T] = js.Iterable[T] | js.Iterator[T] | typingsSlinky.std.AsyncIterable[T] | (typingsSlinky.std.AsyncIterator[T, js.Any, js.UndefOr[scala.Nothing]])
  
  type UnArrayAnyIterable[A /* <: js.Array[typingsSlinky.streamingIterables.mod.AnyIterable[_]] */] = js.Any
  
  type UnwrapAnyIterable[M /* <: typingsSlinky.streamingIterables.mod.AnyIterable[_] */] = typingsSlinky.std.AsyncIterable[js.Any] | js.Iterable[js.Any]
  
  type UnwrapAnyIterableArray[M /* <: typingsSlinky.streamingIterables.mod.AnyIterable[_] */] = (typingsSlinky.std.AsyncGenerator[js.Array[js.Any], js.Any, js.Any]) | (typingsSlinky.std.Generator[js.Array[js.Any], js.Any, js.Any])
  
  type UnwrapToPromiseOrAsyncIterable[M /* <: typingsSlinky.streamingIterables.mod.AnyIterable[_] */] = js.Promise[js.Array[js.Any]] | js.Array[js.Any]
}
