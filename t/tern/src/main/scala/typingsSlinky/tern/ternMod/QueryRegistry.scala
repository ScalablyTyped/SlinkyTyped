package typingsSlinky.tern.ternMod

import typingsSlinky.tern.AnonQueryDefinitionQuery
import typingsSlinky.tern.AnonQueryDocumentationQuery
import typingsSlinky.tern.AnonQueryFilesQuery
import typingsSlinky.tern.AnonQueryPropertiesQuery
import typingsSlinky.tern.AnonQueryRefsQuery
import typingsSlinky.tern.AnonQueryRenameQuery
import typingsSlinky.tern.AnonQueryResult
import typingsSlinky.tern.AnonResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryRegistry extends js.Object {
  var completions: AnonResult = js.native
  var definition: AnonQueryDefinitionQuery = js.native
  var documentation: AnonQueryDocumentationQuery = js.native
  var files: AnonQueryFilesQuery = js.native
  var properties: AnonQueryPropertiesQuery = js.native
  var refs: AnonQueryRefsQuery = js.native
  var rename: AnonQueryRenameQuery = js.native
  var `type`: AnonQueryResult = js.native
}

object QueryRegistry {
  @scala.inline
  def apply(
    completions: AnonResult,
    definition: AnonQueryDefinitionQuery,
    documentation: AnonQueryDocumentationQuery,
    files: AnonQueryFilesQuery,
    properties: AnonQueryPropertiesQuery,
    refs: AnonQueryRefsQuery,
    rename: AnonQueryRenameQuery,
    `type`: AnonQueryResult
  ): QueryRegistry = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRegistry]
  }
  @scala.inline
  implicit class QueryRegistryOps[Self <: QueryRegistry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletions(value: AnonResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinition(value: AnonQueryDefinitionQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentation(value: AnonQueryDocumentationQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: AnonQueryFilesQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: AnonQueryPropertiesQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefs(value: AnonQueryRefsQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRename(value: AnonQueryRenameQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: AnonQueryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

