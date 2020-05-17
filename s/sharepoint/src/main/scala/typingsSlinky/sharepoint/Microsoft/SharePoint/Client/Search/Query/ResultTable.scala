package typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultTable extends ClientValueObject {
  def get_groupTemplateId(): String = js.native
  def get_itemTemplateId(): String = js.native
  def get_properties(): StringDictionary[js.Any] = js.native
  def get_queryId(): String = js.native
  def get_queryRuleId(): String = js.native
  def get_resultRows(): js.Array[StringDictionary[_]] = js.native
  def get_resultTitle(): String = js.native
  def get_resultTitleUrl(): String = js.native
  def get_rowCount(): Double = js.native
  def get_tableType(): String = js.native
  def get_totalRows(): Double = js.native
  def get_totalRowsIncludingDuplicates(): Double = js.native
  def initPropertiesFromJson(parentNode: js.Any): Unit = js.native
}

object ResultTable {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_groupTemplateId: () => String,
    get_itemTemplateId: () => String,
    get_properties: () => StringDictionary[js.Any],
    get_queryId: () => String,
    get_queryRuleId: () => String,
    get_resultRows: () => js.Array[StringDictionary[_]],
    get_resultTitle: () => String,
    get_resultTitleUrl: () => String,
    get_rowCount: () => Double,
    get_tableType: () => String,
    get_totalRows: () => Double,
    get_totalRowsIncludingDuplicates: () => Double,
    get_typeId: () => String,
    initPropertiesFromJson: js.Any => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ResultTable = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_groupTemplateId = js.Any.fromFunction0(get_groupTemplateId), get_itemTemplateId = js.Any.fromFunction0(get_itemTemplateId), get_properties = js.Any.fromFunction0(get_properties), get_queryId = js.Any.fromFunction0(get_queryId), get_queryRuleId = js.Any.fromFunction0(get_queryRuleId), get_resultRows = js.Any.fromFunction0(get_resultRows), get_resultTitle = js.Any.fromFunction0(get_resultTitle), get_resultTitleUrl = js.Any.fromFunction0(get_resultTitleUrl), get_rowCount = js.Any.fromFunction0(get_rowCount), get_tableType = js.Any.fromFunction0(get_tableType), get_totalRows = js.Any.fromFunction0(get_totalRows), get_totalRowsIncludingDuplicates = js.Any.fromFunction0(get_totalRowsIncludingDuplicates), get_typeId = js.Any.fromFunction0(get_typeId), initPropertiesFromJson = js.Any.fromFunction1(initPropertiesFromJson), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ResultTable]
  }
  @scala.inline
  implicit class ResultTableOps[Self <: ResultTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_groupTemplateId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_groupTemplateId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_itemTemplateId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_itemTemplateId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_properties(value: () => StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_properties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_queryId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_queryId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_queryRuleId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_queryRuleId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_resultRows(value: () => js.Array[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_resultRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_resultTitle(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_resultTitle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_resultTitleUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_resultTitleUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_rowCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_rowCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_tableType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_tableType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_totalRows(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_totalRows")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_totalRowsIncludingDuplicates(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_totalRowsIncludingDuplicates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitPropertiesFromJson(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initPropertiesFromJson")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

