package typingsSlinky.serializeJavascript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializeJSOptions extends js.Object {
  /**
    * This option is a signal to serialize() that the object being serialized does not contain any function or regexps values.
    * This enables a hot-path that allows serialization to be over 3x faster.
    * If you're serializing a lot of data, and know its pure JSON, then you can enable this option for a speed-up.
    */
  var isJSON: js.UndefOr[Boolean] = js.native
  /**
    * This option is the same as the space argument that can be passed to JSON.stringify.
    * It can be used to add whitespace and indentation to the serialized output to make it more readable.
    */
  var space: js.UndefOr[String | Double] = js.native
  /**
    * This option is to signal serialize() that we want to do a straight conversion, without the XSS protection.
    * This options needs to be explicitly set to true. HTML characters and JavaScript line terminators will not be escaped.
    * You will have to roll your own.
    */
  var unsafe: js.UndefOr[Boolean] = js.native
}

object SerializeJSOptions {
  @scala.inline
  def apply(): SerializeJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeJSOptions]
  }
  @scala.inline
  implicit class SerializeJSOptionsOps[Self <: SerializeJSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsJSON(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withSpace(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("space")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsafe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe")(js.undefined)
        ret
    }
  }
  
}

