package typingsSlinky.vueMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMdurl extends js.Object {
  var mdurl: AnonDecode = js.native
  var ucmicro: AnonAny = js.native
}

object AnonMdurl {
  @scala.inline
  def apply(mdurl: AnonDecode, ucmicro: AnonAny): AnonMdurl = {
    val __obj = js.Dynamic.literal(mdurl = mdurl.asInstanceOf[js.Any], ucmicro = ucmicro.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMdurl]
  }
  @scala.inline
  implicit class AnonMdurlOps[Self <: AnonMdurl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMdurl(value: AnonDecode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdurl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUcmicro(value: AnonAny): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ucmicro")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

