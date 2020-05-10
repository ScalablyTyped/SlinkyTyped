package typingsSlinky.serialport.mod

import typingsSlinky.serialport.serialportNumbers.`110`
import typingsSlinky.serialport.serialportNumbers.`115200`
import typingsSlinky.serialport.serialportNumbers.`1200`
import typingsSlinky.serialport.serialportNumbers.`134`
import typingsSlinky.serialport.serialportNumbers.`150`
import typingsSlinky.serialport.serialportNumbers.`1800`
import typingsSlinky.serialport.serialportNumbers.`19200`
import typingsSlinky.serialport.serialportNumbers.`200`
import typingsSlinky.serialport.serialportNumbers.`2400`
import typingsSlinky.serialport.serialportNumbers.`300`
import typingsSlinky.serialport.serialportNumbers.`38400`
import typingsSlinky.serialport.serialportNumbers.`4800`
import typingsSlinky.serialport.serialportNumbers.`50`
import typingsSlinky.serialport.serialportNumbers.`57600`
import typingsSlinky.serialport.serialportNumbers.`600`
import typingsSlinky.serialport.serialportNumbers.`75`
import typingsSlinky.serialport.serialportNumbers.`9600`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOptions extends js.Object {
  var baudRate: js.UndefOr[
    `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
  ] = js.native
}

object UpdateOptions {
  @scala.inline
  def apply(): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions]
  }
  @scala.inline
  implicit class UpdateOptionsOps[Self <: UpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

