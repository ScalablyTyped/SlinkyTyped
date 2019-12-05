package typingsSlinky.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserActionType extends js.Object

@JSGlobal("Srch.UserActionType")
@js.native
object UserActionType extends js.Object {
  @js.native
  sealed trait filterLanguage extends UserActionType
  
  @js.native
  sealed trait pageNext extends UserActionType
  
  @js.native
  sealed trait pagePrev extends UserActionType
  
  @js.native
  sealed trait refine extends UserActionType
  
  @js.native
  sealed trait search extends UserActionType
  
  @js.native
  sealed trait sort extends UserActionType
  
  /* 5 */ val filterLanguage: typingsSlinky.sharepoint.Srch.UserActionType.filterLanguage with Double = js.native
  /* 1 */ val pageNext: typingsSlinky.sharepoint.Srch.UserActionType.pageNext with Double = js.native
  /* 2 */ val pagePrev: typingsSlinky.sharepoint.Srch.UserActionType.pagePrev with Double = js.native
  /* 3 */ val refine: typingsSlinky.sharepoint.Srch.UserActionType.refine with Double = js.native
  /* 0 */ val search: typingsSlinky.sharepoint.Srch.UserActionType.search with Double = js.native
  /* 4 */ val sort: typingsSlinky.sharepoint.Srch.UserActionType.sort with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserActionType with Double] = js.native
}

