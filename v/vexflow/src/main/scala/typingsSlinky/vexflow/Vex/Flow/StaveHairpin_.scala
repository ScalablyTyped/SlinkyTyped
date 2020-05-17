package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Firstnote
import typingsSlinky.vexflow.anon.Firstx
import typingsSlinky.vexflow.anon.Leftshiftpx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaveHairpin_ extends js.Object {
  def draw(): Boolean = js.native
  def renderHairpin(params: Firstx): Unit = js.native
  def setContext(context: IRenderContext): StaveHairpin = js.native
  def setNotes(notes: Firstnote): StaveHairpin = js.native
  def setPosition(position: Position): StaveHairpin = js.native
  def setRenderOptions(options: Leftshiftpx): StaveHairpin = js.native
}

object StaveHairpin_ {
  @scala.inline
  def apply(
    draw: () => Boolean,
    renderHairpin: Firstx => Unit,
    setContext: IRenderContext => StaveHairpin,
    setNotes: Firstnote => StaveHairpin,
    setPosition: Position => StaveHairpin,
    setRenderOptions: Leftshiftpx => StaveHairpin
  ): StaveHairpin_ = {
    val __obj = js.Dynamic.literal(draw = js.Any.fromFunction0(draw), renderHairpin = js.Any.fromFunction1(renderHairpin), setContext = js.Any.fromFunction1(setContext), setNotes = js.Any.fromFunction1(setNotes), setPosition = js.Any.fromFunction1(setPosition), setRenderOptions = js.Any.fromFunction1(setRenderOptions))
    __obj.asInstanceOf[StaveHairpin_]
  }
  @scala.inline
  implicit class StaveHairpin_Ops[Self <: StaveHairpin_] (val x: Self) extends AnyVal {
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
    def withRenderHairpin(value: Firstx => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHairpin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetContext(value: IRenderContext => StaveHairpin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNotes(value: Firstnote => StaveHairpin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNotes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: Position => StaveHairpin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRenderOptions(value: Leftshiftpx => StaveHairpin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRenderOptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

