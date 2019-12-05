package typingsSlinky.spotifyDashWebDashPlaybackDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Spotify {
  import typingsSlinky.spotifyDashWebDashPlaybackDashSdk.spotifyDashWebDashPlaybackDashSdkStrings.not_ready
  import typingsSlinky.spotifyDashWebDashPlaybackDashSdk.spotifyDashWebDashPlaybackDashSdkStrings.player_state_changed
  import typingsSlinky.spotifyDashWebDashPlaybackDashSdk.spotifyDashWebDashPlaybackDashSdkStrings.ready

  type AddListenerFn = (js.Function2[/* event */ ready | not_ready, /* cb */ PlaybackInstanceListener, Unit]) with (js.Function2[player_state_changed, /* cb */ PlaybackStateListener, Unit]) with (js.Function2[/* event */ ErrorTypes, /* cb */ ErrorListener, Unit])
  type ErrorListener = js.Function1[/* err */ Error, Unit]
  type PlaybackInstanceListener = js.Function1[/* inst */ WebPlaybackInstance, Unit]
  type PlaybackStateListener = js.Function1[/* s */ PlaybackState, Unit]
}
