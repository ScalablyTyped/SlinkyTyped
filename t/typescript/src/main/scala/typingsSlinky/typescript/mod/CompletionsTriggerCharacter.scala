package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.typescriptStrings.Dot
  - typingsSlinky.typescript.typescriptStrings.Quotationmark
  - typingsSlinky.typescript.typescriptStrings.Apostrophe
  - typingsSlinky.typescript.typescriptStrings.Graveaccent
  - typingsSlinky.typescript.typescriptStrings.Slash
  - typingsSlinky.typescript.typescriptStrings.`@`
  - typingsSlinky.typescript.typescriptStrings.Lessthansign
  - typingsSlinky.typescript.typescriptStrings.Numbersign
*/
trait CompletionsTriggerCharacter extends js.Object

object CompletionsTriggerCharacter {
  @scala.inline
  def `@`: typingsSlinky.typescript.typescriptStrings.`@` = this.cast("@")
  @scala.inline
  def Apostrophe: typingsSlinky.typescript.typescriptStrings.Apostrophe = this.cast("'")
  @scala.inline
  def Dot: typingsSlinky.typescript.typescriptStrings.Dot = this.cast(".")
  @scala.inline
  def Graveaccent: typingsSlinky.typescript.typescriptStrings.Graveaccent = this.cast("`")
  @scala.inline
  def Lessthansign: typingsSlinky.typescript.typescriptStrings.Lessthansign = this.cast("<")
  @scala.inline
  def Numbersign: typingsSlinky.typescript.typescriptStrings.Numbersign = this.cast("#")
  @scala.inline
  def Quotationmark: typingsSlinky.typescript.typescriptStrings.Quotationmark = this.cast("\"")
  @scala.inline
  def Slash: typingsSlinky.typescript.typescriptStrings.Slash = this.cast("/")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

