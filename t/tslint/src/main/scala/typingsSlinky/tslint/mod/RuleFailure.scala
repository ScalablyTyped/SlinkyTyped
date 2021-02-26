package typingsSlinky.tslint.mod

import typingsSlinky.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "RuleFailure")
@js.native
class RuleFailure protected ()
  extends typingsSlinky.tslint.ruleMod.RuleFailure {
  def this(sourceFile: SourceFile, start: Double, end: Double, failure: String, ruleName: String) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: js.Array[typingsSlinky.tslint.ruleMod.Replacement]
  ) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: typingsSlinky.tslint.ruleMod.Replacement
  ) = this()
}
/* static members */
object RuleFailure {
  
  @JSImport("tslint", "RuleFailure.compare")
  @js.native
  def compare(a: typingsSlinky.tslint.ruleMod.RuleFailure, b: typingsSlinky.tslint.ruleMod.RuleFailure): Double = js.native
}
