package typingsSlinky.vexflow.global.Vex.Flow

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vexflow.anon.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.TextNote")
@js.native
class TextNote protected ()
  extends typingsSlinky.vexflow.Vex.Flow.TextNote {
  def this(text_struct: typingsSlinky.vexflow.anon.Font) = this()
}

@JSGlobal("Vex.Flow.TextNote")
@js.native
object TextNote extends js.Object {
  @js.native
  object GLYPHS extends /* name */ StringDictionary[Point]
  
  @js.native
  object Justification extends js.Object {
    /* 0 */ val CENTER: typingsSlinky.vexflow.Vex.Flow.TextNote.Justification.CENTER with Double = js.native
    /* 1 */ val LEFT: typingsSlinky.vexflow.Vex.Flow.TextNote.Justification.LEFT with Double = js.native
    /* 1 */ val RIGHT: typingsSlinky.vexflow.Vex.Flow.TextNote.Justification.RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vexflow.Vex.Flow.TextNote.Justification with Double] = js.native
  }
  
}

