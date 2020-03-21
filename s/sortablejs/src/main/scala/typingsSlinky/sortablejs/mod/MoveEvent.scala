package typingsSlinky.sortablejs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveEvent extends Event_ {
  var dragged: HTMLElement = js.native
  var draggedRect: DOMRect = js.native
  var from: HTMLElement = js.native
  /**
    * element on which have guided
    */
  var related: HTMLElement = js.native
  var relatedRect: DOMRect = js.native
  var to: HTMLElement = js.native
  var willInsertAfter: js.UndefOr[Boolean] = js.native
}

