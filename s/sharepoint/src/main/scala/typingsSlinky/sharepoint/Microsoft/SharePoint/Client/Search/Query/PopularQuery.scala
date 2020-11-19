package typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopularQuery extends ClientValueObject {
  
  def get_LCID(): Double = js.native
  
  def get_clickCount(): Double = js.native
  
  def get_queryCount(): Double = js.native
  
  def get_queryText(): String = js.native
  
  def set_LCID(value: Double): Unit = js.native
  
  def set_clickCount(value: Double): Unit = js.native
  
  def set_queryCount(value: Double): Unit = js.native
  
  def set_queryText(value: String): Unit = js.native
}
object PopularQuery {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_LCID: () => Double,
    get_clickCount: () => Double,
    get_queryCount: () => Double,
    get_queryText: () => String,
    get_typeId: () => String,
    set_LCID: Double => Unit,
    set_clickCount: Double => Unit,
    set_queryCount: Double => Unit,
    set_queryText: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): PopularQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_LCID = js.Any.fromFunction0(get_LCID), get_clickCount = js.Any.fromFunction0(get_clickCount), get_queryCount = js.Any.fromFunction0(get_queryCount), get_queryText = js.Any.fromFunction0(get_queryText), get_typeId = js.Any.fromFunction0(get_typeId), set_LCID = js.Any.fromFunction1(set_LCID), set_clickCount = js.Any.fromFunction1(set_clickCount), set_queryCount = js.Any.fromFunction1(set_queryCount), set_queryText = js.Any.fromFunction1(set_queryText), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[PopularQuery]
  }
  
  @scala.inline
  implicit class PopularQueryOps[Self <: PopularQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet_LCID(value: () => Double): Self = this.set("get_LCID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_clickCount(value: () => Double): Self = this.set("get_clickCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_queryCount(value: () => Double): Self = this.set("get_queryCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_queryText(value: () => String): Self = this.set("get_queryText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_LCID(value: Double => Unit): Self = this.set("set_LCID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_clickCount(value: Double => Unit): Self = this.set("set_clickCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_queryCount(value: Double => Unit): Self = this.set("set_queryCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_queryText(value: String => Unit): Self = this.set("set_queryText", js.Any.fromFunction1(value))
  }
}
