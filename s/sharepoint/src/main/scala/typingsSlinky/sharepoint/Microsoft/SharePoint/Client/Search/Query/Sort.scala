package typingsSlinky.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sort extends ClientValueObject {
  
  def get_direction(): SortDirection = js.native
  
  def get_property(): String = js.native
  
  def set_direction(value: SortDirection): Unit = js.native
  
  def set_property(value: String): Unit = js.native
}
object Sort {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_direction: () => SortDirection,
    get_property: () => String,
    get_typeId: () => String,
    set_direction: SortDirection => Unit,
    set_property: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): Sort = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_direction = js.Any.fromFunction0(get_direction), get_property = js.Any.fromFunction0(get_property), get_typeId = js.Any.fromFunction0(get_typeId), set_direction = js.Any.fromFunction1(set_direction), set_property = js.Any.fromFunction1(set_property), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[Sort]
  }
  
  @scala.inline
  implicit class SortOps[Self <: Sort] (val x: Self) extends AnyVal {
    
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
    def setGet_direction(value: () => SortDirection): Self = this.set("get_direction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_property(value: () => String): Self = this.set("get_property", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_direction(value: SortDirection => Unit): Self = this.set("set_direction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_property(value: String => Unit): Self = this.set("set_property", js.Any.fromFunction1(value))
  }
}
