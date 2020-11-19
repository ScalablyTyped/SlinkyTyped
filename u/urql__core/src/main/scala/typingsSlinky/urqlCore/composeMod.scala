package typingsSlinky.urqlCore

import typingsSlinky.urqlCore.typesMod.Exchange
import typingsSlinky.urqlCore.typesMod.ExchangeIO
import typingsSlinky.urqlCore.typesMod.ExchangeInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@urql/core/dist/types/exchanges/compose", JSImport.Namespace)
@js.native
object composeMod extends js.Object {
  
  def composeExchanges(exchanges: js.Array[Exchange]): js.Function1[/* hasClientForwardDispatchDebug */ ExchangeInput, ExchangeIO] = js.native
}
