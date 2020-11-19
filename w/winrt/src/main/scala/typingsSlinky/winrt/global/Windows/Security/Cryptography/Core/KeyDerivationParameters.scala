package typingsSlinky.winrt.global.Windows.Security.Cryptography.Core

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
@js.native
class KeyDerivationParameters ()
  extends typingsSlinky.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters
/* static members */
@JSGlobal("Windows.Security.Cryptography.Core.KeyDerivationParameters")
@js.native
object KeyDerivationParameters extends js.Object {
  
  def buildForPbkdf2(pbkdf2Salt: IBuffer, iterationCount: Double): typingsSlinky.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters = js.native
  
  def buildForSP800108(label: IBuffer, context: IBuffer): typingsSlinky.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters = js.native
  
  def buildForSP80056a(
    algorithmId: IBuffer,
    partyUInfo: IBuffer,
    partyVInfo: IBuffer,
    suppPubInfo: IBuffer,
    suppPrivInfo: IBuffer
  ): typingsSlinky.winrt.Windows.Security.Cryptography.Core.KeyDerivationParameters = js.native
}
