package typingsSlinky.storybookAddonA11y.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod._Global_.JSX.LibraryManagedAttributes
import typingsSlinky.storybookAddonA11y.TypeofHighlightToggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HighlightToggle {
  @JSImport("@storybook/addon-a11y/dist/components/Report/HighlightToggle", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def displayName(value: String): this.type = set("displayName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactComponentClass[LibraryManagedAttributes[TypeofHighlightToggle, js.Any]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(DollarDollartypeof: js.Symbol): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactComponentClass[LibraryManagedAttributes[TypeofHighlightToggle, js.Any]]]))
  }
}

