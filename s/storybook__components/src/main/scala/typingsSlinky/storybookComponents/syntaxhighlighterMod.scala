package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.storybookComponents.anon.TypeofReactSyntaxHighligh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntaxhighlighterMod {
  
  @JSImport("@storybook/components/dist/syntaxhighlighter/syntaxhighlighter", "SyntaxHighlighter")
  @js.native
  val SyntaxHighlighter: ReactComponentClass[Props] = js.native
  
  @js.native
  trait PreProps extends StObject {
    
    var padded: js.UndefOr[Boolean] = js.native
  }
  object PreProps {
    
    @scala.inline
    def apply(): PreProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreProps]
    }
    
    @scala.inline
    implicit class PrePropsMutableBuilder[Self <: PreProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPadded(value: Boolean): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
    }
  }
  
  type Props = SyntaxHighlighterProps with ReactSyntaxHighlighterProps
  
  type ReactSyntaxHighlighterProps = ComponentProps[TypeofReactSyntaxHighligh]
  
  @js.native
  trait SyntaxHighlighterProps extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var copyable: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[Boolean] = js.native
    
    var language: String = js.native
    
    var padded: js.UndefOr[Boolean] = js.native
    
    var renderer: js.UndefOr[js.Function1[/* props */ SyntaxHighlighterRendererProps, ReactElement]] = js.native
  }
  object SyntaxHighlighterProps {
    
    @scala.inline
    def apply(language: String): SyntaxHighlighterProps = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyntaxHighlighterProps]
    }
    
    @scala.inline
    implicit class SyntaxHighlighterPropsMutableBuilder[Self <: SyntaxHighlighterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCopyable(value: Boolean): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
      
      @scala.inline
      def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadded(value: Boolean): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
      
      @scala.inline
      def setRenderer(value: /* props */ SyntaxHighlighterRendererProps => ReactElement): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    }
  }
  
  @js.native
  trait SyntaxHighlighterRendererProps extends StObject {
    
    var rows: js.Array[_] = js.native
    
    var stylesheet: String = js.native
    
    var useInlineStyles: Boolean = js.native
  }
  object SyntaxHighlighterRendererProps {
    
    @scala.inline
    def apply(rows: js.Array[_], stylesheet: String, useInlineStyles: Boolean): SyntaxHighlighterRendererProps = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], stylesheet = stylesheet.asInstanceOf[js.Any], useInlineStyles = useInlineStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyntaxHighlighterRendererProps]
    }
    
    @scala.inline
    implicit class SyntaxHighlighterRendererPropsMutableBuilder[Self <: SyntaxHighlighterRendererProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRows(value: js.Array[_]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: js.Any*): Self = StObject.set(x, "rows", js.Array(value :_*))
      
      @scala.inline
      def setStylesheet(value: String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseInlineStyles(value: Boolean): Self = StObject.set(x, "useInlineStyles", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SyntaxHighlighterState extends StObject {
    
    var copied: Boolean = js.native
  }
  object SyntaxHighlighterState {
    
    @scala.inline
    def apply(copied: Boolean): SyntaxHighlighterState = {
      val __obj = js.Dynamic.literal(copied = copied.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyntaxHighlighterState]
    }
    
    @scala.inline
    implicit class SyntaxHighlighterStateMutableBuilder[Self <: SyntaxHighlighterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopied(value: Boolean): Self = StObject.set(x, "copied", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WrapperProps extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var padded: js.UndefOr[Boolean] = js.native
  }
  object WrapperProps {
    
    @scala.inline
    def apply(): WrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WrapperProps]
    }
    
    @scala.inline
    implicit class WrapperPropsMutableBuilder[Self <: WrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setPadded(value: Boolean): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
    }
  }
}
