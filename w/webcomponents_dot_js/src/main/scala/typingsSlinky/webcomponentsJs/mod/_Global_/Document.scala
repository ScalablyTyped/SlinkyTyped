package typingsSlinky.webcomponentsJs.mod._Global_

import typingsSlinky.webcomponentsJs.mod.CustomElementConstructor
import typingsSlinky.webcomponentsJs.mod.CustomElementInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  def registerElement(name: String, prototype: CustomElementInit): CustomElementConstructor = js.native
}

object Document {
  @scala.inline
  def apply(registerElement: (String, CustomElementInit) => CustomElementConstructor): Document = {
    val __obj = js.Dynamic.literal(registerElement = js.Any.fromFunction2(registerElement))
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisterElement(value: (String, CustomElementInit) => CustomElementConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerElement")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

