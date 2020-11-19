package typingsSlinky.semanticUiSticky.SemanticUI

import typingsSlinky.semanticUiSticky.JQuery
import typingsSlinky.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings
import typingsSlinky.semanticUiSticky.SemanticUI.Sticky.ErrorSettings
import typingsSlinky.semanticUiSticky.semanticUiStickyBooleans.`false`
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.bottomOffset
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.className
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.context
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.debug
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.destroy
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.error
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.jitter
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.name
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.namespace
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.observeChanges
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.offset
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onBottom
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onReposition
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onScroll
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onStick
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onTop
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.onUnstick
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.performance
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.pushing
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.refresh
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.scrollContext
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.setSize
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.setting
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.silent
import typingsSlinky.semanticUiSticky.semanticUiStickyStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sticky_ extends js.Object {
  
  def apply(): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * recalculates offsets
    */
  def apply(behavior: refresh): JQuery = js.native
  def apply(behavior: setting, name: bottomOffset, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: bottomOffset, value: Double): JQuery = js.native
  def apply(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): `false` | String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: context, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def apply(behavior: setting, name: jitter, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: jitter, value: Double): JQuery = js.native
  def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: observeChanges, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: offset, value: js.UndefOr[scala.Nothing]): Double = js.native
  def apply(behavior: setting, name: offset, value: Double): JQuery = js.native
  def apply(behavior: setting, name: onBottom, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onBottom, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onReposition, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onReposition, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onScroll, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onScroll, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onStick, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onStick, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onTop, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onTop, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onUnstick, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onUnstick, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: pushing, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: pushing, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: scrollContext, value: js.UndefOr[scala.Nothing]): String | JQuery = js.native
  def apply(behavior: setting, name: scrollContext, value: String): JQuery = js.native
  def apply(behavior: setting, name: scrollContext, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: setSize, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: setSize, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: StickySettings): JQuery = js.native
  def apply(settings: StickySettings): JQuery = js.native
  
  var settings: StickySettings = js.native
}
