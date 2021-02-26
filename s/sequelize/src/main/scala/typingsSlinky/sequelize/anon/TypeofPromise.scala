package typingsSlinky.sequelize.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.bluebird.anon.Cancellation
import typingsSlinky.bluebird.mod.Bluebird
import typingsSlinky.bluebird.mod.ConcurrencyOption
import typingsSlinky.bluebird.mod.CoroutineOptions
import typingsSlinky.bluebird.mod.Disposer
import typingsSlinky.bluebird.mod.FromNodeOptions
import typingsSlinky.bluebird.mod.Inspection
import typingsSlinky.bluebird.mod.IterateFunction
import typingsSlinky.bluebird.mod.PromisifyAllOptions
import typingsSlinky.bluebird.mod.PromisifyOptions
import typingsSlinky.bluebird.mod.Resolvable
import typingsSlinky.bluebird.mod.ResolvableProps
import typingsSlinky.bluebird.mod.Resolver
import typingsSlinky.std.IterableIterator
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPromise extends StObject {
  
  /**
    * A collection of errors. `AggregateError` is an array-like object, with numeric indices and a `.length` property.
    *  It supports all generic array methods such as `.forEach` directly.
    *
    * `AggregateError`s are caught in `.error` handlers, even if the contained errors are not operational.
    *
    * `Promise.some` and `Promise.any` use `AggregateError` as rejection reason when they fail.
    */
  var AggregateError: Instantiable0[typingsSlinky.bluebird.mod.AggregateError] = js.native
  
  /**
    * Signals that an operation has been aborted or cancelled. The default reason used by `.cancel`.
    */
  var CancellationError: Instantiable0[typingsSlinky.bluebird.mod.CancellationError] = js.native
  
  /**
    * returned by `Bluebird.disposer()`.
    */
  var Disposer: Instantiable0[typingsSlinky.bluebird.mod.Disposer[js.Object]] = js.native
  
  /**
    * Represents an error is an explicit promise rejection as opposed to a thrown error.
    *  For example, if an error is errbacked by a callback API promisified through undefined or undefined
    *  and is not a typed error, it will be converted to a `OperationalError` which has the original error in
    *  the `.cause` property.
    *
    * `OperationalError`s are caught in `.error` handlers.
    */
  var OperationalError: Instantiable0[typingsSlinky.bluebird.mod.OperationalError] = js.native
  
  /**
    * Create a new promise. The passed in function will receive functions `resolve` and `reject` as its arguments which can be called to seal the fate of the created promise.
    * If promise cancellation is enabled, passed in function will receive one more function argument `onCancel` that allows to register an optional cancellation callback.
    */
  /* static member */
  var Promise: Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ] = js.native
  
  /**
    * Signals that an operation has timed out. Used as a custom cancellation reason in `.timeout`.
    */
  var TimeoutError: Instantiable0[typingsSlinky.bluebird.mod.TimeoutError] = js.native
  
  /* static member */
  def all[T1](values: js.Array[Resolvable[T1]]): Bluebird[js.Array[T1]] = js.native
  // array with values
  /* static member */
  def all[R](values: Resolvable[js.Iterable[Resolvable[R]]]): Bluebird[js.Array[R]] = js.native
  /* static member */
  def all[T1, T2](values: js.Tuple2[Resolvable[T1], Resolvable[T2]]): Bluebird[js.Tuple2[T1, T2]] = js.native
  /* static member */
  def all[T1, T2, T3](values: js.Tuple3[Resolvable[T1], Resolvable[T2], Resolvable[T3]]): Bluebird[js.Tuple3[T1, T2, T3]] = js.native
  /* static member */
  def all[T1, T2, T3, T4](values: js.Tuple4[Resolvable[T1], Resolvable[T2], Resolvable[T3], Resolvable[T4]]): Bluebird[js.Tuple4[T1, T2, T3, T4]] = js.native
  /**
    * Given an array, or a promise of an array, which contains promises (or a mix of promises and values) return a promise that is fulfilled when all the items in the array are fulfilled.
    * The promise's fulfillment value is an array with fulfillment values at respective positions to the original array.
    * If any promise in the array rejects, the returned promise is rejected with the rejection reason.
    */
  // TODO enable more overloads
  // array with promises of different types
  /* static member */
  def all[T1, T2, T3, T4, T5](values: js.Tuple5[Resolvable[T1], Resolvable[T2], Resolvable[T3], Resolvable[T4], Resolvable[T5]]): Bluebird[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  
  /* static member */
  def allSettled[T1](values: js.Array[Resolvable[T1]]): Bluebird[js.Array[Inspection[T1]]] = js.native
  /* static member */
  def allSettled[R](values: Resolvable[js.Iterable[Resolvable[R]]]): Bluebird[js.Array[Inspection[R]]] = js.native
  /* static member */
  def allSettled[T1, T2](values: js.Tuple2[Resolvable[T1], Resolvable[T2]]): Bluebird[js.Tuple2[Inspection[T1], Inspection[T2]]] = js.native
  /* static member */
  def allSettled[T1, T2, T3](values: js.Tuple3[Resolvable[T1], Resolvable[T2], Resolvable[T3]]): Bluebird[js.Tuple3[Inspection[T1], Inspection[T2], Inspection[T3]]] = js.native
  /* static member */
  def allSettled[T1, T2, T3, T4](values: js.Tuple4[Resolvable[T1], Resolvable[T2], Resolvable[T3], Resolvable[T4]]): Bluebird[js.Tuple4[Inspection[T1], Inspection[T2], Inspection[T3], Inspection[T4]]] = js.native
  /* static member */
  def allSettled[T1, T2, T3, T4, T5](values: js.Tuple5[Resolvable[T1], Resolvable[T2], Resolvable[T3], Resolvable[T4], Resolvable[T5]]): Bluebird[
    js.Tuple5[Inspection[T1], Inspection[T2], Inspection[T3], Inspection[T4], Inspection[T5]]
  ] = js.native
  
  // tslint:disable-line:unified-signatures
  /**
    * Like `Promise.some()`, with 1 as `count`. However, if the promise fulfills, the fulfillment value is not an array of 1 but the value directly.
    */
  /* static member */
  def any[R](values: Resolvable[js.Iterable[Resolvable[R]]]): Bluebird[R] = js.native
  
  /* static member */
  def attempt[R](fn: js.Function0[Resolvable[R]]): Bluebird[R] = js.native
  
  /**
    * Sugar for `Promise.resolve(undefined).bind(thisArg);`. See `.bind()`.
    */
  /* static member */
  def bind(thisArg: js.Any): Bluebird[Unit] = js.native
  
  /**
    * Cast the given `value` to a trusted promise.
    *
    * If `value` is already a trusted `Promise`, it is returned as is. If `value` is not a thenable, a fulfilled is: Promise returned with `value` as its fulfillment value.
    * If `value` is a thenable (Promise-like object, like those returned by jQuery's `$.ajax`), returns a trusted that: Promise assimilates the state of the thenable.
    */
  /* static member */
  def cast[R](value: Resolvable[R]): Bluebird[R] = js.native
  
  /**
    * Configure long stack traces, warnings, monitoring and cancellation.
    * Note that even though false is the default here, a development environment might be detected which automatically
    *  enables long stack traces and warnings.
    */
  /* static member */
  def config(options: Cancellation): Unit = js.native
  
  /**
    * Returns a function that can use `yield` to run asynchronous code synchronously.
    *
    * This feature requires the support of generators which are drafted in the next version of the language.
    * Node version greater than `0.11.2` is required and needs to be executed with the `--harmony-generators` (or `--harmony`) command-line switch.
    */
  // TODO: After https://github.com/Microsoft/TypeScript/issues/2983 is implemented, we can use
  // the return type propagation of generators to automatically infer the return type T.
  /* static member */
  def coroutine[T](generatorFunction: js.Function0[IterableIterator[_]]): js.Function0[Bluebird[T]] = js.native
  def coroutine[T](generatorFunction: js.Function0[IterableIterator[_]], options: CoroutineOptions): js.Function0[Bluebird[T]] = js.native
  /* static member */
  def coroutine[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[_]]): js.Function1[/* a1 */ A1, Bluebird[T]] = js.native
  def coroutine[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[_]], options: CoroutineOptions): js.Function1[/* a1 */ A1, Bluebird[T]] = js.native
  /* static member */
  def coroutine[T, A1, A2](generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[_]]): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = js.native
  def coroutine[T, A1, A2](
    generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[_]],
    options: CoroutineOptions
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = js.native
  /* static member */
  def coroutine[T, A1, A2, A3](generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[_]]): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = js.native
  def coroutine[T, A1, A2, A3](
    generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[_]],
    options: CoroutineOptions
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = js.native
  /* static member */
  def coroutine[T, A1, A2, A3, A4](
    generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[_]]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = js.native
  def coroutine[T, A1, A2, A3, A4](
    generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[_]],
    options: CoroutineOptions
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = js.native
  /* static member */
  def coroutine[T, A1, A2, A3, A4, A5](
    generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[_]]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = js.native
  def coroutine[T, A1, A2, A3, A4, A5](
    generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[_]],
    options: CoroutineOptions
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = js.native
  /* static member */
  def coroutine[T, A1, A2, A3, A4, A5, A6](
    generatorFunction: js.Function6[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      IterableIterator[_]
    ]
  ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6](
    generatorFunction: js.Function6[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      IterableIterator[_]
    ],
    options: CoroutineOptions
  ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = js.native
  /* static member */
  def coroutine[T, A1, A2, A3, A4, A5, A6, A7](
    generatorFunction: js.Function7[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      IterableIterator[_]
    ]
  ): js.Function7[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    Bluebird[T]
  ] = js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6, A7](
    generatorFunction: js.Function7[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      IterableIterator[_]
    ],
    options: CoroutineOptions
  ): js.Function7[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    Bluebird[T]
  ] = js.native
  /* static member */
  def coroutine[T, A1, A2, A3, A4, A5, A6, A7, A8](
    generatorFunction: js.Function8[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      /* a8 */ A8, 
      IterableIterator[_]
    ]
  ): js.Function8[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    /* a8 */ A8, 
    Bluebird[T]
  ] = js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6, A7, A8](
    generatorFunction: js.Function8[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      /* a8 */ A8, 
      IterableIterator[_]
    ],
    options: CoroutineOptions
  ): js.Function8[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    /* a8 */ A8, 
    Bluebird[T]
  ] = js.native
  
  /**
    * @deprecated
    * Create a promise with undecided fate and return a `PromiseResolver` to control it. See resolution?: Promise(#promise-resolution).
    * @see http://bluebirdjs.com/docs/deprecated-apis.html#promise-resolution
    */
  /* static member */
  def defer[R](): Resolver[R] = js.native
  
  /* static member */
  def delay(ms: Double): Bluebird[Unit] = js.native
  /**
    * Returns a promise that will be resolved with value (or undefined) after given ms milliseconds.
    * If value is a promise, the delay will start counting down when it is fulfilled and the returned
    *  promise will be fulfilled with the fulfillment value of the value promise.
    */
  /* static member */
  def delay[R](ms: Double, value: Resolvable[R]): Bluebird[R] = js.native
  
  /**
    * Iterate over an array, or a promise of an array,
    * which contains promises (or a mix of promises and values) with the given iterator function with the signature `(item, index, value)`
    * where item is the resolved value of a respective promise in the input array.
    * Iteration happens serially. If any promise in the input array is rejected the returned promise is rejected as well.
    *
    * Resolves to the original array unmodified, this method is meant to be used for side effects.
    * If the iterator function returns a promise or a thenable, the result for the promise is awaited for before continuing with next iteration.
    */
  /* static member */
  def each[R](values: Resolvable[js.Iterable[Resolvable[R]]], iterator: IterateFunction[R, _]): Bluebird[js.Array[R]] = js.native
  
  /**
    * Filter an array, or a promise of an array,
    * which contains a promises (or a mix of promises and values) with the given `filterer` function with the signature `(item, index, arrayLength)`
    * where `item` is the resolved value of a respective promise in the input array.
    * If any promise in the input array is rejected the returned promise is rejected as well.
    *
    * The return values from the filtered functions are coerced to booleans, with the exception of promises and thenables which are awaited for their eventual result.
    *
    * *The original array is not modified.
    */
  /* static member */
  def filter[R](values: Resolvable[js.Iterable[Resolvable[R]]], filterer: IterateFunction[R, Boolean]): Bluebird[js.Array[R]] = js.native
  def filter[R](
    values: Resolvable[js.Iterable[Resolvable[R]]],
    filterer: IterateFunction[R, Boolean],
    option: ConcurrencyOption
  ): Bluebird[js.Array[R]] = js.native
  
  /* static member */
  def fromCallback[T](
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): Bluebird[T] = js.native
  def fromCallback[T](
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: FromNodeOptions
  ): Bluebird[T] = js.native
  
  /**
    * Returns a promise that is resolved by a node style callback function.
    */
  /* static member */
  def fromNode[T](
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): Bluebird[T] = js.native
  def fromNode[T](
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: FromNodeOptions
  ): Bluebird[T] = js.native
  
  /**
    * Returns a new independent copy of the Bluebird library.
    *
    * This method should be used before you use any of the methods which would otherwise alter the global Bluebird object - to avoid polluting global state.
    */
  def getNewLibraryCopy(): Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ] = js.native
  
  /**
    * See if `value` is a trusted Promise.
    */
  /* static member */
  def is(value: js.Any): Boolean = js.native
  
  // variadic array
  /** @deprecated use .all instead */
  /* static member */
  def join[R](values: Resolvable[R]*): Bluebird[js.Array[R]] = js.native
  /**
    * Promise.join(
    *   Promise<any>|any values...,
    *   function handler
    * ) -> Promise
    * For coordinating multiple concurrent discrete promises.
    *
    * Note: In 1.x and 0.x Promise.join used to be a Promise.all that took the values in as arguments instead in an array.
    * This behavior has been deprecated but is still supported partially - when the last argument is an immediate function value the new semantics will apply
    */
  /* static member */
  def join[R, A1](arg1: Resolvable[A1], handler: js.Function1[/* arg1 */ A1, Resolvable[R]]): Bluebird[R] = js.native
  /* static member */
  def join[R, A1, A2](
    arg1: Resolvable[A1],
    arg2: Resolvable[A2],
    handler: js.Function2[/* arg1 */ A1, /* arg2 */ A2, Resolvable[R]]
  ): Bluebird[R] = js.native
  /* static member */
  def join[R, A1, A2, A3](
    arg1: Resolvable[A1],
    arg2: Resolvable[A2],
    arg3: Resolvable[A3],
    handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Resolvable[R]]
  ): Bluebird[R] = js.native
  /* static member */
  def join[R, A1, A2, A3, A4](
    arg1: Resolvable[A1],
    arg2: Resolvable[A2],
    arg3: Resolvable[A3],
    arg4: Resolvable[A4],
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Resolvable[R]]
  ): Bluebird[R] = js.native
  /* static member */
  def join[R, A1, A2, A3, A4, A5](
    arg1: Resolvable[A1],
    arg2: Resolvable[A2],
    arg3: Resolvable[A3],
    arg4: Resolvable[A4],
    arg5: Resolvable[A5],
    handler: js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Resolvable[R]]
  ): Bluebird[R] = js.native
  
  /**
    * Call this right after the library is loaded to enabled long stack traces.
    *
    * Long stack traces cannot be disabled after being enabled, and cannot be enabled after promises have already been created.
    * Long stack traces imply a substantial performance penalty, around 4-5x for throughput and 0.5x for latency.
    */
  /* static member */
  def longStackTraces(): Unit = js.native
  
  /**
    * Map an array, or a promise of an array,
    * which contains a promises (or a mix of promises and values) with the given `mapper` function with the signature `(item, index, arrayLength)`
    * where `item` is the resolved value of a respective promise in the input array.
    * If any promise in the input array is rejected the returned promise is rejected as well.
    *
    * If the `mapper` function returns promises or thenables, the returned promise will wait for all the mapped results to be resolved as well.
    *
    * *The original array is not modified.*
    */
  /* static member */
  def map[R, U](values: Resolvable[js.Iterable[Resolvable[R]]], mapper: IterateFunction[R, U]): Bluebird[js.Array[U]] = js.native
  def map[R, U](
    values: Resolvable[js.Iterable[Resolvable[R]]],
    mapper: IterateFunction[R, U],
    options: ConcurrencyOption
  ): Bluebird[js.Array[U]] = js.native
  
  /**
    * Given an Iterable(arrays are Iterable), or a promise of an Iterable, which produces promises (or a mix of promises and values),
    * iterate over all the values in the Iterable into an array and iterate over the array serially, in-order.
    *
    * Returns a promise for an array that contains the values returned by the iterator function in their respective positions.
    * The iterator won't be called for an item until its previous item, and the promise returned by the iterator for that item are fulfilled.
    * This results in a mapSeries kind of utility but it can also be used simply as a side effect iterator similar to Array#forEach.
    *
    * If any promise in the input array is rejected or any promise returned by the iterator function is rejected, the result will be rejected as well.
    */
  /* static member */
  def mapSeries[R, U](values: Resolvable[js.Iterable[Resolvable[R]]], iterator: IterateFunction[R, U]): Bluebird[js.Array[U]] = js.native
  
  /**
    * Returns a new function that wraps the given function `fn`.
    * The new function will always return a promise that is fulfilled with the original functions return values or rejected with thrown exceptions from the original function.
    * This method is convenient when a function can sometimes return synchronously or throw synchronously.
    */
  /* static member */
  def method[R](fn: js.Function0[Resolvable[R]]): js.Function0[Bluebird[R]] = js.native
  /* static member */
  def method[R](fn: js.Function1[/* repeated */ js.Any, Resolvable[R]]): js.Function1[/* repeated */ js.Any, Bluebird[R]] = js.native
  /* static member */
  def method[R, A1, A2](fn: js.Function2[/* arg1 */ A1, /* arg2 */ A2, Resolvable[R]]): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[R]] = js.native
  /* static member */
  def method[R, A1, A2, A3](fn: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Resolvable[R]]): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[R]] = js.native
  /* static member */
  def method[R, A1, A2, A3, A4](fn: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Resolvable[R]]): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[R]] = js.native
  /* static member */
  def method[R, A1, A2, A3, A4, A5](
    fn: js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Resolvable[R]]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[R]] = js.native
  /* static member */
  @JSName("method")
  def method_RA1[R, A1](fn: js.Function1[/* arg1 */ A1, Resolvable[R]]): js.Function1[/* arg1 */ A1, Bluebird[R]] = js.native
  
  /**
    * This is relevant to browser environments with no module loader.
    *
    * Release control of the Promise namespace to whatever it was before this library was loaded.
    * Returns a reference to the library namespace so you can attach it to something else.
    */
  def noConflict(): Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[Resolvable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any]], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ] = js.native
  
  /**
    * Add handler as the handler to call when there is a possibly unhandled rejection.
    * The default handler logs the error stack to stderr or console.error in browsers.
    *
    * Passing no value or a non-function will have the effect of removing any kind of handling for possibly unhandled rejections.
    *
    * Note: this hook is specific to the bluebird instance its called on, application developers should use global rejection events.
    */
  /* static member */
  def onPossiblyUnhandledRejection(): Unit = js.native
  /**
    * Add `handler` as the handler to call when there is a possibly unhandled rejection. The default handler logs the error stack to stderr or `console.error` in browsers.
    *
    * Passing no value or a non-function will have the effect of removing any kind of handling for possibly unhandled rejections.
    */
  /* static member */
  def onPossiblyUnhandledRejection(handler: js.Function1[/* reason */ js.Any, _]): Unit = js.native
  def onPossiblyUnhandledRejection(handler: js.Function2[/* error */ js.Error, /* promise */ Bluebird[_], Unit]): Unit = js.native
  
  /* static member */
  def promisify(nodeFunction: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Bluebird[_]] = js.native
  def promisify(nodeFunction: js.Function1[/* repeated */ js.Any, Unit], options: PromisifyOptions): js.Function1[/* repeated */ js.Any, Bluebird[_]] = js.native
  /* static member */
  def promisify[T, A1](
    func: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A1, Bluebird[T]] = js.native
  def promisify[T, A1](
    func: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function1[/* arg1 */ A1, Bluebird[T]] = js.native
  /* static member */
  def promisify[T, A1, A2](
    func: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = js.native
  def promisify[T, A1, A2](
    func: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = js.native
  /* static member */
  def promisify[T, A1, A2, A3](
    func: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = js.native
  def promisify[T, A1, A2, A3](
    func: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = js.native
  /* static member */
  def promisify[T, A1, A2, A3, A4](
    func: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = js.native
  def promisify[T, A1, A2, A3, A4](
    func: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = js.native
  /* static member */
  def promisify[T, A1, A2, A3, A4, A5](
    func: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = js.native
  def promisify[T, A1, A2, A3, A4, A5](
    func: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = js.native
  
  /**
    * Promisifies the entire object by going through the object's properties and creating an async equivalent of each function on the object and its prototype chain.
    *
    * The promisified method name will be the original method name postfixed with `Async`. Returns the input object.
    *
    * Note that the original methods on the object are not overwritten but new methods are created with the `Async`-postfix. For example,
    * if you `promisifyAll()` the node.js `fs` object use `fs.statAsync()` to call the promisified `stat` method.
    */
  // TODO how to model promisifyAll?
  /* static member */
  def promisifyAll[T /* <: js.Object */](target: T): T = js.native
  def promisifyAll[T /* <: js.Object */](target: T, options: PromisifyAllOptions[T]): T = js.native
  
  /**
    * Returns a function that will wrap the given `nodeFunction`.
    *
    * Instead of taking a callback, the returned function will return a promise whose fate is decided by the callback behavior of the given node function.
    * The node function should conform to node.js convention of accepting a callback as last argument and
    * calling that callback with error as the first argument and success value on the second argument.
    *
    * If the `nodeFunction` calls its callback with multiple success values, the fulfillment value will be an array of them.
    *
    * If you pass a `receiver`, the `nodeFunction` will be called as a method on the `receiver`.
    */
  /* static member */
  @JSName("promisify")
  def promisify_T_Function0[T](
    func: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function0[Bluebird[T]] = js.native
  @JSName("promisify")
  def promisify_T_Function0[T](
    func: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function0[Bluebird[T]] = js.native
  
  // trusted promise for object
  /* static member */
  def props[T](`object`: js.Thenable[ResolvableProps[T]]): Bluebird[T] = js.native
  // object
  /* static member */
  def props[T](`object`: ResolvableProps[T]): Bluebird[T] = js.native
  /**
    * Like ``Promise.all`` but for object properties instead of array items. Returns a promise that is fulfilled when all the properties of the object are fulfilled.
    *
    * The promise's fulfillment value is an object with fulfillment values at respective keys to the original object.
    * If any promise in the object rejects, the returned promise is rejected with the rejection reason.
    *
    * If `object` is a trusted `Promise`, then it will be treated as a promise for object rather than for its properties.
    * All other objects are treated for their properties as is returned by `Object.keys` - the object's own enumerable properties.
    *
    * *The original object is not modified.*
    */
  // map
  /* static member */
  def props[K, V](map: Resolvable[Map[K, Resolvable[V]]]): Bluebird[Map[K, V]] = js.native
  
  /**
    * Given an array, or a promise of an array, which contains promises (or a mix of promises and values) return a promise that is
    * fulfilled or rejected as soon as a promise in the array is fulfilled or rejected with the respective rejection reason or fulfillment value.
    *
    * **Note** If you pass empty array or a sparse array with no values, or a promise/thenable for such, it will be forever pending.
    */
  /* static member */
  def race[R](values: Resolvable[js.Iterable[Resolvable[R]]]): Bluebird[R] = js.native
  
  /**
    * Reduce an array, or a promise of an array,
    * which contains a promises (or a mix of promises and values) with the given `reducer` function with the signature `(total, current, index, arrayLength)`
    * where `item` is the resolved value of a respective promise in the input array.
    * If any promise in the input array is rejected the returned promise is rejected as well.
    *
    * If the reducer function returns a promise or a thenable, the result for the promise is awaited for before continuing with next iteration.
    *
    * *The original array is not modified. If no `initialValue` is given and the array doesn't contain at least 2 items,
    * the callback will not be called and `undefined` is returned.
    *
    * If `initialValue` is given and the array doesn't have at least 1 item, `initialValue` is returned.*
    */
  /* static member */
  def reduce[R, U](
    values: Resolvable[js.Iterable[Resolvable[R]]],
    reducer: js.Function4[
      /* total */ U, 
      /* current */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      Resolvable[U]
    ]
  ): Bluebird[U] = js.native
  def reduce[R, U](
    values: Resolvable[js.Iterable[Resolvable[R]]],
    reducer: js.Function4[
      /* total */ U, 
      /* current */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      Resolvable[U]
    ],
    initialValue: U
  ): Bluebird[U] = js.native
  
  /**
    * Create a promise that is rejected with the given `reason`.
    */
  /* static member */
  def reject(reason: js.Any): Bluebird[scala.Nothing] = js.native
  
  /**
    * Create a promise that is resolved with the given `value`. If `value` is a thenable or promise, the returned promise will assume its state.
    */
  /* static member */
  def resolve(): Bluebird[Unit] = js.native
  /* static member */
  def resolve[R](value: Resolvable[R]): Bluebird[R] = js.native
  
  /**
    * Changes how bluebird schedules calls a-synchronously.
    *
    * @param scheduler Should be a function that asynchronously schedules
    *                  the calling of the passed in function
    */
  def setScheduler(scheduler: js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit]): Unit = js.native
  
  /**
    * Initiate a competitive race between multiple promises or values (values will become immediately fulfilled promises).
    * When `count` amount of promises have been fulfilled, the returned promise is fulfilled with an array that contains the fulfillment values of
    * the winners in order of resolution.
    *
    * If too many promises are rejected so that the promise can never become fulfilled,
    * it will be immediately rejected with an array of rejection reasons in the order they were thrown in.
    *
    * *The original array is not modified.*
    */
  /* static member */
  def some[R](values: Resolvable[js.Iterable[Resolvable[R]]], count: Double): Bluebird[js.Array[R]] = js.native
  
  /**
    * Start the chain of promises with `Promise.try`. Any synchronous exceptions will be turned into rejections on the returned promise.
    *
    * Note about second argument: if it's specifically a true array, its values become respective arguments for the function call.
    * Otherwise it is passed as is as the first argument for the function call.
    *
    * Alias for `attempt();` for compatibility with earlier ECMAScript version.
    */
  /* static member */
  def `try`[R](fn: js.Function0[Resolvable[R]]): Bluebird[R] = js.native
  
  /**
    * In conjunction with `.disposer`, using will make sure that no matter what, the specified disposer
    *  will be called when the promise returned by the callback passed to using has settled. The disposer is
    *  necessary because there is no standard interface in node for disposing resources.
    */
  /* static member */
  def using[R, T](disposer: Disposer[R], executor: js.Function1[/* transaction */ R, js.Thenable[T]]): Bluebird[T] = js.native
  /* static member */
  def using[R1, R2, T](
    disposer: Disposer[R1],
    disposer2: Disposer[R2],
    executor: js.Function2[/* transaction1 */ R1, /* transaction2 */ R2, js.Thenable[T]]
  ): Bluebird[T] = js.native
  /* static member */
  def using[R1, R2, R3, T](
    disposer: Disposer[R1],
    disposer2: Disposer[R2],
    disposer3: Disposer[R3],
    executor: js.Function3[/* transaction1 */ R1, /* transaction2 */ R2, /* transaction3 */ R3, js.Thenable[T]]
  ): Bluebird[T] = js.native
  
  /**
    * The version number of the library
    */
  /* static member */
  var version: String = js.native
}
