package typingsSlinky.x2js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeConverter extends js.Object {
  /**
    * Will be called for every attribute where test() returns true, replacing the original value of the attribute.
    * 
    * @param {string} name
    * @param {*} value
    * @returns {string}
    * 
    * @memberOf X2JS.AttributeConverter
    */
  def convert(name: String, value: js.Any): String = js.native
  /**
    * Indicates whether an attribute should be converted.
    * 
    * @param {string} name
    * @param {*} value
    * @returns {boolean}
    * 
    * @memberOf X2JS.AttributeConverter
    */
  def test(name: String, value: js.Any): Boolean = js.native
}

object AttributeConverter {
  @scala.inline
  def apply(convert: (String, js.Any) => String, test: (String, js.Any) => Boolean): AttributeConverter = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction2(convert), test = js.Any.fromFunction2(test))
    __obj.asInstanceOf[AttributeConverter]
  }
  @scala.inline
  implicit class AttributeConverterOps[Self <: AttributeConverter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvert(value: (String, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTest(value: (String, js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

