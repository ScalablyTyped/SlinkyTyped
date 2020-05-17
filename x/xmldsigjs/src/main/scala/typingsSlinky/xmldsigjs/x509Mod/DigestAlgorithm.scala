package typingsSlinky.xmldsigjs.x509Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-1`
  - typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-256`
  - typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-384`
  - typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-512`
*/
trait DigestAlgorithm extends js.Object

object DigestAlgorithm {
  @scala.inline
  def `SHA-1`: typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-1` = "SHA-1".asInstanceOf[typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-1`]
  @scala.inline
  def `SHA-256`: typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-256` = "SHA-256".asInstanceOf[typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-256`]
  @scala.inline
  def `SHA-384`: typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-384` = "SHA-384".asInstanceOf[typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-384`]
  @scala.inline
  def `SHA-512`: typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-512` = "SHA-512".asInstanceOf[typingsSlinky.xmldsigjs.xmldsigjsStrings.`SHA-512`]
  @scala.inline
  implicit def apply(value: String): DigestAlgorithm = value.asInstanceOf[DigestAlgorithm]
}

