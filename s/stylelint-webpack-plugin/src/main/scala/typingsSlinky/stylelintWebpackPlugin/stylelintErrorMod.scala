package typingsSlinky.stylelintWebpackPlugin

import typingsSlinky.std.Error
import typingsSlinky.std.Partial
import typingsSlinky.std.TimerHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylelintErrorMod {
  
  @JSImport("stylelint-webpack-plugin/declarations/StylelintError", JSImport.Default)
  @js.native
  class default protected () extends Error {
    /**
      * @param {Partial<string>} messages
      */
    def this(messages: Partial[String]) = this()
  }
  /* static members */
  object default {
    
    /**
      * @param {Options} options
      * @param {Array<LintResult>} messages
      * @returns {StylelintError}
      */
    @JSImport("stylelint-webpack-plugin/declarations/StylelintError", "default.format")
    @js.native
    def format(hasFormatter: Options, messages: js.Array[LintResult]): js.Error = js.native
  }
  
  type LintResult = typingsSlinky.stylelint.mod.LintResult
  
  @js.native
  trait Options extends StObject {
    
    var context: js.UndefOr[String] = js.native
    
    var emitError: js.UndefOr[Boolean] = js.native
    
    var emitWarning: js.UndefOr[Boolean] = js.native
    
    var failOnError: js.UndefOr[Boolean] = js.native
    
    var failOnWarning: js.UndefOr[Boolean] = js.native
    
    var files: String | js.Array[String] = js.native
    
    var formatter: TimerHandler = js.native
    
    var lintDirtyModulesOnly: js.UndefOr[Boolean] = js.native
    
    var quiet: js.UndefOr[Boolean] = js.native
    
    var stylelintPath: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(files: String | js.Array[String], formatter: TimerHandler, stylelintPath: String): Options = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], stylelintPath = stylelintPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEmitError(value: Boolean): Self = StObject.set(x, "emitError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitErrorUndefined: Self = StObject.set(x, "emitError", js.undefined)
      
      @scala.inline
      def setEmitWarning(value: Boolean): Self = StObject.set(x, "emitWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitWarningUndefined: Self = StObject.set(x, "emitWarning", js.undefined)
      
      @scala.inline
      def setFailOnError(value: Boolean): Self = StObject.set(x, "failOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnErrorUndefined: Self = StObject.set(x, "failOnError", js.undefined)
      
      @scala.inline
      def setFailOnWarning(value: Boolean): Self = StObject.set(x, "failOnWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnWarningUndefined: Self = StObject.set(x, "failOnWarning", js.undefined)
      
      @scala.inline
      def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setFormatter(value: TimerHandler): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLintDirtyModulesOnly(value: Boolean): Self = StObject.set(x, "lintDirtyModulesOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLintDirtyModulesOnlyUndefined: Self = StObject.set(x, "lintDirtyModulesOnly", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setStylelintPath(value: String): Self = StObject.set(x, "stylelintPath", value.asInstanceOf[js.Any])
    }
  }
  
  type StylelintError = js.Error
}
