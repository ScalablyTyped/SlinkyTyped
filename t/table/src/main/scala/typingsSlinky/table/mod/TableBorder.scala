package typingsSlinky.table.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBorder extends js.Object {
  var bodyJoin: js.UndefOr[String] = js.native
  var bodyLeft: js.UndefOr[String] = js.native
  var bodyRight: js.UndefOr[String] = js.native
  var bottomBody: js.UndefOr[String] = js.native
  var bottomJoin: js.UndefOr[String] = js.native
  var bottomLeft: js.UndefOr[String] = js.native
  var bottomRight: js.UndefOr[String] = js.native
  var joinBody: js.UndefOr[String] = js.native
  var joinJoin: js.UndefOr[String] = js.native
  var joinLeft: js.UndefOr[String] = js.native
  var joinRight: js.UndefOr[String] = js.native
  var topBody: js.UndefOr[String] = js.native
  var topJoin: js.UndefOr[String] = js.native
  var topLeft: js.UndefOr[String] = js.native
  var topRight: js.UndefOr[String] = js.native
}

object TableBorder {
  @scala.inline
  def apply(): TableBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorder]
  }
  @scala.inline
  implicit class TableBorderOps[Self <: TableBorder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyJoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyRight")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomBody")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomJoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinBody")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinJoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withJoinRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJoinRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joinRight")(js.undefined)
        ret
    }
    @scala.inline
    def withTopBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBody")(js.undefined)
        ret
    }
    @scala.inline
    def withTopJoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withTopLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withTopRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(js.undefined)
        ret
    }
  }
  
}

