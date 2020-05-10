package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplainList extends js.Object {
  var fcldbid: Double = js.native
  var fname: String = js.native
  var message: String = js.native
  var tcldbid: Double = js.native
  var timestamp: Double = js.native
  var tname: String = js.native
}

object ComplainList {
  @scala.inline
  def apply(fcldbid: Double, fname: String, message: String, tcldbid: Double, timestamp: Double, tname: String): ComplainList = {
    val __obj = js.Dynamic.literal(fcldbid = fcldbid.asInstanceOf[js.Any], fname = fname.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tcldbid = tcldbid.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tname = tname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplainList]
  }
  @scala.inline
  implicit class ComplainListOps[Self <: ComplainList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFcldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTcldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

