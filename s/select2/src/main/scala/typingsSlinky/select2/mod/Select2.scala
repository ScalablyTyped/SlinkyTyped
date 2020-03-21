package typingsSlinky.select2.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.select2.AnonOptions
import typingsSlinky.select2.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select2 extends js.Object {
  @JSName("$container")
  var $container: JQuery[HTMLElement] = js.native
  @JSName("$dropdown")
  var $dropdown: JQuery[HTMLElement] = js.native
  @JSName("$results")
  var $results: JQuery[HTMLElement] = js.native
  @JSName("$selection")
  var $selection: JQuery[HTMLElement] = js.native
  var dropdown: js.Any = js.native
  var id: String = js.native
  var options: AnonOptions = js.native
  var results: js.Any = js.native
  var selection: js.Any = js.native
}

