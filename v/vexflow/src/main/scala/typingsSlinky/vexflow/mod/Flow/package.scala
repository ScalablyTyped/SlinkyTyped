package typingsSlinky.vexflow.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Flow {
  
  //inconsistent API: this should be private and have a wrapper function like the other tables
  @scala.inline
  def DEFAULT_NOTATION_FONT_SCALE: scala.Double = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_NOTATION_FONT_SCALE").asInstanceOf[scala.Double]
  
  @scala.inline
  def RESOLUTION: scala.Double = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("RESOLUTION").asInstanceOf[scala.Double]
  
  @scala.inline
  def STAVE_LINE_THICKNESS: scala.Double = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("STAVE_LINE_THICKNESS").asInstanceOf[scala.Double]
  
  @scala.inline
  def STEM_HEIGHT: scala.Double = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("STEM_HEIGHT").asInstanceOf[scala.Double]
  
  // from tables.js:
  @scala.inline
  def STEM_WIDTH: scala.Double = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].selectDynamic("STEM_WIDTH").asInstanceOf[scala.Double]
  
  @scala.inline
  def accidentalCodes(acc: java.lang.String): typingsSlinky.vexflow.anon.Gracenotewidth = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("accidentalCodes")(acc.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vexflow.anon.Gracenotewidth]
  
  @scala.inline
  def articulationCodes(artic: java.lang.String): typingsSlinky.vexflow.anon.Betweenlines = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("articulationCodes")(artic.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vexflow.anon.Betweenlines]
  
  @scala.inline
  def clefProperties(clef: java.lang.String): typingsSlinky.vexflow.anon.Lineshift = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("clefProperties")(clef.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vexflow.anon.Lineshift]
  
  @scala.inline
  def durationToFraction(duration: java.lang.String): typingsSlinky.vexflow.Vex.Flow.Fraction = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("durationToFraction")(duration.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vexflow.Vex.Flow.Fraction]
  
  @scala.inline
  def durationToGlyph(duration: java.lang.String, `type`: java.lang.String): typingsSlinky.vexflow.anon.Codehead = (typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("durationToGlyph")(duration.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vexflow.anon.Codehead]
  
  @scala.inline
  def durationToNumber(duration: java.lang.String): scala.Double = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("durationToNumber")(duration.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def durationToTicks(duration: java.lang.String): scala.Double = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("durationToTicks")(duration.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def integerToNote(integer: scala.Double): java.lang.String = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("integerToNote")(integer.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def keyProperties(key: java.lang.String, clef: java.lang.String, params: typingsSlinky.vexflow.anon.Octaveshift): typingsSlinky.vexflow.anon.Accidental = (typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("keyProperties")(key.asInstanceOf[js.Any], clef.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vexflow.anon.Accidental]
  
  @scala.inline
  def keySignature(spec: java.lang.String): js.Array[typingsSlinky.vexflow.anon.Line] = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("keySignature")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.vexflow.anon.Line]]
  
  @scala.inline
  def ornamentCodes(acc: java.lang.String): typingsSlinky.vexflow.anon.Shiftdown = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("ornamentCodes")(acc.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vexflow.anon.Shiftdown]
  
  @scala.inline
  def parseNoteData(noteData: typingsSlinky.vexflow.anon.Dots): typingsSlinky.vexflow.anon.Duration = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("parseNoteData")(noteData.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vexflow.anon.Duration]
  
  @scala.inline
  def parseNoteDurationString(durationString: java.lang.String): typingsSlinky.vexflow.anon.Dots = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("parseNoteDurationString")(durationString.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vexflow.anon.Dots]
  
  // from glyph.js:
  @scala.inline
  def renderGlyph(
    ctx: typingsSlinky.vexflow.Vex.IRenderContext,
    x_pos: scala.Double,
    y_pos: scala.Double,
    point: scala.Double,
    `val`: java.lang.String,
    nocache: scala.Boolean
  ): scala.Unit = (typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("renderGlyph")(ctx.asInstanceOf[js.Any], x_pos.asInstanceOf[js.Any], y_pos.asInstanceOf[js.Any], point.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], nocache.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def tabToGlyph(fret: java.lang.String): typingsSlinky.vexflow.anon.Code = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("tabToGlyph")(fret.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.vexflow.anon.Code]
  
  @scala.inline
  def textWidth(text: java.lang.String): scala.Double = typingsSlinky.vexflow.mod.Flow.^.asInstanceOf[js.Dynamic].applyDynamic("textWidth")(text.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
}
