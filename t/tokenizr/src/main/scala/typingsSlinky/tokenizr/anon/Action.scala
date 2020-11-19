package typingsSlinky.tokenizr.anon

import typingsSlinky.std.RegExpExecArray
import typingsSlinky.tokenizr.mod.ActionContext
import typingsSlinky.tokenizr.mod.RuleAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  
  def action(ctx: ActionContext, found: RegExpExecArray): Unit = js.native
  @JSName("action")
  var action_Original: RuleAction = js.native
  
  var name: String = js.native
  
  var pattern: js.RegExp = js.native
  
  var state: String = js.native
}
