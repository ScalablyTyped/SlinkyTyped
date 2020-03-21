package typingsSlinky.storybookComponents

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLHeadingElement
import org.scalajs.dom.raw.HTMLTableElement
import slinky.core.ReactComponentClass
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.TableHTMLAttributes
import typingsSlinky.storybookComponents.colorPaletteMod.ColorProps
import typingsSlinky.storybookComponents.descriptionMod.DescriptionProps
import typingsSlinky.storybookComponents.iconGalleryMod.IconItemProps
import typingsSlinky.storybookComponents.previewMod.PreviewProps
import typingsSlinky.storybookComponents.propsTableMod.PropsTableProps
import typingsSlinky.storybookComponents.sourceMod.SourceProps
import typingsSlinky.storybookComponents.storyMod.StoryProps
import typingsSlinky.storybookComponents.typesetMod.TypesetProps
import typingsSlinky.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/blocks", JSImport.Namespace)
@js.native
object blocksMod extends js.Object {
  @js.native
  class IFrame ()
    extends typingsSlinky.storybookComponents.iframeMod.IFrame
  
  val ColorItem: ReactComponentClass[ColorProps] = js.native
  val ColorPalette: ReactComponentClass[js.Object] = js.native
  val Description: ReactComponentClass[DescriptionProps] = js.native
  val DocsContent: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  val DocsPageWrapper: ReactComponentClass[js.Object] = js.native
  val DocsWrapper: StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], js.Object, Theme] = js.native
  val IconGallery: ReactComponentClass[js.Object] = js.native
  val IconItem: ReactComponentClass[IconItemProps] = js.native
  /**
    * A preview component for showing one or more component `Story`
    * items. The preview also shows the source for the component
    * as a drop-down.
    */
  val Preview: ReactComponentClass[PreviewProps] = js.native
  /**
    * Display the props for a component as a props table. Each row is a collection of
    * PropDefs, usually derived from docgen info for the component.
    */
  val PropsTable: ReactComponentClass[PropsTableProps] = js.native
  /**
    * Syntax-highlighted source code for a component (or anything!)
    */
  val Source: ReactComponentClass[SourceProps] = js.native
  /**
    * A story element, either renderend inline or in an iframe,
    * with configurable height.
    */
  val Story: ReactComponentClass[StoryProps] = js.native
  val Subtitle: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  val Table: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    js.Object, 
    Theme
  ] = js.native
  val Title: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  val Typeset: ReactComponentClass[TypesetProps] = js.native
  @js.native
  object PropsTableError extends js.Object {
    /* "No component found" */ val NO_COMPONENT: typingsSlinky.storybookComponents.propsTableMod.PropsTableError.NO_COMPONENT with String = js.native
    /* "Props unsupported. See Props documentation for your framework." */ val PROPS_UNSUPPORTED: typingsSlinky.storybookComponents.propsTableMod.PropsTableError.PROPS_UNSUPPORTED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.storybookComponents.propsTableMod.PropsTableError with String] = js.native
  }
  
  @js.native
  object SourceError extends js.Object {
    /* "There\\u2019s no story here." */ val NO_STORY: typingsSlinky.storybookComponents.sourceMod.SourceError.NO_STORY with String = js.native
    /* "Oh no! The source is not available." */ val SOURCE_UNAVAILABLE: typingsSlinky.storybookComponents.sourceMod.SourceError.SOURCE_UNAVAILABLE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.storybookComponents.sourceMod.SourceError with String] = js.native
  }
  
  @js.native
  object StoryError extends js.Object {
    /* "No component or story to display" */ val NO_STORY: typingsSlinky.storybookComponents.storyMod.StoryError.NO_STORY with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.storybookComponents.storyMod.StoryError with String] = js.native
  }
  
}

