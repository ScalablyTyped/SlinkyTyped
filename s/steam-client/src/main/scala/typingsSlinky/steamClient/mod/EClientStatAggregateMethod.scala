package typingsSlinky.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClientStatAggregateMethod extends StObject
@JSImport("steam-client", "EClientStatAggregateMethod")
@js.native
object EClientStatAggregateMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientStatAggregateMethod with Double] = js.native
  
  @js.native
  sealed trait Event extends EClientStatAggregateMethod
  /* 2 */ val Event: typingsSlinky.steamClient.mod.EClientStatAggregateMethod.Event with Double = js.native
  
  @js.native
  sealed trait LatestOnly extends EClientStatAggregateMethod
  /* 0 */ val LatestOnly: typingsSlinky.steamClient.mod.EClientStatAggregateMethod.LatestOnly with Double = js.native
  
  @js.native
  sealed trait Scalar extends EClientStatAggregateMethod
  /* 3 */ val Scalar: typingsSlinky.steamClient.mod.EClientStatAggregateMethod.Scalar with Double = js.native
  
  @js.native
  sealed trait Sum extends EClientStatAggregateMethod
  /* 1 */ val Sum: typingsSlinky.steamClient.mod.EClientStatAggregateMethod.Sum with Double = js.native
}
