package typingsSlinky.wxServerSdk.mod

import typingsSlinky.wxServerSdk.wxServerSdkStrings.i
import typingsSlinky.wxServerSdk.wxServerSdkStrings.m
import typingsSlinky.wxServerSdk.wxServerSdkStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpOptions extends js.Object {
   // 正则表达式，字符串形式
  var options: i | m | s = js.native
  var regexp: String = js.native
}

object RegExpOptions {
  @scala.inline
  def apply(options: i | m | s, regexp: String): RegExpOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpOptions]
  }
  @scala.inline
  implicit class RegExpOptionsOps[Self <: RegExpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: i | m | s): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegexp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

