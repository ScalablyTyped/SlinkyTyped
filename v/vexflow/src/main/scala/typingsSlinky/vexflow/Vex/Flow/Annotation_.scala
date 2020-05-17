package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.Annotation.Justify
import typingsSlinky.vexflow.Vex.Flow.Annotation.VerticalJustify
import typingsSlinky.vexflow.Vex.Flow.Modifier.Position
import typingsSlinky.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Annotation_ extends Modifier {
  def getJustification(): Justify = js.native
  def setFont(family: String, size: Double, weight: String): Annotation = js.native
  def setJustification(justification: Justify): Annotation = js.native
  def setVerticalJustification(just: VerticalJustify): Annotation = js.native
}

object Annotation_ {
  @scala.inline
  def apply(
    alignSubNotesWithNote: (js.Array[Note], Note) => Unit,
    draw: () => Unit,
    getCategory: () => String,
    getContext: () => IRenderContext,
    getIndex: () => Double,
    getJustification: () => Justify,
    getModifierContext: () => ModifierContext,
    getNote: () => Note,
    getPosition: () => Position,
    getWidth: () => Double,
    setContext: IRenderContext => Modifier,
    setFont: (String, Double, String) => Annotation,
    setIndex: Double => Modifier,
    setJustification: Justify => Annotation,
    setModifierContext: ModifierContext => Modifier,
    setNote: Note => Modifier,
    setPosition: Position => Modifier,
    setTextLine: Double => Modifier,
    setVerticalJustification: VerticalJustify => Annotation,
    setWidth: Double => Modifier,
    setXShift: Double => Unit,
    setYShift: Double => Modifier
  ): Annotation_ = {
    val __obj = js.Dynamic.literal(alignSubNotesWithNote = js.Any.fromFunction2(alignSubNotesWithNote), draw = js.Any.fromFunction0(draw), getCategory = js.Any.fromFunction0(getCategory), getContext = js.Any.fromFunction0(getContext), getIndex = js.Any.fromFunction0(getIndex), getJustification = js.Any.fromFunction0(getJustification), getModifierContext = js.Any.fromFunction0(getModifierContext), getNote = js.Any.fromFunction0(getNote), getPosition = js.Any.fromFunction0(getPosition), getWidth = js.Any.fromFunction0(getWidth), setContext = js.Any.fromFunction1(setContext), setFont = js.Any.fromFunction3(setFont), setIndex = js.Any.fromFunction1(setIndex), setJustification = js.Any.fromFunction1(setJustification), setModifierContext = js.Any.fromFunction1(setModifierContext), setNote = js.Any.fromFunction1(setNote), setPosition = js.Any.fromFunction1(setPosition), setTextLine = js.Any.fromFunction1(setTextLine), setVerticalJustification = js.Any.fromFunction1(setVerticalJustification), setWidth = js.Any.fromFunction1(setWidth), setXShift = js.Any.fromFunction1(setXShift), setYShift = js.Any.fromFunction1(setYShift))
    __obj.asInstanceOf[Annotation_]
  }
  @scala.inline
  implicit class Annotation_Ops[Self <: Annotation_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetJustification(value: () => Justify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJustification")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetFont(value: (String, Double, String) => Annotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFont")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetJustification(value: Justify => Annotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setJustification")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVerticalJustification(value: VerticalJustify => Annotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVerticalJustification")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

