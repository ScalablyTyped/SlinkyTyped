package typingsSlinky.sharepoint.SP.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrincipalType extends js.Object

@JSGlobal("SP.Utilities.PrincipalType")
@js.native
object PrincipalType extends js.Object {
  @js.native
  sealed trait all extends PrincipalType
  
  @js.native
  sealed trait distributionList extends PrincipalType
  
  @js.native
  sealed trait none extends PrincipalType
  
  @js.native
  sealed trait securityGroup extends PrincipalType
  
  @js.native
  sealed trait sharePointGroup extends PrincipalType
  
  @js.native
  sealed trait user extends PrincipalType
  
  /* 5 */ val all: typingsSlinky.sharepoint.SP.Utilities.PrincipalType.all with Double = js.native
  /* 2 */ val distributionList: typingsSlinky.sharepoint.SP.Utilities.PrincipalType.distributionList with Double = js.native
  /* 0 */ val none: typingsSlinky.sharepoint.SP.Utilities.PrincipalType.none with Double = js.native
  /* 3 */ val securityGroup: typingsSlinky.sharepoint.SP.Utilities.PrincipalType.securityGroup with Double = js.native
  /* 4 */ val sharePointGroup: typingsSlinky.sharepoint.SP.Utilities.PrincipalType.sharePointGroup with Double = js.native
  /* 1 */ val user: typingsSlinky.sharepoint.SP.Utilities.PrincipalType.user with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrincipalType with Double] = js.native
}

