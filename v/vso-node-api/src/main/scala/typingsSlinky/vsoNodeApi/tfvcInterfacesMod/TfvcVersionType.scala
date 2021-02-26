package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TfvcVersionType extends StObject
@JSImport("vso-node-api/interfaces/TfvcInterfaces", "TfvcVersionType")
@js.native
object TfvcVersionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionType with Double] = js.native
  
  @js.native
  sealed trait Change extends TfvcVersionType
  /* 3 */ val Change: typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.Change with Double = js.native
  
  @js.native
  sealed trait Changeset extends TfvcVersionType
  /* 1 */ val Changeset: typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.Changeset with Double = js.native
  
  @js.native
  sealed trait Date extends TfvcVersionType
  /* 4 */ val Date: typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.Date with Double = js.native
  
  @js.native
  sealed trait Latest extends TfvcVersionType
  /* 5 */ val Latest: typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.Latest with Double = js.native
  
  @js.native
  sealed trait MergeSource extends TfvcVersionType
  /* 7 */ val MergeSource: typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.MergeSource with Double = js.native
  
  @js.native
  sealed trait None extends TfvcVersionType
  /* 0 */ val None: typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.None with Double = js.native
  
  @js.native
  sealed trait Shelveset extends TfvcVersionType
  /* 2 */ val Shelveset: typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.Shelveset with Double = js.native
  
  @js.native
  sealed trait Tip extends TfvcVersionType
  /* 6 */ val Tip: typingsSlinky.vsoNodeApi.tfvcInterfacesMod.TfvcVersionType.Tip with Double = js.native
}
