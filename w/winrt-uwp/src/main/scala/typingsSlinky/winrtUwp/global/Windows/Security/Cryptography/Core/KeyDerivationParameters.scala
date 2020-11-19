package typingsSlinky.winrtUwp.global.Windows.Security.Cryptography.Core

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents parameters used when deriving a key. */
@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
@js.native
abstract class KeyDerivationParameters ()
  extends typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters
/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
@js.native
object KeyDerivationParameters extends js.Object {
  
  /**
    * Creates a KeyDerivationParameters object for use in the target algorithm.
    * @param capi1KdfTargetAlgorithm The target algorithm.
    * @return Refers to the parameters used during key derivation.
    */
  def buildForCapi1Kdf(
    capi1KdfTargetAlgorithm: typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.Capi1KdfTargetAlgorithm
  ): typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters = js.native
  
  /**
    * Creates a KeyDerivationParameters object for use in the password-based key derivation function 2 (PBKDF2).
    * @param pbkdf2Salt The salt, a random or pseudorandom value to be combined with the password in multiple iterations. A salt is used to increase entropy above what can be obtained from using a password alone.
    * @param iterationCount Number of iterations to be used to derive a key.
    * @return Refers to the parameters used during key derivation.
    */
  def buildForPbkdf2(pbkdf2Salt: IBuffer, iterationCount: Double): typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters = js.native
  
  /**
    * Creates a KeyDerivationParameters object for use in a counter mode, hash-based message authentication code (HMAC) key derivation function.
    * @param label Buffer that specifies the purpose for the derived keying material.
    * @param context Buffer that specifies information related to the derived keying material. For example, the context can identify the parties who are deriving the keying material and, optionally, a nonce known by the parties.
    * @return Refers to the parameters used during key derivation.
    */
  def buildForSP800108(label: IBuffer, context: IBuffer): typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters = js.native
  
  /**
    * Creates a KeyDerivationParameters object for use in the SP800-56A key derivation function.
    * @param algorithmId Specifies the intended purpose of the derived key.
    * @param partyUInfo Contains public information contributed by the initiator.
    * @param partyVInfo Contains public information contributed by the responder.
    * @param suppPubInfo Contains public information known to both initiator and responder.
    * @param suppPrivInfo Contains private information known to both initiator and responder, such as a shared secret.
    * @return Refers to the parameters used during key derivation.
    */
  def buildForSP80056a(
    algorithmId: IBuffer,
    partyUInfo: IBuffer,
    partyVInfo: IBuffer,
    suppPubInfo: IBuffer,
    suppPrivInfo: IBuffer
  ): typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core.KeyDerivationParameters = js.native
}
