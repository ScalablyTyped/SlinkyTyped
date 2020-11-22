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
import typingsSlinky.storybookComponents.previewMod.PreviewProps
import typingsSlinky.storybookComponents.sourceMod.SourceProps
import typingsSlinky.storybookComponents.storyMod.StoryProps
import typingsSlinky.storybookComponents.tabbedArgsTableMod.TabbedArgsTableProps
import typingsSlinky.storybookComponents.typesetMod.TypesetProps
import typingsSlinky.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/blocks", JSImport.Namespace)
@js.native
object blocksMod extends js.Object {
  
  val ArgsTable: ReactComponentClass[ArgsTableProps] = js.native
  
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
  
  def NoControlsWarning(): ReactElement = js.native
  
  /**
    * A preview component for showing one or more component `Story`
    * items. The preview also shows the source for the component
    * as a drop-down.
    */
  val Preview: ReactComponentClass[PreviewProps] = js.native
  
  /**
    * Syntax-highlighted source code for a component (or anything!)
    */
  val Source: ReactComponentClass[SourceProps] = js.native
  
  /**
    * A story element, either rendered inline or in an iframe,
    * with configurable height.
    */
  val Story: ReactComponentClass[StoryProps with Error] = js.native
  
  val Subtitle: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  
  val TabbedArgsTable: ReactComponentClass[TabbedArgsTableProps] = js.native
  
  val TableWrapper: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    Compact, 
    Theme
  ] = js.native
  
  val Title: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  
  val Typeset: ReactComponentClass[TypesetProps] = js.native
  
  @js.native
  object ArgsTableError extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableError with String
      ] = js.native
    
    /* "Args unsupported. See Args documentation for your framework." */ val ARGS_UNSUPPORTED: typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableError.ARGS_UNSUPPORTED with String = js.native
    
    /* "No component found." */ val NO_COMPONENT: typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableError.NO_COMPONENT with String = js.native
  }
  
  @js.native
  class IFrame ()
    extends typingsSlinky.storybookComponents.iframeMod.IFrame
  
  @js.native
  object SourceError extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.storybookComponents.sourceMod.SourceError with String] = js.native
    
    /* "There\\u2019s no story here." */ val NO_STORY: typingsSlinky.storybookComponents.sourceMod.SourceError.NO_STORY with String = js.native
    
    /* "Oh no! The source is not available." */ val SOURCE_UNAVAILABLE: typingsSlinky.storybookComponents.sourceMod.SourceError.SOURCE_UNAVAILABLE with String = js.native
  }
  
  @js.native
  object StoryError extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.storybookComponents.storyMod.StoryError with String] = js.native
    
    /* "No component or story to display" */ val NO_STORY: typingsSlinky.storybookComponents.storyMod.StoryError.NO_STORY with String = js.native
  }
}
