package typingsSlinky.storybookComponents

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLHeadingElement
import org.scalajs.dom.raw.HTMLTableElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.TableHTMLAttributes
import typingsSlinky.storybookComponents.anon.Compact
import typingsSlinky.storybookComponents.anon.Error
import typingsSlinky.storybookComponents.anon.PickDetailedHTMLPropsHTML
import typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableProps
import typingsSlinky.storybookComponents.colorPaletteMod.ColorProps
import typingsSlinky.storybookComponents.descriptionMod.DescriptionProps
import typingsSlinky.storybookComponents.iconGalleryMod.IconItemProps
import typingsSlinky.storybookComponents.iframeMod.IFrameProps
import typingsSlinky.storybookComponents.previewMod.PreviewProps
import typingsSlinky.storybookComponents.sourceMod.SourceProps
import typingsSlinky.storybookComponents.storyMod.StoryProps
import typingsSlinky.storybookComponents.tabbedArgsTableMod.TabbedArgsTableProps
import typingsSlinky.storybookComponents.typesetMod.TypesetProps
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blocksMod {
  
  @JSImport("@storybook/components/dist/blocks", "ArgsTable")
  @js.native
  val ArgsTable: ReactComponentClass[ArgsTableProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "ArgsTableError")
  @js.native
  object ArgsTableError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableError with String
      ] = js.native
    
    /* "Args unsupported. See Args documentation for your framework." */ val ARGS_UNSUPPORTED: typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableError.ARGS_UNSUPPORTED with String = js.native
    
    /* "No component found." */ val NO_COMPONENT: typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableError.NO_COMPONENT with String = js.native
  }
  
  @JSImport("@storybook/components/dist/blocks", "ColorItem")
  @js.native
  val ColorItem: ReactComponentClass[ColorProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "ColorPalette")
  @js.native
  val ColorPalette: ReactComponentClass[js.Object] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "Description")
  @js.native
  val Description: ReactComponentClass[DescriptionProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "DocsContent")
  @js.native
  val DocsContent: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "DocsPageWrapper")
  @js.native
  val DocsPageWrapper: ReactComponentClass[js.Object] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "DocsWrapper")
  @js.native
  val DocsWrapper: StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], js.Object, Theme] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "IFrame")
  @js.native
  class IFrame protected ()
    extends typingsSlinky.storybookComponents.iframeMod.IFrame {
    def this(props: IFrameProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IFrameProps, context: js.Any) = this()
  }
  
  @JSImport("@storybook/components/dist/blocks", "IconGallery")
  @js.native
  val IconGallery: ReactComponentClass[js.Object] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "IconItem")
  @js.native
  val IconItem: ReactComponentClass[IconItemProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "NoControlsWarning")
  @js.native
  def NoControlsWarning(): ReactElement = js.native
  
  /**
    * A preview component for showing one or more component `Story`
    * items. The preview also shows the source for the component
    * as a drop-down.
    */
  @JSImport("@storybook/components/dist/blocks", "Preview")
  @js.native
  val Preview: ReactComponentClass[PreviewProps] = js.native
  
  /**
    * Syntax-highlighted source code for a component (or anything!)
    */
  @JSImport("@storybook/components/dist/blocks", "Source")
  @js.native
  val Source: ReactComponentClass[SourceProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "SourceError")
  @js.native
  object SourceError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.storybookComponents.sourceMod.SourceError with String] = js.native
    
    /* "There\\u2019s no story here." */ val NO_STORY: typingsSlinky.storybookComponents.sourceMod.SourceError.NO_STORY with String = js.native
    
    /* "Oh no! The source is not available." */ val SOURCE_UNAVAILABLE: typingsSlinky.storybookComponents.sourceMod.SourceError.SOURCE_UNAVAILABLE with String = js.native
  }
  
  /**
    * A story element, either rendered inline or in an iframe,
    * with configurable height.
    */
  @JSImport("@storybook/components/dist/blocks", "Story")
  @js.native
  val Story: ReactComponentClass[StoryProps with Error] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "StoryError")
  @js.native
  object StoryError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.storybookComponents.storyMod.StoryError with String] = js.native
    
    /* "No component or story to display" */ val NO_STORY: typingsSlinky.storybookComponents.storyMod.StoryError.NO_STORY with String = js.native
  }
  
  @JSImport("@storybook/components/dist/blocks", "Subtitle")
  @js.native
  val Subtitle: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "TabbedArgsTable")
  @js.native
  val TabbedArgsTable: ReactComponentClass[TabbedArgsTableProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "TableWrapper")
  @js.native
  val TableWrapper: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    Compact, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "Title")
  @js.native
  val Title: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/components/dist/blocks", "Typeset")
  @js.native
  val Typeset: ReactComponentClass[TypesetProps] = js.native
}
