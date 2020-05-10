package typingsSlinky.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevtoolModuleFilenameTemplateInfo extends js.Object {
  var absoluteResourcePath: String = js.native
  var allLoaders: js.Array[_] = js.native
  var hash: String = js.native
  var identifier: String = js.native
  var moduleId: String = js.native
  var query: String = js.native
  var resource: js.Any = js.native
  var resourcePath: String = js.native
  var shortIdentifier: String = js.native
}

object DevtoolModuleFilenameTemplateInfo {
  @scala.inline
  def apply(
    absoluteResourcePath: String,
    allLoaders: js.Array[_],
    hash: String,
    identifier: String,
    moduleId: String,
    query: String,
    resource: js.Any,
    resourcePath: String,
    shortIdentifier: String
  ): DevtoolModuleFilenameTemplateInfo = {
    val __obj = js.Dynamic.literal(absoluteResourcePath = absoluteResourcePath.asInstanceOf[js.Any], allLoaders = allLoaders.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourcePath = resourcePath.asInstanceOf[js.Any], shortIdentifier = shortIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevtoolModuleFilenameTemplateInfo]
  }
  @scala.inline
  implicit class DevtoolModuleFilenameTemplateInfoOps[Self <: DevtoolModuleFilenameTemplateInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteResourcePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteResourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllLoaders(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allLoaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourcePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

