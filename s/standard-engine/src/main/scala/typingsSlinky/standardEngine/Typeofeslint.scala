package typingsSlinky.standardEngine

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.eslint.mod.Linter
import typingsSlinky.eslint.mod.RuleTester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofeslint extends js.Object {
  val AST: js.Any = js.native
  var CLIEngine: TypeofCLIEngine with TypeofCLIEngineOptions = js.native
  var Linter: Instantiable0[typingsSlinky.eslint.mod.Linter] = js.native
  val Rule: js.Any = js.native
  var RuleTester: Instantiable0[typingsSlinky.eslint.mod.RuleTester] = js.native
  val Scope: js.Any = js.native
  var SourceCode: TypeofSourceCode = js.native
}

object Typeofeslint {
  @scala.inline
  def apply(
    AST: js.Any,
    CLIEngine: TypeofCLIEngine with TypeofCLIEngineOptions,
    Linter: Instantiable0[Linter],
    Rule: js.Any,
    RuleTester: Instantiable0[RuleTester],
    Scope: js.Any,
    SourceCode: TypeofSourceCode
  ): Typeofeslint = {
    val __obj = js.Dynamic.literal(AST = AST.asInstanceOf[js.Any], CLIEngine = CLIEngine.asInstanceOf[js.Any], Linter = Linter.asInstanceOf[js.Any], Rule = Rule.asInstanceOf[js.Any], RuleTester = RuleTester.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any], SourceCode = SourceCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofeslint]
  }
  @scala.inline
  implicit class TypeofeslintOps[Self <: Typeofeslint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAST(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLIEngine(value: TypeofCLIEngine with TypeofCLIEngineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLIEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinter(value: Instantiable0[Linter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Linter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRule(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleTester(value: Instantiable0[RuleTester]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleTester")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCode(value: TypeofSourceCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

