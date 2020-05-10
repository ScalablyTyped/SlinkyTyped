package typingsSlinky.xmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlNode extends Node {
  var localName: String = js.native
  var name: String = js.native
  var ns: String = js.native
  var prefix: String = js.native
  var text: String = js.native
}

object XmlNode {
  @scala.inline
  def apply(
    getAttribute: (String, Boolean) => XmlAttribute,
    localName: String,
    name: String,
    ns: String,
    path: (js.Array[String], Boolean) => js.Array[XmlNode],
    prefix: String,
    text: String,
    visit: js.Function1[XmlNode, Unit] => Unit
  ): XmlNode = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction2(getAttribute), localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], path = js.Any.fromFunction2(path), prefix = prefix.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], visit = js.Any.fromFunction1(visit))
    __obj.asInstanceOf[XmlNode]
  }
  @scala.inline
  implicit class XmlNodeOps[Self <: XmlNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

