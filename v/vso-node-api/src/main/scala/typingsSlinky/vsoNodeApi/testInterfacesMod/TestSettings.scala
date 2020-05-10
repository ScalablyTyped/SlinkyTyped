package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSettings extends js.Object {
  /**
    * Area path required to create test settings
    */
  var areaPath: String = js.native
  /**
    * Description of the test settings. Used in create test settings.
    */
  var description: String = js.native
  /**
    * Indicates if the tests settings is public or private.Used in create test settings.
    */
  var isPublic: Boolean = js.native
  /**
    * Xml string of machine roles. Used in create test settings.
    */
  var machineRoles: String = js.native
  /**
    * Test settings content.
    */
  var testSettingsContent: String = js.native
  /**
    * Test settings id.
    */
  var testSettingsId: Double = js.native
  /**
    * Test settings name.
    */
  var testSettingsName: String = js.native
}

object TestSettings {
  @scala.inline
  def apply(
    areaPath: String,
    description: String,
    isPublic: Boolean,
    machineRoles: String,
    testSettingsContent: String,
    testSettingsId: Double,
    testSettingsName: String
  ): TestSettings = {
    val __obj = js.Dynamic.literal(areaPath = areaPath.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], machineRoles = machineRoles.asInstanceOf[js.Any], testSettingsContent = testSettingsContent.asInstanceOf[js.Any], testSettingsId = testSettingsId.asInstanceOf[js.Any], testSettingsName = testSettingsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSettings]
  }
  @scala.inline
  implicit class TestSettingsOps[Self <: TestSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areaPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMachineRoles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestSettingsContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSettingsContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestSettingsId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSettingsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestSettingsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSettingsName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

