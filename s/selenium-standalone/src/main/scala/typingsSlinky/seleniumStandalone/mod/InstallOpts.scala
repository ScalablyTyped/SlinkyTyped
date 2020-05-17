package typingsSlinky.seleniumStandalone.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.seleniumStandalone.anon.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallOpts extends js.Object {
  var basePath: js.UndefOr[String] = js.native
  var baseURL: js.UndefOr[String] = js.native
  var cb: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  var drivers: js.UndefOr[StringDictionary[Arch]] = js.native
  var logger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  var progressCb: js.UndefOr[
    js.Function3[/* totalLength */ Double, /* progressLength */ Double, /* chunkLength */ Double, Unit]
  ] = js.native
  var requestOpts: js.UndefOr[RequestOptions | String | URL_] = js.native
  var version: js.UndefOr[String] = js.native
}

object InstallOpts {
  @scala.inline
  def apply(): InstallOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallOpts]
  }
  @scala.inline
  implicit class InstallOptsOps[Self <: InstallOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(js.undefined)
        ret
    }
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
    def withCb(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cb")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cb")(js.undefined)
        ret
    }
    @scala.inline
    def withDrivers(value: StringDictionary[Arch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drivers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrivers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drivers")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: /* message */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressCb(value: (/* totalLength */ Double, /* progressLength */ Double, /* chunkLength */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCb")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutProgressCb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressCb")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOpts(value: RequestOptions | String | URL_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

