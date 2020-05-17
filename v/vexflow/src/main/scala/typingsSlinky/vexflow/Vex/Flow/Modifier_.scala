package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import typingsSlinky.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modifier_ extends js.Object {
  def alignSubNotesWithNote(subNotes: js.Array[Note], note: Note): Unit = js.native
   //inconsistent type: void -> Modifier
  def draw(): Unit = js.native
  def getCategory(): String = js.native
  def getContext(): IRenderContext = js.native
  def getIndex(): Double = js.native
  def getModifierContext(): ModifierContext = js.native
  def getNote(): Note = js.native
  def getPosition(): Position = js.native
  def getWidth(): Double = js.native
  def setContext(context: IRenderContext): Modifier = js.native
  def setIndex(index: Double): Modifier = js.native
  def setModifierContext(c: ModifierContext): Modifier = js.native
  def setNote(note: Note): Modifier = js.native
  def setPosition(position: Position): Modifier = js.native
  def setTextLine(line: Double): Modifier = js.native
  def setWidth(width: Double): Modifier = js.native
  def setXShift(x: Double): Unit = js.native
  def setYShift(y: Double): Modifier = js.native
}

object Modifier_ {
  @scala.inline
  def apply(
    alignSubNotesWithNote: (js.Array[Note], Note) => Unit,
    draw: () => Unit,
    getCategory: () => String,
    getContext: () => IRenderContext,
    getIndex: () => Double,
    getModifierContext: () => ModifierContext,
    getNote: () => Note,
    getPosition: () => Position,
    getWidth: () => Double,
    setContext: IRenderContext => Modifier,
    setIndex: Double => Modifier,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setPosition: Position => Modifier,
    setTextLine: Double => Modifier,
    setWidth: Double => Modifier,
    setXShift: Double => Unit,
    setYShift: Double => Modifier
  ): Modifier_ = {
    val __obj = js.Dynamic.literal(alignSubNotesWithNote = js.Any.fromFunction2(alignSubNotesWithNote), draw = js.Any.fromFunction0(draw), getCategory = js.Any.fromFunction0(getCategory), getContext = js.Any.fromFunction0(getContext), getIndex = js.Any.fromFunction0(getIndex), getModifierContext = js.Any.fromFunction0(getModifierContext), getNote = js.Any.fromFunction0(getNote), getPosition = js.Any.fromFunction0(getPosition), getWidth = js.Any.fromFunction0(getWidth), setContext = js.Any.fromFunction1(setContext), setIndex = js.Any.fromFunction1(setIndex), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setPosition = js.Any.fromFunction1(setPosition), setTextLine = js.Any.fromFunction1(setTextLine), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1(setXShift), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Modifier_]
  }
  @scala.inline
  implicit class Modifier_Ops[Self <: Modifier_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignSubNotesWithNote(value: (js.Array[Note], Note) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignSubNotesWithNote")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCategory(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCategory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContext(value: () => IRenderContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetModifierContext(value: () => ModifierContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModifierContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNote(value: () => Note): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNote")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPosition(value: () => Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContext(value: IRenderContext => Modifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIndex(value: Double => Modifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetModifierContext(value: ModifierContext => Modifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModifierContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNote(value: Note => Modifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNote")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: Position => Modifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTextLine(value: Double => Modifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextLine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWidth(value: Double => Modifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetXShift(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setXShift")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetYShift(value: Double => Modifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setYShift")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

