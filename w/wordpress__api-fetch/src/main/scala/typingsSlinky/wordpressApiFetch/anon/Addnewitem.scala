package typingsSlinky.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Addnewitem extends js.Object {
  var add_new_item: String = js.native
  var add_or_remove_items: String | Null = js.native
  var all_items: String = js.native
  var back_to_items: String = js.native
  var choose_from_most_used: String | Null = js.native
  var edit_item: String = js.native
  var items_list: String = js.native
  var items_list_navigation: String = js.native
  var menu_name: String = js.native
  var most_used: String = js.native
  var name: String = js.native
  var name_admin_bar: String = js.native
  var new_item_name: String = js.native
  var no_terms: String = js.native
  var not_found: String = js.native
  var parent_item: String | Null = js.native
  var parent_item_colon: String | Null = js.native
  var popular_items: String | Null = js.native
  var search_items: String = js.native
  var separate_items_with_commas: String | Null = js.native
  var singular_name: String = js.native
  var update_item: String = js.native
  var view_item: String = js.native
}

object Addnewitem {
  @scala.inline
  def apply(
    add_new_item: String,
    all_items: String,
    back_to_items: String,
    edit_item: String,
    items_list: String,
    items_list_navigation: String,
    menu_name: String,
    most_used: String,
    name: String,
    name_admin_bar: String,
    new_item_name: String,
    no_terms: String,
    not_found: String,
    search_items: String,
    singular_name: String,
    update_item: String,
    view_item: String
  ): Addnewitem = {
    val __obj = js.Dynamic.literal(add_new_item = add_new_item.asInstanceOf[js.Any], all_items = all_items.asInstanceOf[js.Any], back_to_items = back_to_items.asInstanceOf[js.Any], edit_item = edit_item.asInstanceOf[js.Any], items_list = items_list.asInstanceOf[js.Any], items_list_navigation = items_list_navigation.asInstanceOf[js.Any], menu_name = menu_name.asInstanceOf[js.Any], most_used = most_used.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_admin_bar = name_admin_bar.asInstanceOf[js.Any], new_item_name = new_item_name.asInstanceOf[js.Any], no_terms = no_terms.asInstanceOf[js.Any], not_found = not_found.asInstanceOf[js.Any], search_items = search_items.asInstanceOf[js.Any], singular_name = singular_name.asInstanceOf[js.Any], update_item = update_item.asInstanceOf[js.Any], view_item = view_item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addnewitem]
  }
  @scala.inline
  implicit class AddnewitemOps[Self <: Addnewitem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd_new_item(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_new_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAll_items(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBack_to_items(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back_to_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit_item(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems_list(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items_list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems_list_navigation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items_list_navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMost_used(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("most_used")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName_admin_bar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name_admin_bar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNew_item_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new_item_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNo_terms(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_terms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNot_found(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not_found")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch_items(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingular_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singular_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate_item(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView_item(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdd_or_remove_items(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_or_remove_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdd_or_remove_itemsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add_or_remove_items")(null)
        ret
    }
    @scala.inline
    def withChoose_from_most_used(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choose_from_most_used")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChoose_from_most_usedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choose_from_most_used")(null)
        ret
    }
    @scala.inline
    def withParent_item(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_itemNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_item")(null)
        ret
    }
    @scala.inline
    def withParent_item_colon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_item_colon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent_item_colonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent_item_colon")(null)
        ret
    }
    @scala.inline
    def withPopular_items(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popular_items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopular_itemsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popular_items")(null)
        ret
    }
    @scala.inline
    def withSeparate_items_with_commas(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separate_items_with_commas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparate_items_with_commasNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separate_items_with_commas")(null)
        ret
    }
  }
  
}

