package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDecoderCommon extends js.Object {
  /**
    * Returns encoding's name, lowercased.
    */
  val encoding: java.lang.String = js.native
  /**
    * Returns true if error mode is "fatal", and false otherwise.
    */
  val fatal: scala.Boolean = js.native
  /**
    * Returns true if ignore BOM flag is set, and false otherwise.
    */
  val ignoreBOM: scala.Boolean = js.native
}

object TextDecoderCommon {
  @scala.inline
  def apply(encoding: java.lang.String, fatal: scala.Boolean, ignoreBOM: scala.Boolean): TextDecoderCommon = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderCommon]
  }
  @scala.inline
  implicit class TextDecoderCommonOps[Self <: TextDecoderCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFatal(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fatal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreBOM(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreBOM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

