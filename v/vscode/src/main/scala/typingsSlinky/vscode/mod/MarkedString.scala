package typingsSlinky.vscode.mod

import typingsSlinky.vscode.anon.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscode.mod.MarkdownString
  - java.lang.String
  - typingsSlinky.vscode.anon.Language
*/
trait MarkedString extends js.Object

object MarkedString {
  @scala.inline
  implicit def apply(value: Language): MarkedString = value.asInstanceOf[MarkedString]
  @scala.inline
  implicit def apply(value: MarkdownString): MarkedString = value.asInstanceOf[MarkedString]
  @scala.inline
  implicit def apply(value: String): MarkedString = value.asInstanceOf[MarkedString]
}

