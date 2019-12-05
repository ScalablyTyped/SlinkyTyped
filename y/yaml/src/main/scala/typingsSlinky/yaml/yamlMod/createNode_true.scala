package typingsSlinky.yaml.yamlMod

import typingsSlinky.yaml.yamlMod.ast.MapBase
import typingsSlinky.yaml.yamlMod.ast.Scalar
import typingsSlinky.yaml.yamlMod.ast.SeqBase
import typingsSlinky.yaml.yamlNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", "createNode")
@js.native
object createNode_true extends js.Object {
  def apply(value: js.Any, wrapScalars: `true`): MapBase | SeqBase | Scalar = js.native
  def apply(value: js.Any, wrapScalars: `true`, tag: String): MapBase | SeqBase | Scalar = js.native
}

