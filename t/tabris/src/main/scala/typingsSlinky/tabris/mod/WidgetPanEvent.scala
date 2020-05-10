package typingsSlinky.tabris.mod

import typingsSlinky.tabris.AnonX
import typingsSlinky.tabris.tabrisStrings.cancel
import typingsSlinky.tabris.tabrisStrings.change
import typingsSlinky.tabris.tabrisStrings.end
import typingsSlinky.tabris.tabrisStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetPanEvent[Target] extends EventObject[Target] {
  val state: start | change | end | cancel = js.native
  val touches: js.Array[AnonX] = js.native
  val translationX: Double = js.native
  val translationY: Double = js.native
  val velocityX: Double = js.native
  val velocityY: Double = js.native
}

