package typingsSlinky.tabris.mod

import typingsSlinky.tabris.anon.AbsoluteX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetTouchEvent[Target] extends EventObject[Target] {
  val touches: js.Array[AbsoluteX] = js.native
}

