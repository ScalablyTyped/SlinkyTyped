package typingsSlinky.xmldsigjs.typesPkijsMod

import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.JsonWebKey
import typingsSlinky.std.AesCbcParams
import typingsSlinky.std.AesCfbParams
import typingsSlinky.std.AesCmacParams
import typingsSlinky.std.AesCtrParams
import typingsSlinky.std.AesGcmParams
import typingsSlinky.std.BufferSource
import typingsSlinky.std.DhImportKeyParams
import typingsSlinky.std.EcKeyImportParams
import typingsSlinky.std.EcdsaParams
import typingsSlinky.std.HmacImportParams
import typingsSlinky.std.RsaHashedImportParams
import typingsSlinky.std.RsaOaepParams
import typingsSlinky.std.RsaPssParams
import typingsSlinky.std.SubtleCrypto
import typingsSlinky.xmldsigjs.xmldsigjsStrings.jwk
import typingsSlinky.xmldsigjs.xmldsigjsStrings.pkcs8
import typingsSlinky.xmldsigjs.xmldsigjsStrings.raw
import typingsSlinky.xmldsigjs.xmldsigjsStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "CryptoEngine")
@js.native
/**
  * Constructor for CryptoEngine class
  * @param {*} [parameters={}]
  */
class CryptoEngine () extends SubtleCrypto {
  def this(parameters: js.Any) = this()
  var crypto: org.scalajs.dom.crypto.SubtleCrypto = js.native
  var name: String = js.native
  /**
    * Convert WebCrypto keys between different export formats
    * @param {string} inputFormat
    * @param {string} outputFormat
    * @param {ArrayBuffer|JsonWebKey} keyData
    * @param {Algorithm} algorithm
    * @param {boolean} extractable
    * @param {Array} keyUsages
    * @returns {Promise}
    */
  def convert(
    inputFormat: String,
    outputFormat: String,
    keyData: BufferSource,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[BufferSource | JsonWebKey] = js.native
  def convert(
    inputFormat: String,
    outputFormat: String,
    keyData: typingsSlinky.std.JsonWebKey,
    algorithm: Algorithm,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[BufferSource | JsonWebKey] = js.native
  def decrypt(algorithm: String, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def decrypt(algorithm: AesCbcParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def decrypt(algorithm: AesCfbParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def decrypt(algorithm: AesCmacParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def decrypt(algorithm: AesCtrParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def decrypt(algorithm: AesGcmParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def decrypt(algorithm: RsaOaepParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: NativeAlgorithmIdentifier, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(algorithm: String, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(algorithm: AesCbcParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(algorithm: AesCfbParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(algorithm: AesCmacParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(algorithm: AesCtrParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(algorithm: AesGcmParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def encrypt(algorithm: RsaOaepParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_jwk(format: jwk, key: CryptoKey): js.Thenable[JsonWebKey] = js.native
  @JSName("exportKey")
  def exportKey_pkcs8(format: pkcs8, key: CryptoKey): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_raw(format: raw, key: CryptoKey): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_spki(format: spki, key: CryptoKey): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def importKey(
    format: String,
    keyData: BufferSource,
    algorithm: String,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: String,
    keyData: BufferSource,
    algorithm: DhImportKeyParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: String,
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: String,
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: String,
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: String,
    keyData: typingsSlinky.std.JsonWebKey,
    algorithm: String,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: String,
    keyData: typingsSlinky.std.JsonWebKey,
    algorithm: DhImportKeyParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: String,
    keyData: typingsSlinky.std.JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: String,
    keyData: typingsSlinky.std.JsonWebKey,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  def importKey(
    format: String,
    keyData: typingsSlinky.std.JsonWebKey,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: String,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: DhImportKeyParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: JsonWebKey,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: BufferSource,
    algorithm: String,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: BufferSource,
    algorithm: DhImportKeyParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_pkcs8(
    format: pkcs8,
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: BufferSource,
    algorithm: String,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: BufferSource,
    algorithm: DhImportKeyParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_raw(
    format: raw,
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: BufferSource,
    algorithm: String,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: BufferSource,
    algorithm: DhImportKeyParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: BufferSource,
    algorithm: EcKeyImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: BufferSource,
    algorithm: HmacImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  @JSName("importKey")
  def importKey_spki(
    format: spki,
    keyData: BufferSource,
    algorithm: RsaHashedImportParams,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  def sign(algorithm: String, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: AesCmacParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: EcdsaParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def sign(algorithm: RsaPssParams, key: CryptoKey, data: BufferSource): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def unwrapKey(
    format: String,
    wrappedKey: BufferSource,
    unwrappingKey: CryptoKey,
    unwrapAlgorithm: NativeAlgorithmIdentifier,
    unwrappedKeyAlgorithm: NativeAlgorithmIdentifier,
    extractable: Boolean,
    keyUsages: js.Array[String]
  ): js.Thenable[CryptoKey] = js.native
  def verify(algorithm: String, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Thenable[Boolean] = js.native
  def verify(algorithm: AesCmacParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Thenable[Boolean] = js.native
  def verify(algorithm: EcdsaParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Thenable[Boolean] = js.native
  def verify(algorithm: RsaPssParams, key: CryptoKey, signature: BufferSource, data: BufferSource): js.Thenable[Boolean] = js.native
  def wrapKey(format: String, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: NativeAlgorithmIdentifier): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
}

