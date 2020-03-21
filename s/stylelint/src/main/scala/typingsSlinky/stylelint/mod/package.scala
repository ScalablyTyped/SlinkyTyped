package typingsSlinky.stylelint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.stylelint.stylelintStrings.json
    - typingsSlinky.stylelint.stylelintStrings.string
    - typingsSlinky.stylelint.stylelintStrings.verbose
    - typingsSlinky.stylelint.stylelintStrings.compact
    - typingsSlinky.stylelint.stylelintStrings.unix
    - js.Function1[/ * results * / js.Array[typingsSlinky.stylelint.mod.LintResult], java.lang.String]
  */
  type FormatterType = typingsSlinky.stylelint.mod._FormatterType | (js.Function1[/* results */ js.Array[typingsSlinky.stylelint.mod.LintResult], java.lang.String])
  type Plugin = js.Function2[
    /* primaryOption */ js.Any, 
    /* secondaryOptions */ js.UndefOr[js.Object], 
    js.Function2[
      /* root */ typingsSlinky.postcss.mod.Root_, 
      /* result */ typingsSlinky.postcss.mod.Result, 
      scala.Unit | js.Thenable[scala.Unit]
    ]
  ]
  type RuleMessageValue = java.lang.String | (js.Function1[/* repeated */ js.Any, java.lang.String])
}
