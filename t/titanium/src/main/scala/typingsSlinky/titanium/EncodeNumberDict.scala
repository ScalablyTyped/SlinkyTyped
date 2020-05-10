package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named parameters for <Titanium.Codec.encodeNumber>.
  */
@js.native
trait EncodeNumberDict extends js.Object {
  /**
  	 * Byte order to encode with.
  	 */
  var byteOrder: js.UndefOr[Double] = js.native
  /**
  	 * Destination buffer.
  	 */
  var dest: Buffer = js.native
  /**
  	 * Index in the `dest` buffer of the first byte of encoded data.
  	 */
  var position: js.UndefOr[Double] = js.native
  /**
  	 * Number to encode.
  	 */
  var source: Double = js.native
  /**
  	 * Encoding type to use.
  	 */
  var `type`: java.lang.String = js.native
}

object EncodeNumberDict {
  @scala.inline
  def apply(dest: Buffer, source: Double, `type`: java.lang.String): EncodeNumberDict = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeNumberDict]
  }
  @scala.inline
  implicit class EncodeNumberDictOps[Self <: EncodeNumberDict] (val x: Self) extends AnyVal {
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
    def withSource(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withByteOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutByteOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}

