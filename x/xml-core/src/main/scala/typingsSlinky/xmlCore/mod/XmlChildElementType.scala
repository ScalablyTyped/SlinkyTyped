package typingsSlinky.xmlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlChildElementType[T]
  extends XmlSchemaItem[T]
     with XmlSchemaItemParser {
  /**
    * max occurs of items in collection
    *
    * @type {number}
    * @memberOf XmlChildElementType
    */
  var maxOccurs: js.UndefOr[Double] = js.native
  /**
    * min occurs of items in collection
    *
    * @type {number}
    * @memberOf XmlChildElementType
    */
  var minOccurs: js.UndefOr[Double] = js.native
  /**
    * Don't add root element of XmlCollection to compiled element
    *
    * @type {boolean}
    * @memberOf XmlChildElementType
    */
  var noRoot: js.UndefOr[Boolean] = js.native
}

object XmlChildElementType {
  @scala.inline
  def apply[T](): XmlChildElementType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlChildElementType[T]]
  }
  @scala.inline
  implicit class XmlChildElementTypeOps[Self[t] <: XmlChildElementType[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMaxOccurs(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOccurs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxOccurs: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOccurs")(js.undefined)
        ret
    }
    @scala.inline
    def withMinOccurs(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOccurs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinOccurs: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minOccurs")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRoot(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRoot: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRoot")(js.undefined)
        ret
    }
  }
  
}

