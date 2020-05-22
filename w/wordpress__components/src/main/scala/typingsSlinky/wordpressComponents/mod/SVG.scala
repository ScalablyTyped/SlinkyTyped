package typingsSlinky.wordpressComponents.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components", "SVG")
@js.native
class SVG protected ()
  extends Component[SVGProps[SVGSVGElement], js.Object, js.Any] {
  def this(props: SVGProps[SVGSVGElement]) = this()
  def this(props: SVGProps[SVGSVGElement], context: js.Any) = this()
}

@JSImport("@wordpress/components", "SVG")
@js.native
object SVG extends TopLevel[ReactComponentClass[SVGProps[SVGSVGElement]]]

