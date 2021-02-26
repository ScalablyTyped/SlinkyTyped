package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildOptionInputType extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildOptionInputType")
@js.native
object BuildOptionInputType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildOptionInputType with Double] = js.native
  
  @js.native
  sealed trait Boolean extends BuildOptionInputType
  /* 1 */ val Boolean: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildOptionInputType.Boolean with Double = js.native
  
  @js.native
  sealed trait BranchFilter extends BuildOptionInputType
  /* 6 */ val BranchFilter: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildOptionInputType.BranchFilter with Double = js.native
  
  @js.native
  sealed trait MultiLine extends BuildOptionInputType
  /* 5 */ val MultiLine: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildOptionInputType.MultiLine with Double = js.native
  
  @js.native
  sealed trait PickList extends BuildOptionInputType
  /* 4 */ val PickList: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildOptionInputType.PickList with Double = js.native
  
  @js.native
  sealed trait Radio extends BuildOptionInputType
  /* 3 */ val Radio: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildOptionInputType.Radio with Double = js.native
  
  @js.native
  sealed trait String extends BuildOptionInputType
  /* 0 */ val String: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildOptionInputType.String with Double = js.native
  
  @js.native
  sealed trait StringList extends BuildOptionInputType
  /* 2 */ val StringList: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildOptionInputType.StringList with Double = js.native
}
