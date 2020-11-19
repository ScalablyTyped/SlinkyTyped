package typingsSlinky.tslint.testMod

import typingsSlinky.tslint.runnerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/test", "consoleTestResultHandler")
@js.native
object consoleTestResultHandler extends js.Object {
  
  def apply(testResult: TestResult, logger: Logger): Boolean = js.native
}
