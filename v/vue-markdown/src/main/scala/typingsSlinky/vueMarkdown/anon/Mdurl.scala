package typingsSlinky.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mdurl extends js.Object {
  var mdurl: Decode = js.native
  var ucmicro: Any = js.native
}

object Mdurl {
  @scala.inline
  def apply(mdurl: Decode, ucmicro: Any): Mdurl = {
    val __obj = js.Dynamic.literal(mdurl = mdurl.asInstanceOf[js.Any], ucmicro = ucmicro.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mdurl]
  }
  @scala.inline
  implicit class MdurlOps[Self <: Mdurl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMdurl(value: Decode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdurl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUcmicro(value: Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ucmicro")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

