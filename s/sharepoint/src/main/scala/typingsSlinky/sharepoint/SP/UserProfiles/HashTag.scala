package typingsSlinky.sharepoint.SP.UserProfiles

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashTag extends ClientValueObject {
  
  def get_name(): String = js.native
  
  def get_useCount(): Double = js.native
}
object HashTag {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_name: () => String,
    get_typeId: () => String,
    get_useCount: () => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): HashTag = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_name = js.Any.fromFunction0(get_name), get_typeId = js.Any.fromFunction0(get_typeId), get_useCount = js.Any.fromFunction0(get_useCount), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[HashTag]
  }
  
  @scala.inline
  implicit class HashTagMutableBuilder[Self <: HashTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_useCount(value: () => Double): Self = StObject.set(x, "get_useCount", js.Any.fromFunction0(value))
  }
}
