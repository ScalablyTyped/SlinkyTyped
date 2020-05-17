package typingsSlinky.w2ui.W2UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[/ * e * / typingsSlinky.w2ui.W2UI.W2Event, scala.Unit]
  - js.Function2[/ * id * / java.lang.String, / * e * / typingsSlinky.w2ui.W2UI.W2Event, scala.Unit]
*/
trait W2EventHandler extends js.Object

object W2EventHandler {
  @scala.inline
  implicit def apply(value: js.Function1[/* e */ W2Event, Unit]): W2EventHandler = value.asInstanceOf[W2EventHandler]
  @scala.inline
  implicit def apply(value: js.Function2[/* id */ String, /* e */ W2Event, Unit]): W2EventHandler = value.asInstanceOf[W2EventHandler]
}

