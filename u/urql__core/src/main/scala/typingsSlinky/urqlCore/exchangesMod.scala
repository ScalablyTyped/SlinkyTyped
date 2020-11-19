package typingsSlinky.urqlCore

import typingsSlinky.urqlCore.ssrMod.SSRExchangeParams
import typingsSlinky.urqlCore.ssrMod.SSRExchange_
import typingsSlinky.urqlCore.subscriptionMod.SubscriptionExchangeOpts
import typingsSlinky.urqlCore.typesMod.Exchange
import typingsSlinky.urqlCore.typesMod.ExchangeIO
import typingsSlinky.urqlCore.typesMod.ExchangeInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@urql/core/dist/types/exchanges", JSImport.Namespace)
@js.native
object exchangesMod extends js.Object {
  
  val cacheExchange: Exchange = js.native
  
  def composeExchanges(exchanges: js.Array[Exchange]): js.Function1[/* hasClientForwardDispatchDebug */ ExchangeInput, ExchangeIO] = js.native
  
  val debugExchange: Exchange = js.native
  
  val dedupExchange: Exchange = js.native
  
  val defaultExchanges: js.Array[Exchange] = js.native
  
  val fallbackExchangeIO: ExchangeIO = js.native
  
  val fetchExchange: Exchange = js.native
  
  def ssrExchange(): SSRExchange_ = js.native
  def ssrExchange(params: SSRExchangeParams): SSRExchange_ = js.native
  
  def subscriptionExchange(hasForwardSubscriptionEnableAllOperations: SubscriptionExchangeOpts): Exchange = js.native
}
