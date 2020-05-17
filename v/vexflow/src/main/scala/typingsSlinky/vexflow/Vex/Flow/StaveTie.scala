package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Family
import typingsSlinky.vexflow.anon.Firstxpx
import typingsSlinky.vexflow.anon.Lastindices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaveTie extends js.Object {
  def draw(): Boolean = js.native
  def isPartial(): Boolean = js.native
  def renderText(first_x_px: Double, last_x_px: Double): Unit = js.native
  def renderTie(params: Firstxpx): Unit = js.native
  def setContext(context: IRenderContext): StaveTie = js.native
  def setFont(font: Family): StaveTie = js.native
  def setNotes(notes: Lastindices): StaveTie = js.native
}

object StaveTie {
  @scala.inline
  def apply(
    draw: () => Boolean,
    isPartial: () => Boolean,
    renderText: (Double, Double) => Unit,
    renderTie: Firstxpx => Unit,
    setContext: IRenderContext => StaveTie,
    setFont: Family => StaveTie,
    setNotes: Lastindices => StaveTie
  ): StaveTie = {
    val __obj = js.Dynamic.literal(draw = js.Any.fromFunction0(draw), isPartial = js.Any.fromFunction0(isPartial), renderText = js.Any.fromFunction2(renderText), renderTie = js.Any.fromFunction1(renderTie), setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction1(setFont), setNotes = js.Any.fromFunction1(setNotes))
    __obj.asInstanceOf[StaveTie]
  }
  @scala.inline
  implicit class StaveTieOps[Self <: StaveTie] (val x: Self) extends AnyVal {
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
    def withRenderText(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderText")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRenderTie(value: Firstxpx => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTie")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetContext(value: IRenderContext => StaveTie): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFont(value: Family => StaveTie): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFont")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNotes(value: Lastindices => StaveTie): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNotes")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

