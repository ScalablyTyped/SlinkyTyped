package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Named parameters for <Titanium.Codec.decodeNumber>.
  */
@js.native
trait DecodeNumberDict extends js.Object {
  /**
  	 * byte order to decode with.
  	 */
  var byteOrder: js.UndefOr[Double] = js.native
  /**
  	 * Index in the `source` buffer of the first byte of data to decode.
  	 */
  var position: js.UndefOr[Double] = js.native
  /**
  	 * Buffer to decode.
  	 */
  var source: Buffer = js.native
  /**
  	 * The encoding type to use.
  	 */
  var `type`: java.lang.String = js.native
}

object DecodeNumberDict {
  @scala.inline
  def apply(source: Buffer, `type`: java.lang.String): DecodeNumberDict = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeNumberDict]
  }
  @scala.inline
  implicit class DecodeNumberDictOps[Self <: DecodeNumberDict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: Buffer): Self = {
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

