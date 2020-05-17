package typingsSlinky.vexflow.mod.Flow

import typingsSlinky.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.Annotation")
@js.native
class Annotation protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Annotation {
  def this(text: String) = this()
}

/* static members */
@JSImport("vexflow", "Flow.Annotation")
@js.native
object Annotation extends js.Object {
  val CATEGORY: String = js.native
  var DEBUG: Boolean = js.native
  def format(annotations: js.Array[typingsSlinky.vexflow.Vex.Flow.Annotation], state: Leftshift): Boolean = js.native
}

