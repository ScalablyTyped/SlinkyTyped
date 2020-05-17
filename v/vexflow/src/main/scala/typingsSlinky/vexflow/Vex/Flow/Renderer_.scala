package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer_ extends js.Object {
  def getContext(): IRenderContext = js.native
  def resize(width: Double, height: Double): Renderer = js.native
}

object Renderer_ {
  @scala.inline
  def apply(getContext: () => IRenderContext, resize: (Double, Double) => Renderer): Renderer_ = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), resize = js.Any.fromFunction2(resize))
    __obj.asInstanceOf[Renderer_]
  }
  @scala.inline
  implicit class Renderer_Ops[Self <: Renderer_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContext(value: () => IRenderContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResize(value: (Double, Double) => Renderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

