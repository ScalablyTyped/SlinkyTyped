package typingsSlinky.storybookComponents

import org.scalajs.dom.raw.HTMLTableElement
import slinky.core.ReactComponentClass
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.TableHTMLAttributes
import typingsSlinky.storybookComponents.anon.Compact
import typingsSlinky.storybookComponents.typesMod.ArgTypes
import typingsSlinky.storybookComponents.typesMod.Args
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argsTableArgsTableMod {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgsTable", "ArgsTable")
  @js.native
  val ArgsTable: ReactComponentClass[ArgsTableProps] = js.native
  
  @js.native
  sealed trait ArgsTableError extends StObject
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgsTable", "ArgsTableError")
  @js.native
  object ArgsTableError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ArgsTableError with String] = js.native
    
    @js.native
    sealed trait ARGS_UNSUPPORTED extends ArgsTableError
    /* "Args unsupported. See Args documentation for your framework." */ val ARGS_UNSUPPORTED: typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableError.ARGS_UNSUPPORTED with String = js.native
    
    @js.native
    sealed trait NO_COMPONENT extends ArgsTableError
    /* "No component found." */ val NO_COMPONENT: typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableError.NO_COMPONENT with String = js.native
  }
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgsTable", "TableWrapper")
  @js.native
  val TableWrapper: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    Compact, 
    Theme
  ] = js.native
  
  @js.native
  trait ArgsTableErrorProps extends ArgsTableProps {
    
    var error: ArgsTableError = js.native
  }
  object ArgsTableErrorProps {
    
    @scala.inline
    def apply(error: ArgsTableError): ArgsTableErrorProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgsTableErrorProps]
    }
    
    @scala.inline
    implicit class ArgsTableErrorPropsMutableBuilder[Self <: ArgsTableErrorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: ArgsTableError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableRowProps
    - typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableErrorProps
  */
  trait ArgsTableProps extends StObject
  object ArgsTableProps {
    
    @scala.inline
    def ArgsTableErrorProps(error: ArgsTableError): typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableErrorProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableErrorProps]
    }
    
    @scala.inline
    def ArgsTableRowProps(rows: ArgTypes): typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableRowProps = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.storybookComponents.argsTableArgsTableMod.ArgsTableRowProps]
    }
  }
  
  @js.native
  trait ArgsTableRowProps extends ArgsTableProps {
    
    var args: js.UndefOr[Args] = js.native
    
    var compact: js.UndefOr[Boolean] = js.native
    
    var inAddonPanel: js.UndefOr[Boolean] = js.native
    
    var initialExpandedArgs: js.UndefOr[Boolean] = js.native
    
    var resetArgs: js.UndefOr[js.Function1[/* argNames */ js.UndefOr[js.Array[String]], Unit]] = js.native
    
    var rows: ArgTypes = js.native
    
    var updateArgs: js.UndefOr[js.Function1[/* args */ Args, Unit]] = js.native
  }
  object ArgsTableRowProps {
    
    @scala.inline
    def apply(rows: ArgTypes): ArgsTableRowProps = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgsTableRowProps]
    }
    
    @scala.inline
    implicit class ArgsTableRowPropsMutableBuilder[Self <: ArgsTableRowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setInAddonPanel(value: Boolean): Self = StObject.set(x, "inAddonPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInAddonPanelUndefined: Self = StObject.set(x, "inAddonPanel", js.undefined)
      
      @scala.inline
      def setInitialExpandedArgs(value: Boolean): Self = StObject.set(x, "initialExpandedArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialExpandedArgsUndefined: Self = StObject.set(x, "initialExpandedArgs", js.undefined)
      
      @scala.inline
      def setResetArgs(value: /* argNames */ js.UndefOr[js.Array[String]] => Unit): Self = StObject.set(x, "resetArgs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResetArgsUndefined: Self = StObject.set(x, "resetArgs", js.undefined)
      
      @scala.inline
      def setRows(value: ArgTypes): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateArgs(value: /* args */ Args => Unit): Self = StObject.set(x, "updateArgs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateArgsUndefined: Self = StObject.set(x, "updateArgs", js.undefined)
    }
  }
}
