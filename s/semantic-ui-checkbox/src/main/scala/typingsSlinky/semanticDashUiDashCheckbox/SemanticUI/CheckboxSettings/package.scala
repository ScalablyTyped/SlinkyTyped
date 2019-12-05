package typingsSlinky.semanticDashUiDashCheckbox.SemanticUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CheckboxSettings {
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.beforeChecked
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.beforeDeterminate
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.beforeIndeterminate
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.beforeUnchecked
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.className
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.debug
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.error
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.fireOnInit
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.name
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.namespace
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onChange
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onChecked
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onDeterminate
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onDisable
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onDisabled
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onEnable
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onEnabled
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onIndeterminate
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.onUnchecked
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.performance
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.selector
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.silent
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.uncheckable
  import typingsSlinky.semanticDashUiDashCheckbox.semanticDashUiDashCheckboxStrings.verbose
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type Param = (Pick[
    _Impl, 
    uncheckable | fireOnInit | onChange | onChecked | onIndeterminate | onDeterminate | onUnchecked | beforeChecked | beforeIndeterminate | beforeDeterminate | beforeUnchecked | onEnable | onDisable | onEnabled | onDisabled | selector | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      uncheckable | fireOnInit | selector | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
