package typingsSlinky.styleSearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("style-search", JSImport.Namespace)
  @js.native
  def apply(options: Options, callback: StyleSearchCallback): Unit = js.native
  
  /**
    * Syntax feature options all accept three keywords:"skip", "check", "only".
    * An error will be thrown if you use "only" more than once
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * This includes both standard `/ * CSS comments *\/`
      * and non-standard but widely used `// single line comments`.
      * @default 'skip'
      */
    var comments: js.UndefOr[SyntaxFeatureOption] = js.native
    
    /**
      * @default 'check'
      */
    var functionArguments: js.UndefOr[SyntaxFeatureOption] = js.native
    
    /**
      * @default 'skip'
      */
    var functionNames: js.UndefOr[SyntaxFeatureOption] = js.native
    
    /**
      * If true, the search will stop after one match is found.
      * @default false
      */
    var once: js.UndefOr[Boolean] = js.native
    
    /**
      * This designates anything inside parentheses, which includes standard functions,but also Sass maps and other non-standard constructs.
      * `parentheticals` is a broader category than `functionArguments`
      * @default 'check'
      */
    var parentheticals: js.UndefOr[SyntaxFeatureOption] = js.native
    
    /** The source string to search through. */
    var source: String = js.native
    
    /**
      * @default 'skip'
      */
    var strings: js.UndefOr[SyntaxFeatureOption] = js.native
    
    /**
      * The target of the search. Can be
      * - a single character
      * - a string with some length
      * - an array of strings, all of which count as matches
      * (the match object passed to the callback will differentiate which string in the array
      * got matched via its target property)
      */
    var target: String | js.Array[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(source: String, target: String | js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: SyntaxFeatureOption): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setFunctionArguments(value: SyntaxFeatureOption): Self = StObject.set(x, "functionArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionArgumentsUndefined: Self = StObject.set(x, "functionArguments", js.undefined)
      
      @scala.inline
      def setFunctionNames(value: SyntaxFeatureOption): Self = StObject.set(x, "functionNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNamesUndefined: Self = StObject.set(x, "functionNames", js.undefined)
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      @scala.inline
      def setParentheticals(value: SyntaxFeatureOption): Self = StObject.set(x, "parentheticals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentheticalsUndefined: Self = StObject.set(x, "parentheticals", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrings(value: SyntaxFeatureOption): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
      
      @scala.inline
      def setTarget(value: String | js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value :_*))
    }
  }
  
  /**
    * For every match found your callback is invoked with:
    * - `match` object
    * - `count` The count of how many matches have been found up to this point
    */
  type StyleSearchCallback = js.Function2[/* match */ StyleSearchMatch, /* count */ Double, Unit]
  
  @js.native
  trait StyleSearchMatch extends StObject {
    
    /** where the match ends */
    val endIndex: Double = js.native
    
    /** whether the match is inside a comment */
    val insideComment: Boolean = js.native
    
    /** whether the match is inside a function — this includes the parentheses around the arguments */
    val insideFunctionArguments: Boolean = js.native
    
    /** whether the match is inside a string */
    val insideString: Boolean = js.native
    
    /** where the match begins */
    val startIndex: Double = js.native
    
    /** what got matched (useful if your target option is an array instead of a single string) */
    val target: String = js.native
  }
  object StyleSearchMatch {
    
    @scala.inline
    def apply(
      endIndex: Double,
      insideComment: Boolean,
      insideFunctionArguments: Boolean,
      insideString: Boolean,
      startIndex: Double,
      target: String
    ): StyleSearchMatch = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], insideComment = insideComment.asInstanceOf[js.Any], insideFunctionArguments = insideFunctionArguments.asInstanceOf[js.Any], insideString = insideString.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSearchMatch]
    }
    
    @scala.inline
    implicit class StyleSearchMatchMutableBuilder[Self <: StyleSearchMatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsideComment(value: Boolean): Self = StObject.set(x, "insideComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsideFunctionArguments(value: Boolean): Self = StObject.set(x, "insideFunctionArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsideString(value: Boolean): Self = StObject.set(x, "insideString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Syntax feature options.
    * An error will be thrown if you use `only` more than once
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.styleSearch.styleSearchStrings.skip
    - typingsSlinky.styleSearch.styleSearchStrings.check
    - typingsSlinky.styleSearch.styleSearchStrings.only
  */
  trait SyntaxFeatureOption extends StObject
  object SyntaxFeatureOption {
    
    @scala.inline
    def check: typingsSlinky.styleSearch.styleSearchStrings.check = "check".asInstanceOf[typingsSlinky.styleSearch.styleSearchStrings.check]
    
    @scala.inline
    def only: typingsSlinky.styleSearch.styleSearchStrings.only = "only".asInstanceOf[typingsSlinky.styleSearch.styleSearchStrings.only]
    
    @scala.inline
    def skip: typingsSlinky.styleSearch.styleSearchStrings.skip = "skip".asInstanceOf[typingsSlinky.styleSearch.styleSearchStrings.skip]
  }
}
