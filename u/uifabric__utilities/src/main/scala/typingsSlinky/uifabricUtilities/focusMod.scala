package typingsSlinky.uifabricUtilities

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.uifabricUtilities.anon.Focus
import typingsSlinky.uifabricUtilities.uifabricUtilitiesStrings.`data-no-horizontal-wrap`
import typingsSlinky.uifabricUtilities.uifabricUtilitiesStrings.`data-no-vertical-wrap`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/focus", JSImport.Namespace)
@js.native
object focusMod extends js.Object {
  
  def doesElementContainFocus(element: HTMLElement): Boolean = js.native
  
  def focusAsync(): Unit = js.native
  def focusAsync(element: HTMLElement): Unit = js.native
  def focusAsync(element: Focus): Unit = js.native
  
  def focusFirstChild(rootElement: HTMLElement): Boolean = js.native
  
  def getElementIndexPath(fromElement: HTMLElement, toElement: HTMLElement): js.Array[Double] = js.native
  
  def getFirstFocusable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  def getFirstFocusable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  
  def getFirstTabbable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  def getFirstTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: js.UndefOr[scala.Nothing],
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  def getFirstTabbable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  def getFirstTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Boolean,
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  
  def getFocusableByIndexPath(parent: HTMLElement, path: js.Array[Double]): js.UndefOr[HTMLElement] = js.native
  
  def getLastFocusable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  def getLastFocusable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  
  def getLastTabbable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  def getLastTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: js.UndefOr[scala.Nothing],
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  def getLastTabbable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  def getLastTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Boolean,
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  
  def getNextElement(
    rootElement: HTMLElement,
    currentElement: HTMLElement | Null,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    suppressChildTraversal: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = js.native
  
  def getPreviousElement(
    rootElement: HTMLElement,
    currentElement: HTMLElement | Null,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    traverseChildren: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = js.native
  
  def isElementFocusSubZone(): Boolean = js.native
  def isElementFocusSubZone(element: HTMLElement): Boolean = js.native
  
  def isElementFocusZone(): Boolean = js.native
  def isElementFocusZone(element: HTMLElement): Boolean = js.native
  
  def isElementTabbable(element: HTMLElement): Boolean = js.native
  def isElementTabbable(element: HTMLElement, checkTabIndex: Boolean): Boolean = js.native
  
  def isElementVisible(): Boolean = js.native
  def isElementVisible(element: HTMLElement): Boolean = js.native
  
  @JSName("shouldWrapFocus")
  def shouldWrapFocus_datanohorizontalwrap(element: HTMLElement, noWrapDataAttribute: `data-no-horizontal-wrap`): Boolean = js.native
  @JSName("shouldWrapFocus")
  def shouldWrapFocus_datanoverticalwrap(element: HTMLElement, noWrapDataAttribute: `data-no-vertical-wrap`): Boolean = js.native
}
