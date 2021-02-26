package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentSet {
  
  @JSGlobal("SP.DocumentSet.DocumentSet")
  @js.native
  class DocumentSet ()
    extends typingsSlinky.sharepoint.SP.ClientObject
  object DocumentSet {
    
    /* static member */
    @JSGlobal("SP.DocumentSet.DocumentSet.create")
    @js.native
    def create(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      parentFolder: typingsSlinky.sharepoint.SP.Folder,
      name: String,
      ctid: typingsSlinky.sharepoint.SP.ContentTypeId
    ): typingsSlinky.sharepoint.SP.StringResult = js.native
  }
}
