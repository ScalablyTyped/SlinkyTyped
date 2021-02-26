package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueuePriority extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "QueuePriority")
@js.native
object QueuePriority extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueuePriority with Double] = js.native
  
  /**
    * Above normal priority.
    */
  @js.native
  sealed trait AboveNormal extends QueuePriority
  /* 2 */ val AboveNormal: typingsSlinky.vsoNodeApi.buildInterfacesMod.QueuePriority.AboveNormal with Double = js.native
  
  /**
    * Below normal priority.
    */
  @js.native
  sealed trait BelowNormal extends QueuePriority
  /* 4 */ val BelowNormal: typingsSlinky.vsoNodeApi.buildInterfacesMod.QueuePriority.BelowNormal with Double = js.native
  
  /**
    * High priority.
    */
  @js.native
  sealed trait High extends QueuePriority
  /* 1 */ val High: typingsSlinky.vsoNodeApi.buildInterfacesMod.QueuePriority.High with Double = js.native
  
  /**
    * Low priority.
    */
  @js.native
  sealed trait Low extends QueuePriority
  /* 5 */ val Low: typingsSlinky.vsoNodeApi.buildInterfacesMod.QueuePriority.Low with Double = js.native
  
  /**
    * Normal priority.
    */
  @js.native
  sealed trait Normal extends QueuePriority
  /* 3 */ val Normal: typingsSlinky.vsoNodeApi.buildInterfacesMod.QueuePriority.Normal with Double = js.native
}
