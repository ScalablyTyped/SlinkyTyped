package typingsSlinky.xmldsigjs

import typingsSlinky.xmldsigjs.ecdsaKeyMod._NamedCurveType
import typingsSlinky.xmldsigjs.signedXmlMod.OptionsSignTransform
import typingsSlinky.xmldsigjs.x509Mod._DigestAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmldsigjsStrings {
  
  @js.native
  sealed trait `P-256` extends _NamedCurveType
  @scala.inline
  def `P-256`: `P-256` = "P-256".asInstanceOf[`P-256`]
  
  @js.native
  sealed trait `P-384` extends _NamedCurveType
  @scala.inline
  def `P-384`: `P-384` = "P-384".asInstanceOf[`P-384`]
  
  @js.native
  sealed trait `P-521` extends _NamedCurveType
  @scala.inline
  def `P-521`: `P-521` = "P-521".asInstanceOf[`P-521`]
  
  @js.native
  sealed trait `SHA-1` extends _DigestAlgorithm
  @scala.inline
  def `SHA-1`: `SHA-1` = "SHA-1".asInstanceOf[`SHA-1`]
  
  @js.native
  sealed trait `SHA-256` extends _DigestAlgorithm
  @scala.inline
  def `SHA-256`: `SHA-256` = "SHA-256".asInstanceOf[`SHA-256`]
  
  @js.native
  sealed trait `SHA-384` extends _DigestAlgorithm
  @scala.inline
  def `SHA-384`: `SHA-384` = "SHA-384".asInstanceOf[`SHA-384`]
  
  @js.native
  sealed trait `SHA-512` extends _DigestAlgorithm
  @scala.inline
  def `SHA-512`: `SHA-512` = "SHA-512".asInstanceOf[`SHA-512`]
  
  @js.native
  sealed trait base64 extends OptionsSignTransform
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait c14n extends OptionsSignTransform
  @scala.inline
  def c14n: c14n = "c14n".asInstanceOf[c14n]
  
  @js.native
  sealed trait `c14n-com` extends OptionsSignTransform
  @scala.inline
  def `c14n-com`: `c14n-com` = "c14n-com".asInstanceOf[`c14n-com`]
  
  @js.native
  sealed trait enveloped extends OptionsSignTransform
  @scala.inline
  def enveloped: enveloped = "enveloped".asInstanceOf[enveloped]
  
  @js.native
  sealed trait `exc-c14n` extends OptionsSignTransform
  @scala.inline
  def `exc-c14n`: `exc-c14n` = "exc-c14n".asInstanceOf[`exc-c14n`]
  
  @js.native
  sealed trait `exc-c14n-com` extends OptionsSignTransform
  @scala.inline
  def `exc-c14n-com`: `exc-c14n-com` = "exc-c14n-com".asInstanceOf[`exc-c14n-com`]
}
