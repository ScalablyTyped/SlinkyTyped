package typingsSlinky.tstl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Pick
import typingsSlinky.tstl.baseThreadUnderscoreISharedLockableMod._ISharedLockable
import typingsSlinky.tstl.baseThreadUnderscoreISharedTimedLockableMod._ISharedTimedLockable
import typingsSlinky.tstl.baseThreadUnderscoreITimedLockableMod._ITimedLockable
import typingsSlinky.tstl.threadILockableMod.ILockable
import typingsSlinky.tstl.threadSharedLockMod.Closure
import typingsSlinky.tstl.threadSharedLockMod.IMutex
import typingsSlinky.tstl.tstlStrings.lock
import typingsSlinky.tstl.tstlStrings.lock_shared
import typingsSlinky.tstl.tstlStrings.try_lock
import typingsSlinky.tstl.tstlStrings.try_lock_shared
import typingsSlinky.tstl.tstlStrings.try_lock_shared_for
import typingsSlinky.tstl.tstlStrings.try_lock_shared_until
import typingsSlinky.tstl.tstlStrings.unlock
import typingsSlinky.tstl.tstlStrings.unlock_shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread", JSImport.Namespace)
@js.native
object threadMod extends js.Object {
  @js.native
  class Barrier protected ()
    extends typingsSlinky.tstl.threadBarrierMod.Barrier {
    def this(size: Double) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class ConditionVariable ()
    extends typingsSlinky.tstl.threadConditionVariableMod.ConditionVariable
  
  @js.native
  class FlexBarrier protected ()
    extends typingsSlinky.tstl.threadFlexBarrierMod.FlexBarrier {
    /**
      * Initializer Constructor.
      *
      * @param size Size of the downward counter.
      * @param complete Complete function re-configuring *size* when downward count be zero. Default is a function always returning -1, which means the barrier is not reusable more.
      */
    def this(size: Double) = this()
    def this(size: Double, complete: js.Function0[Double]) = this()
  }
  
  @js.native
  class Latch protected ()
    extends typingsSlinky.tstl.threadLatchMod.Latch {
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
    extends typingsSlinky.tstl.threadMutexMod.Mutex
  
  @js.native
  class Semaphore[Max /* <: Double */] protected ()
    extends typingsSlinky.tstl.threadSemaphoreMod.Semaphore[Max] {
    /**
      * Initializer Constructor.
      *
      * @param max Number of maximum sections lockable.
      */
    def this(max: Max) = this()
  }
  
  @js.native
  class SharedLock[Mutex /* <: IMutex */] protected ()
    extends typingsSlinky.tstl.threadSharedLockMod.SharedLock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class SharedMutex ()
    extends typingsSlinky.tstl.threadSharedMutexMod.SharedMutex
  
  @js.native
  /**
    * Default Constructor.
    */
  class SharedTimedMutex ()
    extends typingsSlinky.tstl.threadSharedTimedMutexMod.SharedTimedMutex
  
  @js.native
  /**
    * Default Constructor.
    */
  class TimedMutex ()
    extends typingsSlinky.tstl.threadTimedMutexMod.TimedMutex
  
  @js.native
  class UniqueLock[Mutex /* <: typingsSlinky.tstl.threadUniqueLockMod.IMutex */] protected ()
    extends typingsSlinky.tstl.threadUniqueLockMod.UniqueLock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  @js.native
  class couting_semaphore[Max /* <: Double */] protected ()
    extends typingsSlinky.tstl.threadSemaphoreMod.couting_semaphore[Max] {
    /**
      * Initializer Constructor.
      *
      * @param max Number of maximum sections lockable.
      */
    def this(max: Max) = this()
  }
  
  @js.native
  class shared_lock[Mutex /* <: IMutex */] protected ()
    extends typingsSlinky.tstl.threadSharedLockMod.shared_lock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  @js.native
  class unique_lock[Mutex /* <: typingsSlinky.tstl.threadUniqueLockMod.IMutex */] protected ()
    extends typingsSlinky.tstl.threadUniqueLockMod.unique_lock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  val barrier: Instantiable1[/* size */ Double, typingsSlinky.tstl.threadBarrierMod.Barrier] = js.native
  val condition_variable: Instantiable0[typingsSlinky.tstl.threadConditionVariableMod.ConditionVariable] = js.native
  val flex_barrier: Instantiable2[
    /* size */ Double, 
    js.UndefOr[/* complete */ js.Function0[Double]], 
    typingsSlinky.tstl.threadFlexBarrierMod.FlexBarrier
  ] = js.native
  val latch: Instantiable1[/* size */ Double, typingsSlinky.tstl.threadLatchMod.Latch] = js.native
  val mutex: Instantiable0[typingsSlinky.tstl.threadMutexMod.Mutex] = js.native
  val shared_mutex: Instantiable0[typingsSlinky.tstl.threadSharedMutexMod.SharedMutex] = js.native
  val shared_timed_mutex: Instantiable0[typingsSlinky.tstl.threadSharedTimedMutexMod.SharedTimedMutex] = js.native
  val timed_mutex: Instantiable0[typingsSlinky.tstl.threadTimedMutexMod.TimedMutex] = js.native
  @JSName("lock")
  def lock_lock(items: (Pick[ILockable, lock])*): js.Promise[Unit] = js.native
  def sleep_for(ms: Double): js.Promise[Unit] = js.native
  def sleep_until(at: js.Date): js.Promise[Unit] = js.native
  @JSName("try_lock")
  def try_lock_trylock(items: (Pick[ILockable, try_lock])*): js.Promise[Double] = js.native
  @js.native
  object SharedLock extends js.Object {
    def lock[Mutex /* <: Pick[_ISharedLockable, lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    def try_lock[Mutex /* <: Pick[_ISharedLockable, try_lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_for[Mutex /* <: Pick[_ISharedTimedLockable, try_lock_shared_for | unlock_shared] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_until[Mutex /* <: Pick[_ISharedTimedLockable, try_lock_shared_until | unlock_shared] */](mutex: Mutex, at: js.Date, closure: Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  object UniqueLock extends js.Object {
    def lock[Mutex /* <: Pick[ILockable, typingsSlinky.tstl.tstlStrings.lock | unlock] */](mutex: Mutex, closure: typingsSlinky.tstl.threadUniqueLockMod.Closure): js.Promise[Unit] = js.native
    def try_lock[Mutex /* <: Pick[ILockable, typingsSlinky.tstl.tstlStrings.try_lock | unlock] */](mutex: Mutex, closure: typingsSlinky.tstl.threadUniqueLockMod.Closure): js.Promise[Boolean] = js.native
    def try_lock_for[Mutex /* <: Pick[_ITimedLockable, typingsSlinky.tstl.tstlStrings.try_lock_for | unlock] */](mutex: Mutex, ms: Double, closure: typingsSlinky.tstl.threadUniqueLockMod.Closure): js.Promise[Boolean] = js.native
    def try_lock_until[Mutex /* <: Pick[_ITimedLockable, typingsSlinky.tstl.tstlStrings.try_lock_until | unlock] */](mutex: Mutex, at: js.Date, closure: typingsSlinky.tstl.threadUniqueLockMod.Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  object shared_lock extends js.Object {
    def lock[Mutex /* <: Pick[_ISharedLockable, lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    def try_lock[Mutex /* <: Pick[_ISharedLockable, try_lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_for[Mutex /* <: Pick[_ISharedTimedLockable, try_lock_shared_for | unlock_shared] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_until[Mutex /* <: Pick[_ISharedTimedLockable, try_lock_shared_until | unlock_shared] */](mutex: Mutex, at: js.Date, closure: Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  object unique_lock extends js.Object {
    def lock[Mutex /* <: Pick[ILockable, typingsSlinky.tstl.tstlStrings.lock | unlock] */](mutex: Mutex, closure: typingsSlinky.tstl.threadUniqueLockMod.Closure): js.Promise[Unit] = js.native
    def try_lock[Mutex /* <: Pick[ILockable, typingsSlinky.tstl.tstlStrings.try_lock | unlock] */](mutex: Mutex, closure: typingsSlinky.tstl.threadUniqueLockMod.Closure): js.Promise[Boolean] = js.native
    def try_lock_for[Mutex /* <: Pick[_ITimedLockable, typingsSlinky.tstl.tstlStrings.try_lock_for | unlock] */](mutex: Mutex, ms: Double, closure: typingsSlinky.tstl.threadUniqueLockMod.Closure): js.Promise[Boolean] = js.native
    def try_lock_until[Mutex /* <: Pick[_ITimedLockable, typingsSlinky.tstl.tstlStrings.try_lock_until | unlock] */](mutex: Mutex, at: js.Date, closure: typingsSlinky.tstl.threadUniqueLockMod.Closure): js.Promise[Boolean] = js.native
  }
  
}

