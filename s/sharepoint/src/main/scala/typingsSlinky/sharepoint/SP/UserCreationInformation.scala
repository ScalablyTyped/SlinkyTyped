package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserCreationInformation extends ClientValueObject {
  
  def get_email(): String = js.native
  
  def get_loginName(): String = js.native
  
  def get_title(): String = js.native
  
  def set_email(value: String): Unit = js.native
  
  def set_loginName(value: String): Unit = js.native
  
  def set_title(value: String): Unit = js.native
}
object UserCreationInformation {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_email: () => String,
    get_loginName: () => String,
    get_title: () => String,
    get_typeId: () => String,
    set_email: String => Unit,
    set_loginName: String => Unit,
    set_title: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): UserCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_email = js.Any.fromFunction0(get_email), get_loginName = js.Any.fromFunction0(get_loginName), get_title = js.Any.fromFunction0(get_title), get_typeId = js.Any.fromFunction0(get_typeId), set_email = js.Any.fromFunction1(set_email), set_loginName = js.Any.fromFunction1(set_loginName), set_title = js.Any.fromFunction1(set_title), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[UserCreationInformation]
  }
  
  @scala.inline
  implicit class UserCreationInformationOps[Self <: UserCreationInformation] (val x: Self) extends AnyVal {
    
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
    def setGet_email(value: () => String): Self = this.set("get_email", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_loginName(value: () => String): Self = this.set("get_loginName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_title(value: () => String): Self = this.set("get_title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_email(value: String => Unit): Self = this.set("set_email", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_loginName(value: String => Unit): Self = this.set("set_loginName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_title(value: String => Unit): Self = this.set("set_title", js.Any.fromFunction1(value))
  }
}
