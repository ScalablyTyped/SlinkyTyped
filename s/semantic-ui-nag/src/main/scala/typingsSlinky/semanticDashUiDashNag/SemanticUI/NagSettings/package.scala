package typingsSlinky.semanticDashUiDashNag.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NagSettings {
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.animation
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.className
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.context
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.debug
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.detachable
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.displayTime
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.domain
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.easing
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.error
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.expires
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.key
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.name
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.namespace
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.onHide
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.path
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.performance
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.persist
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.selector
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.silent
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.speed
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.storageMethod
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.value
  import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    persist | displayTime | animation | context | detachable | expires | domain | path | storageMethod | key | value | speed | easing | onHide | className | selector | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      persist | displayTime | animation | context | detachable | expires | domain | path | storageMethod | key | value | speed | easing | className | selector | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
