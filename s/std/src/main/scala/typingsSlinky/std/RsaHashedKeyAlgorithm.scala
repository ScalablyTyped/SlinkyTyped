package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaHashedKeyAlgorithm extends RsaKeyAlgorithm {
  
  var hash: org.scalajs.dom.crypto.KeyAlgorithm = js.native
}
object RsaHashedKeyAlgorithm {
  
  @scala.inline
  def apply(
    hash: org.scalajs.dom.crypto.KeyAlgorithm,
    modulusLength: Double,
    name: java.lang.String,
    publicExponent: js.typedarray.Uint8Array
  ): RsaHashedKeyAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaHashedKeyAlgorithm]
  }
  
  @scala.inline
  implicit class RsaHashedKeyAlgorithmOps[Self <: org.scalajs.dom.crypto.RsaHashedKeyAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHash(value: org.scalajs.dom.crypto.KeyAlgorithm): Self = this.set("hash", value.asInstanceOf[js.Any])
  }
}
