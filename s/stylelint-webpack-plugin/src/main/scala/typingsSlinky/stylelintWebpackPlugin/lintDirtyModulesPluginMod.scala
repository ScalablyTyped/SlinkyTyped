package typingsSlinky.stylelintWebpackPlugin

import typingsSlinky.std.Map
import typingsSlinky.std.TimerHandler
import typingsSlinky.stylelint.mod.LinterResult
import typingsSlinky.stylelintWebpackPlugin.anon.Partialtimestampnumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lintDirtyModulesPluginMod {
  
  @JSImport("stylelint-webpack-plugin/declarations/LintDirtyModulesPlugin", JSImport.Default)
  @js.native
  class default protected () extends LintDirtyModulesPlugin {
    /**
      * @param {Lint} lint
      * @param {Compiler} compiler
      * @param {Options} options
      */
    def this(lint: Lint, compiler: Compiler, options: Options) = this()
  }
  
  type Compiler = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any
  
  type FileSystemInfoEntry = Double | Partialtimestampnumber
  
  type Lint = js.Function1[
    /* options */ typingsSlinky.stylelintWebpackPlugin.getOptionsMod.Options, 
    js.Promise[LinterResult]
  ]
  
  @js.native
  trait LintDirtyModulesPlugin extends StObject {
    
    /**
      * @param {Compiler} compilation
      * @param {LinterCallback} callback
      * @returns {void}
      */
    @JSName("apply")
    def apply(compilation: Compiler, callback: LinterCallback): Unit = js.native
    
    var compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any = js.native
    
    /**
      * @param {Map<string, number|FileSystemInfoEntry>} fileTimestamps
      * @param {string | ReadonlyArray<string>} glob
      * @returns {Array<string>}
      */
    def getChangedFiles(fileTimestamps: Map[String, Double | Partialtimestampnumber], glob: String): js.Array[String] = js.native
    def getChangedFiles(fileTimestamps: Map[String, Double | Partialtimestampnumber], glob: js.Array[String]): js.Array[String] = js.native
    
    var isFirstRun: Boolean = js.native
    
    def lint(options: typingsSlinky.stylelintWebpackPlugin.linterMod.Options): js.Promise[typingsSlinky.stylelintWebpackPlugin.linterMod.LinterResult] = js.native
    @JSName("lint")
    var lint_Original: typingsSlinky.stylelintWebpackPlugin.linterMod.Lint = js.native
    
    var options: typingsSlinky.stylelintWebpackPlugin.getOptionsMod.Options = js.native
    
    var prevTimestamps: Map[_, _] = js.native
    
    var startTime: Double = js.native
  }
  
  type LinterCallback = js.Function1[
    /* error */ js.UndefOr[typingsSlinky.stylelintWebpackPlugin.stylelintErrorMod.default | Null], 
    Unit
  ]
  
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
}
