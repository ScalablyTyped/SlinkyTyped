package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransactionFailedResultCodes extends StObject
@JSImport("stellar-sdk/lib/horizon_api", "Horizon.TransactionFailedResultCodes")
@js.native
object TransactionFailedResultCodes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TransactionFailedResultCodes with String] = js.native
  
  @js.native
  sealed trait TX_BAD_AUTH extends TransactionFailedResultCodes
  /* "tx_bad_auth" */ val TX_BAD_AUTH: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_BAD_AUTH with String = js.native
  
  @js.native
  sealed trait TX_BAD_AUTH_EXTRA extends TransactionFailedResultCodes
  /* "tx_bad_auth_extra" */ val TX_BAD_AUTH_EXTRA: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_BAD_AUTH_EXTRA with String = js.native
  
  @js.native
  sealed trait TX_BAD_SEQ extends TransactionFailedResultCodes
  /* "tx_bad_seq" */ val TX_BAD_SEQ: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_BAD_SEQ with String = js.native
  
  @js.native
  sealed trait TX_FAILED extends TransactionFailedResultCodes
  /* "tx_failed" */ val TX_FAILED: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_FAILED with String = js.native
  
  @js.native
  sealed trait TX_FEE_BUMP_INNER_FAILED extends TransactionFailedResultCodes
  /* "tx_fee_bump_inner_failed" */ val TX_FEE_BUMP_INNER_FAILED: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_FEE_BUMP_INNER_FAILED with String = js.native
  
  @js.native
  sealed trait TX_FEE_BUMP_INNER_SUCCESS extends TransactionFailedResultCodes
  /* "tx_fee_bump_inner_success" */ val TX_FEE_BUMP_INNER_SUCCESS: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_FEE_BUMP_INNER_SUCCESS with String = js.native
  
  @js.native
  sealed trait TX_INSUFFICIENT_BALANCE extends TransactionFailedResultCodes
  /* "tx_insufficient_balance" */ val TX_INSUFFICIENT_BALANCE: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_INSUFFICIENT_BALANCE with String = js.native
  
  @js.native
  sealed trait TX_INSUFFICIENT_FEE extends TransactionFailedResultCodes
  /* "tx_insufficient_fee" */ val TX_INSUFFICIENT_FEE: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_INSUFFICIENT_FEE with String = js.native
  
  @js.native
  sealed trait TX_INTERNAL_ERROR extends TransactionFailedResultCodes
  /* "tx_internal_error" */ val TX_INTERNAL_ERROR: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_INTERNAL_ERROR with String = js.native
  
  @js.native
  sealed trait TX_MISSING_OPERATION extends TransactionFailedResultCodes
  /* "tx_missing_operation" */ val TX_MISSING_OPERATION: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_MISSING_OPERATION with String = js.native
  
  @js.native
  sealed trait TX_NOT_SUPPORTED extends TransactionFailedResultCodes
  /* "tx_not_supported" */ val TX_NOT_SUPPORTED: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_NOT_SUPPORTED with String = js.native
  
  @js.native
  sealed trait TX_NO_SOURCE_ACCOUNT extends TransactionFailedResultCodes
  /* "tx_no_source_account" */ val TX_NO_SOURCE_ACCOUNT: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_NO_SOURCE_ACCOUNT with String = js.native
  
  @js.native
  sealed trait TX_SUCCESS extends TransactionFailedResultCodes
  /* "tx_success" */ val TX_SUCCESS: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_SUCCESS with String = js.native
  
  @js.native
  sealed trait TX_TOO_EARLY extends TransactionFailedResultCodes
  /* "tx_too_early" */ val TX_TOO_EARLY: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_TOO_EARLY with String = js.native
  
  @js.native
  sealed trait TX_TOO_LATE extends TransactionFailedResultCodes
  /* "tx_too_late" */ val TX_TOO_LATE: typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes.TX_TOO_LATE with String = js.native
}
