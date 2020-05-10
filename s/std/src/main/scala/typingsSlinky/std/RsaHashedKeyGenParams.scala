package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RsaHashedKeyGenParams extends RsaKeyGenParams {
  var hash: HashAlgorithmIdentifier = js.native
}

object RsaHashedKeyGenParams {
  @scala.inline
  def apply(
    hash: HashAlgorithmIdentifier,
    modulusLength: Double,
    name: java.lang.String,
    publicExponent: js.typedarray.Uint8Array
  ): RsaHashedKeyGenParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaHashedKeyGenParams]
  }
  @scala.inline
  implicit class RsaHashedKeyGenParamsOps[Self <: org.scalajs.dom.crypto.RsaHashedKeyGenParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: HashAlgorithmIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

