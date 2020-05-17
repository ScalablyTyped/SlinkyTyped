package typingsSlinky.universalRouter.mod

import typingsSlinky.universalRouter.anon.Errorstatusnumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[C /* <: Context */, R] extends js.Object {
  var baseUrl: js.UndefOr[String] = js.native
  var context: js.UndefOr[C] = js.native
  var errorHandler: js.UndefOr[ErrorHandler[C, R]] = js.native
  var resolveRoute: js.UndefOr[ResolveRoute[C, R]] = js.native
}

object Options {
  @scala.inline
  def apply[C, R](): Options[C, R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[C, R]]
  }
  @scala.inline
  implicit class OptionsOps[Self[c, r] <: Options[c, r], C, R] (val x: Self[C, R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[C, R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[C, R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[C, R]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[C, R]) with Other]
    @scala.inline
    def withBaseUrl(value: String): Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: C): Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorHandler(value: (/* error */ Errorstatusnumber, /* context */ C with (RouteContext[C, R])) => Result[R]): Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveRoute(value: (/* context */ C with (RouteContext[C, R]), /* params */ QueryParams) => Result[R]): Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveRoute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutResolveRoute: Self[C, R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveRoute")(js.undefined)
        ret
    }
  }
  
}

