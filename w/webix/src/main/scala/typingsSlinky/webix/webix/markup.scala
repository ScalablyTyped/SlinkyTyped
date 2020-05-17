package typingsSlinky.webix.webix

import typingsSlinky.webix.webix.ui.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait markup extends js.Object {
  var attribute: js.Any = js.native
  var dataTag: js.Any = js.native
  var namespace: js.Any = js.native
  def init(node: String, target: String): baseview = js.native
  def parse(data: js.Any, datatype: String): Unit = js.native
}

object markup {
  @scala.inline
  def apply(
    attribute: js.Any,
    dataTag: js.Any,
    init: (String, String) => baseview,
    namespace: js.Any,
    parse: (js.Any, String) => Unit
  ): markup = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], dataTag = dataTag.asInstanceOf[js.Any], init = js.Any.fromFunction2(init), namespace = namespace.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[markup]
  }
  @scala.inline
  implicit class markupOps[Self <: markup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataTag(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(value: (String, String) => baseview): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNamespace(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: (js.Any, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

