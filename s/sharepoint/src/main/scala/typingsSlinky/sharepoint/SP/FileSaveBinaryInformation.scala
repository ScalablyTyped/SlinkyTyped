package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSaveBinaryInformation extends ClientValueObject {
  
  def get_checkRequiredFields(): Boolean = js.native
  
  def get_content(): Base64EncodedByteArray = js.native
  
  def get_eTag(): String = js.native
  
  def get_fieldValues(): js.Any = js.native
  
  def set_checkRequiredFields(value: Boolean): Unit = js.native
  
  def set_content(value: Base64EncodedByteArray): Unit = js.native
  
  def set_eTag(value: String): Unit = js.native
  
  def set_fieldValues(value: js.Any): Unit = js.native
}
object FileSaveBinaryInformation {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_checkRequiredFields: () => Boolean,
    get_content: () => Base64EncodedByteArray,
    get_eTag: () => String,
    get_fieldValues: () => js.Any,
    get_typeId: () => String,
    set_checkRequiredFields: Boolean => Unit,
    set_content: Base64EncodedByteArray => Unit,
    set_eTag: String => Unit,
    set_fieldValues: js.Any => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FileSaveBinaryInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_checkRequiredFields = js.Any.fromFunction0(get_checkRequiredFields), get_content = js.Any.fromFunction0(get_content), get_eTag = js.Any.fromFunction0(get_eTag), get_fieldValues = js.Any.fromFunction0(get_fieldValues), get_typeId = js.Any.fromFunction0(get_typeId), set_checkRequiredFields = js.Any.fromFunction1(set_checkRequiredFields), set_content = js.Any.fromFunction1(set_content), set_eTag = js.Any.fromFunction1(set_eTag), set_fieldValues = js.Any.fromFunction1(set_fieldValues), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FileSaveBinaryInformation]
  }
  
  @scala.inline
  implicit class FileSaveBinaryInformationOps[Self <: FileSaveBinaryInformation] (val x: Self) extends AnyVal {
    
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
    def setGet_checkRequiredFields(value: () => Boolean): Self = this.set("get_checkRequiredFields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_content(value: () => Base64EncodedByteArray): Self = this.set("get_content", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_eTag(value: () => String): Self = this.set("get_eTag", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_fieldValues(value: () => js.Any): Self = this.set("get_fieldValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_checkRequiredFields(value: Boolean => Unit): Self = this.set("set_checkRequiredFields", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_content(value: Base64EncodedByteArray => Unit): Self = this.set("set_content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_eTag(value: String => Unit): Self = this.set("set_eTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_fieldValues(value: js.Any => Unit): Self = this.set("set_fieldValues", js.Any.fromFunction1(value))
  }
}
