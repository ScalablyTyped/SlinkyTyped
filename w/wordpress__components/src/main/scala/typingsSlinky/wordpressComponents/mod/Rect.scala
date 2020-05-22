package typingsSlinky.wordpressComponents.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.SVGRectElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components", "Rect")
@js.native
class Rect protected ()
  extends Component[SVGProps[SVGRectElement], js.Object, js.Any] {
  def this(props: SVGProps[SVGRectElement]) = this()
  def this(props: SVGProps[SVGRectElement], context: js.Any) = this()
}

@JSImport("@wordpress/components", "Rect")
@js.native
object Rect extends TopLevel[ReactComponentClass[SVGProps[SVGRectElement]]]

