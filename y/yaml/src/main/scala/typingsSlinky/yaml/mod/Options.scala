package typingsSlinky.yaml.mod

import typingsSlinky.yaml.yamlStrings.`1Dot0`
import typingsSlinky.yaml.yamlStrings.`1Dot1`
import typingsSlinky.yaml.yamlStrings.`1Dot2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typingsSlinky.yaml.typesMod.Schema.Options {
  /**
    * Default prefix for anchors.
    *
    * Default: `'a'`, resulting in anchors `a1`, `a2`, etc.
    */
  var anchorPrefix: js.UndefOr[String] = js.native
  /**
    * The number of spaces to use when indenting code.
    *
    * Default: `2`
    */
  var indent: js.UndefOr[Double] = js.native
  /**
    * Whether block sequences should be indented.
    *
    * Default: `true`
    */
  var indentSeq: js.UndefOr[Boolean] = js.native
  /**
    * Allow non-JSON JavaScript objects to remain in the `toJSON` output.
    * Relevant with the YAML 1.1 `!!timestamp` and `!!binary` tags as well as BigInts.
    *
    * Default: `true`
    */
  var keepBlobsInJSON: js.UndefOr[Boolean] = js.native
  /**
    * Include references in the AST to each node's corresponding CST node.
    *
    * Default: `false`
    */
  var keepCstNodes: js.UndefOr[Boolean] = js.native
  /**
    * Store the original node type when parsing documents.
    *
    * Default: `true`
    */
  var keepNodeTypes: js.UndefOr[Boolean] = js.native
  /**
    * When outputting JS, use Map rather than Object to represent mappings.
    *
    * Default: `false`
    */
  var mapAsMap: js.UndefOr[Boolean] = js.native
  /**
    * Prevent exponential entity expansion attacks by limiting data aliasing count;
    * set to `-1` to disable checks; `0` disallows all alias nodes.
    *
    * Default: `100`
    */
  var maxAliasCount: js.UndefOr[Double] = js.native
  /**
    * Include line position & node type directly in errors; drop their verbose source and context.
    *
    * Default: `false`
    */
  var prettyErrors: js.UndefOr[Boolean] = js.native
  /**
    * When stringifying, require keys to be scalars and to use implicit rather than explicit notation.
    *
    * Default: `false`
    */
  var simpleKeys: js.UndefOr[Boolean] = js.native
  /**
    * The YAML version used by documents without a `%YAML` directive.
    *
    * Default: `"1.2"`
    */
  var version: js.UndefOr[`1Dot0` | `1Dot1` | `1Dot2`] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentSeq(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSeq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentSeq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentSeq")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepBlobsInJSON(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepBlobsInJSON")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepBlobsInJSON: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepBlobsInJSON")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepCstNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCstNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepCstNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepCstNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepNodeTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNodeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepNodeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepNodeTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withMapAsMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapAsMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapAsMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapAsMap")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAliasCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAliasCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAliasCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAliasCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPrettyErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrettyErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prettyErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: `1Dot0` | `1Dot1` | `1Dot2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

