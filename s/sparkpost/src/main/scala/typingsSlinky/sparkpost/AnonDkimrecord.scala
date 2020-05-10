package typingsSlinky.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDkimrecord extends js.Object {
  var dkim_record: String = js.native
  var spf_record: String = js.native
}

object AnonDkimrecord {
  @scala.inline
  def apply(dkim_record: String, spf_record: String): AnonDkimrecord = {
    val __obj = js.Dynamic.literal(dkim_record = dkim_record.asInstanceOf[js.Any], spf_record = spf_record.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDkimrecord]
  }
  @scala.inline
  implicit class AnonDkimrecordOps[Self <: AnonDkimrecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDkim_record(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkim_record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpf_record(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spf_record")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

