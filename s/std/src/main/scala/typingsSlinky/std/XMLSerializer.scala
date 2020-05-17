package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the serializeToString() method to construct an XML string representing a DOM tree. */
@js.native
trait XMLSerializer extends js.Object {
  def serializeToString(root: org.scalajs.dom.raw.Node): java.lang.String = js.native
}

object XMLSerializer {
  @scala.inline
  def apply(serializeToString: org.scalajs.dom.raw.Node => java.lang.String): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.asInstanceOf[XMLSerializer]
  }
  @scala.inline
  implicit class XMLSerializerOps[Self <: org.scalajs.dom.raw.XMLSerializer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSerializeToString(value: org.scalajs.dom.raw.Node => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeToString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

