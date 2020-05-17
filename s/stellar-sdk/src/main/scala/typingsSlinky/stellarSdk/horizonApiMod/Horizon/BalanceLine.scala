package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import typingsSlinky.stellarBase.mod.AssetType
import typingsSlinky.stellarBase.mod.AssetType.credit12
import typingsSlinky.stellarBase.mod.AssetType.credit4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.stellarSdk.horizonApiMod.Horizon.BalanceLineNative
  - typingsSlinky.stellarSdk.horizonApiMod.Horizon.BalanceLineAsset[
T | typingsSlinky.stellarBase.mod.AssetType.credit12 | typingsSlinky.stellarBase.mod.AssetType.credit4]
*/
trait BalanceLine[T /* <: AssetType */] extends js.Object

object BalanceLine {
  @scala.inline
  implicit def apply[T](value: BalanceLineAsset[T | credit12 | credit4]): BalanceLine[T] = value.asInstanceOf[BalanceLine[T]]
  @scala.inline
  implicit def apply[T](value: BalanceLineNative): BalanceLine[T] = value.asInstanceOf[BalanceLine[T]]
}

