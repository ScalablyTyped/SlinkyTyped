package typingsSlinky.winrt.Windows.Media.MediaProperties

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.Collections.IMap
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPropertySet
  extends IMap[String, js.Any]
object MediaPropertySet {
  
  @scala.inline
  def apply(
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[String, js.Any]],
    getView: () => IMapView[String, js.Any],
    hasKey: String => Boolean,
    insert: (String, js.Any) => Boolean,
    lookup: String => js.Any,
    remove: String => Unit,
    size: Double
  ): MediaPropertySet = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPropertySet]
  }
}
