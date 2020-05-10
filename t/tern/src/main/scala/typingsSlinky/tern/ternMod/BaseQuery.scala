package typingsSlinky.tern.ternMod

import typingsSlinky.tern.ternStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseQuery extends js.Object {
  var docFormat: js.UndefOr[full] = js.native
  var lineCharPositions: js.UndefOr[Boolean] = js.native
  var `type`: String = js.native
}

object BaseQuery {
  @scala.inline
  def apply(`type`: String): BaseQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQuery]
  }
  @scala.inline
  implicit class BaseQueryOps[Self <: BaseQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocFormat(value: full): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLineCharPositions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCharPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCharPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCharPositions")(js.undefined)
        ret
    }
  }
  
}

