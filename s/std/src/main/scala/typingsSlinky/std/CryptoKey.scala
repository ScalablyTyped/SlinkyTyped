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
}

