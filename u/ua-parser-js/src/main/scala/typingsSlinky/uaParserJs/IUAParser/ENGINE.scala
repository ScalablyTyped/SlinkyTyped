package typingsSlinky.uaParserJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ENGINE extends js.Object {
  var NAME: String = js.native
  var VERSION: String = js.native
}

object ENGINE {
  @scala.inline
  def apply(NAME: String, VERSION: String): ENGINE = {
    val __obj = js.Dynamic.literal(NAME = NAME.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[ENGINE]
  }
  @scala.inline
  implicit class ENGINEOps[Self <: ENGINE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVERSION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

