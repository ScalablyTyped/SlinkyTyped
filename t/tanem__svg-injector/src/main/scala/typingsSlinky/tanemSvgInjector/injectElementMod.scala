package typingsSlinky.tanemSvgInjector

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.NonNullable
import typingsSlinky.tanemSvgInjector.typesMod.BeforeEach
import typingsSlinky.tanemSvgInjector.typesMod.Errback
import typingsSlinky.tanemSvgInjector.typesMod.EvalScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectElementMod {
  
  @JSImport("@tanem/svg-injector/dist/inject-element", JSImport.Default)
  @js.native
  def default(
    el: NonNullable[ElementType],
    evalScripts: EvalScripts,
    renumerateIRIElements: Boolean,
    cacheRequests: Boolean,
    beforeEach: BeforeEach,
    callback: Errback
  ): Unit = js.native
  
  type ElementType = Element | HTMLElement | Null
}
