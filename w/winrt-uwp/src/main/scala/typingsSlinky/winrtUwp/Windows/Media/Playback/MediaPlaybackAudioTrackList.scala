package typingsSlinky.winrtUwp.Windows.Media.Playback

import typingsSlinky.std.Array
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.Media.Core.AudioTrack
import typingsSlinky.winrtUwp.Windows.Media.Core.ISingleSelectMediaTrackList
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.anon.Index
import typingsSlinky.winrtUwp.anon.ItemsReturnValue
import typingsSlinky.winrtUwp.winrtUwpStrings.selectedindexchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a read-only list of audio tracks, of which a single track can be selected at one time. */
@js.native
trait MediaPlaybackAudioTrackList extends Array[AudioTrack] {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedindexchanged(`type`: selectedindexchanged, listener: TypedEventHandler[ISingleSelectMediaTrackList, _]): Unit = js.native
  
  /**
    * Returns an iterator that iterates over the items in the collection.
    * @return The iterator.
    */
  def first(): IIterator[AudioTrack] = js.native
  
  /**
    * Returns the audio track at the specified index.
    * @param index The zero-based index of the audio track.
    * @return The audio track at the specified index.
    */
  def getAt(index: Double): AudioTrack = js.native
  
  /**
    * Retrieves the audio tracks that start at the specified index in the list.
    * @param startIndex The zero-based index of the start of the audio tracks in the list.
    */
  def getMany(startIndex: Double): ItemsReturnValue = js.native
  
  def indexOf(value: AudioTrack, extra: js.Any*): Index = js.native
  /**
    * Retrieves the index of a specified audio track in the list.
    * @param value The audio track to find in the vector view.
    */
  @JSName("indexOf")
  def indexOf_Index(value: AudioTrack): Index = js.native
  
  /** Occurs when the index of the currently selected audio track changes. */
  def onselectedindexchanged(ev: js.Any with WinRTEvent[ISingleSelectMediaTrackList]): Unit = js.native
  /** Occurs when the index of the currently selected audio track changes. */
  @JSName("onselectedindexchanged")
  var onselectedindexchanged_Original: TypedEventHandler[ISingleSelectMediaTrackList, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedindexchanged(`type`: selectedindexchanged, listener: TypedEventHandler[ISingleSelectMediaTrackList, _]): Unit = js.native
  
  /** Gets or sets the index of the currently selected audio track in the list. */
  var selectedIndex: Double = js.native
  
  /** Gets the number of audio tracks in the list. */
  var size: Double = js.native
}
