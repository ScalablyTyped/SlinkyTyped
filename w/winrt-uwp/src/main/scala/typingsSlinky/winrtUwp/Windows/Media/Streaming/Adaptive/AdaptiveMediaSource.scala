package typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.downloadbitratechanged
import typingsSlinky.winrtUwp.winrtUwpStrings.downloadcompleted
import typingsSlinky.winrtUwp.winrtUwpStrings.downloadfailed
import typingsSlinky.winrtUwp.winrtUwpStrings.downloadrequested
import typingsSlinky.winrtUwp.winrtUwpStrings.playbackbitratechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the source of adaptive streaming content. */
@js.native
trait AdaptiveMediaSource extends js.Object {
  var advancedSettings: js.Any = js.native
   /* unmapped type */ /** Gets a value indicating if the content streamed by the media source contains only audio. */
  var audioOnlyPlayback: Boolean = js.native
  /** Gets the available adaptive bit rates of the adaptive streaming manifest that is the source of the adaptive streaming object. */
  var availableBitrates: IVectorView[Double] = js.native
  /** Gets a value indicating the current download bitrate for the media source. */
  var currentDownloadBitrate: Double = js.native
  /** Gets a value indicating the current playback bitrate for the media source. */
  var currentPlaybackBitrate: Double = js.native
  /** Gets or sets the desired starting offset for the live playback of the media source. */
  var desiredLiveOffset: Double = js.native
  /** Gets or sets the desired maximum bitrate for the media source. */
  var desiredMaxBitrate: Double = js.native
  /** Gets or sets the desired minimum bitrate for the media source. */
  var desiredMinBitrate: Double = js.native
  /** Gets a value indicating the inbound bits per second statistic over the time window specified by the InboundBitsPerSecondWindow property. */
  var inboundBitsPerSecond: Double = js.native
  /** Gets or sets the time span over which the InboundBitsPerSecond property is calculated. */
  var inboundBitsPerSecondWindow: Double = js.native
  /** Gets and sets the initial bit rate to use for playback of the media source. */
  var initialBitrate: Double = js.native
  /** Gets a value that indicates whether the media source is live. */
  var isLive: Boolean = js.native
  /** Occurs when the CurrentDownloadBitrate changes. */
  @JSName("ondownloadbitratechanged")
  var ondownloadbitratechanged_Original: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadBitrateChangedEventArgs] = js.native
  /** Occurs when a resource download operation completes */
  @JSName("ondownloadcompleted")
  var ondownloadcompleted_Original: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadCompletedEventArgs] = js.native
  /** Occurs when a resource download operation fails. */
  @JSName("ondownloadfailed")
  var ondownloadfailed_Original: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadFailedEventArgs] = js.native
  /** Occurs when a resource download operation is requested. */
  @JSName("ondownloadrequested")
  var ondownloadrequested_Original: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadRequestedEventArgs] = js.native
  /** Occurs when the CurrentPlaybackBitrate changes. */
  @JSName("onplaybackbitratechanged")
  var onplaybackbitratechanged_Original: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourcePlaybackBitrateChangedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadbitratechanged(
    `type`: downloadbitratechanged,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadBitrateChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadcompleted(
    `type`: downloadcompleted,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadCompletedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadfailed(
    `type`: downloadfailed,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadFailedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_downloadrequested(
    `type`: downloadrequested,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_playbackbitratechanged(
    `type`: playbackbitratechanged,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourcePlaybackBitrateChangedEventArgs]
  ): Unit = js.native
  /** Occurs when the CurrentDownloadBitrate changes. */
  def ondownloadbitratechanged(ev: AdaptiveMediaSourceDownloadBitrateChangedEventArgs with WinRTEvent[AdaptiveMediaSource]): Unit = js.native
  /** Occurs when a resource download operation completes */
  def ondownloadcompleted(ev: AdaptiveMediaSourceDownloadCompletedEventArgs with WinRTEvent[AdaptiveMediaSource]): Unit = js.native
  /** Occurs when a resource download operation fails. */
  def ondownloadfailed(ev: AdaptiveMediaSourceDownloadFailedEventArgs with WinRTEvent[AdaptiveMediaSource]): Unit = js.native
  /** Occurs when a resource download operation is requested. */
  def ondownloadrequested(ev: AdaptiveMediaSourceDownloadRequestedEventArgs with WinRTEvent[AdaptiveMediaSource]): Unit = js.native
  /** Occurs when the CurrentPlaybackBitrate changes. */
  def onplaybackbitratechanged(ev: AdaptiveMediaSourcePlaybackBitrateChangedEventArgs with WinRTEvent[AdaptiveMediaSource]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadbitratechanged(
    `type`: downloadbitratechanged,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadBitrateChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadcompleted(
    `type`: downloadcompleted,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadCompletedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadfailed(
    `type`: downloadfailed,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadFailedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_downloadrequested(
    `type`: downloadrequested,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourceDownloadRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_playbackbitratechanged(
    `type`: playbackbitratechanged,
    listener: TypedEventHandler[AdaptiveMediaSource, AdaptiveMediaSourcePlaybackBitrateChangedEventArgs]
  ): Unit = js.native
}

