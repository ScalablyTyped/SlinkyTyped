package typingsSlinky.vegaDashTypings.typesRuntimeRendererMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.vegaDashTypings.typesRuntimeMod.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime/renderer", "Renderer")
@js.native
class Renderer protected () extends js.Object {
  def this(loader: Loader) = this()
  def initialize(el: HTMLElement, width: Double, height: Double, origin: js.Array[Double]): this.type = js.native
  def resize(width: Double, height: Double, origin: js.Array[Double]): this.type = js.native
}

