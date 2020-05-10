package typingsSlinky.universalRouter.generateUrlsMod

import typingsSlinky.pathToRegexp.mod.ParseOptions
import typingsSlinky.pathToRegexp.mod.PathFunctionOptions
import typingsSlinky.pathToRegexp.mod.TokensToFunctionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateUrlsOptions
  extends PathFunctionOptions
     with TokensToFunctionOptions
     with ParseOptions {
  var stringifyQueryParams: js.UndefOr[js.Function1[/* params */ Params, String]] = js.native
}

object GenerateUrlsOptions {
  @scala.inline
  def apply(): GenerateUrlsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateUrlsOptions]
  }
  @scala.inline
  implicit class GenerateUrlsOptionsOps[Self <: GenerateUrlsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStringifyQueryParams(value: /* params */ Params => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifyQueryParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStringifyQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringifyQueryParams")(js.undefined)
        ret
    }
  }
  
}

