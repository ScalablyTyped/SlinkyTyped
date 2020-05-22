package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Beammiddleonly
import typingsSlinky.vexflow.anon.End
import typingsSlinky.vexflow.anon.FillStyle_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Beam")
@js.native
class Beam protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Beam {
  def this(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StemmableNote]) = this()
  def this(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StemmableNote], auto_stem: Boolean) = this()
  /* CompleteClass */
  override def applyStemExtensions(): Unit = js.native
  /* CompleteClass */
  override def breakSecondaryAt(indices: js.Array[Double]): typingsSlinky.vexflow.Vex.Flow.Beam = js.native
  /* CompleteClass */
  override def calculateSlope(): Unit = js.native
  /* CompleteClass */
  override def calculateStemDirection(notes: typingsSlinky.vexflow.Vex.Flow.Note): Double = js.native
  /* CompleteClass */
  override def draw(): Boolean = js.native
  /* CompleteClass */
  override def drawBeamLines(): Unit = js.native
  /* CompleteClass */
  override def drawStems(): Unit = js.native
  /* CompleteClass */
  override def getBeamCount(): Double = js.native
  /* CompleteClass */
  override def getBeamLines(duration: String): js.Array[End] = js.native
  /* CompleteClass */
  override def getNotes(): js.Array[typingsSlinky.vexflow.Vex.Flow.StemmableNote] = js.native
  /* CompleteClass */
  override def getSlopeY(): Double = js.native
  /* CompleteClass */
  override def postFormat(): typingsSlinky.vexflow.Vex.Flow.Beam = js.native
  /* CompleteClass */
  override def preFormat(): typingsSlinky.vexflow.Vex.Flow.Beam = js.native
  /* CompleteClass */
  override def setContext(context: IRenderContext): typingsSlinky.vexflow.Vex.Flow.Beam = js.native
  /* CompleteClass */
  override def setStyle(style: FillStyle_): typingsSlinky.vexflow.Vex.Flow.Beam = js.native
}

/* static members */
@JSGlobal("Vex.Flow.Beam")
@js.native
object Beam extends js.Object {
  def applyAndGetBeams(
    voice: typingsSlinky.vexflow.Vex.Flow.Voice,
    stem_direction: Double,
    groups: js.Array[typingsSlinky.vexflow.Vex.Flow.Fraction]
  ): js.Array[typingsSlinky.vexflow.Vex.Flow.Beam] = js.native
  def generateBeams(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StemmableNote]): js.Array[typingsSlinky.vexflow.Vex.Flow.Beam] = js.native
  def generateBeams(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StemmableNote], config: Beammiddleonly): js.Array[typingsSlinky.vexflow.Vex.Flow.Beam] = js.native
  def getDefaultBeamGroups(time_sig: String): js.Array[typingsSlinky.vexflow.Vex.Flow.Fraction] = js.native
}

