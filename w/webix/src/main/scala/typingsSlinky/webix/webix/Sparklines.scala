package typingsSlinky.webix.webix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sparklines extends js.Object {
  var paddingX: Double = js.native
  var paddingY: Double = js.native
  var radius: Double = js.native
  def template(item: js.Any, common: String, data: js.Array[_], column: js.Any, index: Double): String = js.native
}

@JSGlobal("webix.Sparklines")
@js.native
object Sparklines extends TopLevel[Sparklines]

