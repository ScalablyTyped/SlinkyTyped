package typingsSlinky.useSidecar.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SideMedium[T] extends js.Object {
  var options: js.UndefOr[js.Object] = js.native
  def assignMedium(handler: MediumCallback[T]): Unit = js.native
  def assignSyncMedium(handler: MediumCallback[T]): Unit = js.native
  def read(): js.UndefOr[T] = js.native
  def useMedium(effect: T): removeCb = js.native
}

object SideMedium {
  @scala.inline
  def apply[T](
    assignMedium: MediumCallback[T] => Unit,
    assignSyncMedium: MediumCallback[T] => Unit,
    read: () => js.UndefOr[T],
    useMedium: T => removeCb
  ): SideMedium[T] = {
    val __obj = js.Dynamic.literal(assignMedium = js.Any.fromFunction1(assignMedium), assignSyncMedium = js.Any.fromFunction1(assignSyncMedium), read = js.Any.fromFunction0(read), useMedium = js.Any.fromFunction1(useMedium))
    __obj.asInstanceOf[SideMedium[T]]
  }
  @scala.inline
  implicit class SideMediumOps[Self[t] <: SideMedium[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAssignMedium(value: MediumCallback[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignMedium")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAssignSyncMedium(value: MediumCallback[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignSyncMedium")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRead(value: () => js.UndefOr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUseMedium(value: T => removeCb): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMedium")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

