package typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefinitionType extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "DefinitionType")
@js.native
object DefinitionType extends js.Object {
  @js.native
  sealed trait Build extends DefinitionType
  
  @js.native
  sealed trait Xaml extends DefinitionType
  
  /* 2 */ val Build: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionType.Build with Double = js.native
  /* 1 */ val Xaml: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionType.Xaml with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefinitionType with Double] = js.native
}

