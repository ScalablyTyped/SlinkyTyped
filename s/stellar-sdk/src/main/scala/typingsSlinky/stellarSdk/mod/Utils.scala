package typingsSlinky.stellarSdk.mod

import typingsSlinky.stellarBase.mod.MemoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Utils")
@js.native
object Utils extends js.Object {
  def buildChallengeTx(serverKeypair: typingsSlinky.stellarBase.mod.Keypair, clientAccountID: String, anchorName: String): String = js.native
  def buildChallengeTx(
    serverKeypair: typingsSlinky.stellarBase.mod.Keypair,
    clientAccountID: String,
    anchorName: String,
    timeout: Double
  ): String = js.native
  def buildChallengeTx(
    serverKeypair: typingsSlinky.stellarBase.mod.Keypair,
    clientAccountID: String,
    anchorName: String,
    timeout: Double,
    networkPassphrase: String
  ): String = js.native
  def verifyChallengeTx(challengeTx: String, serverAccountId: String): Boolean = js.native
  def verifyChallengeTx(challengeTx: String, serverAccountId: String, networkPassphrase: String): Boolean = js.native
  def verifyTxSignedBy(
    transaction: typingsSlinky.stellarBase.mod.Transaction[
      typingsSlinky.stellarBase.mod.Memo[MemoType], 
      js.Array[typingsSlinky.stellarBase.mod.Operation]
    ],
    accountId: String
  ): Boolean = js.native
}

