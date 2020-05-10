package typingsSlinky.xmlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlNamespace extends js.Object {
  /**
    * Namespace URI
    *
    * @type {(string |)}
    * @memberOf XmlNamespace
    */
  var namespace: String | Null = js.native
  /**
    * Prefix
    *
    * @type {(string |)}
    * @memberOf XmlNamespace
    */
  var prefix: String | Null = js.native
}

object XmlNamespace {
  @scala.inline
  def apply(): XmlNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlNamespace]
  }
  @scala.inline
  implicit class XmlNamespaceOps[Self <: XmlNamespace] (val x: Self) extends AnyVal {
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
    def withNamespaceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(null)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(null)
        ret
    }
  }
  
}

