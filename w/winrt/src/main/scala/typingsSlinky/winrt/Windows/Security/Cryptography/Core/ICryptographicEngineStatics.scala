package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICryptographicEngineStatics extends js.Object {
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
  implicit class ICryptographicEngineStaticsOps[Self <: ICryptographicEngineStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecrypt(value: (CryptographicKey, IBuffer, IBuffer) => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDecryptAndAuthenticate(value: (CryptographicKey, IBuffer, IBuffer, IBuffer, IBuffer) => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decryptAndAuthenticate")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withDeriveKeyMaterial(value: (CryptographicKey, KeyDerivationParameters, Double) => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deriveKeyMaterial")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEncrypt(value: (CryptographicKey, IBuffer, IBuffer) => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEncryptAndAuthenticate(value: (CryptographicKey, IBuffer, IBuffer, IBuffer) => EncryptedAndAuthenticatedData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptAndAuthenticate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSign(value: (CryptographicKey, IBuffer) => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVerifySignature(value: (CryptographicKey, IBuffer, IBuffer) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifySignature")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

