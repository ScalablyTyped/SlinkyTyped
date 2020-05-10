package typingsSlinky.winrt.Windows.ApplicationModel.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoreApplicationUseCount extends js.Object {
  def decrementApplicationUseCount(): Unit = js.native
  def incrementApplicationUseCount(): Unit = js.native
}

object ICoreApplicationUseCount {
  @scala.inline
  def apply(decrementApplicationUseCount: () => Unit, incrementApplicationUseCount: () => Unit): ICoreApplicationUseCount = {
    val __obj = js.Dynamic.literal(decrementApplicationUseCount = js.Any.fromFunction0(decrementApplicationUseCount), incrementApplicationUseCount = js.Any.fromFunction0(incrementApplicationUseCount))
    __obj.asInstanceOf[ICoreApplicationUseCount]
  }
  @scala.inline
  implicit class ICoreApplicationUseCountOps[Self <: ICoreApplicationUseCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecrementApplicationUseCount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrementApplicationUseCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIncrementApplicationUseCount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementApplicationUseCount")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

