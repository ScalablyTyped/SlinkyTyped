package typingsSlinky.sortablejs.sortablejsMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableEvent extends Event {
  @JSName("clone")
  var clone_FSortableEvent: HTMLElement = js.native
  /**
    * previous list
    */
  var from: HTMLElement = js.native
  /**
    * dragged element
    */
  var item: HTMLElement = js.native
  /**
    * new index within parent
    */
  var newIndex: js.UndefOr[Double] = js.native
  /**
    * old index within parent
    */
  var oldIndex: js.UndefOr[Double] = js.native
  @JSName("target")
  var target_SortableEvent: HTMLElement = js.native
  /**
    * list, in which moved element.
    */
  var to: HTMLElement = js.native
}

