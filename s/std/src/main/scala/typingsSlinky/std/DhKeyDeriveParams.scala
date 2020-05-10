package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DhKeyDeriveParams extends Algorithm {
  var public: org.scalajs.dom.crypto.CryptoKey = js.native
}

object DhKeyDeriveParams {
  @scala.inline
  def apply(name: java.lang.String, public: org.scalajs.dom.crypto.CryptoKey): DhKeyDeriveParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[DhKeyDeriveParams]
  }
  @scala.inline
  implicit class DhKeyDeriveParamsOps[Self <: org.scalajs.dom.crypto.DhKeyDeriveParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublic(value: org.scalajs.dom.crypto.CryptoKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

