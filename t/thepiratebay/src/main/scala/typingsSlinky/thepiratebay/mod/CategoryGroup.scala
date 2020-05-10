package typingsSlinky.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoryGroup extends Category {
  var subcategories: js.Array[Category] = js.native
}

object CategoryGroup {
  @scala.inline
  def apply(id: String, name: String, subcategories: js.Array[Category]): CategoryGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subcategories = subcategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryGroup]
  }
  @scala.inline
  implicit class CategoryGroupOps[Self <: CategoryGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubcategories(value: js.Array[Category]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subcategories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

