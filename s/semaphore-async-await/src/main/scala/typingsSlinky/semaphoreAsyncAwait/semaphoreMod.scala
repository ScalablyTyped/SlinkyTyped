package typingsSlinky.semaphoreAsyncAwait

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semaphoreMod {
  
  @JSImport("semaphore-async-await/dist/Semaphore", JSImport.Default)
  @js.native
  class default protected () extends Semaphore {
    /**
      * Creates a semaphore.
      * @param permits  The number of permits, i.e. things being allowed to run in parallel.
      * To create a lock that only lets one thing run at a time, set this to 1.
      * This number can also be negative.
      */
    def this(permits: Double) = this()
  }
  
  @js.native
  trait Semaphore extends StObject {
    
    /**
      * Alias for {@linkcode Semaphore.wait}.
      * @returns  A promise that gets resolved when execution is allowed to proceed.
      */
    def acquire(): js.Promise[Boolean] = js.native
    
    /**
      * Acquires all permits that are currently available and returns the number of acquired permits.
      * @returns  Number of acquired permits.
      */
    def drainPermits(): Double = js.native
    
    /**
      * Schedules func to be called once a permit becomes available.
      * Returns a promise that resolves to the return value of func.
      * @typeparam T  The return type of func.
      * @param func  The function to be executed.
      * @return  A promise that gets resolved with the return value of the function.
      */
    def execute[T](func: js.Function0[T | js.Thenable[T]]): js.Promise[T] = js.native
    
    /**
      * Returns the number of available permits.
      * @returns  The number of available permits.
      */
    def getPermits(): Double = js.native
    
    var permits: js.Any = js.native
    
    var promiseResolverQueue: js.Any = js.native
    
    /**
      * Alias for {@linkcode Semaphore.signal}.
      */
    def release(): Unit = js.native
    
    /**
      * Increases the number of permits by one. If there are other functions waiting, one of them will
      * continue to execute in a future iteration of the event loop.
      */
    def signal(): Unit = js.native
    
    /**
      * Synchronous function that tries to acquire a permit and returns true if successful, false otherwise.
      * @returns  Whether a permit could be acquired.
      */
    def tryAcquire(): Boolean = js.native
    
    /**
      * Same as {@linkcode Semaphore.wait} except the promise returned gets resolved with false if no
      * permit becomes available in time.
      * @param milliseconds  The time spent waiting before the wait is aborted. This is a lower bound,
      * don't rely on it being precise.
      * @returns  A promise that gets resolved with true when execution is allowed to proceed or
      * false if the time given elapses before a permit becomes available.
      */
    def waitFor(milliseconds: Double): js.Promise[Boolean] = js.native
  }
  object Semaphore {
    
    @scala.inline
    def apply(
      acquire: () => js.Promise[Boolean],
      drainPermits: () => Double,
      execute: js.Function0[js.Any | js.Thenable[js.Any]] => js.Promise[js.Any],
      getPermits: () => Double,
      permits: js.Any,
      promiseResolverQueue: js.Any,
      release: () => Unit,
      signal: () => Unit,
      tryAcquire: () => Boolean,
      waitFor: Double => js.Promise[Boolean]
    ): Semaphore = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), drainPermits = js.Any.fromFunction0(drainPermits), execute = js.Any.fromFunction1(execute), getPermits = js.Any.fromFunction0(getPermits), permits = permits.asInstanceOf[js.Any], promiseResolverQueue = promiseResolverQueue.asInstanceOf[js.Any], release = js.Any.fromFunction0(release), signal = js.Any.fromFunction0(signal), tryAcquire = js.Any.fromFunction0(tryAcquire), waitFor = js.Any.fromFunction1(waitFor))
      __obj.asInstanceOf[Semaphore]
    }
    
    @scala.inline
    implicit class SemaphoreMutableBuilder[Self <: Semaphore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcquire(value: () => js.Promise[Boolean]): Self = StObject.set(x, "acquire", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDrainPermits(value: () => Double): Self = StObject.set(x, "drainPermits", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExecute(value: js.Function0[js.Any | js.Thenable[js.Any]] => js.Promise[js.Any]): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPermits(value: () => Double): Self = StObject.set(x, "getPermits", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPermits(value: js.Any): Self = StObject.set(x, "permits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseResolverQueue(value: js.Any): Self = StObject.set(x, "promiseResolverQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSignal(value: () => Unit): Self = StObject.set(x, "signal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTryAcquire(value: () => Boolean): Self = StObject.set(x, "tryAcquire", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWaitFor(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "waitFor", js.Any.fromFunction1(value))
    }
  }
}
