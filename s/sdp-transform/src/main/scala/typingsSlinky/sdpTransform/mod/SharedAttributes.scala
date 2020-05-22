package typingsSlinky.sdpTransform.mod

import typingsSlinky.sdpTransform.anon.AddressTypes
import typingsSlinky.sdpTransform.anon.Hash
import typingsSlinky.sdpTransform.anon.Uri
import typingsSlinky.sdpTransform.anon.ValueString
import typingsSlinky.sdpTransform.sdpTransformStrings.inactive
import typingsSlinky.sdpTransform.sdpTransformStrings.recvonly
import typingsSlinky.sdpTransform.sdpTransformStrings.sendonly
import typingsSlinky.sdpTransform.sdpTransformStrings.sendrecv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedAttributes extends js.Object {
  // a=control
  var control: js.UndefOr[String] = js.undefined
  // a=sendrecv
  // a=recvonly
  // a=sendonly
  // a=inactive
  var direction: js.UndefOr[sendrecv | recvonly | sendonly | inactive] = js.undefined
  // a=extmap
  var ext: js.UndefOr[js.Array[Uri]] = js.undefined
  var fingerprint: js.UndefOr[Hash] = js.undefined
  var icePwd: js.UndefOr[String] = js.undefined
  var iceUfrag: js.UndefOr[String] = js.undefined
  var invalid: js.UndefOr[js.Array[ValueString]] = js.undefined
  // a=setup
  var setup: js.UndefOr[String] = js.undefined
  // a=source-filter: incl IN IP4 239.5.2.31 10.1.15.5
  var sourceFilter: js.UndefOr[AddressTypes] = js.undefined
}

object SharedAttributes {
  @scala.inline
  def apply(
    control: String = null,
    direction: sendrecv | recvonly | sendonly | inactive = null,
    ext: js.Array[Uri] = null,
    fingerprint: Hash = null,
    icePwd: String = null,
    iceUfrag: String = null,
    invalid: js.Array[ValueString] = null,
    setup: String = null,
    sourceFilter: AddressTypes = null
  ): SharedAttributes = {
    val __obj = js.Dynamic.literal()
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (icePwd != null) __obj.updateDynamic("icePwd")(icePwd.asInstanceOf[js.Any])
    if (iceUfrag != null) __obj.updateDynamic("iceUfrag")(iceUfrag.asInstanceOf[js.Any])
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (setup != null) __obj.updateDynamic("setup")(setup.asInstanceOf[js.Any])
    if (sourceFilter != null) __obj.updateDynamic("sourceFilter")(sourceFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAttributes]
  }
}

