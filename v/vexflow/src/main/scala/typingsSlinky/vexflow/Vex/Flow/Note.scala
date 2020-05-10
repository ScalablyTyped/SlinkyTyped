package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.AnonExtraLeftPx_
import typingsSlinky.vexflow.AnonType
import typingsSlinky.vexflow.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Note")
@js.native
class Note protected () extends Tickable {
  def this(note_struct: AnonType) = this()
  var preFormatted: Boolean = js.native
  def addModifier(modifier: Modifier, index: Double): Note = js.native
  def addStroke(index: Double, stroke: Stroke): Note = js.native
  def getAbsoluteX(): Double = js.native
  def getCategory(): String = js.native
  def getDots(): Double = js.native
  def getDuration(): String = js.native
  def getExtraLeftPx(): Double = js.native
  def getExtraRightPx(): Double = js.native
  def getGlyph(): Glyph = js.native
  def getLineForRest(): Double = js.native
  def getLineNumber(): Double = js.native
  def getMetrics(): AnonExtraLeftPx_ = js.native
  def getModifierStartXY(): AnonX = js.native
  def getNoteType(): String = js.native
  def getPlayNote(): js.Any = js.native
  def getStave(): Stave = js.native
  def getTickContext(): TickContext = js.native
  def getX(): Double = js.native
  def getYForTopText(text_line: Double): Double = js.native
  def getYs(): js.Array[Double] = js.native
  def hasStem(): Boolean = js.native
  def isDotted(): Boolean = js.native
  def isRest(): Boolean = js.native
  def setBeam(): Note = js.native
  def setExtraLeftPx(x: Double): Note = js.native
  def setExtraRightPx(x: Double): Note = js.native
  def setModifierContext(mc: ModifierContext): Note = js.native
  def setPlayNote(note: js.Any): Note = js.native
  def setPreFormatted(value: Boolean): Unit = js.native
  def setStave(stave: Stave): Note = js.native
  def setWidth(width: Double): Unit = js.native
  def setYs(ys: js.Array[Double]): Note = js.native
}

@JSGlobal("Vex.Flow.Note")
@js.native
object Note extends js.Object {
  val CATEGORY: String = js.native
}

