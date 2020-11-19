package typingsSlinky.stellarSdk

import typingsSlinky.stellarBase.mod.Keypair
import typingsSlinky.stellarBase.mod.Memo
import typingsSlinky.stellarBase.mod.MemoType
import typingsSlinky.stellarBase.mod.Operation
import typingsSlinky.stellarBase.mod.Transaction
import typingsSlinky.stellarSdk.anon.ClientAccountID
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.AccountRecordSigners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  @js.native
  object Utils extends js.Object {
    
    def buildChallengeTx(
      serverKeypair: Keypair,
      clientAccountID: String,
      anchorName: String,
      timeout: js.UndefOr[scala.Nothing],
      networkPassphrase: String
    ): String = js.native
    def buildChallengeTx(
      serverKeypair: Keypair,
      clientAccountID: String,
      anchorName: String,
      timeout: Double,
      networkPassphrase: String
    ): String = js.native
    
    def gatherTxSigners(transaction: Transaction[Memo[MemoType], js.Array[Operation]], signers: js.Array[String]): js.Array[String] = js.native
    
    def readChallengeTx(challengeTx: String, serverAccountID: String, networkPassphrase: String): ClientAccountID = js.native
    
    def verifyChallengeTxSigners(challengeTx: String, serverAccountID: String, networkPassphrase: String, signers: js.Array[String]): js.Array[String] = js.native
    
    def verifyChallengeTxThreshold(
      challengeTx: String,
      serverAccountID: String,
      networkPassphrase: String,
      threshold: Double,
      signerSummary: js.Array[AccountRecordSigners]
    ): js.Array[String] = js.native
    
    def verifyTxSignedBy(transaction: Transaction[Memo[MemoType], js.Array[Operation]], accountID: String): Boolean = js.native
  }
}
