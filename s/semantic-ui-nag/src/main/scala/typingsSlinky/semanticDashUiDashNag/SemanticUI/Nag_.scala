package typingsSlinky.semanticDashUiDashNag.SemanticUI

import typingsSlinky.semanticDashUiDashNag.JQuery
import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.clear
import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.destroy
import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.hide
import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.setting
import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Nag")
@js.native
trait Nag_ extends js.Object {
  var settings: NagSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Clears cookie so nag shows again
    */
  def apply(behavior: clear): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: hide): JQuery = js.native
  def apply(behavior: setting, value: NagSettings): JQuery = js.native
  def apply(behavior: show): JQuery = js.native
  def apply(settings: NagSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

