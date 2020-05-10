package typingsSlinky.sdpTransform.mod

import typingsSlinky.sdpTransform.AnonAddressTypes
import typingsSlinky.sdpTransform.AnonHash
import typingsSlinky.sdpTransform.AnonUri
import typingsSlinky.sdpTransform.AnonValueString
import typingsSlinky.sdpTransform.sdpTransformStrings.inactive
import typingsSlinky.sdpTransform.sdpTransformStrings.recvonly
import typingsSlinky.sdpTransform.sdpTransformStrings.sendonly
import typingsSlinky.sdpTransform.sdpTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedAttributes extends js.Object {
  // a=control
  var control: js.UndefOr[String] = js.native
  // a=sendrecv
  // a=recvonly
  // a=sendonly
  // a=inactive
  var direction: js.UndefOr[sendrecv | recvonly | sendonly | inactive] = js.native
  // a=extmap
  var ext: js.UndefOr[js.Array[AnonUri]] = js.native
  var fingerprint: js.UndefOr[AnonHash] = js.native
  var icePwd: js.UndefOr[String] = js.native
  var iceUfrag: js.UndefOr[String] = js.native
  var invalid: js.UndefOr[js.Array[AnonValueString]] = js.native
  // a=setup
  var setup: js.UndefOr[String] = js.native
  // a=source-filter: incl IN IP4 239.5.2.31 10.1.15.5
  var sourceFilter: js.UndefOr[AnonAddressTypes] = js.native
}

object SharedAttributes {
  @scala.inline
  def apply(): SharedAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedAttributes]
  }
  @scala.inline
  implicit class SharedAttributesOps[Self <: SharedAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: sendrecv | recvonly | sendonly | inactive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withExt(value: js.Array[AnonUri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: AnonHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withIcePwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icePwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcePwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icePwd")(js.undefined)
        ret
    }
    @scala.inline
    def withIceUfrag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceUfrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceUfrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceUfrag")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalid(value: js.Array[AnonValueString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setup")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFilter(value: AnonAddressTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFilter")(js.undefined)
        ret
    }
  }
  
}

