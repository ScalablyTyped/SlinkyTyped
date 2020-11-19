package typingsSlinky.winrtUwp.Windows.Media.Playback

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Media.Core.ISingleSelectMediaTrackList
import typingsSlinky.winrtUwp.Windows.Media.Core.VideoTrack
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsVideoTrack
import typingsSlinky.winrtUwp.winrtUwpStrings.selectedindexchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a read-only list of video tracks, of which a single track can be selected at one time. */
@js.native
trait MediaPlaybackVideoTrackList extends Array[VideoTrack] {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedindexchanged(`type`: selectedindexchanged, listener: TypedEventHandler[ISingleSelectMediaTrackList, _]): Unit = js.native
  
  /**
    * Returns an iterator that iterates over the items in the collection.
    * @return The iterator.
    */
  def first(): IIterator[VideoTrack] = js.native
  
  /**
    * Returns the video track at the specified index.
    * @param index The zero-based index of the video track.
    * @return The video track at the specified index.
    */
  def getAt(index: Double): VideoTrack = js.native
  
  /**
    * Retrieves the video tracks that start at the specified index in the list.
    * @param startIndex The zero-based index of the start of the video tracks in the list.
    */
  def getMany(startIndex: Double): ItemsVideoTrack = js.native
  
  def indexOf(value: VideoTrack, extra: js.Any*): Index = js.native
  /**
    * Retrieves the index of a specified video track in the list.
    * @param value The video track to find in the vector view.
    */
  @JSName("indexOf")
  def indexOf_Index(value: VideoTrack): Index = js.native
  
  /** Occurs when the index of the currently selected video track changes. */
  def onselectedindexchanged(ev: js.Any with WinRTEvent[ISingleSelectMediaTrackList]): Unit = js.native
  /** Occurs when the index of the currently selected video track changes. */
  @JSName("onselectedindexchanged")
  var onselectedindexchanged_Original: TypedEventHandler[ISingleSelectMediaTrackList, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedindexchanged(`type`: selectedindexchanged, listener: TypedEventHandler[ISingleSelectMediaTrackList, _]): Unit = js.native
  
  /** Gets or sets the index of the currently selected video track in the list. */
  var selectedIndex: Double = js.native
  
  /** Gets the number of video tracks in the list. */
  var size: Double = js.native
}
