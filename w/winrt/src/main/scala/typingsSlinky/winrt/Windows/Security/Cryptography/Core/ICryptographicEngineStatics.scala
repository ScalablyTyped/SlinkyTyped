package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICryptographicEngineStatics extends StObject {
  
  def decrypt(key: CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer = js.native
  
  def decryptAndAuthenticate(
    key: CryptographicKey,
    data: IBuffer,
    nonce: IBuffer,
    authenticationTag: IBuffer,
    authenticatedData: IBuffer
  ): IBuffer = js.native
  
  def deriveKeyMaterial(key: CryptographicKey, parameters: KeyDerivationParameters, desiredKeySize: Double): IBuffer = js.native
  
  def encrypt(key: CryptographicKey, data: IBuffer, iv: IBuffer): IBuffer = js.native
  
  def encryptAndAuthenticate(key: CryptographicKey, data: IBuffer, nonce: IBuffer, authenticatedData: IBuffer): EncryptedAndAuthenticatedData = js.native
  
  def sign(key: CryptographicKey, data: IBuffer): IBuffer = js.native
  
  def verifySignature(key: CryptographicKey, data: IBuffer, signature: IBuffer): Boolean = js.native
}
object ICryptographicEngineStatics {
  
  @scala.inline
  def apply(
    decrypt: (CryptographicKey, IBuffer, IBuffer) => IBuffer,
    decryptAndAuthenticate: (CryptographicKey, IBuffer, IBuffer, IBuffer, IBuffer) => IBuffer,
    deriveKeyMaterial: (CryptographicKey, KeyDerivationParameters, Double) => IBuffer,
    encrypt: (CryptographicKey, IBuffer, IBuffer) => IBuffer,
    encryptAndAuthenticate: (CryptographicKey, IBuffer, IBuffer, IBuffer) => EncryptedAndAuthenticatedData,
    sign: (CryptographicKey, IBuffer) => IBuffer,
    verifySignature: (CryptographicKey, IBuffer, IBuffer) => Boolean
  ): ICryptographicEngineStatics = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction3(decrypt), decryptAndAuthenticate = js.Any.fromFunction5(decryptAndAuthenticate), deriveKeyMaterial = js.Any.fromFunction3(deriveKeyMaterial), encrypt = js.Any.fromFunction3(encrypt), encryptAndAuthenticate = js.Any.fromFunction4(encryptAndAuthenticate), sign = js.Any.fromFunction2(sign), verifySignature = js.Any.fromFunction3(verifySignature))
    __obj.asInstanceOf[ICryptographicEngineStatics]
  }
  
  @scala.inline
  implicit class ICryptographicEngineStaticsMutableBuilder[Self <: ICryptographicEngineStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecrypt(value: (CryptographicKey, IBuffer, IBuffer) => IBuffer): Self = StObject.set(x, "decrypt", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDecryptAndAuthenticate(value: (CryptographicKey, IBuffer, IBuffer, IBuffer, IBuffer) => IBuffer): Self = StObject.set(x, "decryptAndAuthenticate", js.Any.fromFunction5(value))
    
    @scala.inline
    def setDeriveKeyMaterial(value: (CryptographicKey, KeyDerivationParameters, Double) => IBuffer): Self = StObject.set(x, "deriveKeyMaterial", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEncrypt(value: (CryptographicKey, IBuffer, IBuffer) => IBuffer): Self = StObject.set(x, "encrypt", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEncryptAndAuthenticate(value: (CryptographicKey, IBuffer, IBuffer, IBuffer) => EncryptedAndAuthenticatedData): Self = StObject.set(x, "encryptAndAuthenticate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSign(value: (CryptographicKey, IBuffer) => IBuffer): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVerifySignature(value: (CryptographicKey, IBuffer, IBuffer) => Boolean): Self = StObject.set(x, "verifySignature", js.Any.fromFunction3(value))
  }
}
