package typingsSlinky.twoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends StObject
@JSImport("two.js", "Events")
@js.native
object Events extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Events with Double] = js.native
  
  @js.native
  sealed trait change extends Events
  /* 0 */ val change: typingsSlinky.twoJs.mod.Events.change with Double = js.native
  
  @js.native
  sealed trait insert extends Events
  /* 1 */ val insert: typingsSlinky.twoJs.mod.Events.insert with Double = js.native
  
  @js.native
  sealed trait load extends Events
  /* 2 */ val load: typingsSlinky.twoJs.mod.Events.load with Double = js.native
  
  @js.native
  sealed trait order extends Events
  /* 3 */ val order: typingsSlinky.twoJs.mod.Events.order with Double = js.native
  
  @js.native
  sealed trait pause extends Events
  /* 4 */ val pause: typingsSlinky.twoJs.mod.Events.pause with Double = js.native
  
  @js.native
  sealed trait play extends Events
  /* 5 */ val play: typingsSlinky.twoJs.mod.Events.play with Double = js.native
  
  @js.native
  sealed trait remove extends Events
  /* 6 */ val remove: typingsSlinky.twoJs.mod.Events.remove with Double = js.native
  
  @js.native
  sealed trait render extends Events
  /* 7 */ val render: typingsSlinky.twoJs.mod.Events.render with Double = js.native
  
  @js.native
  sealed trait resize extends Events
  /* 8 */ val resize: typingsSlinky.twoJs.mod.Events.resize with Double = js.native
  
  @js.native
  sealed trait update extends Events
  /* 9 */ val update: typingsSlinky.twoJs.mod.Events.update with Double = js.native
}
