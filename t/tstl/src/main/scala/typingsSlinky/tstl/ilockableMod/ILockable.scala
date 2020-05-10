package typingsSlinky.tstl.ilockableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILockable extends js.Object {
  /**
    * Lock until be unlocked.
    */
  def lock(): js.Promise[Unit] = js.native
  /**
    * Try {@link lock}.
    *
    * @return Whether succeeded to lock or not.
    */
  def try_lock(): js.Promise[Boolean] = js.native
  /**
    * Unlock.
    */
  def unlock(): js.Promise[Unit] = js.native
}

object ILockable {
  @scala.inline
  def apply(lock: () => js.Promise[Unit], try_lock: () => js.Promise[Boolean], unlock: () => js.Promise[Unit]): ILockable = {
    val __obj = js.Dynamic.literal(lock = js.Any.fromFunction0(lock), try_lock = js.Any.fromFunction0(try_lock), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[ILockable]
  }
  @scala.inline
  implicit class ILockableOps[Self <: ILockable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLock(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTry_lock(value: () => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("try_lock")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnlock(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

