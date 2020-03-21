package typingsSlinky.wixStyleReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.wixStyleReact.loaderMod.LoaderColor
import typingsSlinky.wixStyleReact.loaderMod.LoaderProps
import typingsSlinky.wixStyleReact.loaderMod.LoaderSize
import typingsSlinky.wixStyleReact.loaderMod.LoaderStatus
import typingsSlinky.wixStyleReact.loaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Loader
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("wix-style-react/Loader", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    color: LoaderColor = null,
    dataHook: String = null,
    shouldLoadAsync: js.UndefOr[Boolean] = js.undefined,
    size: LoaderSize = null,
    status: LoaderStatus = null,
    statusMessage: String = null,
    styles: String = null,
    text: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dataHook != null) __obj.updateDynamic("dataHook")(dataHook.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldLoadAsync)) __obj.updateDynamic("shouldLoadAsync")(shouldLoadAsync.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.wixStyleReact.loaderMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = LoaderProps
}

