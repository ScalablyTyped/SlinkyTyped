package typingsSlinky.yaml.utilMod

import typingsSlinky.std.Error
import typingsSlinky.yaml.AnonEnd
import typingsSlinky.yaml.parseCstMod.CST.Node
import typingsSlinky.yaml.parseCstMod.CST.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml/util", "YAMLError")
@js.native
class YAMLError () extends Error {
  var linePos: js.UndefOr[AnonEnd] = js.native
  @JSName("name")
  var name_YAMLError: typingsSlinky.yaml.yamlStrings.YAMLReferenceError | typingsSlinky.yaml.yamlStrings.YAMLSemanticError | typingsSlinky.yaml.yamlStrings.YAMLSyntaxError | typingsSlinky.yaml.yamlStrings.YAMLWarning = js.native
  var nodeType: js.UndefOr[Type] = js.native
  var range: js.UndefOr[Range] = js.native
  var source: js.UndefOr[Node] = js.native
  /**
    * Drops `source` and adds `nodeType`, `range` and `linePos`, as well as
    * adding details to `message`. Run automatically for document errors if
    * the `prettyErrors` option is set.
    */
  def makePretty(): Unit = js.native
}

