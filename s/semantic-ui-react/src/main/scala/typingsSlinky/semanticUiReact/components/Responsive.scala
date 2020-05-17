package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.responsiveMod.default
import typingsSlinky.semanticUiReact.responsiveResponsiveMod.ResponsiveOnUpdateData
import typingsSlinky.semanticUiReact.responsiveResponsiveMod.ResponsiveProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Responsive {
  @JSImport("semantic-ui-react/dist/commonjs/addons/Responsive", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def fireOnMount(value: Boolean): this.type = set("fireOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def getWidth(value: () => Double): this.type = set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def maxWidth(value: Double | String): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def minWidth(value: Double | String): this.type = set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def onUpdate(value: (/* event */ SyntheticEvent[Event, HTMLElement], /* data */ ResponsiveOnUpdateData) => Unit): this.type = set("onUpdate", js.Any.fromFunction2(value))
  }
  
  def withProps(p: ResponsiveProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Responsive.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

