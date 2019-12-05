package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoleType extends js.Object

@JSGlobal("SP.RoleType")
@js.native
object RoleType extends js.Object {
  @js.native
  sealed trait administrator extends RoleType
  
  @js.native
  sealed trait contributor extends RoleType
  
  @js.native
  sealed trait editor extends RoleType
  
  @js.native
  sealed trait guest extends RoleType
  
  @js.native
  sealed trait none extends RoleType
  
  @js.native
  sealed trait reader extends RoleType
  
  @js.native
  sealed trait webDesigner extends RoleType
  
  /* 5 */ val administrator: typingsSlinky.sharepoint.SP.RoleType.administrator with Double = js.native
  /* 3 */ val contributor: typingsSlinky.sharepoint.SP.RoleType.contributor with Double = js.native
  /* 6 */ val editor: typingsSlinky.sharepoint.SP.RoleType.editor with Double = js.native
  /* 1 */ val guest: typingsSlinky.sharepoint.SP.RoleType.guest with Double = js.native
  /* 0 */ val none: typingsSlinky.sharepoint.SP.RoleType.none with Double = js.native
  /* 2 */ val reader: typingsSlinky.sharepoint.SP.RoleType.reader with Double = js.native
  /* 4 */ val webDesigner: typingsSlinky.sharepoint.SP.RoleType.webDesigner with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoleType with Double] = js.native
}

