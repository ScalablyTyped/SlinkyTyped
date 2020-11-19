package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.anon.Leftshift
import typingsSlinky.vexflow.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Bend")
@js.native
class Bend protected ()
  extends typingsSlinky.vexflow.Vex.Flow.Bend {
  def this(text: String) = this()
  def this(text: String, release: Boolean) = this()
  def this(text: String, release: js.UndefOr[scala.Nothing], phrase: js.Array[Text]) = this()
  def this(text: String, release: Boolean, phrase: js.Array[Text]) = this()
}
/* static members */
@JSGlobal("Vex.Flow.Bend")
@js.native
object Bend extends js.Object {
  
  val CATEGORY: String = js.native
  
  var DOWN: Double = js.native
  
  var UP: Double = js.native
  
  def format(bends: js.Array[typingsSlinky.vexflow.Vex.Flow.Bend], state: Leftshift): Boolean = js.native
}
