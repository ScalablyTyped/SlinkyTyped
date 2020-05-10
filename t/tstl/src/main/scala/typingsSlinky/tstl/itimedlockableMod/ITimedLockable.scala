package typingsSlinky.tstl.itimedlockableMod

import typingsSlinky.tstl.ilockableMod.ILockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimedLockable extends ILockable {
  /**
    * Try lock until timeout.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether succeded to lock or not.
    */
  def try_lock_for(ms: Double): js.Promise[Boolean] = js.native
  /**
    * Try lock until time expiration.
    *
    * @param at The maximum time point to wait.
    * @return Whether succeded to lock or not.
    */
  def try_lock_until(at: js.Date): js.Promise[Boolean] = js.native
}

object ITimedLockable {
  @scala.inline
  def apply(
    lock: () => js.Promise[Unit],
    try_lock: () => js.Promise[Boolean],
    try_lock_for: Double => js.Promise[Boolean],
    try_lock_until: js.Date => js.Promise[Boolean],
    unlock: () => js.Promise[Unit]
  ): ITimedLockable = {
    val __obj = js.Dynamic.literal(lock = js.Any.fromFunction0(lock), try_lock = js.Any.fromFunction0(try_lock), try_lock_for = js.Any.fromFunction1(try_lock_for), try_lock_until = js.Any.fromFunction1(try_lock_until), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[ITimedLockable]
  }
  @scala.inline
  implicit class ITimedLockableOps[Self <: ITimedLockable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTry_lock_for(value: Double => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("try_lock_for")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTry_lock_until(value: js.Date => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("try_lock_until")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

