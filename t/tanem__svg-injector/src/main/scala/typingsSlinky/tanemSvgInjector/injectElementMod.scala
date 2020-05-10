package typingsSlinky.tanemSvgInjector

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.tanemSvgInjector.typesMod.BeforeEach
import typingsSlinky.tanemSvgInjector.typesMod.Errback
import typingsSlinky.tanemSvgInjector.typesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector/dist/inject-element", JSImport.Namespace)
@js.native
object injectElementMod extends js.Object {
  def default(
    el: Element,
    evalScripts: EvalScripts,
    renumerateIRIElements: Boolean,
    beforeEach: BeforeEach,
    callback: Errback
  ): Unit = js.native
  def default(
    el: HTMLElement,
    evalScripts: EvalScripts,
    renumerateIRIElements: Boolean,
    beforeEach: BeforeEach,
    callback: Errback
  ): Unit = js.native
}

