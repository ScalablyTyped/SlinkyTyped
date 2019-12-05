package typingsSlinky.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object YT {
  import typingsSlinky.youtube.youtubeStrings.default
  import typingsSlinky.youtube.youtubeStrings.hd1080
  import typingsSlinky.youtube.youtubeStrings.hd720
  import typingsSlinky.youtube.youtubeStrings.highres
  import typingsSlinky.youtube.youtubeStrings.large
  import typingsSlinky.youtube.youtubeStrings.medium
  import typingsSlinky.youtube.youtubeStrings.player
  import typingsSlinky.youtube.youtubeStrings.search
  import typingsSlinky.youtube.youtubeStrings.small
  import typingsSlinky.youtube.youtubeStrings.user_uploads

  type ListType = ListTypePlayer | ListTypeSearch | ListTypeUserUploads
  type ListTypePlayer = player
  type ListTypeSearch = search
  type ListTypeUserUploads = user_uploads
  type PlayerEventHandler[TEvent /* <: PlayerEvent */] = js.Function1[/* event */ TEvent, Unit]
  type SuggestedVideoQuality = VideoQualityDefault | VideoQualitySmall | VideoQualityMedium | VideoQualityLarge | VideoQualityHD720 | VideoQualityHD1080 | VideoQualityHighRes
  type VideoQualityDefault = default
  type VideoQualityHD1080 = hd1080
  type VideoQualityHD720 = hd720
  type VideoQualityHighRes = highres
  type VideoQualityLarge = large
  type VideoQualityMedium = medium
  type VideoQualitySmall = small
}
