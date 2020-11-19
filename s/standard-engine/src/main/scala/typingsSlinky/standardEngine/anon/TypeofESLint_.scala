package typingsSlinky.standardEngine.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.eslint.mod.ESLint
import typingsSlinky.eslint.mod.ESLint.LintResult
import typingsSlinky.eslint.mod.ESLint.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofESLint_ extends Instantiable1[/* options */ Options, ESLint] {
  
  def getErrorResults(results: js.Array[LintResult]): js.Array[LintResult] = js.native
  
  def outputFixes(results: js.Array[LintResult]): js.Promise[Unit] = js.native
  
  var version: String = js.native
}
