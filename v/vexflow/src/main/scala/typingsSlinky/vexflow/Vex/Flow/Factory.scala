package typingsSlinky.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Factory extends js.Object {
  
  def Accidental(params: js.Any): typingsSlinky.vexflow.Vex.Flow.Accidental = js.native
  
  def Annotation(params: js.Any): typingsSlinky.vexflow.Vex.Flow.Annotation = js.native
  
  def Articulation(params: js.Any): typingsSlinky.vexflow.Vex.Flow.Articulation = js.native
  
  def BarNote(params: js.Any): typingsSlinky.vexflow.Vex.Flow.BarNote = js.native
  
  def Beam(params: js.Any): typingsSlinky.vexflow.Vex.Flow.Beam = js.native
  
  def ClefNote(params: js.Any): typingsSlinky.vexflow.Vex.Flow.ClefNote = js.native
  
  def Curve(params: js.Any): typingsSlinky.vexflow.Vex.Flow.Curve = js.native
  
  def EasyScore(): typingsSlinky.vexflow.Vex.Flow.EasyScore = js.native
  def EasyScore(params: js.Object): typingsSlinky.vexflow.Vex.Flow.EasyScore = js.native
  
  def Fingering(params: js.Any): FretHandFinger = js.native
  
  def Formatter(): typingsSlinky.vexflow.Vex.Flow.Formatter = js.native
  
  def GhostNote(noteStruct: js.Any): typingsSlinky.vexflow.Vex.Flow.GhostNote = js.native
  
  def GlyphNote(glyph: js.Any, noteStruct: js.Any, options: js.Any): typingsSlinky.vexflow.Vex.Flow.GlyphNote = js.native
  
  def GraceNote(noteStruct: js.Any): typingsSlinky.vexflow.Vex.Flow.GraceNote = js.native
  
  def GraceNoteGroup(params: js.Any): typingsSlinky.vexflow.Vex.Flow.GraceNoteGroup = js.native
  
  def KeySigNote(params: js.Any): typingsSlinky.vexflow.Vex.Flow.KeySigNote = js.native
  
  def ModifierContext(): typingsSlinky.vexflow.Vex.Flow.ModifierContext = js.native
  
  def MultiMeasureRest(params: js.Any): typingsSlinky.vexflow.Vex.Flow.MultiMeasureRest = js.native
  
  def NoteSubGroup(): typingsSlinky.vexflow.Vex.Flow.NoteSubGroup = js.native
  def NoteSubGroup(params: js.Object): typingsSlinky.vexflow.Vex.Flow.NoteSubGroup = js.native
  
  def PedalMarking(): typingsSlinky.vexflow.Vex.Flow.PedalMarking = js.native
  def PedalMarking(params: js.Object): typingsSlinky.vexflow.Vex.Flow.PedalMarking = js.native
  
  def RepeatNote(`type`: js.Any, noteStruct: js.Any, options: js.Any): typingsSlinky.vexflow.Vex.Flow.RepeatNote = js.native
  
  def Stave(params: js.Any): typingsSlinky.vexflow.Vex.Flow.Stave = js.native
  
  def StaveConnector(params: js.Any): typingsSlinky.vexflow.Vex.Flow.StaveConnector = js.native
  
  def StaveLine(params: js.Any): typingsSlinky.vexflow.Vex.Flow.StaveLine = js.native
  
  def StaveNote(noteStruct: js.Any): typingsSlinky.vexflow.Vex.Flow.StaveNote = js.native
  
  def StaveTie(params: js.Any): typingsSlinky.vexflow.Vex.Flow.StaveTie = js.native
  
  def StringNumber(params: js.Any): typingsSlinky.vexflow.Vex.Flow.StringNumber = js.native
  
  def System(): typingsSlinky.vexflow.Vex.Flow.System = js.native
  def System(params: js.Object): typingsSlinky.vexflow.Vex.Flow.System = js.native
  
  def TabNote(noteStruct: js.Any): typingsSlinky.vexflow.Vex.Flow.TabNote = js.native
  
  def TabStave(params: js.Any): typingsSlinky.vexflow.Vex.Flow.TabStave = js.native
  
  def TextBracket(params: js.Any): typingsSlinky.vexflow.Vex.Flow.TextBracket = js.native
  
  def TextDynamics(params: js.Any): typingsSlinky.vexflow.Vex.Flow.TextDynamics = js.native
  
  def TextNote(textNoteStruct: js.Any): typingsSlinky.vexflow.Vex.Flow.TextNote = js.native
  
  def TickContext(): typingsSlinky.vexflow.Vex.Flow.TickContext = js.native
  
  def TimeSigNote(params: js.Any): typingsSlinky.vexflow.Vex.Flow.TimeSigNote = js.native
  
  def Tuplet(params: js.Any): typingsSlinky.vexflow.Vex.Flow.Tuplet = js.native
  
  def VibratoBracket(params: js.Any): typingsSlinky.vexflow.Vex.Flow.VibratoBracket = js.native
  
  def Voice(params: js.Any): typingsSlinky.vexflow.Vex.Flow.Voice = js.native
  
  var context: js.Any = js.native
  
  def draw(): Unit = js.native
  
  def getContext(): js.Any = js.native
  
  def getOptions(): typingsSlinky.vexflow.anon.Renderer = js.native
  
  def getStave(): Stave = js.native
  
  def getVoices(): js.Array[_] = js.native
  
  def initRenderer(): Unit = js.native
  
  var options: typingsSlinky.vexflow.anon.Renderer = js.native
  
  var renderQ: js.Array[_] = js.native
  
  def reset(): Unit = js.native
  
  def setContext(context: js.Any): Factory = js.native
  
  def setOptions(options: js.Any): Unit = js.native
  
  def space(spacing: js.Any): Double = js.native
  
  var stave: Stave = js.native
  
  var staves: js.Array[_] = js.native
  
  var systems: js.Array[_] = js.native
  
  var voices: js.Array[_] = js.native
}
