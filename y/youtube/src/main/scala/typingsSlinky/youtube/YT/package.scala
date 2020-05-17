package typingsSlinky.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object YT {
  type ListTypePlayer = typingsSlinky.youtube.youtubeStrings.player
  type ListTypeSearch = typingsSlinky.youtube.youtubeStrings.search
  type ListTypeUserUploads = typingsSlinky.youtube.youtubeStrings.user_uploads
  type PlayerEventHandler[TEvent /* <: typingsSlinky.youtube.YT.PlayerEvent */] = js.Function1[/* event */ TEvent, scala.Unit]
  type VideoQualityDefault = typingsSlinky.youtube.youtubeStrings.default
  type VideoQualityHD1080 = typingsSlinky.youtube.youtubeStrings.hd1080
  type VideoQualityHD720 = typingsSlinky.youtube.youtubeStrings.hd720
  type VideoQualityHighRes = typingsSlinky.youtube.youtubeStrings.highres
  type VideoQualityLarge = typingsSlinky.youtube.youtubeStrings.large
  type VideoQualityMedium = typingsSlinky.youtube.youtubeStrings.medium
  type VideoQualitySmall = typingsSlinky.youtube.youtubeStrings.small
}
