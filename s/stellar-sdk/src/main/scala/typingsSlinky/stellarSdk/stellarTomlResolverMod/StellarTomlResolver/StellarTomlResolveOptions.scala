package typingsSlinky.stellarSdk.stellarTomlResolverMod.StellarTomlResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StellarTomlResolveOptions extends js.Object {
  var allowHttp: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object StellarTomlResolveOptions {
  @scala.inline
  def apply(): StellarTomlResolveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StellarTomlResolveOptions]
  }
  @scala.inline
  implicit class StellarTomlResolveOptionsOps[Self <: StellarTomlResolveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHttp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHttp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHttp")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

