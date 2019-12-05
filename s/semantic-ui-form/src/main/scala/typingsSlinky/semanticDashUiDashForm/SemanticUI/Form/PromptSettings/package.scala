package typingsSlinky.semanticDashUiDashForm.SemanticUI.Form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PromptSettings {
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.`match`
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.checked
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.contain
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.containExactly
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.creditCard
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.decimal
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.different
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.doesntContain
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.doesntContainExactly
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.email
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.empty
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.exactCount
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.exactLength
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.integer
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.is
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.isExactly
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.length
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.maxCount
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.maxLength
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.minCount
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.minLength
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.not
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.notExactly
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.number
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.regExp
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.url
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    empty | checked | email | url | regExp | integer | decimal | number | is | isExactly | not | notExactly | contain | containExactly | doesntContain | doesntContainExactly | minLength | length | exactLength | maxLength | `match` | different | creditCard | minCount | exactCount | maxCount
  ]) with (Partial[
    Pick[
      _Impl, 
      empty | checked | email | url | regExp | integer | decimal | number | is | isExactly | not | notExactly | contain | containExactly | doesntContain | doesntContainExactly | minLength | length | exactLength | maxLength | `match` | different | creditCard | minCount | exactCount | maxCount
    ]
  ])
}
