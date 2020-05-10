package typingsSlinky.xmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  /**
    * Gets an node attribute by name
    * @param attrName  Name of the attribute
    * @param ignoreCase  whenever or not to ignore the name casing
    */
  def getAttribute(attrName: String, ignoreCase: Boolean): XmlAttribute = js.native
  /**
    * Traverses the XML Nodes and iterates through specified path
    * @param path  Node names to traverse down
    * @param ignoreCase  Ignore the casing of the path / node names
    */
  def path(path: js.Array[String], ignoreCase: Boolean): js.Array[XmlNode] = js.native
  /**
    * Recursively traverses the nodes and calls the given function in-order
    * @param fn Function to call for each node
    */
  def visit(fn: js.Function1[/* n */ this.type, Unit]): Unit = js.native
}

object Node {
  @scala.inline
  def apply(
    getAttribute: (String, Boolean) => XmlAttribute,
    path: (js.Array[String], Boolean) => js.Array[XmlNode],
    visit: js.Function1[Node, Unit] => Unit
  ): Node = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction2(getAttribute), path = js.Any.fromFunction2(path), visit = js.Any.fromFunction1(visit))
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAttribute(value: (String, Boolean) => XmlAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPath(value: (js.Array[String], Boolean) => js.Array[XmlNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withVisit(value: js.Function1[Node, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

