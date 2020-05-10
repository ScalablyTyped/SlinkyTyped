package typingsSlinky.sortablejs.mod

import typingsSlinky.sortablejs.pluginsMod.AutoScrollOptions
import typingsSlinky.sortablejs.pluginsMod.MultiDragOptions
import typingsSlinky.sortablejs.pluginsMod.OnSpillOptions
import typingsSlinky.sortablejs.pluginsMod.SwapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends SortableOptions
     with AutoScrollOptions
     with MultiDragOptions
     with OnSpillOptions
     with SwapOptions

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
}

