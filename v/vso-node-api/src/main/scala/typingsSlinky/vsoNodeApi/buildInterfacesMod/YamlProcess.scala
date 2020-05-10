package typingsSlinky.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YamlProcess extends BuildProcess {
  var errors: js.Array[String] = js.native
  /**
    * The resources used by the build definition.
    */
  var resources: BuildProcessResources = js.native
  /**
    * The YAML filename.
    */
  var yamlFilename: String = js.native
}

object YamlProcess {
  @scala.inline
  def apply(errors: js.Array[String], resources: BuildProcessResources, `type`: Double, yamlFilename: String): YamlProcess = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], yamlFilename = yamlFilename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[YamlProcess]
  }
  @scala.inline
  implicit class YamlProcessOps[Self <: YamlProcess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: BuildProcessResources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYamlFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yamlFilename")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

