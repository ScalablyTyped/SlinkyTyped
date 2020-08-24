package typingsSlinky.stylelintWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object linterMod {
  type Compiler = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any
  type Lint = js.Function1[
    /* options */ typingsSlinky.stylelintWebpackPlugin.linterMod.Options, 
    js.Promise[typingsSlinky.stylelintWebpackPlugin.linterMod.LinterResult]
  ]
  type LintResult = typingsSlinky.stylelint.mod.LintResult
  type LinterCallback = js.Function1[
    /* error */ js.UndefOr[typingsSlinky.stylelintWebpackPlugin.stylelintErrorMod.default | scala.Null], 
    scala.Unit
  ]
  type LinterResult = typingsSlinky.stylelint.mod.LinterResult
}
