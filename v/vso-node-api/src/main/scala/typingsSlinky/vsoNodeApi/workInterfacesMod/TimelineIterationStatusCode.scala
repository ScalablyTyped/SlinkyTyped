package typingsSlinky.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimelineIterationStatusCode extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimelineIterationStatusCode")
@js.native
object TimelineIterationStatusCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineIterationStatusCode with Double] = js.native
  
  /**
    * This iteration overlaps with another iteration, no data is returned for this iteration.
    */
  @js.native
  sealed trait IsOverlapping extends TimelineIterationStatusCode
  /* 1 */ val IsOverlapping: typingsSlinky.vsoNodeApi.workInterfacesMod.TimelineIterationStatusCode.IsOverlapping with Double = js.native
  
  /**
    * No error - iteration data is good.
    */
  @js.native
  sealed trait OK extends TimelineIterationStatusCode
  /* 0 */ val OK: typingsSlinky.vsoNodeApi.workInterfacesMod.TimelineIterationStatusCode.OK with Double = js.native
}
