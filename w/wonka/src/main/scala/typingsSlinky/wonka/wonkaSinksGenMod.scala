package typingsSlinky.wonka

import typingsSlinky.wonka.wonkaTypesGenMod.sourceT
import typingsSlinky.wonka.wonkaTypesGenMod.subscriptionT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/dist/types/src/Wonka_sinks.gen", JSImport.Namespace)
@js.native
object wonkaSinksGenMod extends js.Object {
  
  def forEach[a](f: js.Function1[/* _1 */ a, Unit]): forEachConsumerT[a] = js.native
  
  def publish[a](source: sourceT[a]): subscriptionT = js.native
  
  def subscribe[a](f: js.Function1[/* _1 */ a, Unit]): subscribeConsumerT[a] = js.native
  
  def toArray[a](source: sourceT[a]): js.Array[a] = js.native
  
  type forEachConsumerT[a] = js.Function1[/* _1 */ sourceT[a], Unit]
  
  type subscribeConsumerT[a] = js.Function1[/* _1 */ sourceT[a], subscriptionT]
}
