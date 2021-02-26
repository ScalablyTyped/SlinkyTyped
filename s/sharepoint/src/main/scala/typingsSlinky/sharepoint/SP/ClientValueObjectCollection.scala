package typingsSlinky.sharepoint.SP

import typingsSlinky.sharepoint.IEnumerable
import typingsSlinky.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientValueObjectCollection[T]
  extends ClientValueObject
     with IEnumerable[T] {
  
  def get_count(): Double = js.native
}
object ClientValueObjectCollection {
  
  @scala.inline
  def apply[T](
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    getEnumerator: () => IEnumerator[T],
    get_count: () => Double,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ClientValueObjectCollection[T] = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), getEnumerator = js.Any.fromFunction0(getEnumerator), get_count = js.Any.fromFunction0(get_count), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ClientValueObjectCollection[T]]
  }
  
  @scala.inline
  implicit class ClientValueObjectCollectionMutableBuilder[Self <: ClientValueObjectCollection[_], T] (val x: Self with ClientValueObjectCollection[T]) extends AnyVal {
    
    @scala.inline
    def setGet_count(value: () => Double): Self = StObject.set(x, "get_count", js.Any.fromFunction0(value))
  }
}
