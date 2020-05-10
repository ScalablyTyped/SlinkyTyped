package typingsSlinky.xml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEncoding extends js.Object {
  var encoding: js.UndefOr[String] = js.native
  var standalone: js.UndefOr[String] = js.native
}

object AnonEncoding {
  @scala.inline
  def apply(): AnonEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEncoding]
  }
  @scala.inline
  implicit class AnonEncodingOps[Self <: AnonEncoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withStandalone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandalone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(js.undefined)
        ret
    }
  }
  
}

