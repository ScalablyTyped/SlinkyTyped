package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The CryptoKey dictionary of the Web Crypto API represents a cryptographic key. */
trait CryptoKey extends js.Object {
  val algorithm: org.scalajs.dom.crypto.KeyAlgorithm
  val extractable: scala.Boolean
  val `type`: org.scalajs.dom.crypto.KeyType
  val usages: js.Array[org.scalajs.dom.crypto.KeyUsage]
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithm(value: org.scalajs.dom.crypto.KeyAlgorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtractable(value: scala.Boolean): Self = this.set("extractable", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: org.scalajs.dom.crypto.KeyType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsages(value: js.Array[org.scalajs.dom.crypto.KeyUsage]): Self = this.set("usages", value.asInstanceOf[js.Any])
  }
  
}

