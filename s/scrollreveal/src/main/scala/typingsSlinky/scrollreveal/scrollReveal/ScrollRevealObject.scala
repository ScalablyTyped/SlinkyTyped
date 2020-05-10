package typingsSlinky.scrollreveal.scrollReveal

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollRevealObject extends js.Object {
  def apply(): ScrollRevealObject = js.native
  def apply(options: ScrollRevealObjectOptions): ScrollRevealObject = js.native
  def reveal(selector: String): ScrollRevealObject = js.native
  def reveal(selector: String, interval: Double): ScrollRevealObject = js.native
  def reveal(selector: String, options: ScrollRevealObjectOptions): ScrollRevealObject = js.native
  def reveal(selector: String, options: ScrollRevealObjectOptions, interval: Double): ScrollRevealObject = js.native
  def reveal(selector: HTMLElement): ScrollRevealObject = js.native
  def reveal(selector: HTMLElement, interval: Double): ScrollRevealObject = js.native
  def reveal(selector: HTMLElement, options: ScrollRevealObjectOptions): ScrollRevealObject = js.native
  def reveal(selector: HTMLElement, options: ScrollRevealObjectOptions, interval: Double): ScrollRevealObject = js.native
  def reveal(selector: NodeListOf[Element with Node]): ScrollRevealObject = js.native
  def reveal(selector: NodeListOf[Element with Node], interval: Double): ScrollRevealObject = js.native
  def reveal(selector: NodeListOf[Element with Node], options: ScrollRevealObjectOptions): ScrollRevealObject = js.native
  def reveal(selector: NodeListOf[Element with Node], options: ScrollRevealObjectOptions, interval: Double): ScrollRevealObject = js.native
  def sync(): Unit = js.native
}

