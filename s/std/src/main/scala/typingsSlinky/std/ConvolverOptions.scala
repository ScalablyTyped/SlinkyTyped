package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvolverOptions extends AudioNodeOptions {
  var buffer: js.UndefOr[org.scalajs.dom.raw.AudioBuffer | Null] = js.native
  var disableNormalization: js.UndefOr[scala.Boolean] = js.native
}

object ConvolverOptions {
  @scala.inline
  def apply(): ConvolverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvolverOptions]
  }
  @scala.inline
  implicit class ConvolverOptionsOps[Self <: ConvolverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: org.scalajs.dom.raw.AudioBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(null)
        ret
    }
    @scala.inline
    def withDisableNormalization(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNormalization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNormalization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNormalization")(js.undefined)
        ret
    }
  }
  
}

