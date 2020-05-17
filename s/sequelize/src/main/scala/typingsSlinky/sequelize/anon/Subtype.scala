package typingsSlinky.sequelize.anon

import typingsSlinky.sequelize.mod.DataTypeAbstract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subtype extends js.Object {
  var subtype: DataTypeAbstract = js.native
}

object Subtype {
  @scala.inline
  def apply(subtype: DataTypeAbstract): Subtype = {
    val __obj = js.Dynamic.literal(subtype = subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtype]
  }
  @scala.inline
  implicit class SubtypeOps[Self <: Subtype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubtype(value: DataTypeAbstract): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

