package typingsSlinky.vexflow.vexflowMod.Flow

import typingsSlinky.vexflow.Anon_Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Accidental")
@js.native
class Accidental protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Accidental {
  def this(`type`: String) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Accidental")
@js.native
object Accidental extends js.Object {
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  def applyAccidentals(voices: js.Array[typingsSlinky.vexflow.Vex.Flow.Voice]): Unit = js.native
  def applyAccidentals(voices: js.Array[typingsSlinky.vexflow.Vex.Flow.Voice], keySignature: String): Unit = js.native
  def format(accidentals: js.Array[typingsSlinky.vexflow.Vex.Flow.Accidental], state: Anon_Leftshift): Unit = js.native
}

