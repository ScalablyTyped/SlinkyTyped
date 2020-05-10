package typingsSlinky.ws.mod

import typingsSlinky.node.zlibMod.ZlibOptions
import typingsSlinky.ws.AnonChunkSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerMessageDeflateOptions extends js.Object {
  var clientMaxWindowBits: js.UndefOr[Double] = js.native
  var clientNoContextTakeover: js.UndefOr[Boolean] = js.native
  var concurrencyLimit: js.UndefOr[Double] = js.native
  var serverMaxWindowBits: js.UndefOr[Double] = js.native
  var serverNoContextTakeover: js.UndefOr[Boolean] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var zlibDeflateOptions: js.UndefOr[AnonChunkSize] = js.native
  var zlibInflateOptions: js.UndefOr[ZlibOptions] = js.native
}

object PerMessageDeflateOptions {
  @scala.inline
  def apply(): PerMessageDeflateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerMessageDeflateOptions]
  }
  @scala.inline
  implicit class PerMessageDeflateOptionsOps[Self <: PerMessageDeflateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientMaxWindowBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientMaxWindowBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientMaxWindowBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientMaxWindowBits")(js.undefined)
        ret
    }
    @scala.inline
    def withClientNoContextTakeover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientNoContextTakeover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientNoContextTakeover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientNoContextTakeover")(js.undefined)
        ret
    }
    @scala.inline
    def withConcurrencyLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrencyLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withServerMaxWindowBits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverMaxWindowBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerMaxWindowBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverMaxWindowBits")(js.undefined)
        ret
    }
    @scala.inline
    def withServerNoContextTakeover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverNoContextTakeover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerNoContextTakeover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverNoContextTakeover")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withZlibDeflateOptions(value: AnonChunkSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlibDeflateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZlibDeflateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlibDeflateOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withZlibInflateOptions(value: ZlibOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlibInflateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZlibInflateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlibInflateOptions")(js.undefined)
        ret
    }
  }
  
}

