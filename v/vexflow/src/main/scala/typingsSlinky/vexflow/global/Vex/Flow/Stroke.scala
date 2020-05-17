package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.Vex.Flow.Stroke.Type
import typingsSlinky.vexflow.anon.Allvoices
import typingsSlinky.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Stroke")
@js.native
class Stroke protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Stroke {
  def this(`type`: Type) = this()
  def this(`type`: Type, options: Allvoices) = this()
}

/* static members */
@JSGlobal("Vex.Flow.Stroke")
@js.native
object Stroke extends js.Object {
  val CATEGORY: String = js.native
  def format(strokes: js.Array[typingsSlinky.vexflow.Vex.Flow.Stroke], state: Leftshift): Boolean = js.native
}

