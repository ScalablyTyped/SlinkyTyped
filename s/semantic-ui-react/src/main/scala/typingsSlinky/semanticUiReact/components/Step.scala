package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.a.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import typingsSlinky.semanticUiReact.stepContentMod.StepContentProps
import typingsSlinky.semanticUiReact.stepDescriptionMod.StepDescriptionProps
import typingsSlinky.semanticUiReact.stepGroupMod.StepGroupProps
import typingsSlinky.semanticUiReact.stepStepMod.StepProps
import typingsSlinky.semanticUiReact.stepTitleMod.StepTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Step {
  @JSImport("semantic-ui-react", "Step")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.semanticUiReact.mod.Step] {
    @scala.inline
    def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def completed(value: Boolean): this.type = set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def descriptionFunction3(
      value: (/* component */ ReactType[StepDescriptionProps], StepDescriptionProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("description", js.Any.fromFunction3(value))
    @scala.inline
    def description(value: SemanticShorthandItem[StepDescriptionProps]): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconFunction3(
      value: (/* component */ ReactType[IconProps], IconProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("icon", js.Any.fromFunction3(value))
    @scala.inline
    def icon(value: SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def link(value: Boolean): this.type = set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ StepProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def ordered(value: Boolean): this.type = set("ordered", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleFunction3(
      value: (/* component */ ReactType[StepTitleProps], StepTitleProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("title", js.Any.fromFunction3(value))
    @scala.inline
    def title(value: SemanticShorthandItem[StepTitleProps]): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Step.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Content {
    @JSImport("semantic-ui-react", "Step.Content")
    @js.native
    object component extends js.Object
    
    def withProps(p: StepContentProps): SharedBuilder_StepContentProps774867170 = new SharedBuilder_StepContentProps774867170(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Content.type): SharedBuilder_StepContentProps774867170 = new SharedBuilder_StepContentProps774867170(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Description {
    @JSImport("semantic-ui-react", "Step.Description")
    @js.native
    object component extends js.Object
    
    def withProps(p: StepDescriptionProps): SharedBuilder_StepDescriptionProps_1229748384 = new SharedBuilder_StepDescriptionProps_1229748384(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Description.type): SharedBuilder_StepDescriptionProps_1229748384 = new SharedBuilder_StepDescriptionProps_1229748384(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Group {
    @JSImport("semantic-ui-react", "Step.Group")
    @js.native
    object component extends js.Object
    
    def withProps(p: StepGroupProps): SharedBuilder_StepGroupProps1201670136 = new SharedBuilder_StepGroupProps1201670136(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Group.type): SharedBuilder_StepGroupProps1201670136 = new SharedBuilder_StepGroupProps1201670136(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Title {
    @JSImport("semantic-ui-react", "Step.Title")
    @js.native
    object component extends js.Object
    
    def withProps(p: StepTitleProps): SharedBuilder_StepTitleProps1252644081 = new SharedBuilder_StepTitleProps1252644081(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Title.type): SharedBuilder_StepTitleProps1252644081 = new SharedBuilder_StepTitleProps1252644081(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

