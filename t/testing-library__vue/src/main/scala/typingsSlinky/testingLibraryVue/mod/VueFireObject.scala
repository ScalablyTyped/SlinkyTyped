package typingsSlinky.testingLibraryVue.mod

import typingsSlinky.std.Document_
import typingsSlinky.std.Element
import typingsSlinky.std.Event_
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.HTMLInputElement
import typingsSlinky.std.HTMLOptionElement
import typingsSlinky.std.HTMLSelectElement
import typingsSlinky.std.HTMLTextAreaElement
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueFireObject extends AsyncFireObject {
  def apply(element: Document_, event: Event_): js.Promise[Unit] = js.native
  def apply(element: Element, event: Event_): js.Promise[Unit] = js.native
  def apply(element: Window_, event: Event_): js.Promise[Unit] = js.native
  def touch(element: Document_): js.Promise[Unit] = js.native
  def touch(element: Element): js.Promise[Unit] = js.native
  def touch(element: Window_): js.Promise[Unit] = js.native
  def update(element: HTMLElement): js.Promise[Unit] = js.native
  def update(element: HTMLElement, value: String): js.Promise[Unit] = js.native
  def update(element: HTMLInputElement, value: String): js.Promise[Unit] = js.native
  def update(element: HTMLOptionElement): js.Promise[Unit] = js.native
  def update(element: HTMLSelectElement, value: String): js.Promise[Unit] = js.native
  def update(element: HTMLTextAreaElement, value: String): js.Promise[Unit] = js.native
}

