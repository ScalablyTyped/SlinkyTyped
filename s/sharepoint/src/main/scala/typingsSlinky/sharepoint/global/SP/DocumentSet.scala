package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.DocumentSet")
@js.native
object DocumentSet extends js.Object {
  @js.native
  class DocumentSet ()
    extends typingsSlinky.sharepoint.SP.ClientObject
  
  /* static members */
  @js.native
  object DocumentSet extends js.Object {
    def create(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      parentFolder: typingsSlinky.sharepoint.SP.Folder,
      name: String,
      ctid: typingsSlinky.sharepoint.SP.ContentTypeId
    ): typingsSlinky.sharepoint.SP.StringResult = js.native
  }
  
}

