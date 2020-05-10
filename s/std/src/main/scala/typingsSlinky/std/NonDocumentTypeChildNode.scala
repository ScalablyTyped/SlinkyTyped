package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonDocumentTypeChildNode extends js.Object {
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  val nextElementSibling: org.scalajs.dom.raw.Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  val previousElementSibling: org.scalajs.dom.raw.Element | Null = js.native
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
    def withNextElementSibling(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextElementSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextElementSiblingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextElementSibling")(null)
        ret
    }
    @scala.inline
    def withPreviousElementSibling(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousElementSibling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousElementSiblingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousElementSibling")(null)
        ret
    }
  }
  
}

