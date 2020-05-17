package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import typingsSlinky.winrtUwp.anon.ItemsIPlayReadySecureStopServiceRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides for iteration of the IPlayReadySecureStopServiceRequest interface. */
@js.native
trait PlayReadySecureStopIterator extends js.Object {
  /** Gets the current item in the PlayReady secure stop collection. */
  var current: IPlayReadySecureStopServiceRequest = js.native
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady secure stop collection. */
  var hasCurrent: Boolean = js.native
  /**
    * Retrieves all items in the PlayReady secure stop collection.
    */
  def getMany(): ItemsIPlayReadySecureStopServiceRequest = js.native
  /**
    * Advances the enumerator to the next item in the collection.
    * @return true if the iterator refers to a valid item that is in the collection or false if the iterator is at the end of the collection.
    */
  def moveNext(): Boolean = js.native
}

object PlayReadySecureStopIterator {
  @scala.inline
  def apply(
    current: IPlayReadySecureStopServiceRequest,
    getMany: () => ItemsIPlayReadySecureStopServiceRequest,
    hasCurrent: Boolean,
    moveNext: () => Boolean
  ): PlayReadySecureStopIterator = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[PlayReadySecureStopIterator]
  }
  @scala.inline
  implicit class PlayReadySecureStopIteratorOps[Self <: PlayReadySecureStopIterator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: IPlayReadySecureStopServiceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMany(value: () => ItemsIPlayReadySecureStopServiceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMany")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasCurrent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveNext(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveNext")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

