package typingsSlinky.sortablejs.pluginsMod

import typingsSlinky.sortablejs.mod.SortableEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSpillOptions extends js.Object {
  /**
    * Called when either `revertOnSpill` or `RemoveOnSpill` plugins are enabled.
    */
  var onSpill: js.UndefOr[js.Function1[/* evt */ SortableEvent, Unit]] = js.native
  /**
    * This plugin, when enabled,
    * will cause the dragged item to be removed from the DOM if it is *spilled*
    * (ie. it is dropped outside of a valid Sortable drop target)
    */
  var removeOnSpill: js.UndefOr[Boolean] = js.native
  /**
    * This plugin, when enabled,
    * will cause the dragged item to be reverted to it's original position if it is *spilled*
    * (ie. it is dropped outside of a valid Sortable drop target)
    */
  var revertOnSpill: js.UndefOr[Boolean] = js.native
}

object OnSpillOptions {
  @scala.inline
  def apply(): OnSpillOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnSpillOptions]
  }
  @scala.inline
  implicit class OnSpillOptionsOps[Self <: OnSpillOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSpill(value: /* evt */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSpill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSpill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSpill")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveOnSpill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnSpill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveOnSpill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnSpill")(js.undefined)
        ret
    }
    @scala.inline
    def withRevertOnSpill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertOnSpill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevertOnSpill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertOnSpill")(js.undefined)
        ret
    }
  }
  
}

