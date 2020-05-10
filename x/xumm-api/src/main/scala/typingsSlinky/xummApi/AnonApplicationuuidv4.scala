package typingsSlinky.xummApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApplicationuuidv4 extends js.Object {
  var application_uuidv4: String = js.native
  var payload_uuidv4: String = js.native
  var url: String = js.native
}

object AnonApplicationuuidv4 {
  @scala.inline
  def apply(application_uuidv4: String, payload_uuidv4: String, url: String): AnonApplicationuuidv4 = {
    val __obj = js.Dynamic.literal(application_uuidv4 = application_uuidv4.asInstanceOf[js.Any], payload_uuidv4 = payload_uuidv4.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplicationuuidv4]
  }
  @scala.inline
  implicit class AnonApplicationuuidv4Ops[Self <: AnonApplicationuuidv4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication_uuidv4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("application_uuidv4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload_uuidv4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload_uuidv4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

