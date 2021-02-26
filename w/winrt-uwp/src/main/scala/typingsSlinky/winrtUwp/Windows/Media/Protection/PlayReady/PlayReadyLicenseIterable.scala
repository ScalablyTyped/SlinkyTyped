package typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes the PlayReadyLicense class iterator. */
@js.native
trait PlayReadyLicenseIterable extends StObject {
  
  /**
    * Returns an iterator that iterates over the items in the PlayReady license collection.
    * @return The PlayReady license iterator.
    */
  def first(): IIterator[IPlayReadyLicense] = js.native
}
object PlayReadyLicenseIterable {
  
  @scala.inline
  def apply(first: () => IIterator[IPlayReadyLicense]): PlayReadyLicenseIterable = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first))
    __obj.asInstanceOf[PlayReadyLicenseIterable]
  }
  
  @scala.inline
  implicit class PlayReadyLicenseIterableMutableBuilder[Self <: PlayReadyLicenseIterable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: () => IIterator[IPlayReadyLicense]): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
  }
}
