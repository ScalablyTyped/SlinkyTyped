package typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BuildOptionInputType extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildOptionInputType")
@js.native
object BuildOptionInputType extends js.Object {
  @js.native
  sealed trait Boolean extends BuildOptionInputType
  
  @js.native
  sealed trait BranchFilter extends BuildOptionInputType
  
  @js.native
  sealed trait MultiLine extends BuildOptionInputType
  
  @js.native
  sealed trait PickList extends BuildOptionInputType
  
  @js.native
  sealed trait Radio extends BuildOptionInputType
  
  @js.native
  sealed trait String extends BuildOptionInputType
  
  @js.native
  sealed trait StringList extends BuildOptionInputType
  
  /* 1 */ val Boolean: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildOptionInputType.Boolean with Double = js.native
  /* 6 */ val BranchFilter: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildOptionInputType.BranchFilter with Double = js.native
  /* 5 */ val MultiLine: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildOptionInputType.MultiLine with Double = js.native
  /* 4 */ val PickList: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildOptionInputType.PickList with Double = js.native
  /* 3 */ val Radio: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildOptionInputType.Radio with Double = js.native
  /* 0 */ val String: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildOptionInputType.String with Double = js.native
  /* 2 */ val StringList: typingsSlinky.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildOptionInputType.StringList with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildOptionInputType with Double] = js.native
}

