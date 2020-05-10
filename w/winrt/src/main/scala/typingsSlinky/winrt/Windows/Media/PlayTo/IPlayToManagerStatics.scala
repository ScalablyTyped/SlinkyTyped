package typingsSlinky.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToManagerStatics extends js.Object {
  def getForCurrentView(): PlayToManager = js.native
  def showPlayToUI(): Unit = js.native
}

object IPlayToManagerStatics {
  @scala.inline
  def apply(getForCurrentView: () => PlayToManager, showPlayToUI: () => Unit): IPlayToManagerStatics = {
    val __obj = js.Dynamic.literal(getForCurrentView = js.Any.fromFunction0(getForCurrentView), showPlayToUI = js.Any.fromFunction0(showPlayToUI))
    __obj.asInstanceOf[IPlayToManagerStatics]
  }
  @scala.inline
  implicit class IPlayToManagerStaticsOps[Self <: IPlayToManagerStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetForCurrentView(value: () => PlayToManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getForCurrentView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowPlayToUI(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPlayToUI")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

