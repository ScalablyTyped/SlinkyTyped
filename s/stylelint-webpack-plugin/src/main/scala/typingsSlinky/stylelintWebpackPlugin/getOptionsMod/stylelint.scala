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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait stylelint extends js.Object {
  
  def createPlugin(ruleName: String, plugin: Plugin): js.Any = js.native
  
  def createRuleTester(
    fn: js.Function2[
      /* result */ js.Promise[js.Array[RuleTesterResult]], 
      /* context */ RuleTesterContext, 
      Unit
    ]
  ): js.Function2[/* rule */ Plugin, /* schema */ RuleTesterSchema, Unit] = js.native
  
  val formatters: Typeofformatters = js.native
  
  def lint(): js.Promise[LinterResult] = js.native
  def lint(options: PartialLinterOptions): js.Promise[LinterResult] = js.native
  
  val utils: Typeofutils = js.native
}
