package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.End
import typingsSlinky.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Beam extends StObject {
  
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
  implicit class BeamMutableBuilder[Self <: Beam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyStemExtensions(value: () => Unit): Self = StObject.set(x, "applyStemExtensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBreakSecondaryAt(value: js.Array[Double] => Beam): Self = StObject.set(x, "breakSecondaryAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateSlope(value: () => Unit): Self = StObject.set(x, "calculateSlope", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCalculateStemDirection(value: Note => Double): Self = StObject.set(x, "calculateStemDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDraw(value: () => Boolean): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawBeamLines(value: () => Unit): Self = StObject.set(x, "drawBeamLines", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawStems(value: () => Unit): Self = StObject.set(x, "drawStems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBeamCount(value: () => Double): Self = StObject.set(x, "getBeamCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBeamLines(value: String => js.Array[End]): Self = StObject.set(x, "getBeamLines", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNotes(value: () => js.Array[StemmableNote]): Self = StObject.set(x, "getNotes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSlopeY(value: () => Double): Self = StObject.set(x, "getSlopeY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPostFormat(value: () => Beam): Self = StObject.set(x, "postFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreFormat(value: () => Beam): Self = StObject.set(x, "preFormat", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetContext(value: IRenderContext => Beam): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStyle(value: FillStyle_ => Beam): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
  }
}
