package typingsSlinky.wouter.anon

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
trait PartialRouterPropschildre extends js.Object {
  var base: js.UndefOr[Path] = js.undefined
  var children: TagMod[Any]
  var hook: js.UndefOr[LocationHook] = js.undefined
  var matcher: js.UndefOr[MatcherFn] = js.undefined
}

object PartialRouterPropschildre {
  @scala.inline
  def apply(
    base: Path = null,
    children: TagMod[Any] = null,
    hook: /* options */ js.UndefOr[LocationHookOptions] => LocationTuple = null,
    matcher: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams] = null
  ): PartialRouterPropschildre = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(js.Any.fromFunction1(hook))
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction2(matcher))
    __obj.asInstanceOf[PartialRouterPropschildre]
  }
}

