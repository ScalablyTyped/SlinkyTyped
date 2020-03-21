package typingsSlinky.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tslint.tslintStrings.functionality
  - typingsSlinky.tslint.tslintStrings.maintainability
  - typingsSlinky.tslint.tslintStrings.style
  - typingsSlinky.tslint.tslintStrings.typescript
  - typingsSlinky.tslint.tslintStrings.formatting
*/
trait RuleType extends js.Object

object RuleType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def formatting: typingsSlinky.tslint.tslintStrings.formatting = this.cast("formatting")
  @scala.inline
  def functionality: typingsSlinky.tslint.tslintStrings.functionality = this.cast("functionality")
  @scala.inline
  def maintainability: typingsSlinky.tslint.tslintStrings.maintainability = this.cast("maintainability")
  @scala.inline
  def style: typingsSlinky.tslint.tslintStrings.style = this.cast("style")
  @scala.inline
  def typescript: typingsSlinky.tslint.tslintStrings.typescript = this.cast("typescript")
}

