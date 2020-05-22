package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.KeySignature
import typingsSlinky.vexflow.anon.GetContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.KeySignature")
@js.native
class KeySignature_ protected () extends KeySignature {
  def this(key_spec: String) = this()
  /* CompleteClass */
  override def addEndModifier(): Unit = js.native
  /* CompleteClass */
  override def addModifier(): Unit = js.native
  /* CompleteClass */
  override def addToStave(stave: typingsSlinky.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typingsSlinky.vexflow.Vex.Flow.StaveModifier = js.native
  /* CompleteClass */
  override def addToStaveEnd(stave: typingsSlinky.vexflow.Vex.Flow.Stave, firstGlyph: Boolean): typingsSlinky.vexflow.Vex.Flow.StaveModifier = js.native
  /* CompleteClass */
  override def getCategory(): String = js.native
  /* CompleteClass */
  override def getPadding(index: Double): Double = js.native
  /* CompleteClass */
  override def getPosition(): Double = js.native
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /* CompleteClass */
  override def makeSpacer(padding: Double): GetContext = js.native
  /* CompleteClass */
  override def placeGlyphOnLine(
    glyph: typingsSlinky.vexflow.Vex.Flow.Glyph,
    stave: typingsSlinky.vexflow.Vex.Flow.Stave,
    line: Double
  ): Unit = js.native
  /* CompleteClass */
  override def setPadding(padding: Double): Unit = js.native
}

