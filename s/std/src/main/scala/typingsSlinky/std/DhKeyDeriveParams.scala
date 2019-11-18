package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DhKeyDeriveParams extends Algorithm {
  var public: org.scalajs.dom.crypto.CryptoKey
}

object DhKeyDeriveParams {
  @scala.inline
  def apply(name: java.lang.String, public: org.scalajs.dom.crypto.CryptoKey): DhKeyDeriveParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DhKeyDeriveParams]
  }
}

