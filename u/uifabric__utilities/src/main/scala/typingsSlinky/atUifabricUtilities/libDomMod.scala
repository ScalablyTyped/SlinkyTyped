package typingsSlinky.atUifabricUtilities

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import typingsSlinky.atUifabricUtilities.atUifabricUtilitiesStrings.`data-portal-element`
import typingsSlinky.atUifabricUtilities.libDomIVirtualElementMod.IVirtualElement
import typingsSlinky.atUifabricUtilities.libIRectangleMod.IRectangle
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom", JSImport.Namespace)
@js.native
object libDomMod extends js.Object {
  val DATA_PORTAL_ATTRIBUTE: `data-portal-element` = js.native
  def elementContains(): Boolean = js.native
  def elementContains(parent: Null, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: Null, child: HTMLElement): Boolean = js.native
  def elementContains(parent: Null, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: HTMLElement): Boolean = js.native
  def elementContains(parent: HTMLElement, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: HTMLElement, child: HTMLElement): Boolean = js.native
  def elementContains(parent: HTMLElement, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
  def elementContainsAttribute(element: org.scalajs.dom.raw.HTMLElement, attribute: String): String | Null = js.native
  def findElementRecursive(element: Null, matchFunction: js.Function1[/* element */ org.scalajs.dom.raw.HTMLElement, Boolean]): org.scalajs.dom.raw.HTMLElement | Null = js.native
  def findElementRecursive(
    element: HTMLElement,
    matchFunction: js.Function1[/* element */ org.scalajs.dom.raw.HTMLElement, Boolean]
  ): org.scalajs.dom.raw.HTMLElement | Null = js.native
  def getChildren(parent: org.scalajs.dom.raw.HTMLElement): js.Array[org.scalajs.dom.raw.HTMLElement] = js.native
  def getChildren(parent: org.scalajs.dom.raw.HTMLElement, allowVirtualChildren: Boolean): js.Array[org.scalajs.dom.raw.HTMLElement] = js.native
  def getDocument(): js.UndefOr[Document] = js.native
  def getDocument(rootElement: org.scalajs.dom.raw.HTMLElement): js.UndefOr[Document] = js.native
  def getParent(child: org.scalajs.dom.raw.HTMLElement): org.scalajs.dom.raw.HTMLElement | Null = js.native
  def getParent(child: org.scalajs.dom.raw.HTMLElement, allowVirtualParents: Boolean): org.scalajs.dom.raw.HTMLElement | Null = js.native
  def getRect(): js.UndefOr[IRectangle] = js.native
  def getRect(element: HTMLElement): js.UndefOr[IRectangle] = js.native
  def getRect(element: Window): js.UndefOr[IRectangle] = js.native
  def getVirtualParent(child: org.scalajs.dom.raw.HTMLElement): js.UndefOr[org.scalajs.dom.raw.HTMLElement] = js.native
  def getWindow(): js.UndefOr[org.scalajs.dom.raw.Window] = js.native
  def getWindow(rootElement: Element): js.UndefOr[org.scalajs.dom.raw.Window] = js.native
  def isVirtualElement(element: IVirtualElement): /* is @uifabric/utilities.@uifabric/utilities/lib/dom/IVirtualElement.IVirtualElement */ Boolean = js.native
  def isVirtualElement(element: HTMLElement): /* is @uifabric/utilities.@uifabric/utilities/lib/dom/IVirtualElement.IVirtualElement */ Boolean = js.native
  def on(
    element: typingsSlinky.std.Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit]
  ): js.Function0[Unit] = js.native
  def on(
    element: typingsSlinky.std.Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit], options: Boolean): js.Function0[Unit] = js.native
  def portalContainsElement(target: org.scalajs.dom.raw.HTMLElement): Boolean = js.native
  def portalContainsElement(target: org.scalajs.dom.raw.HTMLElement, parent: org.scalajs.dom.raw.HTMLElement): Boolean = js.native
  def raiseClick(target: Element): Unit = js.native
  def setPortalAttribute(element: org.scalajs.dom.raw.HTMLElement): Unit = js.native
  def setVirtualParent(child: org.scalajs.dom.raw.HTMLElement, parent: org.scalajs.dom.raw.HTMLElement): Unit = js.native
}

