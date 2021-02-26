package typingsSlinky.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectVisibility extends StObject
@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProjectVisibility")
@js.native
object ProjectVisibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectVisibility with Double] = js.native
  
  @js.native
  sealed trait Organization extends ProjectVisibility
  /* 1 */ val Organization: typingsSlinky.vsoNodeApi.coreInterfacesMod.ProjectVisibility.Organization with Double = js.native
  
  @js.native
  sealed trait Private extends ProjectVisibility
  /* 0 */ val Private: typingsSlinky.vsoNodeApi.coreInterfacesMod.ProjectVisibility.Private with Double = js.native
  
  @js.native
  sealed trait Public extends ProjectVisibility
  /* 2 */ val Public: typingsSlinky.vsoNodeApi.coreInterfacesMod.ProjectVisibility.Public with Double = js.native
  
  @js.native
  sealed trait Unchanged extends ProjectVisibility
  /* -1 */ val Unchanged: typingsSlinky.vsoNodeApi.coreInterfacesMod.ProjectVisibility.Unchanged with Double = js.native
}
