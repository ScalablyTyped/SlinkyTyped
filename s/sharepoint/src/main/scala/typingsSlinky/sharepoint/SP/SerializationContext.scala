package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializationContext extends js.Object {
  def addClientObject(obj: ClientObject): Unit = js.native
  def addObjectPath(path: ObjectPath): Unit = js.native
}

object SerializationContext {
  @scala.inline
  def apply(addClientObject: ClientObject => Unit, addObjectPath: ObjectPath => Unit): SerializationContext = {
    val __obj = js.Dynamic.literal(addClientObject = js.Any.fromFunction1(addClientObject), addObjectPath = js.Any.fromFunction1(addObjectPath))
    __obj.asInstanceOf[SerializationContext]
  }
  @scala.inline
  implicit class SerializationContextOps[Self <: SerializationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClientObject(value: ClientObject => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClientObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddObjectPath(value: ObjectPath => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addObjectPath")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

