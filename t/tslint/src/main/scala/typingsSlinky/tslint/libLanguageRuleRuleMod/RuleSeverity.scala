package typingsSlinky.tslint.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tslint.tslintStrings.warning
  - typings.tslint.tslintStrings.error
  - typings.tslint.tslintStrings.off
*/
trait RuleSeverity extends js.Object

object RuleSeverity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.tslint.tslintStrings.error = this.cast("error")
  @scala.inline
  def off: typingsSlinky.tslint.tslintStrings.off = this.cast("off")
  @scala.inline
  def warning: typingsSlinky.tslint.tslintStrings.warning = this.cast("warning")
}

