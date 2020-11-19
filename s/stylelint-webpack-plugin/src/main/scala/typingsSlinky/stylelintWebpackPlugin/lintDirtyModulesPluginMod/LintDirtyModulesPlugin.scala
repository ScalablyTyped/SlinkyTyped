package typingsSlinky.stylelintWebpackPlugin.lintDirtyModulesPluginMod

import typingsSlinky.std.Map
import typingsSlinky.stylelintWebpackPlugin.linterMod.LinterResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LintDirtyModulesPlugin extends js.Object {
  
  /**
    * @param {Compiler} compilation
    * @param {LinterCallback} callback
    * @returns {void}
    */
  @JSName("apply")
  def apply(compilation: Compiler, callback: LinterCallback): Unit = js.native
  
  var compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any = js.native
  
  /**
    * @param {Map<string, number>} fileTimestamps
    * @param {string | ReadonlyArray<string>} glob
    * @returns {Array<string>}
    */
  def getChangedFiles(fileTimestamps: Map[String, Double], glob: String): js.Array[String] = js.native
  def getChangedFiles(fileTimestamps: Map[String, Double], glob: js.Array[String]): js.Array[String] = js.native
  
  var isFirstRun: Boolean = js.native
  
  def lint(options: typingsSlinky.stylelintWebpackPlugin.linterMod.Options): js.Promise[LinterResult] = js.native
  @JSName("lint")
  var lint_Original: typingsSlinky.stylelintWebpackPlugin.linterMod.Lint = js.native
  
  var options: typingsSlinky.stylelintWebpackPlugin.getOptionsMod.Options = js.native
  
  var prevTimestamps: Map[_, _] = js.native
  
  var startTime: Double = js.native
}
