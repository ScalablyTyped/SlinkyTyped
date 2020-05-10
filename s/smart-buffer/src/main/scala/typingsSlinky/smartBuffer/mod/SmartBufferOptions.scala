package typingsSlinky.smartBuffer.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object interface for constructing new SmartBuffer instances.
  */
@js.native
trait SmartBufferOptions extends js.Object {
  var buff: js.UndefOr[Buffer] = js.native
  var encoding: js.UndefOr[BufferEncoding] = js.native
  var size: js.UndefOr[Double] = js.native
}

object SmartBufferOptions {
  @scala.inline
  def apply(): SmartBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartBufferOptions]
  }
  @scala.inline
  implicit class SmartBufferOptionsOps[Self <: SmartBufferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuff(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buff")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: BufferEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

