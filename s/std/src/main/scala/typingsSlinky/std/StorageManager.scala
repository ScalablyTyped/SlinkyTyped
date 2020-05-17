package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageManager extends js.Object {
  def estimate(): js.Promise[StorageEstimate] = js.native
  def persist(): js.Promise[scala.Boolean] = js.native
  def persisted(): js.Promise[scala.Boolean] = js.native
}

object StorageManager {
  @scala.inline
  def apply(
    estimate: () => js.Promise[StorageEstimate],
    persist: () => js.Promise[scala.Boolean],
    persisted: () => js.Promise[scala.Boolean]
  ): StorageManager = {
    val __obj = js.Dynamic.literal(estimate = js.Any.fromFunction0(estimate), persist = js.Any.fromFunction0(persist), persisted = js.Any.fromFunction0(persisted))
    __obj.asInstanceOf[StorageManager]
  }
  @scala.inline
  implicit class StorageManagerOps[Self <: StorageManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEstimate(value: () => js.Promise[StorageEstimate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("estimate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPersist(value: () => js.Promise[scala.Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persist")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPersisted(value: () => js.Promise[scala.Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persisted")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

