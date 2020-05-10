package typingsSlinky.yaml.typesMod.Schema

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.yaml.typesMod.AST.Node
import typingsSlinky.yaml.typesMod.Scalar
import typingsSlinky.yaml.typesMod.YAMLMap
import typingsSlinky.yaml.typesMod.YAMLSeq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTag extends js.Object {
  /**
    * An optional factory function, used e.g. by collections when wrapping JS objects as AST nodes.
    */
  var createNode: js.UndefOr[
    js.Function3[
      /* schema */ typingsSlinky.yaml.typesMod.Schema, 
      /* value */ js.Any, 
      /* ctx */ CreateNodeContext, 
      YAMLMap | YAMLSeq | Scalar
    ]
  ] = js.native
  /**
    * If a tag has multiple forms that should be parsed and/or stringified differently, use `format` to identify them.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The `Node` child class that implements this tag. Required for collections and tags that have overlapping JS representations.
    */
  var nodeClass: js.UndefOr[Instantiable0[js.Any]] = js.native
  /**
    * Used by some tags to configure their stringification, where applicable.
    */
  var options: js.UndefOr[js.Object] = js.native
  /**
    * Optional function stringifying the AST node in the current context. If your
    * data includes a suitable `.toString()` method, you can probably leave this
    * undefined and use the default stringifier.
    *
    * @param item The node being stringified.
    * @param ctx Contains the stringifying context variables.
    * @param onComment Callback to signal that the stringifier includes the
    *   item's comment in its output.
    * @param onChompKeep Callback to signal that the output uses a block scalar
    *   type with the `+` chomping indicator.
    */
  var stringify: js.UndefOr[
    js.Function4[
      /* item */ Node, 
      /* ctx */ StringifyContext, 
      /* onComment */ js.UndefOr[js.Function0[Unit]], 
      /* onChompKeep */ js.UndefOr[js.Function0[Unit]], 
      String
    ]
  ] = js.native
  /**
    * The identifier for your data type, with which its stringified form will be
    * prefixed. Should either be a !-prefixed local `!tag`, or a fully qualified
    * `tag:domain,date:foo`.
    */
  var tag: String = js.native
  /**
    * Used by `YAML.createNode` to detect your data type, e.g. using `typeof` or
    * `instanceof`.
    */
  def identify(value: js.Any): Boolean = js.native
}

object BaseTag {
  @scala.inline
  def apply(identify: js.Any => Boolean, tag: String): BaseTag = {
    val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTag]
  }
  @scala.inline
  implicit class BaseTagOps[Self <: BaseTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentify(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateNode(
      value: (/* schema */ typingsSlinky.yaml.typesMod.Schema, /* value */ js.Any, /* ctx */ CreateNodeContext) => YAMLMap | YAMLSeq | Scalar
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNode")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreateNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNode")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeClass(value: Instantiable0[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withStringify(
      value: (/* item */ Node, /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutStringify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.undefined)
        ret
    }
  }
  
}

