package typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomTestFieldType extends js.Object

@JSImport("vso-node-api/interfaces/TestInterfaces", "CustomTestFieldType")
@js.native
object CustomTestFieldType extends js.Object {
  @js.native
  sealed trait Bit extends CustomTestFieldType
  
  @js.native
  sealed trait DateTime extends CustomTestFieldType
  
  @js.native
  sealed trait Float extends CustomTestFieldType
  
  @js.native
  sealed trait Guid extends CustomTestFieldType
  
  @js.native
  sealed trait Int extends CustomTestFieldType
  
  @js.native
  sealed trait String extends CustomTestFieldType
  
  /* 2 */ val Bit: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldType.Bit with Double = js.native
  /* 4 */ val DateTime: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldType.DateTime with Double = js.native
  /* 6 */ val Float: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldType.Float with Double = js.native
  /* 14 */ val Guid: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldType.Guid with Double = js.native
  /* 8 */ val Int: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldType.Int with Double = js.native
  /* 12 */ val String: typingsSlinky.vsoDashNodeDashApi.interfacesTestInterfacesMod.CustomTestFieldType.String with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomTestFieldType with Double] = js.native
}

