package typingsSlinky.stylelintWebpackPlugin.getOptionsMod

import typingsSlinky.stylelint.anon.PartialLinterOptions
import typingsSlinky.stylelint.mod.LinterResult
import typingsSlinky.stylelint.mod.Plugin
import typingsSlinky.stylelint.mod.RuleTesterContext
import typingsSlinky.stylelint.mod.RuleTesterResult
import typingsSlinky.stylelint.mod.RuleTesterSchema
import typingsSlinky.stylelintWebpackPlugin.anon.Typeofformatters
import typingsSlinky.stylelintWebpackPlugin.anon.Typeofutils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait stylelint extends js.Object {
  val formatters: Typeofformatters = js.native
  val utils: Typeofutils = js.native
  def createPlugin(ruleName: String, plugin: Plugin): js.Any = js.native
  def createRuleTester(
    fn: js.Function2[
      /* result */ js.Promise[js.Array[RuleTesterResult]], 
      /* context */ RuleTesterContext, 
      Unit
    ]
  ): js.Function2[/* rule */ Plugin, /* schema */ RuleTesterSchema, Unit] = js.native
  def lint(): js.Promise[LinterResult] = js.native
  def lint(options: PartialLinterOptions): js.Promise[LinterResult] = js.native
}

