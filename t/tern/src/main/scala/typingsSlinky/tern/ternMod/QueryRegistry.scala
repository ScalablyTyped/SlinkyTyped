package typingsSlinky.tern.ternMod

import typingsSlinky.tern.anon.QueryDefinitionQuery
import typingsSlinky.tern.anon.QueryDocumentationQuery
import typingsSlinky.tern.anon.QueryFilesQuery
import typingsSlinky.tern.anon.QueryPropertiesQuery
import typingsSlinky.tern.anon.QueryRefsQuery
import typingsSlinky.tern.anon.QueryRenameQuery
import typingsSlinky.tern.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryRegistry extends js.Object {
  var completions: Result = js.native
  var definition: QueryDefinitionQuery = js.native
  var documentation: QueryDocumentationQuery = js.native
  var files: QueryFilesQuery = js.native
  var properties: QueryPropertiesQuery = js.native
  var refs: QueryRefsQuery = js.native
  var rename: QueryRenameQuery = js.native
  var `type`: typingsSlinky.tern.anon.QueryResult = js.native
}

object QueryRegistry {
  @scala.inline
  def apply(
    completions: Result,
    definition: QueryDefinitionQuery,
    documentation: QueryDocumentationQuery,
    files: QueryFilesQuery,
    properties: QueryPropertiesQuery,
    refs: QueryRefsQuery,
    rename: QueryRenameQuery,
    `type`: typingsSlinky.tern.anon.QueryResult
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
    def withCompletions(value: Result): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinition(value: QueryDefinitionQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentation(value: QueryDocumentationQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: QueryFilesQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: QueryPropertiesQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefs(value: QueryRefsQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRename(value: QueryRenameQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: typingsSlinky.tern.anon.QueryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

