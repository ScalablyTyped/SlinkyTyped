package typingsSlinky.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitLightboxPanelElement extends js.Object {
  def hide(): Unit = js.native
  def show(index: Double): Unit = js.native
  def startAutoplay(): Unit = js.native
  def stopAutoplay(): Unit = js.native
}

object UIkitLightboxPanelElement {
  @scala.inline
  def apply(hide: () => Unit, show: Double => Unit, startAutoplay: () => Unit, stopAutoplay: () => Unit): UIkitLightboxPanelElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction1(show), startAutoplay = js.Any.fromFunction0(startAutoplay), stopAutoplay = js.Any.fromFunction0(stopAutoplay))
    __obj.asInstanceOf[UIkitLightboxPanelElement]
  }
  @scala.inline
  implicit class UIkitLightboxPanelElementOps[Self <: UIkitLightboxPanelElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartAutoplay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAutoplay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopAutoplay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopAutoplay")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

