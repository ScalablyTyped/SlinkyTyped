package typingsSlinky.storybookComponents

import org.scalajs.dom.raw.HTMLTableElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.TableHTMLAttributes
import typingsSlinky.storybookComponents.anon.Compact
import typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableProps
import typingsSlinky.storybookComponents.tabbedArgsTableMod.TabbedArgsTableProps
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argsTableMod {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable", "ArgsTable")
  @js.native
  val ArgsTable: ReactComponentClass[ArgsTableProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable", "ArgsTableError")
  @js.native
  object ArgsTableError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableError with String
      ] = js.native
    
    /* "Args unsupported. See Args documentation for your framework." */ val ARGS_UNSUPPORTED: typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableError.ARGS_UNSUPPORTED with String = js.native
    
    /* "No component found." */ val NO_COMPONENT: typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableError.NO_COMPONENT with String = js.native
  }
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable", "NoControlsWarning")
  @js.native
  def NoControlsWarning(): ReactElement = js.native
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable", "TabbedArgsTable")
  @js.native
  val TabbedArgsTable: ReactComponentClass[TabbedArgsTableProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable", "TableWrapper")
  @js.native
  val TableWrapper: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    Compact, 
    Theme
  ] = js.native
}
