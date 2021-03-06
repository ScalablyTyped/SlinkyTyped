package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.StringNumber")
@js.native
class StringNumber protected ()
  extends typingsSlinky.vexflow.Vex.Flow.StringNumber {
  def this(number: String) = this()
  // actually this is not really consistent in the vexflow code "ctx.measureText(this.string_number).width" looks
  // like it is a string. But from the use of it it might be a number ?!
  def this(number: Double) = this()
}
object StringNumber {
  
  @JSGlobal("Vex.Flow.StringNumber.CATEGORY")
  @js.native
  val CATEGORY: String = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.StringNumber.format")
  @js.native
  def format(nums: js.Array[typingsSlinky.vexflow.Vex.Flow.StringNumber], state: Leftshift): Boolean = js.native
}
