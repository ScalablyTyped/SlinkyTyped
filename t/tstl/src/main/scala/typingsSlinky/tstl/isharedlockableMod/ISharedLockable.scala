package typingsSlinky.tstl.isharedlockableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISharedLockable extends js.Object {
  /**
    * Lock shared until be unlock shared.
    */
  def lock_shared(): js.Promise[Unit] = js.native
  /**
    * Try lock shared.
    */
  def try_lock_shared(): js.Promise[Boolean] = js.native
  /**
    * Unlock shared.
    */
  def unlock_shared(): js.Promise[Unit] = js.native
}

object ISharedLockable {
  @scala.inline
  def apply(
    lock_shared: () => js.Promise[Unit],
    try_lock_shared: () => js.Promise[Boolean],
    unlock_shared: () => js.Promise[Unit]
  ): ISharedLockable = {
    val __obj = js.Dynamic.literal(lock_shared = js.Any.fromFunction0(lock_shared), try_lock_shared = js.Any.fromFunction0(try_lock_shared), unlock_shared = js.Any.fromFunction0(unlock_shared))
    __obj.asInstanceOf[ISharedLockable]
  }
  @scala.inline
  implicit class ISharedLockableOps[Self <: ISharedLockable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLock_shared(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock_shared")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTry_lock_shared(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("try_lock_shared")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnlock_shared(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock_shared")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

