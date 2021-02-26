package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.RuleFailure
import typingsSlinky.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enableDisableRulesMod {
  
  @JSImport("tslint/lib/enableDisableRules", "ENABLE_DISABLE_REGEX")
  @js.native
  val ENABLE_DISABLE_REGEX: js.RegExp = js.native
  
  @JSImport("tslint/lib/enableDisableRules", "removeDisabledFailures")
  @js.native
  def removeDisabledFailures(sourceFile: SourceFile, failures: js.Array[RuleFailure]): js.Array[RuleFailure] = js.native
}
