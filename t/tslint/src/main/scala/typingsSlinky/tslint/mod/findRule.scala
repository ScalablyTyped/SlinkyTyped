package typingsSlinky.tslint.mod

import typingsSlinky.tslint.ruleMod.RuleConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "findRule")
@js.native
object findRule extends js.Object {
  
  def apply(name: String): js.UndefOr[RuleConstructor] = js.native
  def apply(name: String, rulesDirectories: String): js.UndefOr[RuleConstructor] = js.native
  def apply(name: String, rulesDirectories: js.Array[String]): js.UndefOr[RuleConstructor] = js.native
}
