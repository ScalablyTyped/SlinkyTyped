package typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Horizon {
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.AssetType
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.AssetType.credit12
  import typingsSlinky.stellarDashBase.stellarDashBaseMod.AssetType.credit4
  import typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ErrorResponseData.InternalServerError
  import typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ErrorResponseData.RateLimitExceeded
  import typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.ErrorResponseData.TransactionFailed
  import typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseType.inflation

  type BalanceLine[T /* <: AssetType */] = BalanceLineNative | (BalanceLineAsset[T | credit12 | credit4])
  type ErrorResponseData = RateLimitExceeded | InternalServerError | TransactionFailed
  type InflationOperationResponse = BaseOperationResponse[
    inflation, 
    typingsSlinky.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.OperationResponseTypeI.inflation
  ]
  type TransactionResponseCollection = ResponseCollection[TransactionResponse]
}
