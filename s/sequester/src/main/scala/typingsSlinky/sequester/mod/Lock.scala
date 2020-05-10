package typingsSlinky.sequester.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lock extends js.Object {
  var count: Double = js.native
  def dispose(): Unit = js.native
  def downgrade(): Unit = js.native
  def exclude(cb: Callback): Unit = js.native
  def share(cb: Callback): Unit = js.native
  def unlock(): Unit = js.native
}

object Lock {
  @scala.inline
  def apply(
    count: Double,
    dispose: () => Unit,
    downgrade: () => Unit,
    exclude: Callback => Unit,
    share: Callback => Unit,
    unlock: () => Unit
  ): Lock = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), downgrade = js.Any.fromFunction0(downgrade), exclude = js.Any.fromFunction1(exclude), share = js.Any.fromFunction1(share), unlock = js.Any.fromFunction0(unlock))
    __obj.asInstanceOf[Lock]
  }
  @scala.inline
  implicit class LockOps[Self <: Lock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDowngrade(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downgrade")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExclude(value: Callback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShare(value: Callback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("share")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnlock(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlock")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

