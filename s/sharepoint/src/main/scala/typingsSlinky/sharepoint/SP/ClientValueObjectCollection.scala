package typingsSlinky.sharepoint.SP

import typingsSlinky.sharepoint.IEnumerable
import typingsSlinky.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ClientValueObjectCollectionOps[Self[t] <: ClientValueObjectCollection[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGet_count(value: () => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_count")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

