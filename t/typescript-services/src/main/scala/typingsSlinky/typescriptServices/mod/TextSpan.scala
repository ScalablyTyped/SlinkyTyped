package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "TextSpan")
@js.native
class TextSpan protected ()
  extends typingsSlinky.typescriptServices.TypeScript.TextSpan {
  def this(start: Double, length: Double) = this()
}
/* static members */
@JSImport("typescript-services", "TextSpan")
@js.native
object TextSpan extends js.Object {
  
  def fromBounds(start: Double, end: Double): typingsSlinky.typescriptServices.TypeScript.TextSpan = js.native
}
