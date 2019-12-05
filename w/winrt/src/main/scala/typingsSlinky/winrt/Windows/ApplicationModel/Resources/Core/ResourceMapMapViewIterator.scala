package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core

import typingsSlinky.winrt.Anon_Items
import typingsSlinky.winrt.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrt.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator")
@js.native
class ResourceMapMapViewIterator () extends IIterator[IKeyValuePair[String, ResourceMap]] {
  /* CompleteClass */
  override var current: IKeyValuePair[String, ResourceMap] = js.native
  /* CompleteClass */
  override var hasCurrent: Boolean = js.native
  /* CompleteClass */
  override def getMany(): Anon_Items[IKeyValuePair[String, ResourceMap]] = js.native
  /* CompleteClass */
  override def moveNext(): Boolean = js.native
}

