package typingsSlinky.vegaTypings.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait As extends js.Object {
  var as: js.Array[String] = js.native
  var cross: js.UndefOr[Boolean] = js.native
  var fields: js.Array[String] = js.native
  var ops: js.Array[String] = js.native
}

object As {
  @scala.inline
  def apply(as: js.Array[String], fields: js.Array[String], ops: js.Array[String]): As = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any])
    __obj.asInstanceOf[As]
  }
  @scala.inline
  implicit class AsOps[Self <: As] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCross(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCross: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross")(js.undefined)
        ret
    }
  }
  
}

