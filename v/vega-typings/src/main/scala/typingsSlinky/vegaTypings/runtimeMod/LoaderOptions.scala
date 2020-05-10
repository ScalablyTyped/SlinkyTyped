package typingsSlinky.vegaTypings.runtimeMod

import org.scalajs.dom.experimental.RequestInit
import typingsSlinky.vegaTypings.vegaTypingsStrings.file
import typingsSlinky.vegaTypings.vegaTypingsStrings.http
import typingsSlinky.vegaTypings.vegaTypingsStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderOptions extends js.Object {
  var baseURL: js.UndefOr[String] = js.native
  var defaultProtocol: js.UndefOr[http | https | String] = js.native
  var http: js.UndefOr[RequestInit] = js.native
  var mode: js.UndefOr[file | http] = js.native
  var target: js.UndefOr[String] = js.native
}

object LoaderOptions {
  @scala.inline
  def apply(): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderOptions]
  }
  @scala.inline
  implicit class LoaderOptionsOps[Self <: LoaderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseURL")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultProtocol(value: http | https | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withHttp(value: RequestInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: file | http): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

