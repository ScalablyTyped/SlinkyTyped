package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.End
import typingsSlinky.vexflow.anon.FillStyle_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Beam extends js.Object {
  def applyStemExtensions(): Unit = js.native
  def breakSecondaryAt(indices: js.Array[Double]): Beam = js.native
  def calculateSlope(): Unit = js.native
  def calculateStemDirection(notes: Note): Double = js.native
  def draw(): Boolean = js.native
  def drawBeamLines(): Unit = js.native
  def drawStems(): Unit = js.native
  def getBeamCount(): Double = js.native
  def getBeamLines(duration: String): js.Array[End] = js.native
  def getNotes(): js.Array[StemmableNote] = js.native
  def getSlopeY(): Double = js.native
  def postFormat(): Beam = js.native
  def preFormat(): Beam = js.native
  def setContext(context: IRenderContext): Beam = js.native
  def setStyle(style: FillStyle_): Beam = js.native
}

object Beam {
  @scala.inline
  def apply(
    applyStemExtensions: () => Unit,
    breakSecondaryAt: js.Array[Double] => Beam,
    calculateSlope: () => Unit,
    calculateStemDirection: Note => Double,
    draw: () => Boolean,
    drawBeamLines: () => Unit,
    drawStems: () => Unit,
    getBeamCount: () => Double,
    getBeamLines: String => js.Array[End],
    getNotes: () => js.Array[StemmableNote],
    getSlopeY: () => Double,
    postFormat: () => Beam,
    preFormat: () => Beam,
    setContext: IRenderContext => Beam,
    setStyle: FillStyle_ => Beam
  ): Beam = {
    val __obj = js.Dynamic.literal(applyStemExtensions = js.Any.fromFunction0(applyStemExtensions), breakSecondaryAt = js.Any.fromFunction1(breakSecondaryAt), calculateSlope = js.Any.fromFunction0(calculateSlope), calculateStemDirection = js.Any.fromFunction1(calculateStemDirection), draw = js.Any.fromFunction0(draw), drawBeamLines = js.Any.fromFunction0(drawBeamLines), drawStems = js.Any.fromFunction0(drawStems), getBeamCount = js.Any.fromFunction0(getBeamCount), getBeamLines = js.Any.fromFunction1(getBeamLines), getNotes = js.Any.fromFunction0(getNotes), getSlopeY = js.Any.fromFunction0(getSlopeY), postFormat = js.Any.fromFunction0(postFormat), preFormat = js.Any.fromFunction0(preFormat), setContext = js.Any.fromFunction1(setContext), setStyle = js.Any.fromFunction1(setStyle))
    __obj.asInstanceOf[Beam]
  }
  @scala.inline
  implicit class BeamOps[Self <: Beam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyStemExtensions(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyStemExtensions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBreakSecondaryAt(value: js.Array[Double] => Beam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakSecondaryAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCalculateSlope(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateSlope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCalculateStemDirection(value: Note => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateStemDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDraw(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDrawBeamLines(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawBeamLines")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDrawStems(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawStems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBeamCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBeamCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBeamLines(value: String => js.Array[End]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBeamLines")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNotes(value: () => js.Array[StemmableNote]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNotes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSlopeY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSlopeY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPostFormat(value: () => Beam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreFormat(value: () => Beam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preFormat")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContext(value: IRenderContext => Beam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStyle(value: FillStyle_ => Beam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

