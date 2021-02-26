package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IssueType extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "IssueType")
@js.native
object IssueType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IssueType with Double] = js.native
  
  @js.native
  sealed trait Error extends IssueType
  /* 1 */ val Error: typingsSlinky.vsoNodeApi.buildInterfacesMod.IssueType.Error with Double = js.native
  
  @js.native
  sealed trait Warning extends IssueType
  /* 2 */ val Warning: typingsSlinky.vsoNodeApi.buildInterfacesMod.IssueType.Warning with Double = js.native
}
