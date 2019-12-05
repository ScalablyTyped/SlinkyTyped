package typingsSlinky.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Operation extends js.Object

@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "Operation")
@js.native
object Operation extends js.Object {
  @js.native
  sealed trait Add extends Operation
  
  @js.native
  sealed trait Copy extends Operation
  
  @js.native
  sealed trait Move extends Operation
  
  @js.native
  sealed trait Remove extends Operation
  
  @js.native
  sealed trait Replace extends Operation
  
  @js.native
  sealed trait Test extends Operation
  
  /* 0 */ val Add: typingsSlinky.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.Operation.Add with Double = js.native
  /* 4 */ val Copy: typingsSlinky.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.Operation.Copy with Double = js.native
  /* 3 */ val Move: typingsSlinky.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.Operation.Move with Double = js.native
  /* 1 */ val Remove: typingsSlinky.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.Operation.Remove with Double = js.native
  /* 2 */ val Replace: typingsSlinky.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.Operation.Replace with Double = js.native
  /* 5 */ val Test: typingsSlinky.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.Operation.Test with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Operation with Double] = js.native
}

