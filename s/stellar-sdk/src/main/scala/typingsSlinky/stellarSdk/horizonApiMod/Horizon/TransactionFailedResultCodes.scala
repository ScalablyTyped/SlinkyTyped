package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransactionFailedResultCodes extends js.Object
@JSImport("stellar-sdk/lib/horizon_api", "Horizon.TransactionFailedResultCodes")
@js.native
object TransactionFailedResultCodes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TransactionFailedResultCodes with String] = js.native
  
  @js.native
  sealed trait TX_BAD_AUTH extends TransactionFailedResultCodes
  /* "tx_bad_auth" */ @js.native
  object TX_BAD_AUTH extends TopLevel[TX_BAD_AUTH with String]
  
  @js.native
  sealed trait TX_BAD_AUTH_EXTRA extends TransactionFailedResultCodes
  /* "tx_bad_auth_extra" */ @js.native
  object TX_BAD_AUTH_EXTRA extends TopLevel[TX_BAD_AUTH_EXTRA with String]
  
  @js.native
  sealed trait TX_BAD_SEQ extends TransactionFailedResultCodes
  /* "tx_bad_seq" */ @js.native
  object TX_BAD_SEQ extends TopLevel[TX_BAD_SEQ with String]
  
  @js.native
  sealed trait TX_FAILED extends TransactionFailedResultCodes
  /* "tx_failed" */ @js.native
  object TX_FAILED extends TopLevel[TX_FAILED with String]
  
  @js.native
  sealed trait TX_FEE_BUMP_INNER_FAILED extends TransactionFailedResultCodes
  /* "tx_fee_bump_inner_failed" */ @js.native
  object TX_FEE_BUMP_INNER_FAILED extends TopLevel[TX_FEE_BUMP_INNER_FAILED with String]
  
  @js.native
  sealed trait TX_FEE_BUMP_INNER_SUCCESS extends TransactionFailedResultCodes
  /* "tx_fee_bump_inner_success" */ @js.native
  object TX_FEE_BUMP_INNER_SUCCESS extends TopLevel[TX_FEE_BUMP_INNER_SUCCESS with String]
  
  @js.native
  sealed trait TX_INSUFFICIENT_BALANCE extends TransactionFailedResultCodes
  /* "tx_insufficient_balance" */ @js.native
  object TX_INSUFFICIENT_BALANCE extends TopLevel[TX_INSUFFICIENT_BALANCE with String]
  
  @js.native
  sealed trait TX_INSUFFICIENT_FEE extends TransactionFailedResultCodes
  /* "tx_insufficient_fee" */ @js.native
  object TX_INSUFFICIENT_FEE extends TopLevel[TX_INSUFFICIENT_FEE with String]
  
  @js.native
  sealed trait TX_INTERNAL_ERROR extends TransactionFailedResultCodes
  /* "tx_internal_error" */ @js.native
  object TX_INTERNAL_ERROR extends TopLevel[TX_INTERNAL_ERROR with String]
  
  @js.native
  sealed trait TX_MISSING_OPERATION extends TransactionFailedResultCodes
  /* "tx_missing_operation" */ @js.native
  object TX_MISSING_OPERATION extends TopLevel[TX_MISSING_OPERATION with String]
  
  @js.native
  sealed trait TX_NOT_SUPPORTED extends TransactionFailedResultCodes
  /* "tx_not_supported" */ @js.native
  object TX_NOT_SUPPORTED extends TopLevel[TX_NOT_SUPPORTED with String]
  
  @js.native
  sealed trait TX_NO_SOURCE_ACCOUNT extends TransactionFailedResultCodes
  /* "tx_no_source_account" */ @js.native
  object TX_NO_SOURCE_ACCOUNT extends TopLevel[TX_NO_SOURCE_ACCOUNT with String]
  
  @js.native
  sealed trait TX_SUCCESS extends TransactionFailedResultCodes
  /* "tx_success" */ @js.native
  object TX_SUCCESS extends TopLevel[TX_SUCCESS with String]
  
  @js.native
  sealed trait TX_TOO_EARLY extends TransactionFailedResultCodes
  /* "tx_too_early" */ @js.native
  object TX_TOO_EARLY extends TopLevel[TX_TOO_EARLY with String]
  
  @js.native
  sealed trait TX_TOO_LATE extends TransactionFailedResultCodes
  /* "tx_too_late" */ @js.native
  object TX_TOO_LATE extends TopLevel[TX_TOO_LATE with String]
}
