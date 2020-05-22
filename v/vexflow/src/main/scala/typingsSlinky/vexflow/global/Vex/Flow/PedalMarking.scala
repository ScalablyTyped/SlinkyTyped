package typingsSlinky.vexflow.global.Vex.Flow

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vexflow.anon.Xshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.PedalMarking")
@js.native
class PedalMarking protected ()
  extends typingsSlinky.vexflow.Vex.Flow.PedalMarking {
  def this(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note]) = this()
}

/* static members */
@JSGlobal("Vex.Flow.PedalMarking")
@js.native
object PedalMarking extends js.Object {
   //inconsistent name: 'notes' is called 'type', suggesting string (is Note[])
  var DEBUG: Boolean = js.native
  def createSostenuto(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note]): typingsSlinky.vexflow.Vex.Flow.PedalMarking = js.native
  def createSustain(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note]): typingsSlinky.vexflow.Vex.Flow.PedalMarking = js.native
  def createUnaCorda(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note]): typingsSlinky.vexflow.Vex.Flow.PedalMarking = js.native
  @js.native
  object GLYPHS extends /* name */ StringDictionary[Xshift]
  
  @js.native
  object Styles extends js.Object {
    /* 0 */ val BRACKET: typingsSlinky.vexflow.Vex.Flow.PedalMarking.Styles.BRACKET with Double = js.native
    /* 1 */ val MIXED: typingsSlinky.vexflow.Vex.Flow.PedalMarking.Styles.MIXED with Double = js.native
    /* 1 */ val TEXT: typingsSlinky.vexflow.Vex.Flow.PedalMarking.Styles.TEXT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.PedalMarking.Styles with Double] = js.native
  }
  
}

