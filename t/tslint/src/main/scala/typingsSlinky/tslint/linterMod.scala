package typingsSlinky.tslint

import typingsSlinky.tslint.anon.FnCall
import typingsSlinky.tslint.anon.FnCallSuppliedConfigFilePathInputFilePath
import typingsSlinky.tslint.configurationMod.IConfigurationFile
import typingsSlinky.tslint.configurationMod.IConfigurationLoadResult
import typingsSlinky.tslint.mod.ILinterOptions
import typingsSlinky.tslint.mod.LintResult
import typingsSlinky.tslint.ruleMod.RuleFailure
import typingsSlinky.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/linter", JSImport.Namespace)
@js.native
object linterMod extends js.Object {
  
  @js.native
  class Linter protected () extends js.Object {
    def this(options: ILinterOptions) = this()
    def this(options: ILinterOptions, program: Program) = this()
    
    var applyAllFixes: js.Any = js.native
    
    /* protected */ def applyFixes(sourceFilePath: String, source: String, fixableFailures: js.Array[RuleFailure]): String = js.native
    
    var applyRule: js.Any = js.native
    
    var failures: js.Any = js.native
    
    val fileNames: js.Any = js.native
    
    var fixes: js.Any = js.native
    
    var getAllFailures: js.Any = js.native
    
    var getEnabledRules: js.Any = js.native
    
    def getResult(): LintResult = js.native
    
    var getSourceFile: js.Any = js.native
    
    def lint(fileName: String, source: String): Unit = js.native
    def lint(fileName: String, source: String, configuration: IConfigurationFile): Unit = js.native
    
    val options: js.Any = js.native
    
    var program: js.Any = js.native
    
    var updateProgram: js.Any = js.native
  }
  /* static members */
  @js.native
  object Linter extends js.Object {
    
    var VERSION: String = js.native
    
    /**
      * Creates a TypeScript program object from a tsconfig.json file path and optional project directory.
      */
    def createProgram(configFile: String): Program = js.native
    def createProgram(configFile: String, projectDirectory: String): Program = js.native
    
    def findConfiguration(configFile: String): IConfigurationLoadResult = js.native
    def findConfiguration(configFile: String, inputFilePath: String): IConfigurationLoadResult = js.native
    def findConfiguration(configFile: Null, inputFilePath: String): IConfigurationLoadResult = js.native
    
    def findConfigurationPath(suppliedConfigFilePath: String): js.UndefOr[String] = js.native
    def findConfigurationPath(suppliedConfigFilePath: String, inputFilePath: String): js.UndefOr[String] = js.native
    def findConfigurationPath(suppliedConfigFilePath: Null, inputFilePath: String): js.UndefOr[String] = js.native
    @JSName("findConfigurationPath")
    var findConfigurationPath_Original: FnCallSuppliedConfigFilePathInputFilePath = js.native
    
    @JSName("findConfiguration")
    var findConfiguration_Original: FnCall = js.native
    
    /**
      * Returns a list of source file names from a TypeScript program. This includes all referenced
      * files and excludes declaration (".d.ts") files, as well as JSON files, to avoid problems with
      * `resolveJsonModule`.
      */
    def getFileNames(program: Program): js.Array[String] = js.native
    
    def getRulesDirectories(): js.Array[String] = js.native
    def getRulesDirectories(directories: js.UndefOr[scala.Nothing], relativeTo: String): js.Array[String] = js.native
    def getRulesDirectories(directories: String): js.Array[String] = js.native
    def getRulesDirectories(directories: String, relativeTo: String): js.Array[String] = js.native
    def getRulesDirectories(directories: js.Array[String]): js.Array[String] = js.native
    def getRulesDirectories(directories: js.Array[String], relativeTo: String): js.Array[String] = js.native
    @JSName("getRulesDirectories")
    var getRulesDirectories_Original: js.Function2[
        /* directories */ js.UndefOr[String | js.Array[String]], 
        /* relativeTo */ js.UndefOr[String], 
        js.Array[String]
      ] = js.native
    
    def loadConfigurationFromPath(): IConfigurationFile = js.native
    def loadConfigurationFromPath(configFilePath: js.UndefOr[scala.Nothing], _originalFilePath: String): IConfigurationFile = js.native
    def loadConfigurationFromPath(configFilePath: String): IConfigurationFile = js.native
    def loadConfigurationFromPath(configFilePath: String, _originalFilePath: String): IConfigurationFile = js.native
    @JSName("loadConfigurationFromPath")
    var loadConfigurationFromPath_Original: js.Function2[
        /* configFilePath */ js.UndefOr[String], 
        /* _originalFilePath */ js.UndefOr[String], 
        IConfigurationFile
      ] = js.native
  }
}
