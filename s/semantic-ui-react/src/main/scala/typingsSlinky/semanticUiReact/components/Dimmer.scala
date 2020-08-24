package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.dimmerDimmableMod.DimmerDimmableProps
import typingsSlinky.semanticUiReact.dimmerDimmerMod.DimmerProps
import typingsSlinky.semanticUiReact.dimmerInnerMod.DimmerInnerProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dimmer {
  @JSImport("semantic-ui-react", "Dimmer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Dimmer] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def page(value: Boolean): this.type = set("page", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DimmerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Dimmer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Dimmable {
    @JSImport("semantic-ui-react", "Dimmer.Dimmable")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
      @scala.inline
      def blurring(value: Boolean): this.type = set("blurring", value.asInstanceOf[js.Any])
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
      @scala.inline
      def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
      @scala.inline
      def dimmed(value: Boolean): this.type = set("dimmed", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: DimmerDimmableProps): typingsSlinky.semanticUiReact.components.Dimmer.Dimmable.Builder = new typingsSlinky.semanticUiReact.components.Dimmer.Dimmable.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Dimmable.type): typingsSlinky.semanticUiReact.components.Dimmer.Dimmable.Builder = new typingsSlinky.semanticUiReact.components.Dimmer.Dimmable.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Inner {
    @JSImport("semantic-ui-react", "Dimmer.Inner")
    @js.native
    object component extends js.Object
    
    def withProps(p: DimmerInnerProps): SharedBuilder_DimmerInnerProps_65086474[typingsSlinky.semanticUiReact.mod.Dimmer.Inner] = new SharedBuilder_DimmerInnerProps_65086474[typingsSlinky.semanticUiReact.mod.Dimmer.Inner](js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Inner.type): SharedBuilder_DimmerInnerProps_65086474[typingsSlinky.semanticUiReact.mod.Dimmer.Inner] = new SharedBuilder_DimmerInnerProps_65086474[typingsSlinky.semanticUiReact.mod.Dimmer.Inner](js.Array(this.component, js.Dictionary.empty))()
  }
  
}

