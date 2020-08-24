package typingsSlinky.yaml.mod

import typingsSlinky.yaml.typesMod.Scalar
import typingsSlinky.yaml.typesMod.YAMLMap
import typingsSlinky.yaml.typesMod.YAMLSeq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml", "createNode")
@js.native
object createNode extends js.Object {
  def apply(value: js.Any): YAMLMap | YAMLSeq | Scalar = js.native
  def apply(value: js.Any, wrapScalars: js.UndefOr[scala.Nothing], tag: String): YAMLMap | YAMLSeq | Scalar = js.native
}

