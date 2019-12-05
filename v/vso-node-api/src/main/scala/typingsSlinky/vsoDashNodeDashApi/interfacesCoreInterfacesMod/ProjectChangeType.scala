package typingsSlinky.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectChangeType extends js.Object

@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProjectChangeType")
@js.native
object ProjectChangeType extends js.Object {
  @js.native
  sealed trait Added extends ProjectChangeType
  
  @js.native
  sealed trait Deleted extends ProjectChangeType
  
  @js.native
  sealed trait Modified extends ProjectChangeType
  
  /* 2 */ val Added: typingsSlinky.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ProjectChangeType.Added with Double = js.native
  /* 1 */ val Deleted: typingsSlinky.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ProjectChangeType.Deleted with Double = js.native
  /* 0 */ val Modified: typingsSlinky.vsoDashNodeDashApi.interfacesCoreInterfacesMod.ProjectChangeType.Modified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectChangeType with Double] = js.native
}

