package typingsSlinky.vexflow.vexflowMod.Flow

import typingsSlinky.vexflow.Anon_Allvoices
import typingsSlinky.vexflow.Anon_Leftshift
import typingsSlinky.vexflow.Vex.Flow.Stroke.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Stroke")
@js.native
class Stroke protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Stroke {
  def this(`type`: Type) = this()
  def this(`type`: Type, options: Anon_Allvoices) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Stroke")
@js.native
object Stroke extends js.Object {
  val CATEGORY: String = js.native
  def format(strokes: js.Array[typingsSlinky.vexflow.Vex.Flow.Stroke], state: Anon_Leftshift): Boolean = js.native
}

