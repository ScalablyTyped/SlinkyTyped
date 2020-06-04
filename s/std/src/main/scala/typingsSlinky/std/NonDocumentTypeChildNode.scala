package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonDocumentTypeChildNode extends js.Object {
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  val nextElementSibling: org.scalajs.dom.raw.Element | Null
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  val previousElementSibling: org.scalajs.dom.raw.Element | Null
}

object NonDocumentTypeChildNode {
  @scala.inline
  def apply(): NonDocumentTypeChildNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonDocumentTypeChildNode]
  }
  @scala.inline
  implicit class NonDocumentTypeChildNodeOps[Self <: org.scalajs.dom.raw.NonDocumentTypeChildNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextElementSibling(value: org.scalajs.dom.raw.Element): Self = this.set("nextElementSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextElementSiblingNull: Self = this.set("nextElementSibling", null)
    @scala.inline
    def setPreviousElementSibling(value: org.scalajs.dom.raw.Element): Self = this.set("previousElementSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousElementSiblingNull: Self = this.set("previousElementSibling", null)
  }
  
}

