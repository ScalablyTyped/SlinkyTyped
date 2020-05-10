package typingsSlinky.trtcJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function1[/* event */ T, scala.Unit]
  type LocalAudioStats = typingsSlinky.trtcJsSdk.mod.SentMediaStats
  type LocalAudioStatsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.trtcJsSdk.mod.LocalAudioStats]
  type LocalVideoStatsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.trtcJsSdk.mod.LocalVideoStats]
  type Nullable[T] = T | scala.Null
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type RemoteAudioStats = typingsSlinky.trtcJsSdk.mod.ReceivedMediaStats
  type RemoteAudioStatsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.trtcJsSdk.mod.RemoteAudioStats]
  type RemoteVideoStatsMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.trtcJsSdk.mod.RemoteVideoStats]
}
