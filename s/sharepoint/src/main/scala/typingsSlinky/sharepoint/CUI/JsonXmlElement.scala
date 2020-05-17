package typingsSlinky.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonXmlElement extends js.Object {
  def appendChild(name: String, attrs: js.Array[String]): JsonXmlElement = js.native
  def appendChildNode(node: JsonXmlElement): JsonXmlElement = js.native
  def get_attributes(): js.Array[String] = js.native
  def get_childNodes(): js.Array[JsonXmlElement] = js.native
  def get_name(): String = js.native
}

object JsonXmlElement {
  @scala.inline
  def apply(
    appendChild: (String, js.Array[String]) => JsonXmlElement,
    appendChildNode: JsonXmlElement => JsonXmlElement,
    get_attributes: () => js.Array[String],
    get_childNodes: () => js.Array[JsonXmlElement],
    get_name: () => String
  ): JsonXmlElement = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction2(appendChild), appendChildNode = js.Any.fromFunction1(appendChildNode), get_attributes = js.Any.fromFunction0(get_attributes), get_childNodes = js.Any.fromFunction0(get_childNodes), get_name = js.Any.fromFunction0(get_name))
    __obj.asInstanceOf[JsonXmlElement]
  }
  @scala.inline
  implicit class JsonXmlElementOps[Self <: JsonXmlElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendChild(value: (String, js.Array[String]) => JsonXmlElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAppendChildNode(value: JsonXmlElement => JsonXmlElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendChildNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet_attributes(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_attributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_childNodes(value: () => js.Array[JsonXmlElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_childNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_name(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_name")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

