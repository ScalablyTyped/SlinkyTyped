package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GetOption extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "GetOption")
@js.native
object GetOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetOption with Double] = js.native
  
  /**
    * A user-specified version has been supplied.
    */
  @js.native
  sealed trait Custom extends GetOption
  /* 2 */ val Custom: typingsSlinky.vsoNodeApi.buildInterfacesMod.GetOption.Custom with Double = js.native
  
  /**
    * Use the latest changeset at the time the build is started.
    */
  @js.native
  sealed trait LatestOnBuild extends GetOption
  /* 1 */ val LatestOnBuild: typingsSlinky.vsoNodeApi.buildInterfacesMod.GetOption.LatestOnBuild with Double = js.native
  
  /**
    * Use the latest changeset at the time the build is queued.
    */
  @js.native
  sealed trait LatestOnQueue extends GetOption
  /* 0 */ val LatestOnQueue: typingsSlinky.vsoNodeApi.buildInterfacesMod.GetOption.LatestOnQueue with Double = js.native
}
