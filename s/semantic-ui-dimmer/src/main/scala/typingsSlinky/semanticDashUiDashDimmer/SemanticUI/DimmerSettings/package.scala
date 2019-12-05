package typingsSlinky.semanticDashUiDashDimmer.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DimmerSettings {
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.className
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.closable
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.debug
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.dimmerName
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.duration
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.error
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.name
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.namespace
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.on
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.onChange
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.onHide
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.onShow
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.opacity
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.performance
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.selector
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.silent
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.template
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.transition
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.useCSS
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.variation
  import typingsSlinky.semanticDashUiDashDimmer.semanticDashUiDashDimmerStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    opacity | variation | dimmerName | closable | on | useCSS | duration | transition | onShow | onHide | onChange | selector | template | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      opacity | variation | dimmerName | closable | on | useCSS | duration | transition | selector | template | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
