package typingsSlinky.semanticDashUiDashForm.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FormSettings {
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.`inline`
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.className
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.debug
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.defaults
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.delay
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.duration
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.error
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.fields
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.keyboardShortcuts
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.metadata
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.name
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.namespace
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.on
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.onFailure
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.onInvalid
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.onSuccess
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.onValid
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.performance
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.prompt
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.revalidate
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.rules
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.selector
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.silent
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.templates
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.text
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.transition
  import typingsSlinky.semanticDashUiDashForm.semanticDashUiDashFormStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    keyboardShortcuts | on | revalidate | delay | `inline` | transition | duration | fields | text | prompt | onValid | onInvalid | onSuccess | onFailure | templates | rules | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      defaults | keyboardShortcuts | on | revalidate | delay | `inline` | transition | duration | fields | text | prompt | templates | rules | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
