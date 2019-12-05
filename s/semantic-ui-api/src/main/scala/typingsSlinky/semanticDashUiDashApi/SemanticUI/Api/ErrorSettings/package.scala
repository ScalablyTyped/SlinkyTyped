package typingsSlinky.semanticDashUiDashApi.SemanticUI.Api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ErrorSettings {
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.JSONParse
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.beforeSend
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.error
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.exitConditions
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.legacyParameters
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.missingAction
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.missingSerialize
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.missingURL
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.noReturnedValue
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.parseError
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.requiredParameter
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.statusMessage
  import typingsSlinky.semanticDashUiDashApi.semanticDashUiDashApiStrings.timeout
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    beforeSend | error | exitConditions | JSONParse | legacyParameters | missingAction | missingSerialize | missingURL | noReturnedValue | parseError | requiredParameter | statusMessage | timeout
  ]) with (Partial[
    Pick[
      _Impl, 
      beforeSend | error | exitConditions | JSONParse | legacyParameters | missingAction | missingSerialize | missingURL | noReturnedValue | parseError | requiredParameter | statusMessage | timeout
    ]
  ])
}
