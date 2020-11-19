package typingsSlinky.stellarSdk.horizonApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Horizon {
  
  type BalanceLine[T /* <: typingsSlinky.stellarBase.mod.AssetType */] = typingsSlinky.stellarSdk.horizonApiMod.Horizon.BalanceLineNative | (typingsSlinky.stellarSdk.horizonApiMod.Horizon.BalanceLineAsset[
    T | typingsSlinky.stellarBase.mod.AssetType.credit12 | typingsSlinky.stellarBase.mod.AssetType.credit4
  ])
  
  type ErrorResponseData = typingsSlinky.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.RateLimitExceeded | typingsSlinky.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.InternalServerError | typingsSlinky.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.TransactionFailed
  
  type InflationOperationResponse = typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse[
    typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseType.inflation, 
    typingsSlinky.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.inflation
  ]
  
  type TransactionResponseCollection = typingsSlinky.stellarSdk.horizonApiMod.Horizon.ResponseCollection[typingsSlinky.stellarSdk.horizonApiMod.Horizon.TransactionResponse]
}
