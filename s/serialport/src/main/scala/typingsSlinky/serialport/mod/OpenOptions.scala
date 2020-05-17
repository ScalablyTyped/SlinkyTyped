package typingsSlinky.serialport.mod

import typingsSlinky.serialport.anon.Vmin
import typingsSlinky.serialport.serialportNumbers.`110`
import typingsSlinky.serialport.serialportNumbers.`115200`
import typingsSlinky.serialport.serialportNumbers.`1200`
import typingsSlinky.serialport.serialportNumbers.`134`
import typingsSlinky.serialport.serialportNumbers.`150`
import typingsSlinky.serialport.serialportNumbers.`1800`
import typingsSlinky.serialport.serialportNumbers.`19200`
import typingsSlinky.serialport.serialportNumbers.`1`
import typingsSlinky.serialport.serialportNumbers.`200`
import typingsSlinky.serialport.serialportNumbers.`2400`
import typingsSlinky.serialport.serialportNumbers.`2`
import typingsSlinky.serialport.serialportNumbers.`300`
import typingsSlinky.serialport.serialportNumbers.`38400`
import typingsSlinky.serialport.serialportNumbers.`4800`
import typingsSlinky.serialport.serialportNumbers.`50`
import typingsSlinky.serialport.serialportNumbers.`57600`
import typingsSlinky.serialport.serialportNumbers.`5`
import typingsSlinky.serialport.serialportNumbers.`600`
import typingsSlinky.serialport.serialportNumbers.`6`
import typingsSlinky.serialport.serialportNumbers.`75`
import typingsSlinky.serialport.serialportNumbers.`7`
import typingsSlinky.serialport.serialportNumbers.`8`
import typingsSlinky.serialport.serialportNumbers.`9600`
import typingsSlinky.serialport.serialportStrings.even
import typingsSlinky.serialport.serialportStrings.mark
import typingsSlinky.serialport.serialportStrings.none
import typingsSlinky.serialport.serialportStrings.odd
import typingsSlinky.serialport.serialportStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Options Type Defs
@js.native
trait OpenOptions extends js.Object {
  var autoOpen: js.UndefOr[Boolean] = js.native
  var baudRate: js.UndefOr[
    `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
  ] = js.native
  var binding: js.UndefOr[BaseBinding] = js.native
  var bindingOptions: js.UndefOr[Vmin] = js.native
  var dataBits: js.UndefOr[`8` | `7` | `6` | `5`] = js.native
  var highWaterMark: js.UndefOr[Double] = js.native
  var lock: js.UndefOr[Boolean] = js.native
  var parity: js.UndefOr[none | even | mark | odd | space] = js.native
  var rtscts: js.UndefOr[Boolean] = js.native
  var stopBits: js.UndefOr[`1` | `2`] = js.native
  var xany: js.UndefOr[Boolean] = js.native
  var xoff: js.UndefOr[Boolean] = js.native
  var xon: js.UndefOr[Boolean] = js.native
}

object OpenOptions {
  @scala.inline
  def apply(): OpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenOptions]
  }
  @scala.inline
  implicit class OpenOptionsOps[Self <: OpenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withBaudRate(
      value: `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baudRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaudRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baudRate")(js.undefined)
        ret
    }
    @scala.inline
    def withBinding(value: BaseBinding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(js.undefined)
        ret
    }
    @scala.inline
    def withBindingOptions(value: Vmin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBits(value: `8` | `7` | `6` | `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBits")(js.undefined)
        ret
    }
    @scala.inline
    def withHighWaterMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighWaterMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highWaterMark")(js.undefined)
        ret
    }
    @scala.inline
    def withLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lock")(js.undefined)
        ret
    }
    @scala.inline
    def withParity(value: none | even | mark | odd | space): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parity")(js.undefined)
        ret
    }
    @scala.inline
    def withRtscts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtscts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtscts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtscts")(js.undefined)
        ret
    }
    @scala.inline
    def withStopBits(value: `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopBits")(js.undefined)
        ret
    }
    @scala.inline
    def withXany(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xany")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xany")(js.undefined)
        ret
    }
    @scala.inline
    def withXoff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xoff")(js.undefined)
        ret
    }
    @scala.inline
    def withXon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xon")(js.undefined)
        ret
    }
  }
  
}

