package typingsSlinky.tslint.libConfigurationMod

import typingsSlinky.std.Map
import typingsSlinky.std.Partial
import typingsSlinky.tslint.libLanguageRuleRuleMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/configuration", "convertRuleOptions")
@js.native
object convertRuleOptions extends js.Object {
  def apply(ruleConfiguration: Map[String, Partial[IOptions]]): js.Array[IOptions] = js.native
}

