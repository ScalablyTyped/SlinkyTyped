package typingsSlinky.tslint

import typingsSlinky.tslint.tslintNumbers.`0`
import typingsSlinky.tslint.tslintNumbers.`1`
import typingsSlinky.tslint.tslintNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runnerMod {
  
  @JSImport("tslint/lib/runner", "run")
  @js.native
  def run(options: Options, logger: Logger): js.Promise[Status] = js.native
  
  @js.native
  trait Logger extends StObject {
    
    def error(message: String): Unit = js.native
    
    def log(message: String): Unit = js.native
  }
  object Logger {
    
    @scala.inline
    def apply(error: String => Unit, log: String => Unit): Logger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Path to a configuration file.
      */
    var config: js.UndefOr[String] = js.native
    
    /**
      * Exclude globs from path expansion.
      */
    var exclude: js.Array[String] = js.native
    
    /**
      * File paths to lint.
      */
    var files: js.Array[String] = js.native
    
    /**
      * Whether to fixes linting errors for select rules. This may overwrite linted files.
      */
    var fix: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to return status code 0 even if there are lint errors.
      */
    var force: js.UndefOr[Boolean] = js.native
    
    /**
      * Output format.
      */
    var format: js.UndefOr[String] = js.native
    
    /**
      * Formatters directory path.
      */
    var formattersDirectory: js.UndefOr[String] = js.native
    
    /**
      * Whether to generate a tslint.json config file in the current working directory.
      */
    var init: js.UndefOr[Boolean] = js.native
    
    /**
      * Output file path.
      */
    var out: js.UndefOr[String] = js.native
    
    /**
      * Whether to output absolute paths
      */
    var outputAbsolutePaths: js.UndefOr[Boolean] = js.native
    
    /**
      * Outputs the configuration to be used instead of linting.
      */
    var printConfig: js.UndefOr[Boolean] = js.native
    
    /**
      * tsconfig.json file.
      */
    var project: js.UndefOr[String] = js.native
    
    /**
      * Whether to hide warnings
      */
    var quiet: js.UndefOr[Boolean] = js.native
    
    /**
      * Rules directory paths.
      */
    var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Run the tests in the given directories to ensure a (custom) TSLint rule's output matches the expected output.
      * When this property is `true` the `files` property is used to specify the directories from which the tests should be executed.
      */
    var test: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to enable type checking when linting a project.
      */
    var typeCheck: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(exclude: js.Array[String], files: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFormattersDirectory(value: String): Self = StObject.set(x, "formattersDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattersDirectoryUndefined: Self = StObject.set(x, "formattersDirectory", js.undefined)
      
      @scala.inline
      def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      @scala.inline
      def setOutputAbsolutePaths(value: Boolean): Self = StObject.set(x, "outputAbsolutePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputAbsolutePathsUndefined: Self = StObject.set(x, "outputAbsolutePaths", js.undefined)
      
      @scala.inline
      def setPrintConfig(value: Boolean): Self = StObject.set(x, "printConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintConfigUndefined: Self = StObject.set(x, "printConfig", js.undefined)
      
      @scala.inline
      def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setRulesDirectory(value: String | js.Array[String]): Self = StObject.set(x, "rulesDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesDirectoryUndefined: Self = StObject.set(x, "rulesDirectory", js.undefined)
      
      @scala.inline
      def setRulesDirectoryVarargs(value: String*): Self = StObject.set(x, "rulesDirectory", js.Array(value :_*))
      
      @scala.inline
      def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setTypeCheck(value: Boolean): Self = StObject.set(x, "typeCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeCheckUndefined: Self = StObject.set(x, "typeCheck", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tslint.tslintNumbers.`0`
    - typingsSlinky.tslint.tslintNumbers.`1`
    - typingsSlinky.tslint.tslintNumbers.`2`
  */
  trait Status extends StObject
  object Status {
    
    @scala.inline
    def FatalError: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def LintError: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def Ok: `0` = 0.asInstanceOf[`0`]
  }
}
