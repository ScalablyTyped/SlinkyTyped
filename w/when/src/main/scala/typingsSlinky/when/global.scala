package typingsSlinky.when

import typingsSlinky.when.When.Deferred
import typingsSlinky.when.When.Descriptor
import typingsSlinky.when.When.Promise
import typingsSlinky.when.When.Thenable
import typingsSlinky.when.When._underscore.Fn0
import typingsSlinky.when.When._underscore.Fn1
import typingsSlinky.when.When._underscore.Fn2
import typingsSlinky.when.When._underscore.Fn3
import typingsSlinky.when.When._underscore.Fn4
import typingsSlinky.when.When._underscore.Fn5
import typingsSlinky.when.When._underscore.LiftedFn0
import typingsSlinky.when.When._underscore.LiftedFn1
import typingsSlinky.when.When._underscore.LiftedFn2
import typingsSlinky.when.When._underscore.LiftedFn3
import typingsSlinky.when.When._underscore.LiftedFn4
import typingsSlinky.when.When._underscore.LiftedFn5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object When {
    
    @JSGlobal("When")
    @js.native
    def apply(): Promise[Unit] = js.native
    @JSGlobal("When")
    @js.native
    def apply[T](promiseOrValue: T): Promise[T] = js.native
    @JSGlobal("When")
    @js.native
    def apply[T](promiseOrValue: Promise[T]): Promise[T] = js.native
    @JSGlobal("When")
    @js.native
    def apply[T](promiseOrValue: Thenable[T]): Promise[T] = js.native
    @JSGlobal("When")
    @js.native
    def apply[T, U](promiseOrValue: T, transform: js.Function1[/* val */ T, U]): Promise[U] = js.native
    @JSGlobal("When")
    @js.native
    def apply[T, U](promiseOrValue: Promise[T], transform: js.Function1[/* val */ T, U]): Promise[U] = js.native
    @JSGlobal("When")
    @js.native
    def apply[T, U](promiseOrValue: Thenable[T], transform: js.Function1[/* val */ T, U]): Promise[U] = js.native
    
    /**
      * Return a promise that will resolve only once all the supplied promisesOrValues
      * have resolved. The resolution value of the returned promise will be an array
      * containing the resolution values of each of the promisesOrValues.
      * @memberOf when
      *
      * @param promisesOrValues array of anything, may contain a mix
      *      of {@link Promise}s and values
      */
    @JSGlobal("When.all")
    @js.native
    def all[T](promisesOrValues: js.Array[_]): Promise[T] = js.native
    
    @JSGlobal("When.attempt")
    @js.native
    def attempt[T](f: Fn0[T]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, T](f: Fn1[A1, T], arg1: A1): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, T](f: Fn1[A1, T], arg1: Promise[A1]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, T](f: Fn2[A1, A2, T], arg1: A1, arg2: A2): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, T](f: Fn2[A1, A2, T], arg1: A1, arg2: Promise[A2]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, T](f: Fn2[A1, A2, T], arg1: Promise[A1], arg2: A2): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, T](f: Fn2[A1, A2, T], arg1: Promise[A1], arg2: Promise[A2]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, T](f: Fn3[A1, A2, A3, T], arg1: A1, arg2: A2, arg3: A3): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, T](f: Fn3[A1, A2, A3, T], arg1: A1, arg2: A2, arg3: Promise[A3]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, T](f: Fn3[A1, A2, A3, T], arg1: A1, arg2: Promise[A2], arg3: A3): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, T](f: Fn3[A1, A2, A3, T], arg1: A1, arg2: Promise[A2], arg3: Promise[A3]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, T](f: Fn3[A1, A2, A3, T], arg1: Promise[A1], arg2: A2, arg3: A3): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, T](f: Fn3[A1, A2, A3, T], arg1: Promise[A1], arg2: A2, arg3: Promise[A3]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, T](f: Fn3[A1, A2, A3, T], arg1: Promise[A1], arg2: Promise[A2], arg3: A3): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, T](f: Fn3[A1, A2, A3, T], arg1: Promise[A1], arg2: Promise[A2], arg3: Promise[A3]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: A3, arg4: A4): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: A3, arg4: Promise[A4]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: Promise[A3], arg4: A4): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: A1, arg2: A2, arg3: Promise[A3], arg4: Promise[A4]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: A1, arg2: Promise[A2], arg3: A3, arg4: A4): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: A1, arg2: Promise[A2], arg3: A3, arg4: Promise[A4]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: A1, arg2: Promise[A2], arg3: Promise[A3], arg4: A4): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: A1, arg2: Promise[A2], arg3: Promise[A3], arg4: Promise[A4]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: A2, arg3: A3, arg4: A4): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: A2, arg3: A3, arg4: Promise[A4]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: A2, arg3: Promise[A3], arg4: A4): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: A2, arg3: Promise[A3], arg4: Promise[A4]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: Promise[A2], arg3: A3, arg4: A4): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: Promise[A2], arg3: A3, arg4: Promise[A4]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T], arg1: Promise[A1], arg2: Promise[A2], arg3: Promise[A3], arg4: A4): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, T](
      f: Fn4[A1, A2, A3, A4, T],
      arg1: Promise[A1],
      arg2: Promise[A2],
      arg3: Promise[A3],
      arg4: Promise[A4]
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: Promise[A5]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: A2, arg3: A3, arg4: Promise[A4], arg5: A5): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: A2, arg3: A3, arg4: Promise[A4], arg5: Promise[A5]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: A2, arg3: Promise[A3], arg4: A4, arg5: A5): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: A2, arg3: Promise[A3], arg4: A4, arg5: Promise[A5]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: A2, arg3: Promise[A3], arg4: Promise[A4], arg5: A5): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: A1,
      arg2: A2,
      arg3: Promise[A3],
      arg4: Promise[A4],
      arg5: Promise[A5]
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: Promise[A2], arg3: A3, arg4: A4, arg5: A5): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: Promise[A2], arg3: A3, arg4: A4, arg5: Promise[A5]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: Promise[A2], arg3: A3, arg4: Promise[A4], arg5: A5): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: A1,
      arg2: Promise[A2],
      arg3: A3,
      arg4: Promise[A4],
      arg5: Promise[A5]
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: A1, arg2: Promise[A2], arg3: Promise[A3], arg4: A4, arg5: A5): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: A1,
      arg2: Promise[A2],
      arg3: Promise[A3],
      arg4: A4,
      arg5: Promise[A5]
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: A1,
      arg2: Promise[A2],
      arg3: Promise[A3],
      arg4: Promise[A4],
      arg5: A5
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: A1,
      arg2: Promise[A2],
      arg3: Promise[A3],
      arg4: Promise[A4],
      arg5: Promise[A5]
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: Promise[A1], arg2: A2, arg3: A3, arg4: A4, arg5: A5): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: Promise[A1], arg2: A2, arg3: A3, arg4: A4, arg5: Promise[A5]): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: Promise[A1], arg2: A2, arg3: A3, arg4: Promise[A4], arg5: A5): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: Promise[A1],
      arg2: A2,
      arg3: A3,
      arg4: Promise[A4],
      arg5: Promise[A5]
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: Promise[A1], arg2: A2, arg3: Promise[A3], arg4: A4, arg5: A5): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: Promise[A1],
      arg2: A2,
      arg3: Promise[A3],
      arg4: A4,
      arg5: Promise[A5]
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: Promise[A1],
      arg2: A2,
      arg3: Promise[A3],
      arg4: Promise[A4],
      arg5: A5
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: Promise[A1],
      arg2: A2,
      arg3: Promise[A3],
      arg4: Promise[A4],
      arg5: Promise[A5]
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T], arg1: Promise[A1], arg2: Promise[A2], arg3: A3, arg4: A4, arg5: A5): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: Promise[A1],
      arg2: Promise[A2],
      arg3: A3,
      arg4: A4,
      arg5: Promise[A5]
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: Promise[A1],
      arg2: Promise[A2],
      arg3: A3,
      arg4: Promise[A4],
      arg5: A5
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: Promise[A1],
      arg2: Promise[A2],
      arg3: A3,
      arg4: Promise[A4],
      arg5: Promise[A5]
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: Promise[A1],
      arg2: Promise[A2],
      arg3: Promise[A3],
      arg4: A4,
      arg5: A5
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: Promise[A1],
      arg2: Promise[A2],
      arg3: Promise[A3],
      arg4: A4,
      arg5: Promise[A5]
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: Promise[A1],
      arg2: Promise[A2],
      arg3: Promise[A3],
      arg4: Promise[A4],
      arg5: A5
    ): Promise[T] = js.native
    @JSGlobal("When.attempt")
    @js.native
    def attempt[A1, A2, A3, A4, A5, T](
      f: Fn5[A1, A2, A3, A4, A5, T],
      arg1: Promise[A1],
      arg2: Promise[A2],
      arg3: Promise[A3],
      arg4: Promise[A4],
      arg5: Promise[A5]
    ): Promise[T] = js.native
    
    /**
      * Creates a {promise, resolver} pair, either or both of which
      * may be given out safely to consumers.
      * The resolver has resolve, reject, and progress.  The promise
      * has then plus extended promise API.
      */
    @JSGlobal("When.defer")
    @js.native
    def defer[T](): Deferred[T] = js.native
    
    /**
      * Generates a potentially infinite stream of promises by repeatedly calling f until predicate becomes true.
      * @memberOf when
      * @param f function that, given a seed, returns the next value or a promise for it.
      * @param predicate function that receives the current iteration value, and should return truthy when the iterating should stop
      * @param handler function that receives each value as it is produced by f. It may return a promise to delay the next iteration.
      * @param seed initial value provided to the handler, and first f invocation. May be a promise.
      */
    @JSGlobal("When.iterate")
    @js.native
    def iterate[U](
      f: js.Function1[/* seed */ U, U | Promise[U]],
      predicate: js.Function1[/* value */ U, Boolean],
      handler: js.Function1[/* value */ U, Promise[_] | Unit],
      seed: U
    ): Promise[U] = js.native
    @JSGlobal("When.iterate")
    @js.native
    def iterate[U](
      f: js.Function1[/* seed */ U, U | Promise[U]],
      predicate: js.Function1[/* value */ U, Boolean],
      handler: js.Function1[/* value */ U, Promise[_] | Unit],
      seed: Promise[U]
    ): Promise[U] = js.native
    
    /**
      * Joins multiple promises into a single returned promise.
      * @return a promise that will fulfill when *all* the input promises
      * have fulfilled, or will reject when *any one* of the input promises rejects.
      */
    @JSGlobal("When.join")
    @js.native
    def join[T](promises: (js.Any | Promise[T])*): Promise[js.Array[T]] = js.native
    
    @JSGlobal("When.lift")
    @js.native
    def lift[T](f: Fn0[T]): LiftedFn0[T] = js.native
    @JSGlobal("When.lift")
    @js.native
    def lift[A1, T](f: Fn1[A1, T]): LiftedFn1[A1, T] = js.native
    @JSGlobal("When.lift")
    @js.native
    def lift[A1, A2, T](f: Fn2[A1, A2, T]): LiftedFn2[A1, A2, T] = js.native
    @JSGlobal("When.lift")
    @js.native
    def lift[A1, A2, A3, T](f: Fn3[A1, A2, A3, T]): LiftedFn3[A1, A2, A3, T] = js.native
    @JSGlobal("When.lift")
    @js.native
    def lift[A1, A2, A3, A4, T](f: Fn4[A1, A2, A3, A4, T]): LiftedFn4[A1, A2, A3, A4, T] = js.native
    @JSGlobal("When.lift")
    @js.native
    def lift[A1, A2, A3, A4, A5, T](f: Fn5[A1, A2, A3, A4, A5, T]): LiftedFn5[A1, A2, A3, A4, A5, T] = js.native
    
    /**
      * Promise-aware array map function, similar to `Array.prototype.map()`,
      * but input array may contain promises or values.
      * @param promisesOrValues array of anything, may contain a mix of {@link Promise}s and values
      * @param mapFunc map function which may return a promise or value
      * @returns a promise that will fulfill with an array of mapped values
      *  or reject if any input promise rejects.
      */
    @JSGlobal("When.map")
    @js.native
    def map[T](promisesOrValues: js.Array[_], mapFunc: js.Function2[/* value */ js.Any, /* index */ Double, _]): Promise[T] = js.native
    
    @JSGlobal("When.promise")
    @js.native
    def promise[T](
      resolver: js.Function2[
          /* resolve */ js.Function1[/* value */ T, Unit], 
          /* reject */ js.Function1[/* reason */ js.Any, Unit], 
          Unit
        ]
    ): Promise[T] = js.native
    
    /**
      * Traditional reduce function, similar to `Array.prototype.reduce()`, but
      * input may contain promises and/or values, and reduceFunc
      * may return either a value or a promise, *and* initialValue may
      * be a promise for the starting value.
      * @param promisesOrValues array or promise for an array of anything,
      *      may contain a mix of promises and values.
      * @param reduceFunc function(accumulated:*, x:*, index:number):*} f reduce function
      * @returns a promise that will resolve to the final reduced value
      */
    @JSGlobal("When.reduce")
    @js.native
    def reduce[T](
      promisesOrValues: js.Array[_],
      reduceFunc: js.Function3[/* reduction */ T, /* value */ js.Any, /* index */ Double, T | Promise[T]],
      initialValue: T
    ): Promise[T] = js.native
    
    /**
      * Traditional reduce function, similar to `Array.prototype.reduceRight()`, but
      * input may contain promises and/or values, and reduceFunc
      * may return either a value or a promise, *and* initialValue may
      * be a promise for the starting value.
      * @param promisesOrValues array or promise for an array of anything,
      *      may contain a mix of promises and values.
      * @param reduceFunc function(accumulated:*, x:*, index:number):*} f reduce function
      * @returns a promise that will resolve to the final reduced value
      */
    @JSGlobal("When.reduceRight")
    @js.native
    def reduceRight[T](
      promisesOrValues: js.Array[_],
      reduceFunc: js.Function3[/* reduction */ T, /* value */ js.Any, /* index */ Double, T | Promise[T]],
      initialValue: T
    ): Promise[T] = js.native
    
    @JSGlobal("When.reject")
    @js.native
    def reject[T](reason: js.Any): Promise[T] = js.native
    
    /**
      * Returns a resolved promise. The returned promise will be
      *  - fulfilled with promiseOrValue if it is a value, or
      *  - if promiseOrValue is a promise
      *    - fulfilled with promiseOrValue's value after it is fulfilled
      *    - rejected with promiseOrValue's reason after it is rejected
      */
    @JSGlobal("When.resolve")
    @js.native
    def resolve(): Promise[Unit] = js.native
    @JSGlobal("When.resolve")
    @js.native
    def resolve[T](promiseOrValue: T): Promise[T] = js.native
    @JSGlobal("When.resolve")
    @js.native
    def resolve[T](promiseOrValue: Promise[T]): Promise[T] = js.native
    @JSGlobal("When.resolve")
    @js.native
    def resolve[T](promiseOrValue: Thenable[T]): Promise[T] = js.native
    
    /**
      * Returns a promise for an array containing the same number of elements as the input array.
      * Each element is a descriptor object describing of the outcome of the corresponding element in the input.
      * The returned promise will only reject if array itself is a rejected promise. Otherwise,
      * it will always fulfill with an array of descriptors. This is in contrast to when.all,
      * which will reject if any element of array rejects.
      * @memberOf when
      *
      * @param promisesOrValues array of anything, may contain a mix
      *      of {@link Promise}s and values
      */
    @JSGlobal("When.settle")
    @js.native
    def settle[T](promisesOrValues: js.Array[_]): Promise[js.Array[Descriptor[T]]] = js.native
    
    /**
      * Similar to when/iterate, when.unfold generates a potentially infinite stream of promises by repeatedly calling
      * unspool until predicate becomes true. when.unfold allows you to thread additional state information through the iteration.
      * @memberOf when
      * @param unspool function that, given a seed, returns a [valueToSendToHandler, newSeed] pair.
      * May return an array, array of promises, promise for an array, or promise for an array of promises.
      * @param predicate function that receives the current seed, and should return truthy when the unfold should stop
      * @param handler function that receives the valueToSendToHandler of the current iteration.
      * This function can process valueToSendToHandler in whatever way you need.
      * It may return a promise to delay the next iteration of the unfold.
      * @param seed initial value provided to the first unspool invocation. May be a promise.
      */
    @JSGlobal("When.unfold")
    @js.native
    def unfold[T, U](
      unspool: js.Function1[
          /* seed */ U, 
          (js.Tuple2[T | Promise[T], U | Promise[U]]) | (Promise[js.Tuple2[T | Promise[T], U | Promise[U]]])
        ],
      predicate: js.Function1[/* value */ U, Boolean | Promise[Boolean]],
      handler: js.Function1[/* value */ T, Promise[_] | Unit],
      seed: U
    ): Promise[Unit] = js.native
    @JSGlobal("When.unfold")
    @js.native
    def unfold[T, U](
      unspool: js.Function1[
          /* seed */ U, 
          (js.Tuple2[T | Promise[T], U | Promise[U]]) | (Promise[js.Tuple2[T | Promise[T], U | Promise[U]]])
        ],
      predicate: js.Function1[/* value */ U, Boolean | Promise[Boolean]],
      handler: js.Function1[/* value */ T, Promise[_] | Unit],
      seed: Promise[U]
    ): Promise[Unit] = js.native
    
    // Helper interfaces
    object _underscore
  }
}
