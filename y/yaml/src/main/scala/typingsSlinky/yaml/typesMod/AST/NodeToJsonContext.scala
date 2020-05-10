package typingsSlinky.yaml.typesMod.AST

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.yaml.mod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeToJsonContext
  extends /* key */ StringDictionary[js.Any] {
  var anchors: js.UndefOr[js.Array[_]] = js.native
  var doc: Document = js.native
  var keep: js.UndefOr[Boolean] = js.native
  var mapAsMap: js.UndefOr[Boolean] = js.native
  var maxAliasCount: js.UndefOr[Double] = js.native
  var onCreate: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
}

object NodeToJsonContext {
  @scala.inline
  def apply(doc: Document): NodeToJsonContext = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeToJsonContext]
  }
  @scala.inline
  implicit class NodeToJsonContextOps[Self <: NodeToJsonContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoc(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchors(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchors")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep")(js.undefined)
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
    def withOnCreate(value: /* node */ Node => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCreate")(js.undefined)
        ret
    }
  }
  
}

