package typingsSlinky.zui

import typingsSlinky.std.Event_
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * selectable
  */
@js.native
trait SelectableEvent extends Event_ {
  var selected: js.Array[Double] = js.native
  var selections: Map[Double, Boolean] = js.native
}

