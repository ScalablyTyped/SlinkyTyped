package typingsSlinky.tingleJs.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tingle.js", "modal")
@js.native
class modal () extends js.Object {
  def this(options: Options) = this()
  
  def addFooterBtn(label: String): HTMLButtonElement = js.native
  def addFooterBtn(
    label: String,
    cssClass: js.UndefOr[scala.Nothing],
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): HTMLButtonElement = js.native
  def addFooterBtn(label: String, cssClass: String): HTMLButtonElement = js.native
  def addFooterBtn(
    label: String,
    cssClass: String,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]
  ): HTMLButtonElement = js.native
  
  def checkOverflow(): Unit = js.native
  
  def close(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getContent(): HTMLDivElement = js.native
  
  def getFooterContent(): js.UndefOr[HTMLDivElement] = js.native
  
  def isOpen(): Boolean = js.native
  
  def isOverflow(): Boolean = js.native
  
  def open(): Unit = js.native
  
  def setContent(content: String): Unit = js.native
  def setContent(content: Element): Unit = js.native
  
  def setFooterContent(content: String): Unit = js.native
  
  def setStickyFooter(sticky: Boolean): Unit = js.native
}
