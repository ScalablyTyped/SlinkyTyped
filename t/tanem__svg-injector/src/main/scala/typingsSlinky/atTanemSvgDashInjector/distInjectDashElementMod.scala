package typingsSlinky.atTanemSvgDashInjector

import typingsSlinky.atTanemSvgDashInjector.distTypesMod.BeforeEach
import typingsSlinky.atTanemSvgDashInjector.distTypesMod.Errback
import typingsSlinky.atTanemSvgDashInjector.distTypesMod.EvalScripts
import typingsSlinky.std.Element
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tanem/svg-injector/dist/inject-element", JSImport.Namespace)
@js.native
object distInjectDashElementMod extends js.Object {
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

