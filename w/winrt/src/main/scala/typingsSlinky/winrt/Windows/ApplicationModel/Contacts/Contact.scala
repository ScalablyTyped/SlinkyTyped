package typingsSlinky.winrt.Windows.ApplicationModel.Contacts

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contact extends IContact
object Contact {
  
  @scala.inline
  def apply(fields: IVector[IContactField], name: String, thumbnail: IRandomAccessStreamReference): Contact = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
}
