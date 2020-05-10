package typingsSlinky.winrt.Windows.Storage.Search

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Search.QueryOptions")
@js.native
class QueryOptions () extends IQueryOptions {
  def this(query: CommonFolderQuery) = this()
  def this(query: CommonFileQuery, fileTypeFilter: IIterable[String]) = this()
}

