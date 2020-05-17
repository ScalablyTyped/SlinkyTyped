package typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharepoint.IEnumerator
import typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.WebControls.ControlMessage
import typingsSlinky.sharepoint.SP.ClientValueObjectCollection
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultTableCollection extends ClientValueObjectCollection[ResultTable] {
  def get_elapsedTime(): Double = js.native
  def get_item(index: Double): ResultTable = js.native
  def get_properties(): StringDictionary[js.Any] = js.native
  def get_queryErrors(): StringDictionary[ControlMessage] = js.native
  def get_queryId(): String = js.native
  def get_spellingSuggestion(): String = js.native
  def get_triggeredRules(): js.Array[Guid] = js.native
  def initPropertiesFromJson(parentNode: js.Any): Unit = js.native
  def set_elapsedTime(value: Double): Unit = js.native
}

object ResultTableCollection {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    getEnumerator: () => IEnumerator[ResultTable],
    get_count: () => Double,
    get_elapsedTime: () => Double,
    get_item: Double => ResultTable,
    get_properties: () => StringDictionary[js.Any],
    get_queryErrors: () => StringDictionary[ControlMessage],
    get_queryId: () => String,
    get_spellingSuggestion: () => String,
    get_triggeredRules: () => js.Array[Guid],
    get_typeId: () => String,
    initPropertiesFromJson: js.Any => Unit,
    set_elapsedTime: Double => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ResultTableCollection = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), getEnumerator = js.Any.fromFunction0(getEnumerator), get_count = js.Any.fromFunction0(get_count), get_elapsedTime = js.Any.fromFunction0(get_elapsedTime), get_item = js.Any.fromFunction1(get_item), get_properties = js.Any.fromFunction0(get_properties), get_queryErrors = js.Any.fromFunction0(get_queryErrors), get_queryId = js.Any.fromFunction0(get_queryId), get_spellingSuggestion = js.Any.fromFunction0(get_spellingSuggestion), get_triggeredRules = js.Any.fromFunction0(get_triggeredRules), get_typeId = js.Any.fromFunction0(get_typeId), initPropertiesFromJson = js.Any.fromFunction1(initPropertiesFromJson), set_elapsedTime = js.Any.fromFunction1(set_elapsedTime), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ResultTableCollection]
  }
  @scala.inline
  implicit class ResultTableCollectionOps[Self <: ResultTableCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_elapsedTime(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_elapsedTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_item(value: Double => ResultTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet_properties(value: () => StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_properties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_queryErrors(value: () => StringDictionary[ControlMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_queryErrors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_queryId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_queryId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_spellingSuggestion(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_spellingSuggestion")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_triggeredRules(value: () => js.Array[Guid]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_triggeredRules")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitPropertiesFromJson(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initPropertiesFromJson")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_elapsedTime(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_elapsedTime")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

