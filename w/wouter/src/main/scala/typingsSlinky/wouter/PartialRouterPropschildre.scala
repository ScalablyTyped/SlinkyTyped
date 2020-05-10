package typingsSlinky.wouter

import slinky.core.TagMod
import typingsSlinky.wouter.mod.DefaultParams
import typingsSlinky.wouter.mod.LocationHook
import typingsSlinky.wouter.mod.LocationHookOptions
import typingsSlinky.wouter.mod.LocationTuple
import typingsSlinky.wouter.mod.Match
import typingsSlinky.wouter.mod.MatcherFn
import typingsSlinky.wouter.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<wouter.wouter.RouterProps> & {  children  :react.react.ReactNode} */
@js.native
trait PartialRouterPropschildre extends js.Object {
  var base: js.UndefOr[Path] = js.native
  var children: TagMod[Any] = js.native
  var hook: js.UndefOr[LocationHook] = js.native
  var matcher: js.UndefOr[MatcherFn] = js.native
}

object PartialRouterPropschildre {
  @scala.inline
  def apply(): PartialRouterPropschildre = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRouterPropschildre]
  }
  @scala.inline
  implicit class PartialRouterPropschildreOps[Self <: PartialRouterPropschildre] (val x: Self) extends AnyVal {
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
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withHook(value: /* options */ js.UndefOr[LocationHookOptions] => LocationTuple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hook")(js.undefined)
        ret
    }
    @scala.inline
    def withMatcher(value: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcher")(js.undefined)
        ret
    }
  }
  
}

