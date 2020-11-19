package typingsSlinky.winrtUwp.Windows.Media.Playback

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsTimedMetadataTrack
import typingsSlinky.winrtUwp.winrtUwpStrings.presentationmodechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a read-only list of timed metadata tracks. */
@js.native
trait MediaPlaybackTimedMetadataTrackList extends Array[TimedMetadataTrack] {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_presentationmodechanged(
    `type`: presentationmodechanged,
    listener: TypedEventHandler[MediaPlaybackTimedMetadataTrackList, TimedMetadataPresentationModeChangedEventArgs]
  ): Unit = js.native
  
  /**
    * Returns an iterator that iterates over the items in the collection.
    * @return The iterator.
    */
  def first(): IIterator[TimedMetadataTrack] = js.native
  
  /**
    * Returns the timed metadata track at the specified index.
    * @param index The zero-based index of the timed metadata track.
    * @return The timed metadata track at the specified index.
    */
  def getAt(index: Double): TimedMetadataTrack = js.native
  
  /**
    * Retrieves the timed metadata tracks that start at the specified index in the list.
    * @param startIndex The zero-based index of the start of the timed metadata tracks in the list.
    */
  def getMany(startIndex: Double): ItemsTimedMetadataTrack = js.native
  
  /**
    * Gets the presentation mode of the timed metadata track with the specified index.
    * @param index The index of the timed metadata track for which the presentation mode is queried.
    * @return The presentation mode.
    */
  def getPresentationMode(index: Double): TimedMetadataTrackPresentationMode = js.native
  
  def indexOf(value: TimedMetadataTrack, extra: js.Any*): Index = js.native
  /**
    * Retrieves the index of a specified timed metadata track in the list.
    * @param value The timed metadata track to find in the vector view.
    */
  @JSName("indexOf")
  def indexOf_Index(value: TimedMetadataTrack): Index = js.native
  
  /** Occurs when the presentation mode of the MediaPlaybackTimedMetadataTrackList changes. */
  def onpresentationmodechanged(
    ev: TimedMetadataPresentationModeChangedEventArgs with WinRTEvent[MediaPlaybackTimedMetadataTrackList]
  ): Unit = js.native
  /** Occurs when the presentation mode of the MediaPlaybackTimedMetadataTrackList changes. */
  @JSName("onpresentationmodechanged")
  var onpresentationmodechanged_Original: TypedEventHandler[MediaPlaybackTimedMetadataTrackList, TimedMetadataPresentationModeChangedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_presentationmodechanged(
    `type`: presentationmodechanged,
    listener: TypedEventHandler[MediaPlaybackTimedMetadataTrackList, TimedMetadataPresentationModeChangedEventArgs]
  ): Unit = js.native
  
  /**
    * Sets the presentation mode of the timed metadata track with the specified index.
    * @param index The index of the timed metadata track for which the presentation mode is set.
    * @param value The presentation mode to set.
    */
  def setPresentationMode(index: Double, value: TimedMetadataTrackPresentationMode): Unit = js.native
  
  /** Gets the number of timed metadata tracks in the list. */
  var size: Double = js.native
}
