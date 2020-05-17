package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The CryptoKey dictionary of the Web Crypto API represents a cryptographic key. */
@js.native
trait CryptoKey extends js.Object {
  val algorithm: org.scalajs.dom.crypto.KeyAlgorithm = js.native
  val extractable: scala.Boolean = js.native
  val `type`: org.scalajs.dom.crypto.KeyType = js.native
  val usages: js.Array[org.scalajs.dom.crypto.KeyUsage] = js.native
}

object CryptoKey {
  @scala.inline
  def apply(
    algorithm: org.scalajs.dom.crypto.KeyAlgorithm,
    extractable: scala.Boolean,
    `type`: org.scalajs.dom.crypto.KeyType,
    usages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): CryptoKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
  @scala.inline
  implicit class CryptoKeyOps[Self <: org.scalajs.dom.crypto.CryptoKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: org.scalajs.dom.crypto.KeyAlgorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtractable(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: org.scalajs.dom.crypto.KeyType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsages(value: js.Array[org.scalajs.dom.crypto.KeyUsage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

