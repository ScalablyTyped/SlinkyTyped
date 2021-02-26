package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enumerates PlayReady secure stop service requests. */
@js.native
trait PlayReadySecureStopIterable extends StObject {
  
  /**
    * Returns an iterator that iterates over the items in the PlayReady secure stop collection.
    * @return The PlayReady secure stop iterator.
    */
  def first(): IIterator[IPlayReadySecureStopServiceRequest] = js.native
}
object PlayReadySecureStopIterable {
  
  @scala.inline
  def apply(first: () => IIterator[IPlayReadySecureStopServiceRequest]): PlayReadySecureStopIterable = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
    __obj.asInstanceOf[PlayReadySecureStopIterable]
  }
  
  @scala.inline
  implicit class PlayReadySecureStopIterableMutableBuilder[Self <: PlayReadySecureStopIterable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: () => IIterator[IPlayReadySecureStopServiceRequest]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
  }
}
