package typingsSlinky.stylelint.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.postcss.mod.Result
import typingsSlinky.stylelint.AnonIndex
import typingsSlinky.stylelint.AnonRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylelint", "utils")
@js.native
object utils extends js.Object {
  def checkAgainstRule(options: AnonRoot, callback: js.Function1[/* warning */ String, Unit]): Unit = js.native
  def report(violation: AnonIndex): Unit = js.native
  def ruleMessages[T /* <: StringDictionary[RuleMessageValue] */](ruleName: String, messages: T): T = js.native
  def validateOptions(result: Result, ruleName: String, options: ValidateOptionsAssertion*): Boolean = js.native
}

