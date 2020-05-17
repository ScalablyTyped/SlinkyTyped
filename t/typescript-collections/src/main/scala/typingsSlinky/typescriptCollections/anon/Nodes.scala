package typingsSlinky.typescriptCollections.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nodes extends js.Object {
  var nodes: StringDictionary[js.Array[String]] = js.native
  var rootIds: js.Array[String] = js.native
}

object Nodes {
  @scala.inline
  def apply(nodes: StringDictionary[js.Array[String]], rootIds: js.Array[String]): Nodes = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], rootIds = rootIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
  @scala.inline
  implicit class NodesOps[Self <: Nodes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodes(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

