package typingsSlinky.svgJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // array.js
  type ArrayAlias = typingsSlinky.svgJs.mod.Array | js.Array[scala.Double] | java.lang.String
  // line.js
  type ArrayPoint = js.Array[scala.Double]
  type ColorAlias = java.lang.String | typingsSlinky.svgJs.mod.ColorLike
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.svgJs.mod.MatrixLike
    - js.Array[scala.Double]
    - typingsSlinky.svgJs.mod.Element
    - java.lang.String
  */
  type MatrixAlias = typingsSlinky.svgJs.mod._MatrixAlias | js.Array[scala.Double] | java.lang.String
  type NumberAlias = typingsSlinky.svgJs.mod.Number | scala.Double | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.svgJs.mod.Doc
    - typingsSlinky.svgJs.mod.Nested
    - typingsSlinky.svgJs.mod.G
  */
  type ParentTypeAlias = typingsSlinky.svgJs.mod._ParentTypeAlias | java.lang.String
  type PathArrayAlias = typingsSlinky.svgJs.mod.PathArray | (js.Array[scala.Double | typingsSlinky.svgJs.mod.PathArrayPoint | java.lang.String]) | java.lang.String
  // path.js
  type PathArrayPoint = js.Array[scala.Double | java.lang.String]
  type PointArrayAlias = (js.Array[typingsSlinky.svgJs.mod.ArrayPoint | scala.Double]) | typingsSlinky.svgJs.mod.PointArray | java.lang.String
  // viewbox.js
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.svgJs.mod.ViewBoxLike
    - js.Array[scala.Double]
    - java.lang.String
    - typingsSlinky.svgJs.mod.Element
  */
  type ViewBoxAlias = typingsSlinky.svgJs.mod._ViewBoxAlias | js.Array[scala.Double] | java.lang.String
}
