package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.SVGCircleElement
import org.scalajs.dom.raw.SVGGElement
import org.scalajs.dom.raw.SVGPathElement
import org.scalajs.dom.raw.SVGPolygonElement
import org.scalajs.dom.raw.SVGRectElement
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.SVGProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/primitives/svg", JSImport.Namespace)
@js.native
object svgMod extends js.Object {
  @js.native
  class Circle protected ()
    extends Component[SVGProps[SVGCircleElement], js.Object, js.Any] {
    def this(props: SVGProps[SVGCircleElement]) = this()
    def this(props: SVGProps[SVGCircleElement], context: js.Any) = this()
  }
  
  @js.native
  class G protected ()
    extends Component[SVGProps[SVGGElement], js.Object, js.Any] {
    def this(props: SVGProps[SVGGElement]) = this()
    def this(props: SVGProps[SVGGElement], context: js.Any) = this()
  }
  
  @js.native
  class Path protected ()
    extends Component[SVGProps[SVGPathElement], js.Object, js.Any] {
    def this(props: SVGProps[SVGPathElement]) = this()
    def this(props: SVGProps[SVGPathElement], context: js.Any) = this()
  }
  
  @js.native
  class Polygon protected ()
    extends Component[SVGProps[SVGPolygonElement], js.Object, js.Any] {
    def this(props: SVGProps[SVGPolygonElement]) = this()
    def this(props: SVGProps[SVGPolygonElement], context: js.Any) = this()
  }
  
  @js.native
  class Rect protected ()
    extends Component[SVGProps[SVGRectElement], js.Object, js.Any] {
    def this(props: SVGProps[SVGRectElement]) = this()
    def this(props: SVGProps[SVGRectElement], context: js.Any) = this()
  }
  
  @js.native
  class SVG protected ()
    extends Component[SVGProps[SVGSVGElement], js.Object, js.Any] {
    def this(props: SVGProps[SVGSVGElement]) = this()
    def this(props: SVGProps[SVGSVGElement], context: js.Any) = this()
  }
  
  @js.native
  object Circle extends TopLevel[ReactComponentClass[SVGProps[SVGCircleElement]]]
  
  @js.native
  object G extends TopLevel[ReactComponentClass[SVGProps[SVGGElement]]]
  
  @js.native
  object Path extends TopLevel[ReactComponentClass[SVGProps[SVGPathElement]]]
  
  @js.native
  object Polygon extends TopLevel[ReactComponentClass[SVGProps[SVGPolygonElement]]]
  
  @js.native
  object Rect extends TopLevel[ReactComponentClass[SVGProps[SVGRectElement]]]
  
  @js.native
  object SVG extends TopLevel[ReactComponentClass[SVGProps[SVGSVGElement]]]
  
}

