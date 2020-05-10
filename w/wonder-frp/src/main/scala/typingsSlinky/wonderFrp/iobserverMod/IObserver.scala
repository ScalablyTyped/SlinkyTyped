package typingsSlinky.wonderFrp.iobserverMod

import typingsSlinky.wonderFrp.idisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObserver extends IDisposable {
  def completed(): js.Any = js.native
  def error(error: js.Any): js.Any = js.native
  def next(value: js.Any): js.Any = js.native
}

object IObserver {
  @scala.inline
  def apply(completed: () => js.Any, dispose: () => Unit, error: js.Any => js.Any, next: js.Any => js.Any): IObserver = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction0(completed), dispose = js.Any.fromFunction0(dispose), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[IObserver]
  }
  @scala.inline
  implicit class IObserverOps[Self <: IObserver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleted(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withError(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNext(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

