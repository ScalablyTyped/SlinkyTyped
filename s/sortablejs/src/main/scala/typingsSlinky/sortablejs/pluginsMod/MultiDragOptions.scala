package typingsSlinky.sortablejs.pluginsMod

import typingsSlinky.sortablejs.mod.SortableEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiDragOptions extends js.Object {
  /**
    * Enable the plugin
    */
  var multiDrag: js.UndefOr[Boolean] = js.native
  /**
    * Key that must be down for items to be selected
    */
  // todo: create a type
  // todo: check source code for type
  var multiDragKey: js.UndefOr[Null] = js.native
  /**
    * Called when an item is deselected
    */
  var onDeselect: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  /**
    * Called when an item is selected
    */
  var onSelect: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
  /**
    * Class name for selected item
    */
  var selectedClass: js.UndefOr[String] = js.native
}

object MultiDragOptions {
  @scala.inline
  def apply(): MultiDragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiDragOptions]
  }
  @scala.inline
  implicit class MultiDragOptionsOps[Self <: MultiDragOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiDragKey(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiDragKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiDragKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiDragKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiDragKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiDragKey")(null)
        ret
    }
    @scala.inline
    def withOnDeselect(value: /* event */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* event */ SortableEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedClass")(js.undefined)
        ret
    }
  }
  
}

