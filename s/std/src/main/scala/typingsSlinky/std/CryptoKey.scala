package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
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

@JSGlobal("CryptoKey")
@js.native
object CryptoKey
  extends Instantiable0[org.scalajs.dom.crypto.CryptoKey]

