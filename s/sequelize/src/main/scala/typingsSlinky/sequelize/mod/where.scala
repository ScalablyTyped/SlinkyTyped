package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait where extends js.Object {
  var attribute: js.Object = js.native
  var comparator: js.UndefOr[String] = js.native
  var logic: String | js.Object = js.native
}

object where {
  @scala.inline
  def apply(attribute: js.Object, logic: String | js.Object): where = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], logic = logic.asInstanceOf[js.Any])
    __obj.asInstanceOf[where]
  }
  @scala.inline
  implicit class whereOps[Self <: where] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogic(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparator")(js.undefined)
        ret
    }
  }
  
}

