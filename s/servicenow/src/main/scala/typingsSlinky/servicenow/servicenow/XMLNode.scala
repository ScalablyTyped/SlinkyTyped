package typingsSlinky.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLNode extends js.Object {
  def getAttribute(attribute: String): String = js.native
  def getChildNodeIterator(): XMLNodeIterator = js.native
  def getFirstChild(): XMLNode = js.native
  def getLastChild(): XMLNode = js.native
  def getNodeName(): String = js.native
  def getNodeValue(): String = js.native
  def getTextContent(): String = js.native
  def hasAttribute(name: String): Boolean = js.native
}

object XMLNode {
  @scala.inline
  def apply(
    getAttribute: String => String,
    getChildNodeIterator: () => XMLNodeIterator,
    getFirstChild: () => XMLNode,
    getLastChild: () => XMLNode,
    getNodeName: () => String,
    getNodeValue: () => String,
    getTextContent: () => String,
    hasAttribute: String => Boolean
  ): XMLNode = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getChildNodeIterator = js.Any.fromFunction0(getChildNodeIterator), getFirstChild = js.Any.fromFunction0(getFirstChild), getLastChild = js.Any.fromFunction0(getLastChild), getNodeName = js.Any.fromFunction0(getNodeName), getNodeValue = js.Any.fromFunction0(getNodeValue), getTextContent = js.Any.fromFunction0(getTextContent), hasAttribute = js.Any.fromFunction1(hasAttribute))
    __obj.asInstanceOf[XMLNode]
  }
  @scala.inline
  implicit class XMLNodeOps[Self <: XMLNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAttribute(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetChildNodeIterator(value: () => XMLNodeIterator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getChildNodeIterator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFirstChild(value: () => XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFirstChild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLastChild(value: () => XMLNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLastChild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNodeName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNodeValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextContent(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasAttribute(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttribute")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

