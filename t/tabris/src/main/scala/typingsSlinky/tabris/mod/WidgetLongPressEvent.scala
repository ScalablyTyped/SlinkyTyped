package typingsSlinky.tabris.mod

import typingsSlinky.tabris.anon.X
import typingsSlinky.tabris.tabrisStrings.cancel
import typingsSlinky.tabris.tabrisStrings.end
import typingsSlinky.tabris.tabrisStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetLongPressEvent[Target] extends EventObject[Target] {
  val state: start | end | cancel = js.native
  val touches: js.Array[X] = js.native
}

