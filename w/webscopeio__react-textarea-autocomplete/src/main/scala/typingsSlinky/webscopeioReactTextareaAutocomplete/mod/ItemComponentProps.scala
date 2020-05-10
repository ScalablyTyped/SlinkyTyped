package typingsSlinky.webscopeioReactTextareaAutocomplete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemComponentProps[TItem] extends js.Object {
  var entity: TItem = js.native
  var selected: Boolean = js.native
}

object ItemComponentProps {
  @scala.inline
  def apply[TItem](entity: TItem, selected: Boolean): ItemComponentProps[TItem] = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemComponentProps[TItem]]
  }
  @scala.inline
  implicit class ItemComponentPropsOps[Self[titem] <: ItemComponentProps[titem], TItem] (val x: Self[TItem]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TItem] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TItem]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TItem] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TItem] with Other]
    @scala.inline
    def withEntity(value: TItem): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self[TItem] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

