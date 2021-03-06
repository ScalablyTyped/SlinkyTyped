package typingsSlinky.std

import typingsSlinky.std.stdStrings.jwk
import typingsSlinky.std.stdStrings.pkcs8
import typingsSlinky.std.stdStrings.raw
import typingsSlinky.std.stdStrings.spki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Crypto API interface provides a number of low-level cryptographic functions. It is accessed via the Crypto.subtle properties available in a window context (via Window.crypto). */
@js.native
trait SubtleCrypto extends StObject {
  
  def decrypt(
    algorithm: AlgorithmIdentifier | org.scalajs.dom.crypto.RsaOaepParams | org.scalajs.dom.crypto.AesCtrParams | org.scalajs.dom.crypto.AesCbcParams | org.scalajs.dom.crypto.AesCmacParams | org.scalajs.dom.crypto.AesGcmParams | org.scalajs.dom.crypto.AesCfbParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def deriveBits(
    algorithm: org.scalajs.dom.crypto.ConcatParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    length: Double
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(
    algorithm: org.scalajs.dom.crypto.DhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    length: Double
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(
    algorithm: org.scalajs.dom.crypto.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    length: Double
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(
    algorithm: org.scalajs.dom.crypto.Pbkdf2Params,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    length: Double
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: AlgorithmIdentifier, baseKey: org.scalajs.dom.crypto.CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def deriveBits(algorithm: HkdfParams, baseKey: org.scalajs.dom.crypto.CryptoKey, length: Double): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.ConcatParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.ConcatParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.ConcatParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.ConcatParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.ConcatParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.ConcatParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.DhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.DhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.DhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.DhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.DhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.DhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.EcdhKeyDeriveParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.Pbkdf2Params,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.Pbkdf2Params,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.Pbkdf2Params,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.Pbkdf2Params,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.Pbkdf2Params,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: org.scalajs.dom.crypto.Pbkdf2Params,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: AlgorithmIdentifier,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: java.lang.String,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.AesDerivedKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.ConcatParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: org.scalajs.dom.crypto.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def deriveKey(
    algorithm: HkdfParams,
    baseKey: org.scalajs.dom.crypto.CryptoKey,
    derivedKeyType: HkdfParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.DataView): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Float32Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Float64Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Int16Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Int32Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Int8Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Uint16Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Uint32Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Uint8Array): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def digest(algorithm: AlgorithmIdentifier, data: js.typedarray.Uint8ClampedArray): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def encrypt(
    algorithm: AlgorithmIdentifier | org.scalajs.dom.crypto.RsaOaepParams | org.scalajs.dom.crypto.AesCtrParams | org.scalajs.dom.crypto.AesCbcParams | org.scalajs.dom.crypto.AesCmacParams | org.scalajs.dom.crypto.AesGcmParams | org.scalajs.dom.crypto.AesCfbParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def exportKey(format: java.lang.String, key: org.scalajs.dom.crypto.CryptoKey): js.Promise[org.scalajs.dom.crypto.JsonWebKey | js.typedarray.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_jwk(format: jwk, key: org.scalajs.dom.crypto.CryptoKey): js.Promise[org.scalajs.dom.crypto.JsonWebKey] = js.native
  @JSName("exportKey")
  def exportKey_pkcs8(format: pkcs8, key: org.scalajs.dom.crypto.CryptoKey): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_raw(format: raw, key: org.scalajs.dom.crypto.CryptoKey): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("exportKey")
  def exportKey_spki(format: spki, key: org.scalajs.dom.crypto.CryptoKey): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def generateKey(
    algorithm: org.scalajs.dom.crypto.AesKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def generateKey(
    algorithm: org.scalajs.dom.crypto.DhKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKeyPair] = js.native
  def generateKey(
    algorithm: org.scalajs.dom.crypto.EcKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKeyPair] = js.native
  def generateKey(
    algorithm: org.scalajs.dom.crypto.HmacKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def generateKey(
    algorithm: org.scalajs.dom.crypto.Pbkdf2Params,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def generateKey(
    algorithm: org.scalajs.dom.crypto.RsaHashedKeyGenParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKeyPair] = js.native
  def generateKey(
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKeyPair | org.scalajs.dom.crypto.CryptoKey] = js.native
  
  def importKey(
    format: raw | pkcs8 | spki,
    keyData: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    algorithm: AlgorithmIdentifier | org.scalajs.dom.crypto.RsaHashedImportParams | org.scalajs.dom.crypto.EcKeyImportParams | org.scalajs.dom.crypto.HmacImportParams | org.scalajs.dom.crypto.DhImportKeyParams | org.scalajs.dom.crypto.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  def importKey(
    format: java.lang.String,
    keyData: org.scalajs.dom.crypto.JsonWebKey | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    algorithm: AlgorithmIdentifier | org.scalajs.dom.crypto.RsaHashedImportParams | org.scalajs.dom.crypto.EcKeyImportParams | org.scalajs.dom.crypto.HmacImportParams | org.scalajs.dom.crypto.DhImportKeyParams | org.scalajs.dom.crypto.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.crypto.JsonWebKey,
    algorithm: org.scalajs.dom.crypto.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.crypto.JsonWebKey,
    algorithm: org.scalajs.dom.crypto.DhImportKeyParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.crypto.JsonWebKey,
    algorithm: org.scalajs.dom.crypto.EcKeyImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.crypto.JsonWebKey,
    algorithm: org.scalajs.dom.crypto.HmacImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.crypto.JsonWebKey,
    algorithm: org.scalajs.dom.crypto.RsaHashedImportParams,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  @JSName("importKey")
  def importKey_jwk(
    format: jwk,
    keyData: org.scalajs.dom.crypto.JsonWebKey,
    algorithm: AlgorithmIdentifier,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  
  def sign(
    algorithm: org.scalajs.dom.crypto.AesCmacParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.ArrayBuffer
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.AesCmacParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.DataView
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.AesCmacParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Float32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.AesCmacParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Float64Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.AesCmacParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.AesCmacParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.AesCmacParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.AesCmacParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.AesCmacParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.AesCmacParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.AesCmacParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint8ClampedArray
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.EcdsaParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.ArrayBuffer
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.EcdsaParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.DataView
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.EcdsaParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Float32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.EcdsaParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Float64Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.EcdsaParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.EcdsaParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.EcdsaParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.EcdsaParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.EcdsaParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.EcdsaParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.EcdsaParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint8ClampedArray
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.RsaPssParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.ArrayBuffer
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.RsaPssParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.DataView
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.RsaPssParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Float32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.RsaPssParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Float64Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.RsaPssParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.RsaPssParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.RsaPssParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.RsaPssParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.RsaPssParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.RsaPssParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: org.scalajs.dom.crypto.RsaPssParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint8ClampedArray
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: AlgorithmIdentifier,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.ArrayBuffer
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: AlgorithmIdentifier,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.DataView
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: AlgorithmIdentifier,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Float32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: AlgorithmIdentifier,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Float64Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: AlgorithmIdentifier,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: AlgorithmIdentifier,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: AlgorithmIdentifier,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Int8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: AlgorithmIdentifier,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint16Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: AlgorithmIdentifier,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint32Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: AlgorithmIdentifier,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint8Array
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def sign(
    algorithm: AlgorithmIdentifier,
    key: org.scalajs.dom.crypto.CryptoKey,
    data: js.typedarray.Uint8ClampedArray
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  def unwrapKey(
    format: raw | pkcs8 | spki | jwk | java.lang.String,
    wrappedKey: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    unwrappingKey: org.scalajs.dom.crypto.CryptoKey,
    unwrapAlgorithm: AlgorithmIdentifier | org.scalajs.dom.crypto.RsaOaepParams | org.scalajs.dom.crypto.AesCtrParams | org.scalajs.dom.crypto.AesCbcParams | org.scalajs.dom.crypto.AesCmacParams | org.scalajs.dom.crypto.AesGcmParams | org.scalajs.dom.crypto.AesCfbParams,
    unwrappedKeyAlgorithm: AlgorithmIdentifier | org.scalajs.dom.crypto.RsaHashedImportParams | org.scalajs.dom.crypto.EcKeyImportParams | org.scalajs.dom.crypto.HmacImportParams | org.scalajs.dom.crypto.DhImportKeyParams | org.scalajs.dom.crypto.AesKeyAlgorithm,
    extractable: scala.Boolean,
    keyUsages: js.Array[org.scalajs.dom.crypto.KeyUsage]
  ): js.Promise[org.scalajs.dom.crypto.CryptoKey] = js.native
  
  def verify(
    algorithm: AlgorithmIdentifier | org.scalajs.dom.crypto.RsaPssParams | org.scalajs.dom.crypto.EcdsaParams | org.scalajs.dom.crypto.AesCmacParams,
    key: org.scalajs.dom.crypto.CryptoKey,
    signature: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer,
    data: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ): js.Promise[scala.Boolean] = js.native
  
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCbcParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCfbParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCmacParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCtrParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesGcmParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.RsaOaepParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def wrapKey(
    format: java.lang.String,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: AlgorithmIdentifier
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(
    format: jwk,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCbcParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(
    format: jwk,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCfbParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(
    format: jwk,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCmacParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(
    format: jwk,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCtrParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(
    format: jwk,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesGcmParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(
    format: jwk,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.RsaOaepParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_jwk(
    format: jwk,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: AlgorithmIdentifier
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(
    format: pkcs8,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCbcParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(
    format: pkcs8,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCfbParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(
    format: pkcs8,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCmacParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(
    format: pkcs8,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCtrParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(
    format: pkcs8,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesGcmParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(
    format: pkcs8,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.RsaOaepParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_pkcs8(
    format: pkcs8,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: AlgorithmIdentifier
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(
    format: raw,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCbcParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(
    format: raw,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCfbParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(
    format: raw,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCmacParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(
    format: raw,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCtrParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(
    format: raw,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesGcmParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(
    format: raw,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.RsaOaepParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_raw(
    format: raw,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: AlgorithmIdentifier
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(
    format: spki,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCbcParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(
    format: spki,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCfbParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(
    format: spki,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCmacParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(
    format: spki,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesCtrParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(
    format: spki,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.AesGcmParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(
    format: spki,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: org.scalajs.dom.crypto.RsaOaepParams
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
  @JSName("wrapKey")
  def wrapKey_spki(
    format: spki,
    key: org.scalajs.dom.crypto.CryptoKey,
    wrappingKey: org.scalajs.dom.crypto.CryptoKey,
    wrapAlgorithm: AlgorithmIdentifier
  ): js.Promise[js.typedarray.ArrayBuffer] = js.native
}
