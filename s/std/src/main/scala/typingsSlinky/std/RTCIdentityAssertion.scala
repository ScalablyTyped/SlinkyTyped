package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIdentityAssertion extends js.Object {
  var idp: java.lang.String = js.native
  var name: java.lang.String = js.native
}

object RTCIdentityAssertion {
  @scala.inline
  def apply(idp: java.lang.String, name: java.lang.String): RTCIdentityAssertion = {
    val __obj = js.Dynamic.literal(idp = idp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIdentityAssertion]
  }
  @scala.inline
  implicit class RTCIdentityAssertionOps[Self <: org.scalajs.dom.experimental.webrtc.RTCIdentityAssertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdp(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

