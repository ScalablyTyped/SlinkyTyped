package typingsSlinky.winrt.global.Windows.Security.Cryptography.Core

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine")
@js.native
class CryptographicEngine ()
  extends typingsSlinky.winrt.Windows.Security.Cryptography.Core.CryptographicEngine
/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.CryptographicEngine")
@js.native
object CryptographicEngine extends js.Object {
  
  def decrypt(
    key: typingsSlinky.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
    data: IBuffer,
    iv: IBuffer
  ): IBuffer = js.native
  
  def decryptAndAuthenticate(
    key: typingsSlinky.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
    data: IBuffer,
    nonce: IBuffer,
    authenticationTag: IBuffer,
    authenticatedData: IBuffer
  ): IBuffer = js.native
  
  def deriveKeyMaterial(
    key: typingsSlinky.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
    parameters: typingsSlinky.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters,
    desiredKeySize: Double
  ): IBuffer = js.native
  
  def encrypt(
    key: typingsSlinky.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
    data: IBuffer,
    iv: IBuffer
  ): IBuffer = js.native
  
  def encryptAndAuthenticate(
    key: typingsSlinky.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
    data: IBuffer,
    nonce: IBuffer,
    authenticatedData: IBuffer
  ): typingsSlinky.winrt.Windows.Security.Cryptography.Core.EncryptedAndAuthenticatedData = js.native
  
  def sign(key: typingsSlinky.winrt.Windows.Security.Cryptography.Core.CryptographicKey, data: IBuffer): IBuffer = js.native
  
  def verifySignature(
    key: typingsSlinky.winrt.Windows.Security.Cryptography.Core.CryptographicKey,
    data: IBuffer,
    signature: IBuffer
  ): Boolean = js.native
}
