package typingsSlinky.sharepoint.SP.UserProfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FollowedContentQueryOptions extends js.Object

@JSGlobal("SP.UserProfiles.FollowedContentQueryOptions")
@js.native
object FollowedContentQueryOptions extends js.Object {
  @js.native
  sealed trait all extends FollowedContentQueryOptions
  
  @js.native
  sealed trait defaultOptions extends FollowedContentQueryOptions
  
  @js.native
  sealed trait documents extends FollowedContentQueryOptions
  
  @js.native
  sealed trait hidden extends FollowedContentQueryOptions
  
  @js.native
  sealed trait nonFeed extends FollowedContentQueryOptions
  
  @js.native
  sealed trait sites extends FollowedContentQueryOptions
  
  @js.native
  sealed trait unset extends FollowedContentQueryOptions
  
  /* 6 */ val all: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.all with Double = js.native
  /* 5 */ val defaultOptions: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.defaultOptions with Double = js.native
  /* 2 */ val documents: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.documents with Double = js.native
  /* 3 */ val hidden: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.hidden with Double = js.native
  /* 4 */ val nonFeed: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.nonFeed with Double = js.native
  /* 1 */ val sites: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.sites with Double = js.native
  /* 0 */ val unset: typingsSlinky.sharepoint.SP.UserProfiles.FollowedContentQueryOptions.unset with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FollowedContentQueryOptions with Double] = js.native
}

