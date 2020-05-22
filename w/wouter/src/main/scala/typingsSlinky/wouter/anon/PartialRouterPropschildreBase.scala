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
trait PartialRouterPropschildreBase extends js.Object {
  var base: js.UndefOr[Path] = js.undefined
  var children: ComponentChildren
  var hook: js.UndefOr[LocationHook] = js.undefined
  var matcher: js.UndefOr[MatcherFn] = js.undefined
}

object PartialRouterPropschildreBase {
  @scala.inline
  def apply(
    base: Path = null,
    children: js.UndefOr[Null | ComponentChildren] = js.undefined,
    hook: /* options */ js.UndefOr[LocationHookOptions] => LocationTuple = null,
    matcher: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams] = null
  ): PartialRouterPropschildreBase = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(js.Any.fromFunction1(hook))
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction2(matcher))
    __obj.asInstanceOf[PartialRouterPropschildreBase]
  }
}

