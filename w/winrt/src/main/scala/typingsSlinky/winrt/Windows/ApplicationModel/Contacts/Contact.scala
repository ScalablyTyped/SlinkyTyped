package typingsSlinky.winrt.Windows.ApplicationModel.Contacts

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Contacts.Contact")
@js.native
class Contact () extends IContact {
  /* CompleteClass */
  override var fields: IVector[IContactField] = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var thumbnail: IRandomAccessStreamReference = js.native
}

