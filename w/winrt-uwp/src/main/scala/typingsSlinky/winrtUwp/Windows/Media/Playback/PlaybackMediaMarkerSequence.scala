package typingsSlinky.winrtUwp.Windows.Media.Playback

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An ordered collection of PlaybackMediaMarker objects. */
@js.native
trait PlaybackMediaMarkerSequence extends js.Object {
  /** Returns the number of items in the sequence. */
  var size: Double = js.native
  /** Removes all elements from the sequence. */
  def clear(): Unit = js.native
  /**
    * Gets an IIterator pointing at the first PlaybackMediaMarker in the sequence.
    * @return Iterator pointing at the first media marker in the sequence.
    */
  def first(): IIterator[PlaybackMediaMarker] = js.native
  /**
    * Adds a PlaybackMediaMarker to the sequence in it's ordered position.
    * @param value The media marker to insert into the sequence.
    */
  def insert(value: PlaybackMediaMarker): Unit = js.native
}

object PlaybackMediaMarkerSequence {
  @scala.inline
  def apply(
    clear: () => Unit,
    first: () => IIterator[PlaybackMediaMarker],
    insert: PlaybackMediaMarker => Unit,
    size: Double
  ): PlaybackMediaMarkerSequence = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), insert = js.Any.fromFunction1(insert), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackMediaMarkerSequence]
  }
  @scala.inline
  implicit class PlaybackMediaMarkerSequenceOps[Self <: PlaybackMediaMarkerSequence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFirst(value: () => IIterator[PlaybackMediaMarker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInsert(value: PlaybackMediaMarker => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

