package typingsSlinky.xml

import typingsSlinky.xml.mod._XmlDesc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCdata extends _XmlDesc {
  var _cdata: String = js.native
}

object AnonCdata {
  @scala.inline
  def apply(_cdata: String): AnonCdata = {
    val __obj = js.Dynamic.literal(_cdata = _cdata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCdata]
  }
  @scala.inline
  implicit class AnonCdataOps[Self <: AnonCdata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_cdata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_cdata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

