package typingsSlinky.xmlFormatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml-formatter", JSImport.Namespace)
  @js.native
  def apply(xml: String): String = js.native
  @JSImport("xml-formatter", JSImport.Namespace)
  @js.native
  def apply(xml: String, options: FormatOptions): String = js.native
  
  @js.native
  trait FormatOptions extends StObject {
    
    var collapseContent: js.UndefOr[Boolean] = js.native
    
    var filter: js.UndefOr[js.Function1[/* node */ js.Any, Boolean]] = js.native
    
    var indentation: js.UndefOr[String] = js.native
    
    var lineSeparator: js.UndefOr[String] = js.native
    
    var stripComments: js.UndefOr[Boolean] = js.native
    
    var whiteSpaceAtEndOfSelfclosingTag: js.UndefOr[Boolean] = js.native
  }
  object FormatOptions {
    
    @scala.inline
    def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit class FormatOptionsMutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseContent(value: Boolean): Self = StObject.set(x, "collapseContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseContentUndefined: Self = StObject.set(x, "collapseContent", js.undefined)
      
      @scala.inline
      def setFilter(value: /* node */ js.Any => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIndentation(value: String): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
      
      @scala.inline
      def setLineSeparator(value: String): Self = StObject.set(x, "lineSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineSeparatorUndefined: Self = StObject.set(x, "lineSeparator", js.undefined)
      
      @scala.inline
      def setStripComments(value: Boolean): Self = StObject.set(x, "stripComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripCommentsUndefined: Self = StObject.set(x, "stripComments", js.undefined)
      
      @scala.inline
      def setWhiteSpaceAtEndOfSelfclosingTag(value: Boolean): Self = StObject.set(x, "whiteSpaceAtEndOfSelfclosingTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhiteSpaceAtEndOfSelfclosingTagUndefined: Self = StObject.set(x, "whiteSpaceAtEndOfSelfclosingTag", js.undefined)
    }
  }
}
