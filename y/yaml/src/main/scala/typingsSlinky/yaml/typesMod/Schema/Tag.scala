package typingsSlinky.yaml.typesMod.Schema

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.yaml.mod.Document
import typingsSlinky.yaml.parseCstMod.CST.Node
import typingsSlinky.yaml.typesMod.Scalar
import typingsSlinky.yaml.typesMod.YAMLMap
import typingsSlinky.yaml.typesMod.YAMLSeq
import typingsSlinky.yaml.yamlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.yaml.typesMod.Schema.CustomTag
  - typingsSlinky.yaml.typesMod.Schema.DefaultTag
*/
trait Tag extends js.Object

object Tag {
  @scala.inline
  def CustomTag(
    identify: js.Any => Boolean,
    resolve: (Document, Node) => typingsSlinky.yaml.typesMod.Node | js.Any,
    tag: String,
    `class`: Instantiable0[js.Any] = null,
    createNode: (/* schema */ typingsSlinky.yaml.typesMod.Schema, /* value */ js.Any, /* ctx */ CreateNodeContext) => YAMLMap | YAMLSeq | Scalar = null,
    format: String = null,
    nodeClass: Instantiable0[js.Any] = null,
    options: js.Object = null,
    stringify: (/* item */ typingsSlinky.yaml.typesMod.Node, /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String = null
  ): Tag = {
    val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction2(resolve), tag = tag.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction3(createNode))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (nodeClass != null) __obj.updateDynamic("nodeClass")(nodeClass.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction4(stringify))
    __obj.asInstanceOf[Tag]
  }
  @scala.inline
  def DefaultTag(
    default: `true`,
    identify: js.Any => Boolean,
    resolve: /* repeated */ String => typingsSlinky.yaml.typesMod.Node | js.Any,
    tag: String,
    test: js.RegExp,
    createNode: (/* schema */ typingsSlinky.yaml.typesMod.Schema, /* value */ js.Any, /* ctx */ CreateNodeContext) => YAMLMap | YAMLSeq | Scalar = null,
    format: String = null,
    nodeClass: Instantiable0[js.Any] = null,
    options: js.Object = null,
    stringify: (/* item */ typingsSlinky.yaml.typesMod.Node, /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String = null
  ): Tag = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction1(resolve), tag = tag.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    if (createNode != null) __obj.updateDynamic("createNode")(js.Any.fromFunction3(createNode))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (nodeClass != null) __obj.updateDynamic("nodeClass")(nodeClass.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (stringify != null) __obj.updateDynamic("stringify")(js.Any.fromFunction4(stringify))
    __obj.asInstanceOf[Tag]
  }
}

