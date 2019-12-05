package typingsSlinky.vexflow.vexflowMod.Flow

import typingsSlinky.vexflow.Anon_Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.GraceNoteGroup")
@js.native
class GraceNoteGroup protected ()
  extends typingsSlinky.vexflow.Vex.Flow.GraceNoteGroup {
  def this(grace_notes: js.Array[typingsSlinky.vexflow.Vex.Flow.GraceNote]) = this()
  def this(grace_notes: js.Array[typingsSlinky.vexflow.Vex.Flow.GraceNote], show_slur: Boolean) = this()
}

/* static members */
@JSImport("vexflow", "Flow.GraceNoteGroup")
@js.native
object GraceNoteGroup extends js.Object {
  val CATEGORY: String = js.native
   //inconsistent name: 'show_slur' is called 'config', suggesting object (is boolean)
  var DEBUG: Boolean = js.native
  def format(gracenote_groups: js.Array[typingsSlinky.vexflow.Vex.Flow.GraceNoteGroup], state: Anon_Leftshift): Boolean = js.native
}

