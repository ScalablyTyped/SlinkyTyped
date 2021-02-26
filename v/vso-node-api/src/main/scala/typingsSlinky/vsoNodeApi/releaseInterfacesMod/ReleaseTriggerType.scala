package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseTriggerType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseTriggerType")
@js.native
object ReleaseTriggerType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseTriggerType with Double] = js.native
  
  @js.native
  sealed trait ArtifactSource extends ReleaseTriggerType
  /* 1 */ val ArtifactSource: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.ArtifactSource with Double = js.native
  
  @js.native
  sealed trait ContainerImage extends ReleaseTriggerType
  /* 4 */ val ContainerImage: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.ContainerImage with Double = js.native
  
  @js.native
  sealed trait Package extends ReleaseTriggerType
  /* 5 */ val Package: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.Package with Double = js.native
  
  @js.native
  sealed trait PullRequest extends ReleaseTriggerType
  /* 6 */ val PullRequest: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.PullRequest with Double = js.native
  
  @js.native
  sealed trait Schedule extends ReleaseTriggerType
  /* 2 */ val Schedule: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.Schedule with Double = js.native
  
  @js.native
  sealed trait SourceRepo extends ReleaseTriggerType
  /* 3 */ val SourceRepo: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.SourceRepo with Double = js.native
  
  @js.native
  sealed trait Undefined extends ReleaseTriggerType
  /* 0 */ val Undefined: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ReleaseTriggerType.Undefined with Double = js.native
}
