package typingsSlinky.atTestingDashLibraryVue.atTestingDashLibraryVueMod

import org.scalajs.dom.raw.Event
import typingsSlinky.std.Document
import typingsSlinky.std.Element
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.HTMLInputElement
import typingsSlinky.std.HTMLOptionElement
import typingsSlinky.std.HTMLSelectElement
import typingsSlinky.std.HTMLTextAreaElement
import typingsSlinky.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window, options? : {}): std.Promise<void>} */ @js.native
trait VueFireObject extends js.Object {
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

