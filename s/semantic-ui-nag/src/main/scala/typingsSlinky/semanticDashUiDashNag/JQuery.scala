package typingsSlinky.semanticDashUiDashNag

import typingsSlinky.semanticDashUiDashNag.SemanticUI.Nag
import typingsSlinky.semanticDashUiDashNag.SemanticUI.NagSettings
import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.clear
import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.destroy
import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.hide
import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.setting
import typingsSlinky.semanticDashUiDashNag.semanticDashUiDashNagStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("nag")
  var nag_Original: Nag = js.native
  def nag(): JQuery = js.native
  def nag(settings: NagSettings): JQuery = js.native
  /**
    * Clears cookie so nag shows again
    */
  @JSName("nag")
  def nag_clear(behavior: clear): JQuery = js.native
  @JSName("nag")
  def nag_destroy(behavior: destroy): JQuery = js.native
  @JSName("nag")
  def nag_hide(behavior: hide): JQuery = js.native
  @JSName("nag")
  def nag_setting(behavior: setting, value: NagSettings): JQuery = js.native
  @JSName("nag")
  def nag_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any = js.native
  @JSName("nag")
  def nag_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  @JSName("nag")
  def nag_show(behavior: show): JQuery = js.native
}

