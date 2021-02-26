package typingsSlinky.vkOpenapi.vk.OpenAPI.Widgets

import typingsSlinky.vkOpenapi.vk.OpenAPI.Nullable
import typingsSlinky.vkOpenapi.vk.OpenAPI.NumericBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait API extends StObject {
  
  def AllowMessagesFromCommunity(elementId: String, options: Nullable[AllowMessagesFromCommunityOptions], groupId: Double): Double = js.native
  
  def App(elementId: String, appId: Double): Double = js.native
  def App(elementId: String, appId: Double, options: AppOptions): Double = js.native
  
  def Article(elementId: String, articleId: String): Double = js.native
  
  def Auth(elementId: String): Double = js.native
  def Auth(elementId: String, options: AuthOptions): Double = js.native
  
  def Bookmarks(elementId: String): Double = js.native
  def Bookmarks(elementId: String, options: BookmarksOptions): Double = js.native
  
  def Comments(elementId: String): Double = js.native
  def Comments(elementId: String, options: js.UndefOr[scala.Nothing], pageId: String): Double = js.native
  def Comments(elementId: String, options: CommentsOptions): Double = js.native
  def Comments(elementId: String, options: CommentsOptions, pageId: String): Double = js.native
  
  def CommunityMessages(elementId: String, groupId: Double): typingsSlinky.vkOpenapi.vk.OpenAPI.Widgets.CommunityMessages = js.native
  def CommunityMessages(elementId: String, groupId: Double, options: CommunityMessagesOptions): typingsSlinky.vkOpenapi.vk.OpenAPI.Widgets.CommunityMessages = js.native
  
  def ContactUs(elementId: String, options: Nullable[ContactUsOptions], ownerId: Double): Double = js.native
  
  def Group(elementId: String, options: Nullable[GroupOptions], groupId: Double): Double = js.native
  
  def Like(elementId: String): Double = js.native
  def Like(elementId: String, options: js.UndefOr[scala.Nothing], pageId: String): Double = js.native
  def Like(elementId: String, options: LikeOptions): Double = js.native
  def Like(elementId: String, options: LikeOptions, pageId: String): Double = js.native
  
  def Playlist(elementId: String, ownerId: Double, playlistId: Double, hash: String): Double = js.native
  def Playlist(elementId: String, ownerId: Double, playlistId: Double, hash: String, options: PlaylistOptions): Double = js.native
  
  def Podcast(elementId: String, episodeId: String, hash: String): Double = js.native
  
  def Poll(elementId: String, options: Nullable[PollOptions], pollId: String): Double = js.native
  
  def Post(elementId: String, ownerId: Double, postId: Double, hash: String): Double = js.native
  def Post(elementId: String, ownerId: Double, postId: Double, hash: String, options: PostOptions): Double = js.native
  
  def Recommended(elementId: String): Double = js.native
  def Recommended(
    elementId: String,
    options: js.UndefOr[scala.Nothing],
    verb: js.UndefOr[scala.Nothing],
    sort: js.UndefOr[scala.Nothing],
    target: RecommendedTarget
  ): Double = js.native
  def Recommended(
    elementId: String,
    options: js.UndefOr[scala.Nothing],
    verb: js.UndefOr[scala.Nothing],
    sort: RecommendedSort
  ): Double = js.native
  def Recommended(
    elementId: String,
    options: js.UndefOr[scala.Nothing],
    verb: js.UndefOr[scala.Nothing],
    sort: RecommendedSort,
    target: RecommendedTarget
  ): Double = js.native
  def Recommended(elementId: String, options: js.UndefOr[scala.Nothing], verb: NumericBoolean): Double = js.native
  def Recommended(
    elementId: String,
    options: js.UndefOr[scala.Nothing],
    verb: NumericBoolean,
    sort: js.UndefOr[scala.Nothing],
    target: RecommendedTarget
  ): Double = js.native
  def Recommended(elementId: String, options: js.UndefOr[scala.Nothing], verb: NumericBoolean, sort: RecommendedSort): Double = js.native
  def Recommended(
    elementId: String,
    options: js.UndefOr[scala.Nothing],
    verb: NumericBoolean,
    sort: RecommendedSort,
    target: RecommendedTarget
  ): Double = js.native
  def Recommended(elementId: String, options: RecommendedOptions): Double = js.native
  def Recommended(
    elementId: String,
    options: RecommendedOptions,
    verb: js.UndefOr[scala.Nothing],
    sort: js.UndefOr[scala.Nothing],
    target: RecommendedTarget
  ): Double = js.native
  def Recommended(
    elementId: String,
    options: RecommendedOptions,
    verb: js.UndefOr[scala.Nothing],
    sort: RecommendedSort
  ): Double = js.native
  def Recommended(
    elementId: String,
    options: RecommendedOptions,
    verb: js.UndefOr[scala.Nothing],
    sort: RecommendedSort,
    target: RecommendedTarget
  ): Double = js.native
  def Recommended(elementId: String, options: RecommendedOptions, verb: NumericBoolean): Double = js.native
  def Recommended(
    elementId: String,
    options: RecommendedOptions,
    verb: NumericBoolean,
    sort: js.UndefOr[scala.Nothing],
    target: RecommendedTarget
  ): Double = js.native
  def Recommended(elementId: String, options: RecommendedOptions, verb: NumericBoolean, sort: RecommendedSort): Double = js.native
  def Recommended(
    elementId: String,
    options: RecommendedOptions,
    verb: NumericBoolean,
    sort: RecommendedSort,
    target: RecommendedTarget
  ): Double = js.native
  
  def Subscribe(elementId: String, options: Nullable[SubscribeOptions], ownerId: Double): Double = js.native
}
