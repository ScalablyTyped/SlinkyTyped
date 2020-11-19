package typingsSlinky.semanticUiNag.SemanticUI

import typingsSlinky.semanticUiNag.JQuery
import typingsSlinky.semanticUiNag.SemanticUI.Nag.AnimationSettings
import typingsSlinky.semanticUiNag.SemanticUI.Nag.ClassNameSettings
import typingsSlinky.semanticUiNag.SemanticUI.Nag.ErrorSettings
import typingsSlinky.semanticUiNag.SemanticUI.Nag.SelectorSettings
import typingsSlinky.semanticUiNag.semanticUiNagBooleans.`false`
import typingsSlinky.semanticUiNag.semanticUiNagStrings.animation
import typingsSlinky.semanticUiNag.semanticUiNagStrings.className
import typingsSlinky.semanticUiNag.semanticUiNagStrings.clear
import typingsSlinky.semanticUiNag.semanticUiNagStrings.context
import typingsSlinky.semanticUiNag.semanticUiNagStrings.cookie
import typingsSlinky.semanticUiNag.semanticUiNagStrings.debug
import typingsSlinky.semanticUiNag.semanticUiNagStrings.destroy
import typingsSlinky.semanticUiNag.semanticUiNagStrings.detachable
import typingsSlinky.semanticUiNag.semanticUiNagStrings.displayTime
import typingsSlinky.semanticUiNag.semanticUiNagStrings.domain
import typingsSlinky.semanticUiNag.semanticUiNagStrings.easing
import typingsSlinky.semanticUiNag.semanticUiNagStrings.error
import typingsSlinky.semanticUiNag.semanticUiNagStrings.expires
import typingsSlinky.semanticUiNag.semanticUiNagStrings.hide
import typingsSlinky.semanticUiNag.semanticUiNagStrings.key
import typingsSlinky.semanticUiNag.semanticUiNagStrings.localstorage
import typingsSlinky.semanticUiNag.semanticUiNagStrings.name
import typingsSlinky.semanticUiNag.semanticUiNagStrings.namespace
import typingsSlinky.semanticUiNag.semanticUiNagStrings.onHide
import typingsSlinky.semanticUiNag.semanticUiNagStrings.path
import typingsSlinky.semanticUiNag.semanticUiNagStrings.performance
import typingsSlinky.semanticUiNag.semanticUiNagStrings.persist
import typingsSlinky.semanticUiNag.semanticUiNagStrings.selector
import typingsSlinky.semanticUiNag.semanticUiNagStrings.sessionstorage
import typingsSlinky.semanticUiNag.semanticUiNagStrings.setting
import typingsSlinky.semanticUiNag.semanticUiNagStrings.show
import typingsSlinky.semanticUiNag.semanticUiNagStrings.silent
import typingsSlinky.semanticUiNag.semanticUiNagStrings.speed
import typingsSlinky.semanticUiNag.semanticUiNagStrings.storageMethod
import typingsSlinky.semanticUiNag.semanticUiNagStrings.value
import typingsSlinky.semanticUiNag.semanticUiNagStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nag_ extends js.Object {
  
  def apply(): JQuery = js.native
  /**
    * Clears cookie so nag shows again
    */
  def apply(behavior: clear): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: hide): JQuery = js.native
  def apply(behavior: setting, name: animation, value: AnimationSettings): JQuery = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): `false` | String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: context, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: detachable, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: detachable, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: displayTime, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: displayTime, value: Double): JQuery = js.native
  def apply(behavior: setting, name: domain, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def apply(behavior: setting, name: domain, value: String): JQuery = js.native
  def apply(behavior: setting, name: domain, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: easing, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: easing, value: String): JQuery = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: expires, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: expires, value: Double): JQuery = js.native
  def apply(behavior: setting, name: key, value: js.UndefOr[scala.Nothing]): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['key'] */ js.Any = js.native
  def apply(
    behavior: setting,
    name: key,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['key'] */ js.Any
  ): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onHide, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onHide, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: path, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: path, value: String): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: persist, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: persist, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: speed, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: speed, value: Double): JQuery = js.native
  def apply(behavior: setting, name: storageMethod, value: js.UndefOr[scala.Nothing]): cookie | localstorage | sessionstorage = js.native
  def apply(behavior: setting, name: storageMethod, value: cookie): JQuery = js.native
  def apply(behavior: setting, name: storageMethod, value: localstorage): JQuery = js.native
  def apply(behavior: setting, name: storageMethod, value: sessionstorage): JQuery = js.native
  def apply(behavior: setting, name: value, value: js.UndefOr[scala.Nothing]): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['value'] */ js.Any = js.native
  def apply(
    behavior: setting,
    name: value,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl['value'] */ js.Any
  ): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: NagSettings): JQuery = js.native
  def apply(behavior: show): JQuery = js.native
  def apply(settings: NagSettings): JQuery = js.native
  
  var settings: NagSettings = js.native
}
