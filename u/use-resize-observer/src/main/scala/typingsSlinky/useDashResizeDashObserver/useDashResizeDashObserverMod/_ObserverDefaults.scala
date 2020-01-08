package typingsSlinky.useDashResizeDashObserver.useDashResizeDashObserverMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.useDashResizeDashObserver.useDashResizeDashObserverBooleans.`false`
import typingsSlinky.useDashResizeDashObserver.useDashResizeDashObserverBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ObserverDefaults[TElement /* <: HTMLElement */] extends js.Object

object _ObserverDefaults {
  @scala.inline
  def DefaultsWithoutSize[TElement /* <: HTMLElement */](ref: ReactRef[TElement] = null, useDefaults: `false` = null): _ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (useDefaults != null) __obj.updateDynamic("useDefaults")(useDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ObserverDefaults[TElement]]
  }
  @scala.inline
  def DefaultsWithHeightOnly[TElement /* <: HTMLElement */](defaultHeight: Double, ref: ReactRef[TElement] = null, useDefaults: `true` = null): _ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal(defaultHeight = defaultHeight.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (useDefaults != null) __obj.updateDynamic("useDefaults")(useDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ObserverDefaults[TElement]]
  }
  @scala.inline
  def DefaultsWithWidthOnly[TElement /* <: HTMLElement */](defaultWidth: Double, ref: ReactRef[TElement] = null, useDefaults: `true` = null): _ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal(defaultWidth = defaultWidth.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (useDefaults != null) __obj.updateDynamic("useDefaults")(useDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ObserverDefaults[TElement]]
  }
}

