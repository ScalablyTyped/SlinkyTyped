package typingsSlinky.stellarSdk

import typingsSlinky.stellarBase.mod.FeeBumpTransaction
import typingsSlinky.stellarBase.mod.Keypair
import typingsSlinky.stellarBase.mod.Memo
import typingsSlinky.stellarBase.mod.MemoType
import typingsSlinky.stellarBase.mod.Operation
import typingsSlinky.stellarBase.mod.Transaction
import typingsSlinky.stellarSdk.anon.ClientAccountID
import typingsSlinky.stellarSdk.serverApiMod.ServerApi.AccountRecordSigners
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  object Utils {
    
    @JSImport("stellar-sdk/lib/utils", "Utils.buildChallengeTx")
    @js.native
    def buildChallengeTx(
      serverKeypair: Keypair,
      clientAccountID: String,
      homeDomain: String,
      timeout: js.UndefOr[scala.Nothing],
      networkPassphrase: String
    ): String = js.native
    @JSImport("stellar-sdk/lib/utils", "Utils.buildChallengeTx")
    @js.native
    def buildChallengeTx(
      serverKeypair: Keypair,
      clientAccountID: String,
      homeDomain: String,
      timeout: Double,
      networkPassphrase: String
    ): String = js.native
    
    @JSImport("stellar-sdk/lib/utils", "Utils.gatherTxSigners")
    @js.native
    def gatherTxSigners(transaction: FeeBumpTransaction, signers: js.Array[String]): js.Array[String] = js.native
    @JSImport("stellar-sdk/lib/utils", "Utils.gatherTxSigners")
    @js.native
    def gatherTxSigners(transaction: Transaction[Memo[MemoType], js.Array[Operation]], signers: js.Array[String]): js.Array[String] = js.native
    
    @JSImport("stellar-sdk/lib/utils", "Utils.readChallengeTx")
    @js.native
    def readChallengeTx(challengeTx: String, serverAccountID: String, networkPassphrase: String, homeDomains: String): ClientAccountID = js.native
    @JSImport("stellar-sdk/lib/utils", "Utils.readChallengeTx")
    @js.native
    def readChallengeTx(
      challengeTx: String,
      serverAccountID: String,
      networkPassphrase: String,
      homeDomains: js.Array[String]
    ): ClientAccountID = js.native
    
    @JSImport("stellar-sdk/lib/utils", "Utils.verifyChallengeTxSigners")
    @js.native
    def verifyChallengeTxSigners(
      challengeTx: String,
      serverAccountID: String,
      networkPassphrase: String,
      signers: js.Array[String],
      homeDomains: String
    ): js.Array[String] = js.native
    @JSImport("stellar-sdk/lib/utils", "Utils.verifyChallengeTxSigners")
    @js.native
    def verifyChallengeTxSigners(
      challengeTx: String,
      serverAccountID: String,
      networkPassphrase: String,
      signers: js.Array[String],
      homeDomains: js.Array[String]
    ): js.Array[String] = js.native
    
    @JSImport("stellar-sdk/lib/utils", "Utils.verifyChallengeTxThreshold")
    @js.native
    def verifyChallengeTxThreshold(
      challengeTx: String,
      serverAccountID: String,
      networkPassphrase: String,
      threshold: Double,
      signerSummary: js.Array[AccountRecordSigners],
      homeDomains: String
    ): js.Array[String] = js.native
    @JSImport("stellar-sdk/lib/utils", "Utils.verifyChallengeTxThreshold")
    @js.native
    def verifyChallengeTxThreshold(
      challengeTx: String,
      serverAccountID: String,
      networkPassphrase: String,
      threshold: Double,
      signerSummary: js.Array[AccountRecordSigners],
      homeDomains: js.Array[String]
    ): js.Array[String] = js.native
    
    @JSImport("stellar-sdk/lib/utils", "Utils.verifyTxSignedBy")
    @js.native
    def verifyTxSignedBy(transaction: FeeBumpTransaction, accountID: String): Boolean = js.native
    @JSImport("stellar-sdk/lib/utils", "Utils.verifyTxSignedBy")
    @js.native
    def verifyTxSignedBy(transaction: Transaction[Memo[MemoType], js.Array[Operation]], accountID: String): Boolean = js.native
  }
}
