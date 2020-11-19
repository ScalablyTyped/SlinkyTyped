package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.StaveNote")
@js.native
class StaveNote protected ()
  extends typingsSlinky.vexflow.Vex.Flow.StaveNote {
  def this(note_struct: typingsSlinky.vexflow.anon.Clef) = this()
}
/* static members */
@JSImport("vexflow", "Flow.StaveNote")
@js.native
object StaveNote extends js.Object {
  
  val CATEGORY: String = js.native
  
  var DEBUG: Boolean = js.native
  
  val STEM_DOWN: Double = js.native
  
  val STEM_UP: Double = js.native
  
  def format(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StaveNote], state: Leftshift): Boolean = js.native
  
  def formatByY(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StaveNote], state: Leftshift): Unit = js.native
  
  def postFormat(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.StaveNote]): Boolean = js.native
}
