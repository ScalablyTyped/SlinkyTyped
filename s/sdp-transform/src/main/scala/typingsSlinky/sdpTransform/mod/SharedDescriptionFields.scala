package typingsSlinky.sdpTransform.mod

import typingsSlinky.sdpTransform.AnonIp
import typingsSlinky.sdpTransform.AnonLimit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedDescriptionFields extends js.Object {
  // b=AS:4000
  var bandwidth: js.UndefOr[js.Array[AnonLimit]] = js.native
  // c=IN IP4 10.47.197.26
  var connection: js.UndefOr[AnonIp] = js.native
  // i=
  var description: js.UndefOr[String] = js.native
}

object SharedDescriptionFields {
  @scala.inline
  def apply(): SharedDescriptionFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDescriptionFields]
  }
  @scala.inline
  implicit class SharedDescriptionFieldsOps[Self <: SharedDescriptionFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandwidth(value: js.Array[AnonLimit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection(value: AnonIp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

