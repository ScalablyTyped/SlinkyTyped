package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the options selected for an email mailbox query. */
@js.native
trait EmailQueryOptions extends js.Object {
  /** Gets the identifiers for the folders in which to search. */
  var folderIds: IVector[String] = js.native
  /** Gets or sets the kind of emails for which to query. */
  var kind: EmailQueryKind = js.native
  /** Gets or sets the direction of the sort for the query results. */
  var sortDirection: EmailQuerySortDirection = js.native
  /** Gets or sets a Boolean value indicating whether the query results should be sorted. */
  var sortProperty: EmailQuerySortProperty = js.native
  /** Gets the text to search for. */
  var textSearch: EmailQueryTextSearch = js.native
}

object EmailQueryOptions {
  @scala.inline
  def apply(
    folderIds: IVector[String],
    kind: EmailQueryKind,
    sortDirection: EmailQuerySortDirection,
    sortProperty: EmailQuerySortProperty,
    textSearch: EmailQueryTextSearch
  ): EmailQueryOptions = {
    val __obj = js.Dynamic.literal(folderIds = folderIds.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any], sortProperty = sortProperty.asInstanceOf[js.Any], textSearch = textSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailQueryOptions]
  }
  @scala.inline
  implicit class EmailQueryOptionsOps[Self <: EmailQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFolderIds(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folderIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: EmailQueryKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortDirection(value: EmailQuerySortDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortProperty(value: EmailQuerySortProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextSearch(value: EmailQueryTextSearch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSearch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

