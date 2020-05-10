package typingsSlinky.sigmajs.SigmaJs

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  var container: HTMLElement = js.native
  def refresh(): Sigma = js.native
  def render(): Sigma = js.native
  def resize(): Sigma = js.native
  def settings(settings: Settings): Unit = js.native
}

object Renderer {
  @scala.inline
  def apply(
    container: HTMLElement,
    refresh: () => Sigma,
    render: () => Sigma,
    resize: () => Sigma,
    settings: Settings => Unit
  ): Renderer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), render = js.Any.fromFunction0(render), resize = js.Any.fromFunction0(resize), settings = js.Any.fromFunction1(settings))
    __obj.asInstanceOf[Renderer]
  }
  @scala.inline
  implicit class RendererOps[Self <: Renderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Sigma): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender(value: () => Sigma): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResize(value: () => Sigma): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSettings(value: Settings => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

