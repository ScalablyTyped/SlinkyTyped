package typingsSlinky.sourceListMap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mappings extends js.Object {
  var file: js.Any = js.native
  var mappings: String = js.native
  var sources: js.Array[String] = js.native
  var sourcesContent: js.Array[String] = js.native
  var version: Double = js.native
}

object Mappings {
  @scala.inline
  def apply(
    file: js.Any,
    mappings: String,
    sources: js.Array[String],
    sourcesContent: js.Array[String],
    version: Double
  ): Mappings = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mappings]
  }
  @scala.inline
  implicit class MappingsOps[Self <: Mappings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMappings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSources(value: js.Array[String]): Self = {
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
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

