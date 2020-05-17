package typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuerySuggestionQuery extends ClientValueObject {
  def get_isPersonal(): Boolean = js.native
  def get_query(): String = js.native
  def set_isPersonal(value: Boolean): Unit = js.native
  def set_query(value: String): Unit = js.native
}

object QuerySuggestionQuery {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_isPersonal: () => Boolean,
    get_query: () => String,
    get_typeId: () => String,
    set_isPersonal: Boolean => Unit,
    set_query: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): QuerySuggestionQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_isPersonal = js.Any.fromFunction0(get_isPersonal), get_query = js.Any.fromFunction0(get_query), get_typeId = js.Any.fromFunction0(get_typeId), set_isPersonal = js.Any.fromFunction1(set_isPersonal), set_query = js.Any.fromFunction1(set_query), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[QuerySuggestionQuery]
  }
  @scala.inline
  implicit class QuerySuggestionQueryOps[Self <: QuerySuggestionQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_isPersonal(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_isPersonal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_query(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_query")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_isPersonal(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_isPersonal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_query(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_query")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

