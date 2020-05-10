package typingsSlinky.yogLog.mod

import typingsSlinky.yogLog.yogLogStrings.ACCESS
import typingsSlinky.yogLog.yogLogStrings.ACCESS_ERROR
import typingsSlinky.yogLog.yogLogStrings.DEBUG
import typingsSlinky.yogLog.yogLogStrings.FATAL
import typingsSlinky.yogLog.yogLogStrings.NOTICE
import typingsSlinky.yogLog.yogLogStrings.TRACE
import typingsSlinky.yogLog.yogLogStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LEVELS extends js.Object {
  // 访问日志
  var `0`: ACCESS = js.native
  // 应用日志等级 ODP格式
  var `1`: FATAL = js.native
  var `16`: DEBUG = js.native
  var `2`: WARNING = js.native
  var `3`: ACCESS_ERROR = js.native
  var `4`: NOTICE = js.native
  var `8`: TRACE = js.native
}

object LEVELS {
  @scala.inline
  def apply(`0`: ACCESS, `1`: FATAL, `16`: DEBUG, `2`: WARNING, `3`: ACCESS_ERROR, `4`: NOTICE, `8`: TRACE): LEVELS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("16")(`16`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LEVELS]
  }
  @scala.inline
  implicit class LEVELSOps[Self <: LEVELS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with0(value: ACCESS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with1(value: FATAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with16(value: DEBUG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("16")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with2(value: WARNING): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with3(value: ACCESS_ERROR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with4(value: NOTICE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with8(value: TRACE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("8")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

