package typingsSlinky.tsJest

import typingsSlinky.bsLogger.loggerMod.Logger
import typingsSlinky.jestTypes.configMod.ProjectConfig
import typingsSlinky.std.Record
import typingsSlinky.tsJest.anon.NodeResolve
import typingsSlinky.tsJest.anon.PartialCompilerOptions
import typingsSlinky.tsJest.typesMod.TTypeScript
import typingsSlinky.typescript.mod.CompilerOptions
import typingsSlinky.typescript.mod.CustomTransformers
import typingsSlinky.typescript.mod.Diagnostic
import typingsSlinky.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-jest/dist/config/config-set", JSImport.Namespace)
@js.native
object configSetMod extends js.Object {
  
  @js.native
  class ConfigSet protected () extends js.Object {
    def this(jestConfig: ProjectConfig) = this()
    def this(jestConfig: ProjectConfig, parentLogger: Logger) = this()
    
    var _overriddenCompilerOptions: PartialCompilerOptions = js.native
    
    /* protected */ def _resolveTsConfig(): Record[String, _] = js.native
    /* protected */ def _resolveTsConfig(compilerOptions: js.UndefOr[scala.Nothing], resolvedConfigFile: String): Record[String, _] = js.native
    /* protected */ def _resolveTsConfig(compilerOptions: CompilerOptions): Record[String, _] = js.native
    /* protected */ def _resolveTsConfig(compilerOptions: CompilerOptions, resolvedConfigFile: String): Record[String, _] = js.native
    
    val compilerModule: TTypeScript = js.native
    
    var customTransformers: CustomTransformers = js.native
    
    val cwd: String = js.native
    
    def isTestFile: js.Function1[/* fileName */ String, Boolean] = js.native
    
    val isolatedModules: Boolean = js.native
    
    val logger: Logger = js.native
    
    var parsedTsConfig: ParsedCommandLine | (Record[String, _]) = js.native
    
    def raiseDiagnostics(diagnostics: js.Array[Diagnostic]): Unit = js.native
    def raiseDiagnostics(diagnostics: js.Array[Diagnostic], filePath: js.UndefOr[scala.Nothing], logger: Logger): Unit = js.native
    def raiseDiagnostics(diagnostics: js.Array[Diagnostic], filePath: String): Unit = js.native
    def raiseDiagnostics(diagnostics: js.Array[Diagnostic], filePath: String, logger: Logger): Unit = js.native
    
    def resolvePath(inputPath: String): String = js.native
    def resolvePath(inputPath: String, hasThrowIfMissingNodeResolve: NodeResolve): String = js.native
    
    val rootDir: String = js.native
    
    def shouldReportDiagnostics(filePath: String): Boolean = js.native
    
    def shouldStringifyContent(filePath: String): Boolean = js.native
    
    var tsCacheDir: js.UndefOr[String] = js.native
    
    def tsJestDigest: String = js.native
  }
}
