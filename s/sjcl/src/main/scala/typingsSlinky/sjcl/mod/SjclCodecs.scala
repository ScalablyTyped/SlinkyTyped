package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclCodecs extends js.Object {
  var arrayBuffer: SjclArrayBufferCodec = js.native
  var base32: SjclCodec[String] = js.native
  var base32hex: SjclCodec[String] = js.native
  var base64: SjclCodec[String] = js.native
  var base64url: SjclCodec[String] = js.native
  var bytes: SjclCodec[js.Array[Double]] = js.native
  var hex: SjclCodec[String] = js.native
  var utf8String: SjclCodec[String] = js.native
  var z85: SjclCodec[String] = js.native
}

object SjclCodecs {
  @scala.inline
  def apply(
    arrayBuffer: SjclArrayBufferCodec,
    base32: SjclCodec[String],
    base32hex: SjclCodec[String],
    base64: SjclCodec[String],
    base64url: SjclCodec[String],
    bytes: SjclCodec[js.Array[Double]],
    hex: SjclCodec[String],
    utf8String: SjclCodec[String],
    z85: SjclCodec[String]
  ): SjclCodecs = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.asInstanceOf[js.Any], base32 = base32.asInstanceOf[js.Any], base32hex = base32hex.asInstanceOf[js.Any], base64 = base64.asInstanceOf[js.Any], base64url = base64url.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], utf8String = utf8String.asInstanceOf[js.Any], z85 = z85.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCodecs]
  }
  @scala.inline
  implicit class SjclCodecsOps[Self <: SjclCodecs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayBuffer(value: SjclArrayBufferCodec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase32(value: SjclCodec[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase32hex(value: SjclCodec[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base32hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase64(value: SjclCodec[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase64url(value: SjclCodec[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base64url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytes(value: SjclCodec[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHex(value: SjclCodec[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtf8String(value: SjclCodec[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utf8String")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZ85(value: SjclCodec[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z85")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

