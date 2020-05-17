package typingsSlinky.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Through[TJoinTableAttributes] extends js.Object {
  var through: TJoinTableAttributes = js.native
}

object Through {
  @scala.inline
  def apply[TJoinTableAttributes](through: TJoinTableAttributes): Through[TJoinTableAttributes] = {
    val __obj = js.Dynamic.literal(through = through.asInstanceOf[js.Any])
    __obj.asInstanceOf[Through[TJoinTableAttributes]]
  }
  @scala.inline
  implicit class ThroughOps[Self[tjointableattributes] <: Through[tjointableattributes], TJoinTableAttributes] (val x: Self[TJoinTableAttributes]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TJoinTableAttributes] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TJoinTableAttributes]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TJoinTableAttributes] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TJoinTableAttributes] with Other]
    @scala.inline
    def withThrough(value: TJoinTableAttributes): Self[TJoinTableAttributes] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("through")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

