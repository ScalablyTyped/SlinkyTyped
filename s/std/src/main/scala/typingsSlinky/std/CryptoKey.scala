package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
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

@JSGlobal("CryptoKey")
@js.native
object CryptoKey extends Instantiable0[CryptoKey]

