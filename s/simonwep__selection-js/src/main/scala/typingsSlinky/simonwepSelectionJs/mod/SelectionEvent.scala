package typingsSlinky.simonwepSelectionJs.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.simonwepSelectionJs.anon.Added
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionEvent extends js.Object {
  var area: Element = js.native
  var changed: Added = js.native
  var inst: Selection = js.native
  var oe: MouseEvent | TouchEvent = js.native
  var selected: js.Array[Element] = js.native
}

object SelectionEvent {
  @scala.inline
  def apply(
    area: Element,
    changed: Added,
    inst: Selection,
    oe: MouseEvent | TouchEvent,
    selected: js.Array[Element]
  ): SelectionEvent = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], inst = inst.asInstanceOf[js.Any], oe = oe.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionEvent]
  }
  @scala.inline
  implicit class SelectionEventOps[Self <: SelectionEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChanged(value: Added): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInst(value: Selection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOeMouseEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOeTouchEvent(value: TouchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOe(value: MouseEvent | TouchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

