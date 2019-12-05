package typingsSlinky.webix.webix

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Touch extends js.Object {
  var config: js.Any
  def disable(): Unit
  def enable(): Unit
  def limit(mode: Boolean): Unit
  def scrollTo(node: HTMLElement, x: Double, y: Double, speed: String): Unit
}

@JSGlobal("webix.Touch")
@js.native
object Touch extends TopLevel[Touch]

