package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named parameters for <Titanium.Codec.encodeString>.
  */
@js.native
trait EncodeStringDict extends js.Object {
  /**
  	 * Character encoding to use when encoding this string to bytes.
  	 */
  var charset: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Destination buffer.
  	 */
  var dest: Buffer = js.native
  /**
  	 * Index in the `dest` buffer of the first byte of the encoded string.
  	 */
  var destPosition: js.UndefOr[Double] = js.native
  /**
  	 * Source string to encode.
  	 */
  var source: java.lang.String = js.native
  /**
  	 * Number of characters in `source` to encode.
  	 */
  var sourceLength: js.UndefOr[Double] = js.native
  /**
  	 * Position in `source` to start encoding.
  	 */
  var sourcePosition: js.UndefOr[Double] = js.native
}

object EncodeStringDict {
  @scala.inline
  def apply(dest: Buffer, source: java.lang.String): EncodeStringDict = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeStringDict]
  }
  @scala.inline
  implicit class EncodeStringDictOps[Self <: EncodeStringDict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDest(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharset(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charset")(js.undefined)
        ret
    }
    @scala.inline
    def withDestPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcePosition")(js.undefined)
        ret
    }
  }
  
}

