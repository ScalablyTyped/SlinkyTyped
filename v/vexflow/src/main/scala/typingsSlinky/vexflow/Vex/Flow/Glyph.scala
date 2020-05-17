package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Cache
import typingsSlinky.vexflow.anon.Xmax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Glyph extends js.Object {
  def getContext(): IRenderContext = js.native
  def getMetrics(): Xmax = js.native
  def render(ctx: IRenderContext, x_pos: Double, y_pos: Double): Unit = js.native
  def renderToStave(x: Double): Unit = js.native
  def reset(): Unit = js.native
  def setContext(context: IRenderContext): Glyph = js.native
  def setOptions(options: Cache): Unit = js.native
  def setStave(stave: Stave): Glyph = js.native
  def setWidth(width: Double): Glyph = js.native
  def setXShift(x_shift: Double): Glyph = js.native
  def setYShift(y_shift: Double): Glyph = js.native
}

object Glyph {
  @scala.inline
  def apply(
    getContext: () => IRenderContext,
    getMetrics: () => Xmax,
    render: (IRenderContext, Double, Double) => Unit,
    renderToStave: Double => Unit,
    reset: () => Unit,
    setContext: IRenderContext => Glyph,
    setOptions: Cache => Unit,
    setStave: Stave => Glyph,
    setWidth: Double => Glyph,
    setXShift: Double => Glyph,
    setYShift: Double => Glyph
  ): Glyph = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getMetrics = js.Any.fromFunction0(getMetrics), render = js.Any.fromFunction3(render), renderToStave = js.Any.fromFunction1(renderToStave), reset = js.Any.fromFunction0(reset), setContext = js.Any.fromFunction1(setContext), setOptions = js.Any.fromFunction1(setOptions), setStave = js.Any.fromFunction1(setStave), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1(setXShift), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Glyph]
  }
  @scala.inline
  implicit class GlyphOps[Self <: Glyph] (val x: Self) extends AnyVal {
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
    def withGetMetrics(value: () => Xmax): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMetrics")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender(value: (IRenderContext, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRenderToStave(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToStave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContext(value: IRenderContext => Glyph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOptions(value: Cache => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStave(value: Stave => Glyph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWidth(value: Double => Glyph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetXShift(value: Double => Glyph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXShift")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetYShift(value: Double => Glyph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYShift")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

