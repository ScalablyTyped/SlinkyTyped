package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildDefinitionSourceProvider extends js.Object {
  /**
    * Uri of the associated definition
    */
  var definitionUri: String = js.native
  /**
    * fields associated with this build definition
    */
  var fields: StringDictionary[String] = js.native
  /**
    * Id of this source provider
    */
  var id: Double = js.native
  /**
    * The lst time this source provider was modified
    */
  var lastModified: js.Date = js.native
  /**
    * Name of the source provider
    */
  var name: String = js.native
  /**
    * Which trigger types are supported by this definition source provider
    */
  var supportedTriggerTypes: DefinitionTriggerType = js.native
}

object BuildDefinitionSourceProvider {
  @scala.inline
  def apply(
    definitionUri: String,
    fields: StringDictionary[String],
    id: Double,
    lastModified: js.Date,
    name: String,
    supportedTriggerTypes: DefinitionTriggerType
  ): BuildDefinitionSourceProvider = {
    val __obj = js.Dynamic.literal(definitionUri = definitionUri.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportedTriggerTypes = supportedTriggerTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionSourceProvider]
  }
  @scala.inline
  implicit class BuildDefinitionSourceProviderOps[Self <: BuildDefinitionSourceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinitionUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModified(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedTriggerTypes(value: DefinitionTriggerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedTriggerTypes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

