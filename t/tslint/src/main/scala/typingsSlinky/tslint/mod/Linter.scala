package typingsSlinky.tslint.mod

import typingsSlinky.tslint.anon.FnCall
import typingsSlinky.tslint.anon.FnCallSuppliedConfigFilePathInputFilePath
import typingsSlinky.tslint.configurationMod.IConfigurationFile
import typingsSlinky.tslint.configurationMod.IConfigurationLoadResult
import typingsSlinky.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "Linter")
@js.native
class Linter protected ()
  extends typingsSlinky.tslint.linterMod.Linter {
  def this(options: ILinterOptions) = this()
  def this(options: ILinterOptions, program: Program) = this()
}
/* static members */
object Linter {
  
  @JSImport("tslint", "Linter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tslint", "Linter.VERSION")
  @js.native
  def VERSION: String = js.native
  @scala.inline
  def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a TypeScript program object from a tsconfig.json file path and optional project directory.
    */
  @JSImport("tslint", "Linter.createProgram")
  @js.native
  def createProgram(configFile: String): Program = js.native
  @JSImport("tslint", "Linter.createProgram")
  @js.native
  def createProgram(configFile: String, projectDirectory: String): Program = js.native
  
  @JSImport("tslint", "Linter.findConfiguration")
  @js.native
  def findConfiguration: FnCall = js.native
  @JSImport("tslint", "Linter.findConfiguration")
  @js.native
  def findConfiguration(configFile: String): IConfigurationLoadResult = js.native
  @JSImport("tslint", "Linter.findConfiguration")
  @js.native
  def findConfiguration(configFile: String, inputFilePath: String): IConfigurationLoadResult = js.native
  @JSImport("tslint", "Linter.findConfiguration")
  @js.native
  def findConfiguration(configFile: Null, inputFilePath: String): IConfigurationLoadResult = js.native
  
  @JSImport("tslint", "Linter.findConfigurationPath")
  @js.native
  def findConfigurationPath: FnCallSuppliedConfigFilePathInputFilePath = js.native
  @JSImport("tslint", "Linter.findConfigurationPath")
  @js.native
  def findConfigurationPath(suppliedConfigFilePath: String): js.UndefOr[String] = js.native
  @JSImport("tslint", "Linter.findConfigurationPath")
  @js.native
  def findConfigurationPath(suppliedConfigFilePath: String, inputFilePath: String): js.UndefOr[String] = js.native
  @JSImport("tslint", "Linter.findConfigurationPath")
  @js.native
  def findConfigurationPath(suppliedConfigFilePath: Null, inputFilePath: String): js.UndefOr[String] = js.native
  @scala.inline
  def findConfigurationPath_=(x: FnCallSuppliedConfigFilePathInputFilePath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findConfigurationPath")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def findConfiguration_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findConfiguration")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a list of source file names from a TypeScript program. This includes all referenced
    * files and excludes declaration (".d.ts") files, as well as JSON files, to avoid problems with
    * `resolveJsonModule`.
    */
  @JSImport("tslint", "Linter.getFileNames")
  @js.native
  def getFileNames(program: Program): js.Array[String] = js.native
  
  @JSImport("tslint", "Linter.getRulesDirectories")
  @js.native
  def getRulesDirectories(): js.Array[String] = js.native
  @JSImport("tslint", "Linter.getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: js.UndefOr[scala.Nothing], relativeTo: String): js.Array[String] = js.native
  @JSImport("tslint", "Linter.getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: String): js.Array[String] = js.native
  @JSImport("tslint", "Linter.getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: String, relativeTo: String): js.Array[String] = js.native
  @JSImport("tslint", "Linter.getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: js.Array[String]): js.Array[String] = js.native
  @JSImport("tslint", "Linter.getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: js.Array[String], relativeTo: String): js.Array[String] = js.native
  @JSImport("tslint", "Linter.getRulesDirectories")
  @js.native
  def getRulesDirectories_FLinter: js.Function2[
    /* directories */ js.UndefOr[String | js.Array[String]], 
    /* relativeTo */ js.UndefOr[String], 
    js.Array[String]
  ] = js.native
  
  @scala.inline
  def getRulesDirectories_FLinter_=(
    x: js.Function2[
      /* directories */ js.UndefOr[String | js.Array[String]], 
      /* relativeTo */ js.UndefOr[String], 
      js.Array[String]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRulesDirectories")(x.asInstanceOf[js.Any])
  
  @JSImport("tslint", "Linter.loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath(): IConfigurationFile = js.native
  @JSImport("tslint", "Linter.loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath(configFilePath: js.UndefOr[scala.Nothing], _originalFilePath: String): IConfigurationFile = js.native
  @JSImport("tslint", "Linter.loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath(configFilePath: String): IConfigurationFile = js.native
  @JSImport("tslint", "Linter.loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath(configFilePath: String, _originalFilePath: String): IConfigurationFile = js.native
  @JSImport("tslint", "Linter.loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath_FLinter: js.Function2[
    /* configFilePath */ js.UndefOr[String], 
    /* _originalFilePath */ js.UndefOr[String], 
    IConfigurationFile
  ] = js.native
  
  @scala.inline
  def loadConfigurationFromPath_FLinter_=(
    x: js.Function2[
      /* configFilePath */ js.UndefOr[String], 
      /* _originalFilePath */ js.UndefOr[String], 
      IConfigurationFile
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadConfigurationFromPath")(x.asInstanceOf[js.Any])
}
