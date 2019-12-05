package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrt.Anon_Items
import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapIterator")
@js.native
class ResourceMapIterator () extends IIterator[IKeyValuePair[String, NamedResource]] {
  /* CompleteClass */
  override var current: IKeyValuePair[String, NamedResource] = js.native
  /* CompleteClass */
  override var hasCurrent: Boolean = js.native
  /* CompleteClass */
  override def getMany(): Anon_Items[IKeyValuePair[String, NamedResource]] = js.native
  /* CompleteClass */
  override def moveNext(): Boolean = js.native
}

