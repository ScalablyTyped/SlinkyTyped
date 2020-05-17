package typingsSlinky.sourceListMap.anon

import typingsSlinky.sourceListMap.mod.CodeNode
import typingsSlinky.sourceListMap.mod.SourceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sources extends js.Object {
  var mappings: String = js.native
  var sources: js.Array[String | SourceNode | CodeNode] = js.native
  var sourcesContent: js.Array[String] = js.native
}

object Sources {
  @scala.inline
  def apply(
    mappings: String,
    sources: js.Array[String | SourceNode | CodeNode],
    sourcesContent: js.Array[String]
  ): Sources = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sources]
  }
  @scala.inline
  implicit class SourcesOps[Self <: Sources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMappings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSources(value: js.Array[String | SourceNode | CodeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourcesContent(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcesContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

