package typingsSlinky.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClientStatAggregateMethod extends js.Object

@JSImport("steam-client", "EClientStatAggregateMethod")
@js.native
object EClientStatAggregateMethod extends js.Object {
  @js.native
  sealed trait Event extends EClientStatAggregateMethod
  
  @js.native
  sealed trait LatestOnly extends EClientStatAggregateMethod
  
  @js.native
  sealed trait Scalar extends EClientStatAggregateMethod
  
  @js.native
  sealed trait Sum extends EClientStatAggregateMethod
  
  /* 2 */ val Event: typingsSlinky.steamDashClient.steamDashClientMod.EClientStatAggregateMethod.Event with Double = js.native
  /* 0 */ val LatestOnly: typingsSlinky.steamDashClient.steamDashClientMod.EClientStatAggregateMethod.LatestOnly with Double = js.native
  /* 3 */ val Scalar: typingsSlinky.steamDashClient.steamDashClientMod.EClientStatAggregateMethod.Scalar with Double = js.native
  /* 1 */ val Sum: typingsSlinky.steamDashClient.steamDashClientMod.EClientStatAggregateMethod.Sum with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientStatAggregateMethod with Double] = js.native
}

