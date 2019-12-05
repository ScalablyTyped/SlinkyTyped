package typingsSlinky.twoDotJs.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Events extends js.Object

@JSImport("two.js", "Events")
@js.native
object Events extends js.Object {
  @js.native
  sealed trait change extends Events
  
  @js.native
  sealed trait insert extends Events
  
  @js.native
  sealed trait load extends Events
  
  @js.native
  sealed trait order extends Events
  
  @js.native
  sealed trait pause extends Events
  
  @js.native
  sealed trait play extends Events
  
  @js.native
  sealed trait remove extends Events
  
  @js.native
  sealed trait render extends Events
  
  @js.native
  sealed trait resize extends Events
  
  @js.native
  sealed trait update extends Events
  
  /* 0 */ val change: typingsSlinky.twoDotJs.twoDotJsMod.Events.change with Double = js.native
  /* 1 */ val insert: typingsSlinky.twoDotJs.twoDotJsMod.Events.insert with Double = js.native
  /* 2 */ val load: typingsSlinky.twoDotJs.twoDotJsMod.Events.load with Double = js.native
  /* 3 */ val order: typingsSlinky.twoDotJs.twoDotJsMod.Events.order with Double = js.native
  /* 4 */ val pause: typingsSlinky.twoDotJs.twoDotJsMod.Events.pause with Double = js.native
  /* 5 */ val play: typingsSlinky.twoDotJs.twoDotJsMod.Events.play with Double = js.native
  /* 6 */ val remove: typingsSlinky.twoDotJs.twoDotJsMod.Events.remove with Double = js.native
  /* 7 */ val render: typingsSlinky.twoDotJs.twoDotJsMod.Events.render with Double = js.native
  /* 8 */ val resize: typingsSlinky.twoDotJs.twoDotJsMod.Events.resize with Double = js.native
  /* 9 */ val update: typingsSlinky.twoDotJs.twoDotJsMod.Events.update with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Events with Double] = js.native
}

