package typingsSlinky.wordpressDependencyExtractionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var injectPolyfill: js.UndefOr[Boolean] = js.native
  var requestToExternal: js.UndefOr[js.Function1[/* request */ String, String | js.Array[String] | Unit]] = js.native
  var requestToHandle: js.UndefOr[js.Function1[/* request */ String, String | Unit]] = js.native
  var useDefaults: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInjectPolyfill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectPolyfill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectPolyfill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectPolyfill")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestToExternal(value: /* request */ String => String | js.Array[String] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestToExternal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequestToExternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestToExternal")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestToHandle(value: /* request */ String => String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestToHandle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequestToHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestToHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDefaults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDefaults")(js.undefined)
        ret
    }
  }
  
}

