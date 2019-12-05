package typingsSlinky.atStorybookComponents

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLTableElement
import slinky.core.ReactComponentClass
import typingsSlinky.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typingsSlinky.atStorybookComponents.distBlocksColorPaletteMod.ColorProps
import typingsSlinky.atStorybookComponents.distBlocksDescriptionMod.DescriptionProps
import typingsSlinky.atStorybookComponents.distBlocksDocsPageMod.DocsPageProps
import typingsSlinky.atStorybookComponents.distBlocksIconGalleryMod.IconItemProps
import typingsSlinky.atStorybookComponents.distBlocksPreviewMod.PreviewProps
import typingsSlinky.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableProps
import typingsSlinky.atStorybookComponents.distBlocksSourceMod.SourceProps
import typingsSlinky.atStorybookComponents.distBlocksStoryMod.StoryProps
import typingsSlinky.atStorybookComponents.distBlocksTypesetMod.TypesetProps
import typingsSlinky.atStorybookTheming.distTypesMod.Theme
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.react.reactMod.TableHTMLAttributes
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/blocks", JSImport.Namespace)
@js.native
object distBlocksMod extends js.Object {
  @js.native
  class IFrame ()
    extends typingsSlinky.atStorybookComponents.distBlocksIFrameMod.IFrame
  
  val ColorItem: ReactComponentClass[ColorProps] = js.native
  val ColorPalette: ReactComponentClass[js.Object] = js.native
  val Description: ReactComponentClass[DescriptionProps] = js.native
  val DocsContent: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Pick[
      DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 254 */ js.Any
    ], 
    Theme
  ] = js.native
  /**
    * An out-of-the box documentation page for components that shows the
    * title & subtitle and a collection of blocks including `Description`,
    * and `Preview`s for each of the component's stories.
    */
  val DocsPage: ReactComponentClass[DocsPageProps] = js.native
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
  val Table: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    js.Object, 
    Theme
  ] = js.native
  val Typeset: ReactComponentClass[TypesetProps] = js.native
  @js.native
  object PropsTableError extends js.Object {
    /* "No component found" */ val NO_COMPONENT: typingsSlinky.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableError.NO_COMPONENT with String = js.native
    /* "Props unsupported. See Props documentation for your framework." */ val PROPS_UNSUPPORTED: typingsSlinky.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableError.PROPS_UNSUPPORTED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableError with String
      ] = js.native
  }
  
  @js.native
  object SourceError extends js.Object {
    /* "There\\u2019s no story here." */ val NO_STORY: typingsSlinky.atStorybookComponents.distBlocksSourceMod.SourceError.NO_STORY with String = js.native
    /* "Oh no! The source is not available." */ val SOURCE_UNAVAILABLE: typingsSlinky.atStorybookComponents.distBlocksSourceMod.SourceError.SOURCE_UNAVAILABLE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.atStorybookComponents.distBlocksSourceMod.SourceError with String] = js.native
  }
  
  @js.native
  object StoryError extends js.Object {
    /* "No component or story to display" */ val NO_STORY: typingsSlinky.atStorybookComponents.distBlocksStoryMod.StoryError.NO_STORY with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.atStorybookComponents.distBlocksStoryMod.StoryError with String] = js.native
  }
  
}

