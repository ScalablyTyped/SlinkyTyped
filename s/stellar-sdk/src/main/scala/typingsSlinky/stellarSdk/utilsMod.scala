package typingsSlinky.stellarSdk

import typingsSlinky.stellarBase.mod.Keypair
import typingsSlinky.stellarBase.mod.Memo
import typingsSlinky.stellarBase.mod.MemoType
import typingsSlinky.stellarBase.mod.Operation
import typingsSlinky.stellarBase.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  @js.native
  object Utils extends js.Object {
    def buildChallengeTx(serverKeypair: Keypair, clientAccountID: String, anchorName: String): String = js.native
    def buildChallengeTx(serverKeypair: Keypair, clientAccountID: String, anchorName: String, timeout: Double): String = js.native
    def buildChallengeTx(
      serverKeypair: Keypair,
      clientAccountID: String,
      anchorName: String,
      timeout: Double,
      networkPassphrase: String
    ): String = js.native
    def verifyChallengeTx(challengeTx: String, serverAccountId: String): Boolean = js.native
    def verifyChallengeTx(challengeTx: String, serverAccountId: String, networkPassphrase: String): Boolean = js.native
    def verifyTxSignedBy(transaction: Transaction[Memo[MemoType], js.Array[Operation]], accountId: String): Boolean = js.native
  }
  
}

