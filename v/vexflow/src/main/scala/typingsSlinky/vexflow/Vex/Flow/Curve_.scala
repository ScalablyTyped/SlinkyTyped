package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Curve_ extends js.Object {
  def draw(): Boolean = js.native
  def isPartial(): Boolean = js.native
  def renderCurve(params: Direction): Unit = js.native
  def setContext(context: IRenderContext): Curve = js.native
  def setNotes(from: Note, to: Note): Curve = js.native
}

object Curve_ {
  @scala.inline
  def apply(
    draw: () => Boolean,
    isPartial: () => Boolean,
    renderCurve: Direction => Unit,
    setContext: IRenderContext => Curve,
    setNotes: (Note, Note) => Curve
  ): Curve_ = {
    val __obj = js.Dynamic.literal(draw = js.Any.fromFunction0(draw), isPartial = js.Any.fromFunction0(isPartial), renderCurve = js.Any.fromFunction1(renderCurve), setContext = js.Any.fromFunction1(setContext), setNotes = js.Any.fromFunction2(setNotes))
    __obj.asInstanceOf[Curve_]
  }
  @scala.inline
  implicit class Curve_Ops[Self <: Curve_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraw(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPartial(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPartial")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderCurve(value: Direction => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCurve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetContext(value: IRenderContext => Curve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNotes(value: (Note, Note) => Curve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNotes")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

