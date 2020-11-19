package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsSlinky.winrt.anon.Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceMapIterator extends IIterator[IKeyValuePair[String, NamedResource]]
object ResourceMapIterator {
  
  @scala.inline
  def apply(
    current: IKeyValuePair[String, NamedResource],
    getMany: () => Items[IKeyValuePair[String, NamedResource]],
    hasCurrent: Boolean,
    moveNext: () => Boolean
  ): ResourceMapIterator = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[ResourceMapIterator]
  }
}
