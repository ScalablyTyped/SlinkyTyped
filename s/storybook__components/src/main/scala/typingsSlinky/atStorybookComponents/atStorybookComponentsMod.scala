package typingsSlinky.atStorybookComponents

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.HTMLTableElement
import slinky.core.ReactComponentClass
import typingsSlinky.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typingsSlinky.atStorybookComponents.distActionBarActionBarMod.ActionBarProps
import typingsSlinky.atStorybookComponents.distAddonDashPanelAddonDashPanelMod.AddonPanelProps
import typingsSlinky.atStorybookComponents.distBadgeBadgeMod.BadgeProps
import typingsSlinky.atStorybookComponents.distBarBarMod.FlexBarProps
import typingsSlinky.atStorybookComponents.distBarButtonMod.IconButtonProps
import typingsSlinky.atStorybookComponents.distBarButtonMod.TabButtonProps
import typingsSlinky.atStorybookComponents.distBarSeparatorMod.SeparatorProps
import typingsSlinky.atStorybookComponents.distBlocksColorPaletteMod.ColorProps
import typingsSlinky.atStorybookComponents.distBlocksDescriptionMod.DescriptionProps
import typingsSlinky.atStorybookComponents.distBlocksDocsPageMod.DocsPageProps
import typingsSlinky.atStorybookComponents.distBlocksIconGalleryMod.IconItemProps
import typingsSlinky.atStorybookComponents.distBlocksPreviewMod.PreviewProps
import typingsSlinky.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableProps
import typingsSlinky.atStorybookComponents.distBlocksSourceMod.SourceProps
import typingsSlinky.atStorybookComponents.distBlocksStoryMod.StoryProps
import typingsSlinky.atStorybookComponents.distBlocksTypesetMod.TypesetProps
import typingsSlinky.atStorybookComponents.distBrandStorybookLogoMod.StorybookLogoProps
import typingsSlinky.atStorybookComponents.distButtonButtonMod.ButtonProps
import typingsSlinky.atStorybookComponents.distIconIconMod.IconsProps
import typingsSlinky.atStorybookComponents.distScrollAreaScrollAreaMod.ScrollAreaProps
import typingsSlinky.atStorybookComponents.distSpacedSpacedMod.SpacedProps
import typingsSlinky.atStorybookComponents.distSyntaxhighlighterSyntaxhighlighterMod.SyntaxHighlighterProps
import typingsSlinky.atStorybookComponents.distTabsTabsMod.TabWrapperProps
import typingsSlinky.atStorybookComponents.distTabsTabsMod.TabsProps
import typingsSlinky.atStorybookComponents.distTabsTabsMod.TabsStateProps
import typingsSlinky.atStorybookComponents.distTooltipTooltipLinkListMod.TooltipLinkListProps
import typingsSlinky.atStorybookComponents.distTooltipTooltipMessageMod.TooltipMessageProps
import typingsSlinky.atStorybookComponents.distTooltipTooltipNoteMod.TooltipNoteProps
import typingsSlinky.atStorybookComponents.distTooltipWithTooltipMod.WithTooltipPureProps
import typingsSlinky.atStorybookComponents.distTypographyLinkLinkMod.AProps
import typingsSlinky.atStorybookComponents.distTypographyLinkLinkMod.LinkProps
import typingsSlinky.atStorybookTheming.distTypesMod.Theme
import typingsSlinky.react.reactMod.ButtonHTMLAttributes
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.FormHTMLAttributes
import typingsSlinky.react.reactMod.ForwardRefExoticComponent
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.react.reactMod.RefAttributes
import typingsSlinky.react.reactMod.TableHTMLAttributes
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components", JSImport.Namespace)
@js.native
object atStorybookComponentsMod extends js.Object {
  @js.native
  class IFrame ()
    extends typingsSlinky.atStorybookComponents.distBlocksIFrameMod.IFrame
  
  @js.native
  class SyntaxHighlighter ()
    extends typingsSlinky.atStorybookComponents.distSyntaxhighlighterSyntaxhighlighterMod.SyntaxHighlighter
  
  @js.native
  class TabsState protected ()
    extends typingsSlinky.atStorybookComponents.distTabsTabsMod.TabsState {
    def this(props: TabsStateProps) = this()
  }
  
  val ActionBar: ReactComponentClass[ActionBarProps] = js.native
  val Badge: ReactComponentClass[BadgeProps] = js.native
  val Bar: StyledComponent[js.Any, (Pick[_, String | Double | js.Symbol]) with Anon_Theme, Theme] = js.native
  val Button: (ForwardRefExoticComponent[ButtonProps with RefAttributes[_]]) with Anon_DefaultProps = js.native
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
  val DocumentWrapper: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Pick[
      DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 254 */ js.Any
    ], 
    Theme
  ] = js.native
  val FlexBar: ReactComponentClass[FlexBarProps] = js.native
  val Form: (StyledComponent[
    DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
    Pick[
      DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 262 */ js.Any
    ], 
    Theme
  ]) with Anon_About = js.native
  val IconButton: StyledComponent[
    DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
    IconButtonProps, 
    Theme
  ] = js.native
  val IconGallery: ReactComponentClass[js.Object] = js.native
  val IconItem: ReactComponentClass[IconItemProps] = js.native
  val Icons: ReactComponentClass[IconsProps] = js.native
  val Link: ReactComponentClass[LinkProps with AProps] = js.native
  val Placeholder: ReactComponentClass[js.Object] = js.native
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
  val ScrollArea: ReactComponentClass[ScrollAreaProps] = js.native
  val Separator: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
    SeparatorProps, 
    Theme
  ] = js.native
  /**
    * Syntax-highlighted source code for a component (or anything!)
    */
  val Source: ReactComponentClass[SourceProps] = js.native
  val Spaced: ReactComponentClass[SpacedProps] = js.native
  /**
    * A story element, either renderend inline or in an iframe,
    * with configurable height.
    */
  val Story: ReactComponentClass[StoryProps] = js.native
  val StorybookIcon: ReactComponentClass[js.Object] = js.native
  val StorybookLogo: ReactComponentClass[StorybookLogoProps] = js.native
  val TabBar: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Pick[
      DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 254 */ js.Any
    ], 
    Theme
  ] = js.native
  val TabButton: StyledComponent[
    DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
    TabButtonProps, 
    Theme
  ] = js.native
  val TabWrapper: ReactComponentClass[TabWrapperProps] = js.native
  val Table: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    js.Object, 
    Theme
  ] = js.native
  val Tabs: ReactComponentClass[TabsProps] = js.native
  val TooltipLinkList: ReactComponentClass[TooltipLinkListProps] = js.native
  val TooltipMessage: ReactComponentClass[TooltipMessageProps] = js.native
  val TooltipNote: ReactComponentClass[TooltipNoteProps] = js.native
  val Typeset: ReactComponentClass[TypesetProps] = js.native
  val WithTooltipPure: ReactComponentClass[WithTooltipPureProps] = js.native
  def AddonPanel(hasActiveChildren: AddonPanelProps): Element = js.native
  def interleaveSeparators(list: js.Array[_]): js.Any = js.native
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
  
  /* static members */
  @js.native
  object SyntaxHighlighter extends js.Object {
    var defaultProps: SyntaxHighlighterProps = js.native
  }
  
  /* static members */
  @js.native
  object TabsState extends js.Object {
    var defaultProps: TabsStateProps = js.native
  }
  
}

