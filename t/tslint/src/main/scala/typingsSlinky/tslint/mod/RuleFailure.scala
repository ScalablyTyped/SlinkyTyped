package typingsSlinky.tslint.mod

import typingsSlinky.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("tslint", "RuleFailure")
@js.native
object RuleFailure extends js.Object {
  def compare(a: typingsSlinky.tslint.ruleMod.RuleFailure, b: typingsSlinky.tslint.ruleMod.RuleFailure): Double = js.native
}

