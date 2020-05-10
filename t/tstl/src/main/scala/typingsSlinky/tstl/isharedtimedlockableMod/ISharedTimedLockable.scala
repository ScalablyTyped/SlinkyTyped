package typingsSlinky.tstl.isharedtimedlockableMod

import typingsSlinky.tstl.isharedlockableMod.ISharedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISharedTimedLockable extends ISharedLockable {
  /**
    * Try lock shared until timeout.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether succeded to lock or not.
    */
  def try_lock_shared_for(ms: Double): js.Promise[Boolean] = js.native
  /**
    * Try lock shared until time expiration.
    *
    * @param at The maximum time point to wait.
    * @return Whether succeded to lock or not.
    */
  def try_lock_shared_until(at: js.Date): js.Promise[Boolean] = js.native
}

object ISharedTimedLockable {
  @scala.inline
  def apply(
    lock_shared: () => js.Promise[Unit],
    try_lock_shared: () => js.Promise[Boolean],
    try_lock_shared_for: Double => js.Promise[Boolean],
    try_lock_shared_until: js.Date => js.Promise[Boolean],
    unlock_shared: () => js.Promise[Unit]
  ): ISharedTimedLockable = {
    val __obj = js.Dynamic.literal(lock_shared = js.Any.fromFunction0(lock_shared), try_lock_shared = js.Any.fromFunction0(try_lock_shared), try_lock_shared_for = js.Any.fromFunction1(try_lock_shared_for), try_lock_shared_until = js.Any.fromFunction1(try_lock_shared_until), unlock_shared = js.Any.fromFunction0(unlock_shared))
    __obj.asInstanceOf[ISharedTimedLockable]
  }
  @scala.inline
  implicit class ISharedTimedLockableOps[Self <: ISharedTimedLockable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTry_lock_shared_for(value: Double => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("try_lock_shared_for")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTry_lock_shared_until(value: js.Date => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("try_lock_shared_until")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

