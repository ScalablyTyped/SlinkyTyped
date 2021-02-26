package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import typingsSlinky.winrtUwp.anon.ItemsIPlayReadySecureStopServiceRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides for iteration of the IPlayReadySecureStopServiceRequest interface. */
@js.native
trait PlayReadySecureStopIterator extends StObject {
  
  /** Gets the current item in the PlayReady secure stop collection. */
  var current: IPlayReadySecureStopServiceRequest = js.native
  
  /**
    * Retrieves all items in the PlayReady secure stop collection.
    */
  def getMany(): ItemsIPlayReadySecureStopServiceRequest = js.native
  
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady secure stop collection. */
  var hasCurrent: Boolean = js.native
  
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
  implicit class PlayReadySecureStopIteratorMutableBuilder[Self <: PlayReadySecureStopIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: IPlayReadySecureStopServiceRequest): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMany(value: () => ItemsIPlayReadySecureStopServiceRequest): Self = StObject.set(x, "getMany", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasCurrent(value: Boolean): Self = StObject.set(x, "hasCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
  }
}
