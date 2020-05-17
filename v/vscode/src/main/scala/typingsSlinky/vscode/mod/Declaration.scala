package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscode.mod.Location
  - js.Array[typingsSlinky.vscode.mod.Location | typingsSlinky.vscode.mod.LocationLink]
*/
trait Declaration extends js.Object

object Declaration {
  @scala.inline
  implicit def apply(value: js.Array[Location | LocationLink]): Declaration = value.asInstanceOf[Declaration]
  @scala.inline
  implicit def apply(value: Location): Declaration = value.asInstanceOf[Declaration]
}

