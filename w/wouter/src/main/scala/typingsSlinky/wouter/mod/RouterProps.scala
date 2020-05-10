package typingsSlinky.wouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterProps extends js.Object {
  var base: Path = js.native
  var hook: LocationHook = js.native
  var matcher: MatcherFn = js.native
}

object RouterProps {
  @scala.inline
  def apply(
    base: Path,
    hook: /* options */ js.UndefOr[LocationHookOptions] => LocationTuple,
    matcher: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]
  ): RouterProps = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], hook = js.Any.fromFunction1(hook), matcher = js.Any.fromFunction2(matcher))
    __obj.asInstanceOf[RouterProps]
  }
  @scala.inline
  implicit class RouterPropsOps[Self <: RouterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHook(value: /* options */ js.UndefOr[LocationHookOptions] => LocationTuple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatcher(value: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

