package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies parameters to use in a text search of Contact objects. */
@js.native
trait ContactQueryTextSearch extends js.Object {
  /** Gets or sets which contact fields to search for a text match. */
  var fields: ContactQuerySearchFields = js.native
  /** Gets or sets a value that specifies either a local or server search. */
  var searchScope: ContactQuerySearchScope = js.native
  /** Gets or sets the text for which to search. */
  var text: String = js.native
}

object ContactQueryTextSearch {
  @scala.inline
  def apply(fields: ContactQuerySearchFields, searchScope: ContactQuerySearchScope, text: String): ContactQueryTextSearch = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], searchScope = searchScope.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactQueryTextSearch]
  }
  @scala.inline
  implicit class ContactQueryTextSearchOps[Self <: ContactQueryTextSearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFields(value: ContactQuerySearchFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchScope(value: ContactQuerySearchScope): Self = {
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

