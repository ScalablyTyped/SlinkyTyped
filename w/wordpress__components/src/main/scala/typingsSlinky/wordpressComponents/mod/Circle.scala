package typingsSlinky.wordpressComponents.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.SVGCircleElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components", "Circle")
@js.native
class Circle protected ()
  extends Component[SVGProps[SVGCircleElement], js.Object, js.Any] {
  def this(props: SVGProps[SVGCircleElement]) = this()
  def this(props: SVGProps[SVGCircleElement], context: js.Any) = this()
}

@JSImport("@wordpress/components", "Circle")
@js.native
object Circle extends TopLevel[ReactComponentClass[SVGProps[SVGCircleElement]]]

