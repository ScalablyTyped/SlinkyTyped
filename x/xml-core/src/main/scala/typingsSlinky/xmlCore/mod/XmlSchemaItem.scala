package typingsSlinky.xmlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlSchemaItem[T] extends XmlSchemaItemBase {
  /**
    * Custom converter for item value
    *
    * @type {IConverter<T>}
    * @memberOf XmlAttributeType
    */
  var converter: js.UndefOr[IConverter[T]] = js.native
  /**
    * Default value for item
    *
    * @type {(T |)}
    * @memberOf XmlSchemaItem
    */
  var defaultValue: js.UndefOr[T | Null] = js.native
  /**
    * Determine where item is required
    *
    * @type {boolean}
    * @memberOf XmlSchemaItem
    */
  var required: js.UndefOr[Boolean] = js.native
}

object XmlSchemaItem {
  @scala.inline
  def apply[T](): XmlSchemaItem[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlSchemaItem[T]]
  }
  @scala.inline
  implicit class XmlSchemaItemOps[Self[t] <: XmlSchemaItem[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withConverter(value: IConverter[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConverter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(null)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
  }
  
}

