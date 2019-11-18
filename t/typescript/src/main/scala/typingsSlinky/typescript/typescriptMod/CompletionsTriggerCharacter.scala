package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typescript.typescriptStrings.DOT
  - typings.typescript.typescriptStrings.BACKSLASH
  - typings.typescript.typescriptStrings._quote
  - typings.typescript.typescriptStrings.BACKTICK
  - typings.typescript.typescriptStrings.`/`
  - typings.typescript.typescriptStrings.`@`
  - typings.typescript.typescriptStrings.`<`
*/
trait CompletionsTriggerCharacter extends js.Object

object CompletionsTriggerCharacter {
  @scala.inline
  def _quote: typingsSlinky.typescript.typescriptStrings._quote = this.cast("'")
  @scala.inline
  def `/`: typingsSlinky.typescript.typescriptStrings.`/` = this.cast("/")
  @scala.inline
  def `<`: typingsSlinky.typescript.typescriptStrings.`<` = this.cast("<")
  @scala.inline
  def `@`: typingsSlinky.typescript.typescriptStrings.`@` = this.cast("@")
  @scala.inline
  def BACKSLASH: typingsSlinky.typescript.typescriptStrings.BACKSLASH = this.cast("\"")
  @scala.inline
  def BACKTICK: typingsSlinky.typescript.typescriptStrings.BACKTICK = this.cast("`")
  @scala.inline
  def DOT: typingsSlinky.typescript.typescriptStrings.DOT = this.cast(".")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

