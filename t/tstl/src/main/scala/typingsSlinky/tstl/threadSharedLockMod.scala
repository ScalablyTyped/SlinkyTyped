package typingsSlinky.tstl

import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.tstl.baseThreadUnderscoreISharedLockableMod._ISharedLockable
import typingsSlinky.tstl.baseThreadUnderscoreISharedTimedLockableMod._ISharedTimedLockable
import typingsSlinky.tstl.threadSharedLockMod.Closure
import typingsSlinky.tstl.threadSharedLockMod.IMutex
import typingsSlinky.tstl.threadSharedLockMod.SharedLock
import typingsSlinky.tstl.tstlStrings.lock_shared
import typingsSlinky.tstl.tstlStrings.try_lock_shared
import typingsSlinky.tstl.tstlStrings.try_lock_shared_for
import typingsSlinky.tstl.tstlStrings.try_lock_shared_until
import typingsSlinky.tstl.tstlStrings.unlock_shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/SharedLock", JSImport.Namespace)
@js.native
object threadSharedLockMod extends js.Object {
  @js.native
  class SharedLock[Mutex /* <: IMutex */] protected () extends js.Object {
    def this(mutex: Mutex) = this()
    /**
      * @hidden
      */
    var mutex_ : js.Any = js.native
    var try_lock_for: js.UndefOr[js.Function2[/* ms */ Double, /* closure */ Closure, js.Promise[Boolean]]] = js.native
    var try_lock_until: js.UndefOr[js.Function2[/* at */ js.Date, /* closure */ Closure, js.Promise[Boolean]]] = js.native
    def lock(closure: Closure): js.Promise[Unit] = js.native
    def try_lock(closure: Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  class shared_lock[Mutex /* <: IMutex */] protected () extends SharedLock[Mutex] {
    def this(mutex: Mutex) = this()
  }
  
  @js.native
  object SharedLock extends js.Object {
    def lock[Mutex /* <: Pick[_ISharedLockable, lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    def try_lock[Mutex /* <: Pick[_ISharedLockable, try_lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_for[Mutex /* <: Pick[_ISharedTimedLockable, try_lock_shared_for | unlock_shared] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_until[Mutex /* <: Pick[_ISharedTimedLockable, try_lock_shared_until | unlock_shared] */](mutex: Mutex, at: js.Date, closure: Closure): js.Promise[Boolean] = js.native
  }
  
  @js.native
  object shared_lock extends js.Object {
    def lock[Mutex /* <: Pick[_ISharedLockable, lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    def try_lock[Mutex /* <: Pick[_ISharedLockable, try_lock_shared | unlock_shared] */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_for[Mutex /* <: Pick[_ISharedTimedLockable, try_lock_shared_for | unlock_shared] */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    def try_lock_until[Mutex /* <: Pick[_ISharedTimedLockable, try_lock_shared_until | unlock_shared] */](mutex: Mutex, at: js.Date, closure: Closure): js.Promise[Boolean] = js.native
  }
  
  /**
    * @hidden
    */
  type Closure = js.Function0[Unit | js.Promise[Unit]]
  /**
    * @hidden
    */
  type IMutex = _ISharedLockable with Partial[_ISharedTimedLockable]
}

