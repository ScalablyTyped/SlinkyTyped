package typingsSlinky.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decode extends js.Object {
  var decode: js.Any = js.native
  var encode: js.Any = js.native
  var format: js.Any = js.native
  var parse: js.Any = js.native
}

object Decode {
  @scala.inline
  def apply(decode: js.Any, encode: js.Any, format: js.Any, parse: js.Any): Decode = {
    val __obj = js.Dynamic.literal(decode = decode.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decode]
  }
  @scala.inline
  implicit class DecodeOps[Self <: Decode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

