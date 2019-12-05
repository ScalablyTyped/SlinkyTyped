package typingsSlinky.semanticDashUiDashProgress.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ProgressSettings {
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.autoSuccess
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.className
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.debug
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.error
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.label
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.limitValues
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.metadata
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.name
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.namespace
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.onActive
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.onChange
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.onError
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.onSuccess
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.onWarning
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.performance
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.precision
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.random
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.regExp
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.selector
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.showActivity
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.silent
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.text
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.total
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.value
  import typingsSlinky.semanticDashUiDashProgress.semanticDashUiDashProgressStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    autoSuccess | showActivity | limitValues | label | random | precision | total | value | onChange | onSuccess | onActive | onError | onWarning | text | regExp | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      autoSuccess | showActivity | limitValues | label | random | precision | total | value | text | regExp | selector | metadata | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
