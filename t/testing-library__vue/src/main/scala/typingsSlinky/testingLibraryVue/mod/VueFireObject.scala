package typingsSlinky.testingLibraryVue.mod

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLOptionElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueFireObject extends AsyncFireObject {
  
  def apply(element: Document, event: Event): js.Promise[Unit] = js.native
  def apply(element: Element, event: Event): js.Promise[Unit] = js.native
  def apply(element: Window, event: Event): js.Promise[Unit] = js.native
  
  def touch(element: Document): js.Promise[Unit] = js.native
  def touch(element: Element): js.Promise[Unit] = js.native
  def touch(element: Window): js.Promise[Unit] = js.native
  
  def update(element: HTMLElement): js.Promise[Unit] = js.native
  def update(element: HTMLElement, value: String): js.Promise[Unit] = js.native
  def update(element: HTMLInputElement, value: String): js.Promise[Unit] = js.native
  def update(element: HTMLOptionElement): js.Promise[Unit] = js.native
  def update(element: HTMLSelectElement, value: String): js.Promise[Unit] = js.native
  def update(element: HTMLTextAreaElement, value: String): js.Promise[Unit] = js.native
}
