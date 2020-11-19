package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Accidental")
@js.native
class Accidental protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Accidental {
  def this(`type`: String) = this()
}
/* static members */
@JSGlobal("Vex.Flow.Accidental")
@js.native
object Accidental extends js.Object {
  
  val CATEGORY: String = js.native
  
  var DEBUG: Boolean = js.native
  
  def applyAccidentals(voices: js.Array[typingsSlinky.vexflow.Vex.Flow.Voice]): Unit = js.native
  def applyAccidentals(voices: js.Array[typingsSlinky.vexflow.Vex.Flow.Voice], keySignature: String): Unit = js.native
  
  def format(accidentals: js.Array[typingsSlinky.vexflow.Vex.Flow.Accidental], state: Leftshift): Unit = js.native
}
