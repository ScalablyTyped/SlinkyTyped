package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.anon.First
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceQualifierMapView extends IMapView[String, String]
object ResourceQualifierMapView {
  
  @scala.inline
  def apply(
    first: () => IIterator[IKeyValuePair[String, String]],
    hasKey: String => Boolean,
    lookup: String => String,
    size: Double,
    split: () => First[String, String]
  ): ResourceQualifierMapView = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size.asInstanceOf[js.Any], split = js.Any.fromFunction0(split))
    __obj.asInstanceOf[ResourceQualifierMapView]
  }
}
