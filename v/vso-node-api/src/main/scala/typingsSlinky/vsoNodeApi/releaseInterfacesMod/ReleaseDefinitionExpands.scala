package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseDefinitionExpands extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionExpands")
@js.native
object ReleaseDefinitionExpands extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionExpands with Double] = js.native
  
  @js.native
  sealed trait Artifacts extends ReleaseDefinitionExpands
  /* 4 */ val Artifacts: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.Artifacts with Double = js.native
  
  @js.native
  sealed trait Environments extends ReleaseDefinitionExpands
  /* 2 */ val Environments: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.Environments with Double = js.native
  
  @js.native
  sealed trait LastRelease extends ReleaseDefinitionExpands
  /* 64 */ val LastRelease: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.LastRelease with Double = js.native
  
  @js.native
  sealed trait None extends ReleaseDefinitionExpands
  /* 0 */ val None: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.None with Double = js.native
  
  @js.native
  sealed trait Tags extends ReleaseDefinitionExpands
  /* 32 */ val Tags: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.Tags with Double = js.native
  
  @js.native
  sealed trait Triggers extends ReleaseDefinitionExpands
  /* 8 */ val Triggers: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.Triggers with Double = js.native
  
  @js.native
  sealed trait Variables extends ReleaseDefinitionExpands
  /* 16 */ val Variables: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseDefinitionExpands.Variables with Double = js.native
}
