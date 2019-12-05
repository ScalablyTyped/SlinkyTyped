package typingsSlinky.yaml.yamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ast {
  import org.scalablytyped.runtime.Instantiable0
  import org.scalablytyped.runtime.Instantiable1
  import org.scalablytyped.runtime.Instantiable2
  import typingsSlinky.yaml.yamlMod.ParseOptions

  type DocumentConstructor = Instantiable1[js.UndefOr[/* options */ ParseOptions], typingsSlinky.yaml.yamlMod.ast.Document]
  type MapConstructor = Instantiable0[MapBase]
  type PairConstructor = Instantiable2[/* key */ AstNode | Null, js.UndefOr[AstNode | Null], Pair]
  type ScalarConstructor = Instantiable1[/* value */ Null | Boolean | Double | String, Scalar]
  type SeqConstructor = Instantiable0[SeqBase]
}
