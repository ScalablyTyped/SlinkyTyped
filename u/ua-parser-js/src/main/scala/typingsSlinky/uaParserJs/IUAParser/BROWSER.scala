package typingsSlinky.uaParserJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BROWSER extends js.Object {
  /**
    * @deprecated
    */
  var MAJOR: String = js.native
  var NAME: String = js.native
  var VERSION: String = js.native
}

object BROWSER {
  @scala.inline
  def apply(MAJOR: String, NAME: String, VERSION: String): BROWSER = {
    val __obj = js.Dynamic.literal(MAJOR = MAJOR.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[BROWSER]
  }
  @scala.inline
  implicit class BROWSEROps[Self <: BROWSER] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMAJOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAJOR")(value.asInstanceOf[js.Any])
        ret
    }
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

