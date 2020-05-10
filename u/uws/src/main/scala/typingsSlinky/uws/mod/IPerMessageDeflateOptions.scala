package typingsSlinky.uws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPerMessageDeflateOptions extends js.Object {
  var clientMaxWindowBits: js.UndefOr[Double] = js.native
  var clientNoContextTakeover: js.UndefOr[Boolean] = js.native
  var memLevel: js.UndefOr[Double] = js.native
  var serverMaxWindowBits: js.UndefOr[Double] = js.native
  var serverNoContextTakeover: js.UndefOr[Boolean] = js.native
}

object IPerMessageDeflateOptions {
  @scala.inline
  def apply(): IPerMessageDeflateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPerMessageDeflateOptions]
  }
  @scala.inline
  implicit class IPerMessageDeflateOptionsOps[Self <: IPerMessageDeflateOptions] (val x: Self) extends AnyVal {
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
    def withMemLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memLevel")(js.undefined)
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
  }
  
}

