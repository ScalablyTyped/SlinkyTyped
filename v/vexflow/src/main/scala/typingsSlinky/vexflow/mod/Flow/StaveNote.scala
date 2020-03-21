package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.AnonClef
import typingsSlinky.vexflow.AnonLeftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.StaveNote")
@js.native
class StaveNote protected ()
  extends typingsSlinky.vexflow.Vex.Flow.StaveNote {
  def this(note_struct: AnonClef) = this()
}

/* static members */
@JSImport("vexflow", "Flow.StaveNote")
@js.native
object StaveNote extends js.Object {
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  val STEM_DOWN: Double = js.native
  val STEM_UP: Double = js.native
  def format(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StaveNote], state: AnonLeftshift): Boolean = js.native
  def formatByY(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StaveNote], state: AnonLeftshift): Unit = js.native
  def postFormat(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StaveNote]): Boolean = js.native
}

