package typingsSlinky.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastRequestOptions extends js.Object {
  /**
    * Allows you to parse all the ads contained in the VAST or to parse them ad by ad or adPod by adPod (default true)
    */
  var resolveAll: js.UndefOr[Boolean] = js.native
  /**
    * A custom timeout for the requests (default 0)
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Custom urlhandler to be used instead of the default ones urlhandlers
    */
  var urlHandler: js.UndefOr[VASTClientUrlHandler] = js.native
  /**
    * A boolean to enable the withCredentials options for the XHR and FLASH URLHandlers (default false)
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
  /**
    * A number of Wrapper responses that can be received with no InLine response (default 0)
    */
  var wrapperLimit: js.UndefOr[Double] = js.native
}

object VastRequestOptions {
  @scala.inline
  def apply(): VastRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VastRequestOptions]
  }
  @scala.inline
  implicit class VastRequestOptionsOps[Self <: VastRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolveAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveAll")(js.undefined)
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
    @scala.inline
    def withUrlHandler(value: VASTClientUrlHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperLimit")(js.undefined)
        ret
    }
  }
  
}

