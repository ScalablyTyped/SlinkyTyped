package typingsSlinky.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectChangeType extends StObject
@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProjectChangeType")
@js.native
object ProjectChangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectChangeType with Double] = js.native
  
  @js.native
  sealed trait Added extends ProjectChangeType
  /* 2 */ val Added: typingsSlinky.vsoNodeApi.coreInterfacesMod.ProjectChangeType.Added with Double = js.native
  
  @js.native
  sealed trait Deleted extends ProjectChangeType
  /* 1 */ val Deleted: typingsSlinky.vsoNodeApi.coreInterfacesMod.ProjectChangeType.Deleted with Double = js.native
  
  @js.native
  sealed trait Modified extends ProjectChangeType
  /* 0 */ val Modified: typingsSlinky.vsoNodeApi.coreInterfacesMod.ProjectChangeType.Modified with Double = js.native
}
