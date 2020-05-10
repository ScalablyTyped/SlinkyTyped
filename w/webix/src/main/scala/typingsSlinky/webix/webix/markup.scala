package typingsSlinky.webix.webix

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.webix.webix.ui.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait markup extends js.Object {
  var attribute: js.Any = js.native
  var dataTag: js.Any = js.native
  var namespace: js.Any = js.native
  def init(node: String, target: String): baseview = js.native
  def parse(data: js.Any, datatype: String): Unit = js.native
}

@JSGlobal("webix.markup")
@js.native
object markup extends TopLevel[markup]

