package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscode.mod.DocumentFilter
  - java.lang.String
  - js.Array[typingsSlinky.vscode.mod.DocumentFilter | java.lang.String]
*/
trait DocumentSelector extends js.Object

object DocumentSelector {
  @scala.inline
  implicit def apply(value: js.Array[DocumentFilter | String]): DocumentSelector = value.asInstanceOf[DocumentSelector]
  @scala.inline
  implicit def apply(value: DocumentFilter): DocumentSelector = value.asInstanceOf[DocumentSelector]
  @scala.inline
  implicit def apply(value: String): DocumentSelector = value.asInstanceOf[DocumentSelector]
}

