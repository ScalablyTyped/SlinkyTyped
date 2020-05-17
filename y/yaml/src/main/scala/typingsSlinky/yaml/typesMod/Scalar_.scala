package typingsSlinky.yaml.typesMod

import typingsSlinky.yaml.typesMod.AST.Node
import typingsSlinky.yaml.typesMod.AST.NodeToJsonContext
import typingsSlinky.yaml.typesMod.Scalar.Type
import typingsSlinky.yaml.yamlStrings.BIN
import typingsSlinky.yaml.yamlStrings.HEX
import typingsSlinky.yaml.yamlStrings.OCT
import typingsSlinky.yaml.yamlStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml/types", "Scalar")
@js.native
class Scalar_ protected () extends Node {
  def this(value: js.Any) = this()
  /**
    * By default (undefined), numbers use decimal notation.
    * The YAML 1.2 core schema only supports 'HEX' and 'OCT'.
    */
  var format: js.UndefOr[BIN | HEX | OCT | TIME] = js.native
  @JSName("type")
  var type_Scalar_ : js.UndefOr[Type] = js.native
  var value: js.Any = js.native
  def toJSON(arg: js.Any, ctx: NodeToJsonContext): js.Any = js.native
}

