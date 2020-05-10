package typingsSlinky.soap

import typingsSlinky.soap.typesMod.IXmlAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNamespace extends js.Object {
  var namespace: String = js.native
  var xmlnsAttributes: js.UndefOr[js.Array[IXmlAttribute]] = js.native
}

object AnonNamespace {
  @scala.inline
  def apply(namespace: String): AnonNamespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNamespace]
  }
  @scala.inline
  implicit class AnonNamespaceOps[Self <: AnonNamespace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXmlnsAttributes(value: js.Array[IXmlAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlnsAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlnsAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlnsAttributes")(js.undefined)
        ret
    }
  }
  
}

