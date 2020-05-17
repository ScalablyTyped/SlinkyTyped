package typingsSlinky.servicenow

import typingsSlinky.servicenow.servicenow.XMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLDocument2 extends js.Object {
  def createElement(name: String): XMLNode = js.native
  def createElementWithTextValue(name: String, value: String): XMLNode = js.native
  def getDocumentElement(): XMLNode = js.native
  def getFirstNode(xpath: String): XMLNode = js.native
  def getNextNode(prev: js.Object): XMLNode = js.native
  def getNode(xpath: String): XMLNode = js.native
  def getNodeText(xpath: String): String = js.native
  def parseXML(xmlDoc: String): Unit = js.native
  def setCurrentElement(element: XMLNode): Unit = js.native
}

object XMLDocument2 {
  @scala.inline
  def apply(
    createElement: String => XMLNode,
    createElementWithTextValue: (String, String) => XMLNode,
    getDocumentElement: () => XMLNode,
    getFirstNode: String => XMLNode,
    getNextNode: js.Object => XMLNode,
    getNode: String => XMLNode,
    getNodeText: String => String,
    parseXML: String => Unit,
    setCurrentElement: XMLNode => Unit
  ): XMLDocument2 = {
    val __obj = js.Dynamic.literal(createElement = js.Any.fromFunction1(createElement), createElementWithTextValue = js.Any.fromFunction2(createElementWithTextValue), getDocumentElement = js.Any.fromFunction0(getDocumentElement), getFirstNode = js.Any.fromFunction1(getFirstNode), getNextNode = js.Any.fromFunction1(getNextNode), getNode = js.Any.fromFunction1(getNode), getNodeText = js.Any.fromFunction1(getNodeText), parseXML = js.Any.fromFunction1(parseXML), setCurrentElement = js.Any.fromFunction1(setCurrentElement))
    __obj.asInstanceOf[XMLDocument2]
  }
  @scala.inline
  implicit class XMLDocument2Ops[Self <: XMLDocument2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateElement(value: String => XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateElementWithTextValue(value: (String, String) => XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createElementWithTextValue")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDocumentElement(value: () => XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDocumentElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFirstNode(value: String => XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirstNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNextNode(value: js.Object => XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNode(value: String => XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNodeText(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseXML(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseXML")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCurrentElement(value: XMLNode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrentElement")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

