package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.anon.Arrowheadangle
import typingsSlinky.vexflow.anon.Family
import typingsSlinky.vexflow.anon.Lastnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaveLine_ extends js.Object {
  //inconsistent API: this should be set via an options object in the constructor
  var render_options: Arrowheadangle = js.native
  def applyFontStyle(): Unit = js.native
  def applyLineStyle(): Unit = js.native
  def draw(): StaveLine = js.native
  def setContext(context: js.Object): StaveLine = js.native
  def setFont(font: Family): StaveLine = js.native
  def setNotes(notes: Lastnote): StaveLine = js.native
  def setText(text: String): StaveLine = js.native
}

object StaveLine_ {
  @scala.inline
  def apply(
    applyFontStyle: () => Unit,
    applyLineStyle: () => Unit,
    draw: () => StaveLine,
    render_options: Arrowheadangle,
    setContext: js.Object => StaveLine,
    setFont: Family => StaveLine,
    setNotes: Lastnote => StaveLine,
    setText: String => StaveLine
  ): StaveLine_ = {
    val __obj = js.Dynamic.literal(applyFontStyle = js.Any.fromFunction0(applyFontStyle), applyLineStyle = js.Any.fromFunction0(applyLineStyle), draw = js.Any.fromFunction0(draw), render_options = render_options.asInstanceOf[js.Any], setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction1(setFont), setNotes = js.Any.fromFunction1(setNotes), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[StaveLine_]
  }
  @scala.inline
  implicit class StaveLine_Ops[Self <: StaveLine_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyFontStyle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyFontStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withApplyLineStyle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyLineStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDraw(value: () => StaveLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender_options(value: Arrowheadangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render_options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetContext(value: js.Object => StaveLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFont(value: Family => StaveLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFont")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNotes(value: Lastnote => StaveLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNotes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => StaveLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

