package typingsSlinky.tstl

import typingsSlinky.tstl.anon.PickILockablelock
import typingsSlinky.tstl.anon.PickILockablelockunlock
import typingsSlinky.tstl.anon.PickILockabletrylock
import typingsSlinky.tstl.anon.PickILockabletrylockunloc
import typingsSlinky.tstl.anon.PickISharedLockablelocksh
import typingsSlinky.tstl.anon.PickISharedLockabletryloc
import typingsSlinky.tstl.anon.PickISharedTimedLockablet
import typingsSlinky.tstl.anon.PickISharedTimedLockabletTrylockshareduntil
import typingsSlinky.tstl.anon.PickITimedLockabletrylock
import typingsSlinky.tstl.anon.PickITimedLockabletrylockTrylockuntil
import typingsSlinky.tstl.anon.PickSemaphorenumberacquir
import typingsSlinky.tstl.itimedlockableMod.ITimedLockable
import typingsSlinky.tstl.sharedLockMod.SharedLock.Closure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/thread", JSImport.Namespace)
@js.native
object tstlThreadMod extends js.Object {
  
  def lock(items: PickILockablelock*): js.Promise[Unit] = js.native
  
  @JSName("sleep_for")
  def sleepFor(ms: Double): js.Promise[Unit] = js.native
  
  @JSName("sleep_until")
  def sleepUntil(at: js.Date): js.Promise[Unit] = js.native
  
  @JSName("try_lock")
  def tryLock(items: PickILockabletrylock*): js.Promise[Double] = js.native
  
  @js.native
  class Barrier protected ()
    extends typingsSlinky.tstl.barrierMod.Barrier {
    /**
      * Initializer Constructor
      *
      * @param size Size of the downward counter.
      */
    def this(size: Double) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class ConditionVariable ()
    extends typingsSlinky.tstl.conditionVariableMod.ConditionVariable
  
  @js.native
  class Latch protected ()
    extends typingsSlinky.tstl.latchMod.Latch {
    /**
      * Initializer Constructor.
      *
      * @param size Size of the downward counter.
      */
    def this(size: Double) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class Mutex ()
    extends typingsSlinky.tstl.mutexMod.Mutex
  
  @js.native
  class Semaphore[Max /* <: Double */] protected ()
    extends typingsSlinky.tstl.semaphoreMod.Semaphore[Max] {
    /**
      * Initializer Constructor.
      *
      * @param max Number of maximum sections acquirable.
      */
    def this(max: Max) = this()
  }
  @js.native
  object Semaphore extends js.Object {
    
    /**
      * Capsules a {@link Semaphore} to be suitable for the {@link UniqueLock}.
      *
      * @param semaphore Target semaphore to capsule.
      * @return Lockable instance suitable for the {@link UniqueLock}
      */
    @JSName("get_lockable")
    def getLockable[SemaphoreT /* <: PickSemaphorenumberacquir */](semaphore: SemaphoreT): ITimedLockable = js.native
  }
  
  @js.native
  class SharedLock ()
    extends typingsSlinky.tstl.sharedLockMod.SharedLock
  @js.native
  object SharedLock extends js.Object {
    
    def lock[Mutex /* <: PickISharedLockablelocksh */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    
    @JSName("try_lock")
    def tryLock[Mutex /* <: PickISharedLockabletryloc */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    
    @JSName("try_lock_for")
    def tryLockFor[Mutex /* <: PickISharedTimedLockablet */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    
    @JSName("try_lock_until")
    def tryLockUntil[Mutex /* <: PickISharedTimedLockabletTrylockshareduntil */](mutex: Mutex, at: js.Date, closure: Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class SharedMutex ()
    extends typingsSlinky.tstl.sharedMutexMod.SharedMutex
  
  @js.native
  /**
    * Default Constructor.
    */
  class SharedTimedMutex ()
    extends typingsSlinky.tstl.sharedTimedMutexMod.SharedTimedMutex
  
  @js.native
  class Singleton[T] protected ()
    extends typingsSlinky.tstl.singletonMod.Singleton[T] {
    /**
      * Initializer Constructor.
      *
      * Create a new `Singleton` instance with the *lazy consturctor*.
      *
      * @param lazyConstructor Lazy constructor function returning the promised value.
      */
    def this(lazyConstructor: js.Function0[js.Promise[T]]) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class TimedMutex ()
    extends typingsSlinky.tstl.timedMutexMod.TimedMutex
  
  @js.native
  class UniqueLock ()
    extends typingsSlinky.tstl.uniqueLockMod.UniqueLock
  @js.native
  object UniqueLock extends js.Object {
    
    def lock[Mutex /* <: PickILockablelockunlock */](mutex: Mutex, closure: typingsSlinky.tstl.uniqueLockMod.UniqueLock.Closure): js.Promise[Unit] = js.native
    
    @JSName("try_lock")
    def tryLock[Mutex /* <: PickILockabletrylockunloc */](mutex: Mutex, closure: typingsSlinky.tstl.uniqueLockMod.UniqueLock.Closure): js.Promise[Boolean] = js.native
    
    @JSName("try_lock_for")
    def tryLockFor[Mutex /* <: PickITimedLockabletrylock */](mutex: Mutex, ms: Double, closure: typingsSlinky.tstl.uniqueLockMod.UniqueLock.Closure): js.Promise[Boolean] = js.native
    
    @JSName("try_lock_until")
    def tryLockUntil[Mutex /* <: PickITimedLockabletrylockTrylockuntil */](mutex: Mutex, at: js.Date, closure: typingsSlinky.tstl.uniqueLockMod.UniqueLock.Closure): js.Promise[Boolean] = js.native
  }
}
