package typingsSlinky.sourceMapSupport.mod

import typingsSlinky.sourceMapSupport.sourceMapSupportStrings.auto
import typingsSlinky.sourceMapSupport.sourceMapSupportStrings.browser
import typingsSlinky.sourceMapSupport.sourceMapSupportStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var emptyCacheBetweenOperations: js.UndefOr[Boolean] = js.native
  var environment: js.UndefOr[auto | browser | node] = js.native
  var handleUncaughtExceptions: js.UndefOr[Boolean] = js.native
  var hookRequire: js.UndefOr[Boolean] = js.native
  var overrideRetrieveFile: js.UndefOr[Boolean] = js.native
  var overrideRetrieveSourceMap: js.UndefOr[Boolean] = js.native
  var retrieveFile: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
  var retrieveSourceMap: js.UndefOr[js.Function1[/* source */ String, UrlAndMap | Null]] = js.native
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
    def withEmptyCacheBetweenOperations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyCacheBetweenOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyCacheBetweenOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyCacheBetweenOperations")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: auto | browser | node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleUncaughtExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleUncaughtExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleUncaughtExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleUncaughtExceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHookRequire(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hookRequire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHookRequire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hookRequire")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideRetrieveFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideRetrieveFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideRetrieveFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideRetrieveFile")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideRetrieveSourceMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideRetrieveSourceMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideRetrieveSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideRetrieveSourceMap")(js.undefined)
        ret
    }
    @scala.inline
    def withRetrieveFile(value: /* path */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieveFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRetrieveFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieveFile")(js.undefined)
        ret
    }
    @scala.inline
    def withRetrieveSourceMap(value: /* source */ String => UrlAndMap | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieveSourceMap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRetrieveSourceMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieveSourceMap")(js.undefined)
        ret
    }
  }
  
}

