package typingsSlinky.wouter.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.wouter.PartialRouterPropschildre
import typingsSlinky.wouter.mod.DefaultParams
import typingsSlinky.wouter.mod.LocationHookOptions
import typingsSlinky.wouter.mod.LocationTuple
import typingsSlinky.wouter.mod.Match
import typingsSlinky.wouter.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Router
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("wouter", "Router")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    base: Path = null,
    hook: /* options */ js.UndefOr[LocationHookOptions] => LocationTuple = null,
    matcher: (/* pattern */ Path, /* path */ Path) => Match[DefaultParams] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(js.Any.fromFunction1(hook))
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction2(matcher))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PartialRouterPropschildre
}

