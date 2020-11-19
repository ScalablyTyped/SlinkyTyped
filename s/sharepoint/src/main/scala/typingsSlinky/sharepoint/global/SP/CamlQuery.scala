package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a Collaborative Application Markup Language (CAML) query on a list. */
@JSGlobal("SP.CamlQuery")
@js.native
class CamlQuery ()
  extends typingsSlinky.sharepoint.SP.CamlQuery
/* static members */
@JSGlobal("SP.CamlQuery")
@js.native
object CamlQuery extends js.Object {
  
  /** This method creates a Collaborative Application Markup Language (CAML) string
    that can be used to recursively get all of the folders in a list, including
    the subfolders. */
  def createAllFoldersQuery(): typingsSlinky.sharepoint.SP.CamlQuery = js.native
  
  /** This method creates a Collaborative Application Markup Language (CAML) string
    that can be used to recursively get all of the items in a list, including
    the items in the subfolders. */
  def createAllItemsQuery(): typingsSlinky.sharepoint.SP.CamlQuery = js.native
}
