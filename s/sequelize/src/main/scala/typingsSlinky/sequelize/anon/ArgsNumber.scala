package typingsSlinky.sequelize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgsNumber extends js.Object {
  var args: Double = js.native
  var msg: String = js.native
}

object ArgsNumber {
  @scala.inline
  def apply(args: Double, msg: String): ArgsNumber = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsNumber]
  }
  @scala.inline
  implicit class ArgsNumberOps[Self <: ArgsNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

