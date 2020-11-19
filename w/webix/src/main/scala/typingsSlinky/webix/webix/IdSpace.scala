package typingsSlinky.webix.webix

import typingsSlinky.webix.webix.ui.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdSpace extends js.Object {
  
  @JSName("$$")
  var DollarDollar: js.Any = js.native
  
  def innerId(id: String): Double | String = js.native
  def innerId(id: Double): Double | String = js.native
  
  def ui(view: js.Any): baseview = js.native
}
