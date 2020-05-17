package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a text search query in an email mailbox. */
@js.native
trait EmailQueryTextSearch extends js.Object {
  /** Gets or sets the fields for an email text search query. */
  var fields: EmailQuerySearchFields = js.native
  /** Gets or sets the scope for an email text search query. */
  var searchScope: EmailQuerySearchScope = js.native
  /** Gets or sets the text string for an email text search query. */
  var text: String = js.native
}

object EmailQueryTextSearch {
  @scala.inline
  def apply(fields: EmailQuerySearchFields, searchScope: EmailQuerySearchScope, text: String): EmailQueryTextSearch = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], searchScope = searchScope.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailQueryTextSearch]
  }
  @scala.inline
  implicit class EmailQueryTextSearchOps[Self <: EmailQueryTextSearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: EmailQuerySearchFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchScope(value: EmailQuerySearchScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

