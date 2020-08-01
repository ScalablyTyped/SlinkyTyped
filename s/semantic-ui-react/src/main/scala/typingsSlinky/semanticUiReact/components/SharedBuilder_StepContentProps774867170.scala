package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.stepDescriptionMod.StepDescriptionProps
import typingsSlinky.semanticUiReact.stepTitleMod.StepTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_StepContentProps774867170 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
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
  def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def titleFunction3(
    value: (/* component */ ReactType[StepTitleProps], StepTitleProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("title", js.Any.fromFunction3(value))
  @scala.inline
  def title(value: SemanticShorthandItem[StepTitleProps]): this.type = set("title", value.asInstanceOf[js.Any])
}

