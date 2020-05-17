package typingsSlinky.sharepoint.SP.UI

import org.scalajs.dom.raw.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagingControl extends js.Object {
  def getButtonState(buttonId: Double): Double = js.native
  def get_innerContent(): HTMLSpanElement = js.native
  def get_innerContentClass(): String = js.native
  def onNext(): Unit = js.native
  /**Should override*/
  def onPrev(): Unit = js.native
  def onWindowResized(): Unit = js.native
  def postRender(): Unit = js.native
  def render(innerContent: String): String = js.native
  def setButtonState(buttonId: Double, state: Double): Unit = js.native
}

object PagingControl {
  @scala.inline
  def apply(
    getButtonState: Double => Double,
    get_innerContent: () => HTMLSpanElement,
    get_innerContentClass: () => String,
    onNext: () => Unit,
    onPrev: () => Unit,
    onWindowResized: () => Unit,
    postRender: () => Unit,
    render: String => String,
    setButtonState: (Double, Double) => Unit
  ): PagingControl = {
    val __obj = js.Dynamic.literal(getButtonState = js.Any.fromFunction1(getButtonState), get_innerContent = js.Any.fromFunction0(get_innerContent), get_innerContentClass = js.Any.fromFunction0(get_innerContentClass), onNext = js.Any.fromFunction0(onNext), onPrev = js.Any.fromFunction0(onPrev), onWindowResized = js.Any.fromFunction0(onWindowResized), postRender = js.Any.fromFunction0(postRender), render = js.Any.fromFunction1(render), setButtonState = js.Any.fromFunction2(setButtonState))
    __obj.asInstanceOf[PagingControl]
  }
  @scala.inline
  implicit class PagingControlOps[Self <: PagingControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetButtonState(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getButtonState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet_innerContent(value: () => HTMLSpanElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_innerContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_innerContentClass(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_innerContentClass")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnPrev(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnWindowResized(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWindowResized")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPostRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetButtonState(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setButtonState")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

