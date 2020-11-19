package typingsSlinky.winrtUwp.Windows.Storage.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateStackOption extends js.Object
/** Indicates the unit of time used to group files into folders if a CommonFolderQuery based on date is used to create a QueryOptions object. */
@JSGlobal("Windows.Storage.Search.DateStackOption")
@js.native
object DateStackOption extends js.Object {
  
  /** The content is grouped by month. */
  @js.native
  sealed trait month extends DateStackOption
  
  /** The query options are not based on the date. */
  @js.native
  sealed trait none extends DateStackOption
  
  /** The content is grouped by year. */
  @js.native
  sealed trait year extends DateStackOption
}
