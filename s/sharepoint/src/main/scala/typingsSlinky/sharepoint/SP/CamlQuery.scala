package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a Collaborative Application Markup Language (CAML) query on a list. */
@js.native
trait CamlQuery extends ClientValueObject {
  /** Returns true if the query returns dates in Coordinated Universal Time (UTC) format. */
  def get_datesInUtc(): Boolean = js.native
  /** Server relative URL of a list folder from which results will be returned. */
  def get_folderServerRelativeUrl(): String = js.native
  def get_listItemCollectionPosition(): ListItemCollectionPosition = js.native
  /** Gets value that specifies the XML schema that defines the list view. */
  def get_viewXml(): String = js.native
  /** Sets a value that indicates whether the query returns dates in Coordinated Universal Time (UTC) format. */
  def set_datesInUtc(value: Boolean): Unit = js.native
  /** Sets a value that specifies the server relative URL of a list folder from which results will be returned. */
  def set_folderServerRelativeUrl(value: String): Unit = js.native
  /** Sets a value that specifies the information required to get the next page of data for the list view. */
  def set_listItemCollectionPosition(value: ListItemCollectionPosition): Unit = js.native
  /** Sets value that specifies the XML schema that defines the list view. It must be null, empty, or an XML fragment that conforms to the ViewDefinition type.  */
  def set_viewXml(value: String): Unit = js.native
}

object CamlQuery {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_datesInUtc: () => Boolean,
    get_folderServerRelativeUrl: () => String,
    get_listItemCollectionPosition: () => ListItemCollectionPosition,
    get_typeId: () => String,
    get_viewXml: () => String,
    set_datesInUtc: Boolean => Unit,
    set_folderServerRelativeUrl: String => Unit,
    set_listItemCollectionPosition: ListItemCollectionPosition => Unit,
    set_viewXml: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): CamlQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_datesInUtc = js.Any.fromFunction0(get_datesInUtc), get_folderServerRelativeUrl = js.Any.fromFunction0(get_folderServerRelativeUrl), get_listItemCollectionPosition = js.Any.fromFunction0(get_listItemCollectionPosition), get_typeId = js.Any.fromFunction0(get_typeId), get_viewXml = js.Any.fromFunction0(get_viewXml), set_datesInUtc = js.Any.fromFunction1(set_datesInUtc), set_folderServerRelativeUrl = js.Any.fromFunction1(set_folderServerRelativeUrl), set_listItemCollectionPosition = js.Any.fromFunction1(set_listItemCollectionPosition), set_viewXml = js.Any.fromFunction1(set_viewXml), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[CamlQuery]
  }
  @scala.inline
  implicit class CamlQueryOps[Self <: CamlQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_datesInUtc(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_datesInUtc")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_folderServerRelativeUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_folderServerRelativeUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_listItemCollectionPosition(value: () => ListItemCollectionPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_listItemCollectionPosition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_viewXml(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_viewXml")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_datesInUtc(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_datesInUtc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_folderServerRelativeUrl(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_folderServerRelativeUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_listItemCollectionPosition(value: ListItemCollectionPosition => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_listItemCollectionPosition")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_viewXml(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_viewXml")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

