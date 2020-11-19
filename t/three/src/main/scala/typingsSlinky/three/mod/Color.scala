package typingsSlinky.three.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "Color")
@js.native
class Color ()
  extends typingsSlinky.three.colorMod.Color {
  def this(color: String) = this()
  def this(color: Double) = this()
  def this(color: typingsSlinky.three.colorMod.Color) = this()
  def this(r: Double, g: Double, b: Double) = this()
}
/* static members */
@JSImport("three", "Color")
@js.native
object Color extends js.Object {
  
  /**
  	 * List of X11 color names.
  	 */
  var NAMES: Record[String, Double] = js.native
}
