package typingsSlinky.sixRuntime.Six.plugins.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait runtimeConf extends js.Object {
  var codeKey: String = js.native
  var dataKey: String = js.native
  var msgKey: String = js.native
}

object runtimeConf {
  @scala.inline
  def apply(codeKey: String, dataKey: String, msgKey: String): runtimeConf = {
    val __obj = js.Dynamic.literal(codeKey = codeKey.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], msgKey = msgKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[runtimeConf]
  }
  @scala.inline
  implicit class runtimeConfOps[Self <: runtimeConf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsgKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

