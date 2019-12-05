package typingsSlinky.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TfvcVersionType extends js.Object

@JSImport("vso-node-api/interfaces/TfvcInterfaces", "TfvcVersionType")
@js.native
object TfvcVersionType extends js.Object {
  @js.native
  sealed trait Change extends TfvcVersionType
  
  @js.native
  sealed trait Changeset extends TfvcVersionType
  
  @js.native
  sealed trait Date extends TfvcVersionType
  
  @js.native
  sealed trait Latest extends TfvcVersionType
  
  @js.native
  sealed trait MergeSource extends TfvcVersionType
  
  @js.native
  sealed trait None extends TfvcVersionType
  
  @js.native
  sealed trait Shelveset extends TfvcVersionType
  
  @js.native
  sealed trait Tip extends TfvcVersionType
  
  /* 3 */ val Change: typingsSlinky.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.Change with Double = js.native
  /* 1 */ val Changeset: typingsSlinky.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.Changeset with Double = js.native
  /* 4 */ val Date: typingsSlinky.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.Date with Double = js.native
  /* 5 */ val Latest: typingsSlinky.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.Latest with Double = js.native
  /* 7 */ val MergeSource: typingsSlinky.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.MergeSource with Double = js.native
  /* 0 */ val None: typingsSlinky.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.None with Double = js.native
  /* 2 */ val Shelveset: typingsSlinky.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.Shelveset with Double = js.native
  /* 6 */ val Tip: typingsSlinky.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.Tip with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionType with Double] = js.native
}

