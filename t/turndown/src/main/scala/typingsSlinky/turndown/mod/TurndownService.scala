package typingsSlinky.turndown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TurndownService extends js.Object {
  
  def addRule(key: String, rule: Rule): this.type = js.native
  
  def escape(str: String): String = js.native
  
  def keep(filter: Filter): this.type = js.native
  
  var options: Options = js.native
  
  def remove(filter: Filter): this.type = js.native
  
  var rules: Rules = js.native
  
  def turndown(html: String): String = js.native
  def turndown(html: Node): String = js.native
  
  def use(plugins: js.Array[Plugin]): this.type = js.native
  def use(plugins: Plugin): this.type = js.native
}
