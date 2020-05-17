package typingsSlinky.wouter.anon

import typingsSlinky.preact.mod.ComponentChildren
import typingsSlinky.wouter.preactMod.DefaultParams
import typingsSlinky.wouter.preactMod.LocationHook
import typingsSlinky.wouter.preactMod.LocationHookOptions
import typingsSlinky.wouter.preactMod.LocationTuple
import typingsSlinky.wouter.preactMod.Match
import typingsSlinky.wouter.preactMod.MatcherFn
import typingsSlinky.wouter.preactMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<wouter.wouter/preact.RouterProps> & {  children  :preact.preact.ComponentChildren} */
@js.native
trait PartialRouterPropschildreBase extends js.Object {
  var base: js.UndefOr[Path] = js.native
  var children: ComponentChildren = js.native
  var hook: js.UndefOr[LocationHook] = js.native
  var matcher: js.UndefOr[MatcherFn] = js.native
}

object PartialRouterPropschildreBase {
  @scala.inline
  def apply(): PartialRouterPropschildreBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRouterPropschildreBase]
  }
  @scala.inline
  implicit class PartialRouterPropschildreBaseOps[Self <: PartialRouterPropschildreBase] (val x: Self) extends AnyVal {
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
    def withChildren(value: ComponentChildren): Self = {
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
    def withChildrenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(null)
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

