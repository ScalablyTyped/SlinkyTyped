package typingsSlinky.xmldsigjs.ecdsaKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-256`
  - typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-384`
  - typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-521`
*/
trait NamedCurveType extends js.Object

object NamedCurveType {
  @scala.inline
  def `P-256`: typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-256` = "P-256".asInstanceOf[typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-256`]
  @scala.inline
  def `P-384`: typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-384` = "P-384".asInstanceOf[typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-384`]
  @scala.inline
  def `P-521`: typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-521` = "P-521".asInstanceOf[typingsSlinky.xmldsigjs.xmldsigjsStrings.`P-521`]
  @scala.inline
  implicit def apply(value: String): NamedCurveType = value.asInstanceOf[NamedCurveType]
}

