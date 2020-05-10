package typingsSlinky.yaml.typesMod.Schema

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.yaml.mod.Document
import typingsSlinky.yaml.parseCstMod.CST.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTag
  extends BaseTag
     with Tag {
  /**
    * A JavaScript class that should be matched to this tag, e.g. `Date` for `!!timestamp`.
    * @deprecated Use `Tag.identify` instead
    */
  var `class`: js.UndefOr[Instantiable0[js.Any]] = js.native
  /**
    * Turns a CST node into an AST node. If returning a non-`Node` value, the
    * output will be wrapped as a `Scalar`.
    */
  def resolve(doc: Document, cstNode: Node): typingsSlinky.yaml.typesMod.AST.Node | js.Any = js.native
}

object CustomTag {
  @scala.inline
  def apply(
    identify: js.Any => Boolean,
    resolve: (Document, Node) => typingsSlinky.yaml.typesMod.AST.Node | js.Any,
    tag: String
  ): CustomTag = {
    val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction2(resolve), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTag]
  }
  @scala.inline
  implicit class CustomTagOps[Self <: CustomTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResolve(value: (Document, Node) => typingsSlinky.yaml.typesMod.AST.Node | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClass(value: Instantiable0[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
  }
  
}

