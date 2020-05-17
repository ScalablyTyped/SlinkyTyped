package typingsSlinky.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stylelint.stylelintStrings.json
  - typingsSlinky.stylelint.stylelintStrings.string
  - typingsSlinky.stylelint.stylelintStrings.verbose
  - typingsSlinky.stylelint.stylelintStrings.compact
  - typingsSlinky.stylelint.stylelintStrings.unix
  - js.Function1[/ * results * / js.Array[typingsSlinky.stylelint.mod.LintResult], java.lang.String]
*/
trait FormatterType extends js.Object

object FormatterType {
  @scala.inline
  def json: typingsSlinky.stylelint.stylelintStrings.json = "json".asInstanceOf[typingsSlinky.stylelint.stylelintStrings.json]
  @scala.inline
  def string: typingsSlinky.stylelint.stylelintStrings.string = "string".asInstanceOf[typingsSlinky.stylelint.stylelintStrings.string]
  @scala.inline
  def verbose: typingsSlinky.stylelint.stylelintStrings.verbose = "verbose".asInstanceOf[typingsSlinky.stylelint.stylelintStrings.verbose]
  @scala.inline
  def compact: typingsSlinky.stylelint.stylelintStrings.compact = "compact".asInstanceOf[typingsSlinky.stylelint.stylelintStrings.compact]
  @scala.inline
  def unix: typingsSlinky.stylelint.stylelintStrings.unix = "unix".asInstanceOf[typingsSlinky.stylelint.stylelintStrings.unix]
  @scala.inline
  implicit def apply(value: js.Function1[/* results */ js.Array[LintResult], String]): FormatterType = value.asInstanceOf[FormatterType]
}

