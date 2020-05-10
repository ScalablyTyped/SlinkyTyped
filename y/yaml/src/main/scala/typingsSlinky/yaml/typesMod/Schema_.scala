package typingsSlinky.yaml.typesMod

import typingsSlinky.yaml.typesMod.AST.Node
import typingsSlinky.yaml.typesMod.Schema.CreateNodeContext
import typingsSlinky.yaml.typesMod.Schema.Name
import typingsSlinky.yaml.typesMod.Schema.Options
import typingsSlinky.yaml.typesMod.Schema.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml/types", "Schema")
@js.native
class Schema_ protected () extends js.Object {
  def this(options: Options) = this()
  var merge: Boolean = js.native
  var name: Name = js.native
  var sortMapEntries: (js.Function2[/* a */ Pair, /* b */ Pair, Double]) | Null = js.native
  var tags: js.Array[Tag] = js.native
  /**
    * Convert any value into a `Node` using this schema, recursively turning
    * objects into collectsions.
    *
    * @param wrapScalars If `true`, also wraps plain values in `Scalar` objects;
    *   if undefined or `false` and `value` is not an object, it will be returned
    *   directly.
    * @param tag Use to specify the collection type, e.g. `"!!omap"`. Note that
    *   this requires the corresponding tag to be available in this schema.
    */
  def createNode(value: js.Any): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean, tag: String): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean, tag: String, ctx: CreateNodeContext): Node = js.native
}

