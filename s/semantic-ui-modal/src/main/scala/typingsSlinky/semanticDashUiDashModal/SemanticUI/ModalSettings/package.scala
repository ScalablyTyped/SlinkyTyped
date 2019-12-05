package typingsSlinky.semanticDashUiDashModal.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ModalSettings {
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.allowMultiple
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.autofocus
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.className
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.closable
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.context
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.debug
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.detachable
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.dimmerSettings
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.duration
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.error
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.keyboardShortcuts
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.name
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.namespace
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.observeChanges
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.offset
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.onApprove
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.onDeny
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.onHidden
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.onHide
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.onShow
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.onVisible
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.performance
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.queue
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.selector
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.silent
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.transition
  import typingsSlinky.semanticDashUiDashModal.semanticDashUiDashModalStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    detachable | autofocus | observeChanges | allowMultiple | keyboardShortcuts | offset | context | closable | dimmerSettings | transition | duration | queue | onShow | onVisible | onHide | onHidden | onApprove | onDeny | selector | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      detachable | autofocus | observeChanges | allowMultiple | keyboardShortcuts | offset | context | closable | dimmerSettings | transition | duration | queue | selector | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
